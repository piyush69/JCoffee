import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14638789 {
public static MyHelperClass parseCookie(URLConnection o0, ConnectData o1){ return null; }
public static MyHelperClass Log;
	public static MyHelperClass setUA(URLConnection o0){ return null; }
//	public MyHelperClass parseCookie(URLConnection o0, ConnectData o1){ return null; }
//public MyHelperClass Log;
//	public MyHelperClass setUA(URLConnection o0){ return null; }

    public static InputStream sendReq(String url, String content, ConnectData data) {
        try {
            URLConnection con = new URL(url).openConnection();
            MyHelperClass TIMEOUT = new MyHelperClass();
            con.setConnectTimeout((int)(Object)TIMEOUT);
//            MyHelperClass TIMEOUT = new MyHelperClass();
            con.setReadTimeout((int)(Object)TIMEOUT);
            con.setUseCaches(false);
            setUA(con);
            con.setRequestProperty("Accept-Charset", "utf-8");
            con.setDoOutput(true);
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (data.cookie != null) con.setRequestProperty("Cookie",(String)(Object) data.cookie);
            HttpURLConnection httpurl = (HttpURLConnection) con;
            httpurl.setRequestMethod("POST");
            Writer wr = new OutputStreamWriter(con.getOutputStream());
            wr.write(content);
            wr.flush();
            con.connect();
            InputStream is = con.getInputStream();
            is = new BufferedInputStream(is);
            wr.close();
            parseCookie(con, data);
            return is;
        } catch (IOException ioe) {
            Log.except("failed to send request " + url, ioe);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass except(String o0, IOException o1){ return null; }}

class ConnectData {
public MyHelperClass cookie;
}
