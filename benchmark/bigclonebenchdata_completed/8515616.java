import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8515616 {
public MyHelperClass nowPlayingUrl;
	public MyHelperClass ResponseStatus;
	public MyHelperClass sessionId;
	public MyHelperClass Caller;
	public MyHelperClass encode(String o0){ return null; }

    public ResponseStatus nowPlaying(String artist, String track, String album, int length, int tracknumber) throws Throwable, IOException {
        MyHelperClass sessionId = new MyHelperClass();
        if (sessionId == null) throw new IllegalStateException("Perform successful handshake first.");
        String b = album != null ? encode(album) : "";
        String l = length == -1 ? "" : String.valueOf(length);
        String n = tracknumber == -1 ? "" : String.valueOf(tracknumber);
        String body = String.format("s=%s&a=%s&t=%s&b=%s&l=%s&n=%s&m=", sessionId, encode(artist), encode(track), b, l, n);
        if ((boolean)(Object)Caller.getInstance().isDebugMode()) System.out.println("now playing: " + body);
        Proxy proxy =(Proxy)(Object) Caller.getInstance().getProxy();
        HttpURLConnection urlConnection =(HttpURLConnection)(Object) Caller.getInstance().openConnection(nowPlayingUrl);
        urlConnection.setRequestMethod("POST");
        urlConnection.setDoOutput(true);
        OutputStream outputStream = urlConnection.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        writer.write(body);
        writer.close();
        InputStream is = urlConnection.getInputStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String status = r.readLine();
        r.close();
        return new ResponseStatus(ResponseStatus.codeForStatus(status));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugMode(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass openConnection(MyHelperClass o0){ return null; }
	public MyHelperClass getProxy(){ return null; }
	public MyHelperClass codeForStatus(String o0){ return null; }}

class ResponseStatus {

ResponseStatus(MyHelperClass o0){}
	ResponseStatus(){}}
