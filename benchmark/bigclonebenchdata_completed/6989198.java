
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6989198 {

    public static boolean isInternetReachable() {
        try {
            URL url = new URL("http://code.google.com/p/ilias-userimport/downloads/list");
            HttpURLConnection urlConnect = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            Object objData = urlConnect.getContent();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getContent(){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
