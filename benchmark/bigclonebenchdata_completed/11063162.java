
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11063162 {

    public int getResponseCode(URI uri) {
        int response = -1;
        try {
            URL url =(URL)(Object) uri.toURL();
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            response =(int)(Object) connection.getResponseCode();
        } catch (UncheckedIOException m) {
            throw new MalformedURLException("URL not correct");
        } catch (ArithmeticException e) {
            throw new IOException("can open connection");
        } finally {
            return response;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URI {

public MyHelperClass toURL(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
