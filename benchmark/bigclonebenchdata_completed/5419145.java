
import java.io.UncheckedIOException;


class c5419145 {

    protected boolean testPort(String protocol, String server, int port, String file) {
        System.out.println("testPort[" + protocol + "," + server + ", " + port + ", " + file + "]");
        URL url = null;
        try {
            url = new URL(protocol, server, port, file);
        } catch (UncheckedIOException ex) {
            MyHelperClass log = new MyHelperClass();
            log.severe("No URL for Protocol=" + protocol + ", Server=" + server + ": " + ex.getMessage());
            return false;
        }
        try {
            URLConnection c =(URLConnection)(Object) url.openConnection();
            Object o = c.getContent();
            MyHelperClass log = new MyHelperClass();
            if (o == null) log.warning("In use=" + url); else log.warning("In Use=" + url);
        } catch (Exception ex) {
            MyHelperClass log = new MyHelperClass();
            log.fine("Not used=" + url);
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class URL {

URL(String o0, String o1, int o2, String o3){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getContent(){ return null; }}
