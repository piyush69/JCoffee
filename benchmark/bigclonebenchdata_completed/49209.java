
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c49209 {

    private void makeConn(String filename1, String filename2) {
        String basename = "http://www.bestmm.com/";
        String urlname = basename + filename1 + "/pic/" + filename2 + ".jpg";
        URL url = null;
        try {
            url = new URL(urlname);
        } catch (UncheckedIOException e) {
            System.err.println("URL Format Error!");
            System.exit(1);
        }
        try {
            HttpURLConnection conn;// = new HttpURLConnection();
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        } catch (UncheckedIOException e) {
            System.err.println("Error IO");
            System.exit(2);
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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

}
