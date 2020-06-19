
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13688266 {
public MyHelperClass cookie;

//    @Override
    public boolean checkLink(String link) {
        boolean result = false;
        URLConnection connection = null;
        URL url = null;
        try {
            url = new URL(link);
            connection =(URLConnection)(Object) url.openConnection();
            MyHelperClass RAPIDSHARE_LOGIN_PAGE = new MyHelperClass();
            connection.setRequestProperty("Cookie", cookie.getCookie(RAPIDSHARE_LOGIN_PAGE));
            connection.connect();
            if ((int)(Object)connection.getContentLength() > 0) {
                if (connection.getContentType().equals("application/octet-stream")) {
                    result = true;
                }
                MyHelperClass Logger = new MyHelperClass();
                Logger.getRootLogger().debug(connection.getContentType());
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.getRootLogger().error(link + " cannot be url",(IOException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.getRootLogger().error("connection failed",(IOException)(Object) e);
        }
        if (!result) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.getRootLogger().warn(link + " doesn't exist");
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCookie(MyHelperClass o0){ return null; }
	public MyHelperClass getRootLogger(){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }
	public MyHelperClass debug(MyHelperClass o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(){ return null; }}

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
