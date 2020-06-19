
import java.io.UncheckedIOException;


class c19136768 {

    public static void main(String[] args) {
        CookieManager cm = new CookieManager();
        try {
            URL url = new URL("http://www.hccp.org/test/cookieTest.jsp");
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.connect();
            cm.storeCookies(conn);
            System.out.println(cm);
            cm.setCookies(url.openConnection());
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class CookieManager {

public MyHelperClass setCookies(MyHelperClass o0){ return null; }
	public MyHelperClass storeCookies(URLConnection o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
