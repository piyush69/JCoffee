
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14501401 {

    private void checkServerAccess() throws IOException {
        URL url = new URL("https://testnetbeans.org/bugzilla/index.cgi");
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();
        } catch (UncheckedIOException exc) {
            String disableMessage;// = new String();
            disableMessage = "Bugzilla is not accessible";
        }
        MyHelperClass BugzillaConnector = new MyHelperClass();
        url = new URL((String)(Object)BugzillaConnector.SERVER_URL);
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();
        } catch (UncheckedIOException exc) {
            String disableMessage;// = new String();
            disableMessage = "Bugzilla Service is not accessible";
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVER_URL;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}
