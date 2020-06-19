
import java.io.UncheckedIOException;


class c11153282 {

    public static boolean existsURL(String urlStr) {
        try {
            MyHelperClass ProxyURLFactory = new MyHelperClass();
            URL url =(URL)(Object) ProxyURLFactory.createHttpUrl(urlStr);
            HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            con.connect();
            int responseCode =(int)(Object) con.getResponseCode();
            con.disconnect();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            return !(responseCode == (int)(Object)HttpURLConnection.HTTP_NOT_FOUND);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_NOT_FOUND;
public MyHelperClass createHttpUrl(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
