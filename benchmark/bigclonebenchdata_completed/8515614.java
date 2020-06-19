import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8515614 {
public MyHelperClass nowPlayingUrl;
	public MyHelperClass sessionId;
	public MyHelperClass ResponseStatus;
	public MyHelperClass submissionUrl;

    private ResponseStatus performHandshake(String url) throws IOException {
        MyHelperClass Caller = new MyHelperClass();
        HttpURLConnection connection =(HttpURLConnection)(Object) Caller.getInstance().openConnection(url);
        InputStream is = connection.getInputStream();
        BufferedReader r = new BufferedReader(new InputStreamReader(is));
        String status = r.readLine();
        MyHelperClass ResponseStatus = new MyHelperClass();
        int statusCode =(int)(Object) ResponseStatus.codeForStatus(status);
        ResponseStatus responseStatus;
//        MyHelperClass ResponseStatus = new MyHelperClass();
        if (statusCode == (int)(Object)ResponseStatus.OK) {
            this.sessionId =(MyHelperClass)(Object) r.readLine();
            this.nowPlayingUrl =(MyHelperClass)(Object) r.readLine();
            this.submissionUrl =(MyHelperClass)(Object) r.readLine();
            responseStatus = new ResponseStatus(statusCode);
        } else if (statusCode == (int)(Object)ResponseStatus.FAILED) {
            responseStatus = new ResponseStatus(statusCode, status.substring(status.indexOf(' ') + 1));
        } else {
            return new ResponseStatus(statusCode);
        }
        r.close();
        return responseStatus;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK;
	public MyHelperClass FAILED;
public MyHelperClass codeForStatus(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass openConnection(String o0){ return null; }}

class ResponseStatus {

ResponseStatus(int o0, String o1){}
	ResponseStatus(int o0){}
	ResponseStatus(){}}
