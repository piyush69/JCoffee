
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9706966 {

    public static boolean checkUrl(CmsObject cms, String check) {
        URI uri = null;
        try {
            uri =(URI)(Object) (new CmsUriSplitter(check, true).toURI());
        } catch (UncheckedIOException exc) {
            return false;
        }
        try {
            if (!(Boolean)(Object)uri.isAbsolute()) {
                return(boolean)(Object) cms.existsResource(cms.getRequestContext().removeSiteRoot(uri.getPath()));
            } else {
                URL url =(URL)(Object) uri.toURL();
                if ("http".equals(url.getProtocol())) {
                    HttpURLConnection httpcon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                    return ((int)(Object)httpcon.getResponseCode() == 200);
                } else {
                    return true;
                }
            }
        } catch (UncheckedIOException mue) {
            return false;
        } catch (Exception ex) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass removeSiteRoot(MyHelperClass o0){ return null; }}

class CmsObject {

public MyHelperClass existsResource(MyHelperClass o0){ return null; }
	public MyHelperClass getRequestContext(){ return null; }}

class URI {

public MyHelperClass isAbsolute(){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class CmsUriSplitter {

CmsUriSplitter(){}
	CmsUriSplitter(String o0, boolean o1){}
	public MyHelperClass toURI(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
