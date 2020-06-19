
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13421722 {

    public static long getFileSize(String address) {
        URL url = null;
        try {
            url = new URL(address);
            System.err.println("Indirizzo valido - " + url.toString().substring(0, 10) + "...");
        } catch (UncheckedIOException ex) {
            System.err.println("Indirizzo non valido!");
        }
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestProperty("Range", "bytes=0-");
            connection.connect();
            return(long)(Object) connection.getContentLength();
        } catch (UncheckedIOException ioe) {
            System.err.println("I/O error!");
            return 0;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
