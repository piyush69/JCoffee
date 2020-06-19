
import java.io.UncheckedIOException;


class c5229696 {

    public static HttpsURLConnection createRequest(String feedUrl, String httpMethod, Map headers) throws BuzzIOException {
        HttpsURLConnection con;
        try {
            URL url = new URL(feedUrl);
            con = (HttpsURLConnection)(HttpsURLConnection)(Object) url.openConnection();
            con.setRequestMethod(httpMethod);
            if (headers != null && !(Boolean)(Object)headers.isEmpty()) {
                for (String key :(String[])(Object) (Object[])(Object)headers.keySet()) {
                    con.setRequestProperty(key, headers.get(key));
                }
            }
        } catch (UncheckedIOException e) {
            throw new BuzzIOException((String)(Object)e);
        }
        return con;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class HttpsURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }}

class BuzzIOException extends Exception{
	public BuzzIOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
