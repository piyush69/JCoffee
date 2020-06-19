
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19845293 {

    public static Properties load(URL url) {
        if (url == null) {
            return new Properties();
        }
        InputStream in = null;
        try {
            in =(InputStream)(Object) url.openStream();
            Properties ret = new Properties();
            ret.load(in);
            return ret;
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error("Error closing",(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
