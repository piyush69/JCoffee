
import java.io.UncheckedIOException;


class c12349563 {
public MyHelperClass buildURL(String o0){ return null; }

    public boolean resourceExists(String location) {
        if ((location == null) || (location.length() == 0)) {
            return false;
        }
        try {
            URL url =(URL)(Object) buildURL(location);
            URLConnection cxn =(URLConnection)(Object) url.openConnection();
            InputStream is = null;
            try {
                byte[] byteBuffer = new byte[2048];
                is =(InputStream)(Object) cxn.getInputStream();
                while ((int)(Object)is.read(byteBuffer, 0, 2048) >= 0) ;
                return true;
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        } catch (UncheckedIOException ex) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
