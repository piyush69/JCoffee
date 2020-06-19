
import java.io.UncheckedIOException;


class c22347366 {

    private static BufferedReader createReaderConnection(String urlString) throws SiteNotFoundException {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestProperty("User-agent", "Mozilla/4.5");
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                MyHelperClass Logger = new MyHelperClass();
                Logger.logln("Response code for url [" + urlString + "] was " + conn.getResponseCode() + " [" + conn.getResponseMessage() + "]");
                throw new SiteNotFoundException(urlString);
            }
            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } catch (UncheckedIOException ex) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.logln("" + ex);
        }
        return reader;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass logln(String o0){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}}

class SiteNotFoundException extends Exception{
	public SiteNotFoundException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
