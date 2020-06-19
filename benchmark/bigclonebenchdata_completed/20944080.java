
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20944080 {
public MyHelperClass jarbase;
	public MyHelperClass log;
	public MyHelperClass loadDriverDB(){ return null; }

    public InputStream loadDriver(String id) throws IOException {
        Hashtable drivers =(Hashtable)(Object) loadDriverDB();
        DriverInfo di = (DriverInfo)(DriverInfo)(Object) drivers.get(id);
        InputStream stream = null;
        if (di == null) {
            log.warn("No id" + id);
            throw new IOException("No driver id '" + id + "'");
        }
        try {
            String strURL =(String)(Object) di.url;
            if (strURL.indexOf(":") == -1) {
                strURL = jarbase + strURL;
            }
            URL url = new URL(strURL);
            stream =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            log.error("bad URL for in " + di,(IOException)(Object) e);
            throw new IOException("Bad driver URL " + e);
        } catch (ArithmeticException e) {
            log.error("can't connect to URL in " + di,(IOException)(Object) e);
            throw e;
        }
        return stream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Hashtable {

public MyHelperClass get(String o0){ return null; }}

class DriverInfo {
public MyHelperClass url;
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
