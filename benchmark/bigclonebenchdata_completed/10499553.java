
import java.io.UncheckedIOException;


class c10499553 {

    private static InputStream connect(final String url) throws IOException {
        InputStream in = null;
        try {
            final URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
            MyHelperClass YahooGeocoding = new MyHelperClass();
            conn.setConnectTimeout(YahooGeocoding.connectTimeOut);
//            MyHelperClass YahooGeocoding = new MyHelperClass();
            conn.setReadTimeout(YahooGeocoding.readTimeOut);
//            MyHelperClass YahooGeocoding = new MyHelperClass();
            conn.setRequestProperty("User-Agent", YahooGeocoding.USER_AGENT);
            in =(InputStream)(Object) conn.getInputStream();
            return in;
        } catch (final UncheckedIOException e) {
            MyHelperClass Util = new MyHelperClass();
            Util.d("problems connecting to geonames url " + url + "Exception:" + e);
        }
        return in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass USER_AGENT;
	public MyHelperClass readTimeOut;
	public MyHelperClass connectTimeOut;
public MyHelperClass d(String o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
