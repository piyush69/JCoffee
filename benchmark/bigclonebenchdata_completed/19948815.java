
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19948815 {

    public static int validate(String url) {
        HttpURLConnection con = null;
        try {
            con = (HttpURLConnection)(HttpURLConnection)(Object) (new URL(url)).openConnection();
        } catch (UncheckedIOException ex) {
            return -1;
        } catch (ArithmeticException ex) {
            return -2;
        }
        try {
            if (con != null &&(int)(Object) con.getResponseCode() != 200) {
                return(int)(Object) con.getResponseCode();
            } else if (con == null) {
                return -3;
            }
        } catch (UncheckedIOException ex) {
            return -4;
        }
        return 1;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }}

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
