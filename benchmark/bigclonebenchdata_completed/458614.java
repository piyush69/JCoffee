
import java.io.UncheckedIOException;


class c458614 {

    public static boolean URLExists(URL url) {
        int responseCode = -1;
        boolean exists = true;
        try {
            MyHelperClass useHttpURLConnection = new MyHelperClass();
            if ((boolean)(Object)useHttpURLConnection && url.getProtocol().equals("http")) {
                HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                conn.setRequestMethod("HEAD");
                responseCode =(int)(Object) conn.getResponseCode();
                if (!(responseCode >= 200 && responseCode < 400)) exists = false;
                conn.disconnect();
            } else {
                InputStream testStream =(InputStream)(Object) url.openStream();
            }
        } catch (UncheckedIOException ioe) {
            exists = false;
        }
        return exists;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
