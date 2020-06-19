
import java.io.UncheckedIOException;


class c14638788 {
public static MyHelperClass parseCookie(URLConnection o0, ConnectData o1){ return null; }
	public static MyHelperClass setUA(URLConnection o0){ return null; }
//public MyHelperClass parseCookie(URLConnection o0, ConnectData o1){ return null; }
//	public MyHelperClass setUA(URLConnection o0){ return null; }

    public static InputStream openURL(String url, ConnectData data) {
        try {
            URLConnection con =(URLConnection)(Object) (new URL(url).openConnection());
            MyHelperClass TIMEOUT = new MyHelperClass();
            con.setConnectTimeout(TIMEOUT);
//            MyHelperClass TIMEOUT = new MyHelperClass();
            con.setReadTimeout(TIMEOUT);
            con.setUseCaches(false);
            con.setRequestProperty("Accept-Charset", "utf-8");
            setUA(con);
            if (data.cookie != null) con.setRequestProperty("Cookie",(String)(Object) data.cookie);
            InputStream is =(InputStream)(Object) con.getInputStream();
            parseCookie(con, data);
            return (InputStream)(Object)new BufferedInputStream(is);
        } catch (UncheckedIOException ioe) {
            MyHelperClass Log = new MyHelperClass();
            Log.except("failed to open URL " + url,(IOException)(Object) ioe);
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

class InputStream {

}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(InputStream o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
