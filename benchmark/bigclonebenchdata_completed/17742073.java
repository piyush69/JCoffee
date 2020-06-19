
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17742073 {

    private HttpURLConnection getRecognizedUrl(SpantusAudioCtx ctx) throws URISyntaxException {
        try {
            URL url =(URL)(Object) ctx.getRecognizedUrl();
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            return conn;
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error((IOException)(Object)e);
        } catch (ArithmeticException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error((IOException)(Object)e);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }}

class SpantusAudioCtx {

public MyHelperClass getRecognizedUrl(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
