
import java.io.UncheckedIOException;


class c16847882 {

    public static Result checkLink(String theUrl) throws MalformedURLException {
        URL url = new URL(theUrl);
        HttpURLConnection urlConnection = null;
        try {
            urlConnection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();
            return new Result((int)(Object)urlConnection.getResponseCode(), false);
        } catch (UncheckedIOException e) {
            return new Result(0, true);
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Result {

Result(){}
	Result(int o0, boolean o1){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
