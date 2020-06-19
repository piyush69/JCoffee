
import java.io.UncheckedIOException;


class c2313678 {

        protected boolean exists(String filename) {
            try {
                MyHelperClass base = new MyHelperClass();
                URL url = new URL(base, filename);
                URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.connect();
                conn.getInputStream().close();
                return true;
            } catch (UncheckedIOException ex) {
                return false;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
