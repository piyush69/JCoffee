
import java.io.UncheckedIOException;


class c22930145 {
public MyHelperClass url;

    private long getLastModification() {
        try {
            MyHelperClass connection = new MyHelperClass();
            if (connection == null) connection = url.openConnection();
//            MyHelperClass connection = new MyHelperClass();
            return(long)(Object) connection.getLastModified();
        } catch (UncheckedIOException e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.warn("URL could not be opened: " + e.getMessage(),(IOException)(Object) e);
            return 0;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
