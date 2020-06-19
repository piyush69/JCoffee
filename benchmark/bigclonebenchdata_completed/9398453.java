
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9398453 {

    private static boolean isRemoteFileExist(String url) {
        InputStream in = null;
        try {
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(url)).openConnection();
            in =(InputStream)(Object) conn.getInputStream();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        if (in != null) {
            return true;
        } else {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
