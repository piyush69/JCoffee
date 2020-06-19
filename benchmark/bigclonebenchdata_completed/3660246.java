import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3660246 {
public MyHelperClass COOKIE;
	public MyHelperClass echoRequest;
	public MyHelperClass getString(Object o0, String o1){ return null; }
	public MyHelperClass getMetawebCookie(){ return null; }
	public MyHelperClass isDebugging(){ return null; }

    private Object query(String json) throws Throwable, IOException, ParseException {
        String envelope = "{\"qname1\":{\"query\":" + json + "}}";
        MyHelperClass MQLREADURL = new MyHelperClass();
        String urlStr = MQLREADURL + "?queries=" + URLEncoder.encode(envelope, "UTF-8");
        if ((boolean)(Object)isDebugging()) {
            if ((boolean)(Object)echoRequest) System.err.println("Sending:" + envelope);
        }
        URL url = new URL(urlStr);
        URLConnection con = url.openConnection();
        con.setRequestProperty("Cookie", COOKIE + "=" + "\"" + getMetawebCookie() + "\"");
        con.connect();
        InputStream in = con.getInputStream();
        Object item = new JSONParser((boolean)(Object)echoRequest ? new EchoReader(in) : in).object();
        in.close();
        String code =(String)(Object) getString(item, "code");
        if (!"/api/status/ok".equals(code)) {
            throw new IOException("Bad code " + item);
        }
        code =(String)(Object) getString(item, "qname1.code");
        if (!"/api/status/ok".equals(code)) {
            throw new IOException("Bad code " + item);
        }
        return item;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class JSONParser {

}

class EchoReader {

EchoReader(InputStream o0){}
	EchoReader(){}}
