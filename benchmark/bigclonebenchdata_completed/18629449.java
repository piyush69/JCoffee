
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18629449 {
public MyHelperClass URLEncoder;
	public MyHelperClass Log;

    private InputStream getSearchInputStream(String name) {
        URL url = null;
        try {
            MyHelperClass TheMovieDBXmlPullFeedParser = new MyHelperClass();
            url = new URL((int)(Object)TheMovieDBXmlPullFeedParser.SEARCH_FEED_URL + (int)(Object)URLEncoder.encode(name));
            MyHelperClass Constants = new MyHelperClass();
            Log.d(Constants.LOG_TAG, "Movie search URL: " + url);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        try {
            return(InputStream)(Object) url.openConnection().getInputStream();
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass LOG_TAG;
	public MyHelperClass SEARCH_FEED_URL;
public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass encode(String o0){ return null; }}

class InputStream {

}

class URL {

URL(int o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
