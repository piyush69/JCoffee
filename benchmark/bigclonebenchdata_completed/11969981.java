import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11969981 {
public static MyHelperClass CFileHelper;
	public static MyHelperClass RSS_USER_AGENT;
	public static MyHelperClass appendParam(String o0, String o1, String o2){ return null; }
//public MyHelperClass CFileHelper;
//	public MyHelperClass RSS_USER_AGENT;
//	public MyHelperClass appendParam(String o0, String o1, String o2){ return null; }

    public static String readRss(String feed, int num)  throws Throwable {
        InputStream stream = null;
        try {
            feed =(String)(Object) appendParam(feed, "num", "" + num);
            System.out.println("feed=" + feed);
            URL url = new URL(feed);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("User-Agent",(String)(Object) RSS_USER_AGENT);
            stream = connection.getInputStream();
            return(String)(Object) CFileHelper.readInputStream(stream);
        } catch (Exception e) {
            throw new CException((String)(Object)e);
        } finally {
            CFileHelper.closeStream(stream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readInputStream(InputStream o0){ return null; }
	public MyHelperClass closeStream(InputStream o0){ return null; }}

class CException extends Exception{
	public CException(String errorMessage) { super(errorMessage); }
}
