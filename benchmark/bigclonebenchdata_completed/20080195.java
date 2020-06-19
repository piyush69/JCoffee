
import java.io.UncheckedIOException;


class c20080195 {
public MyHelperClass loadDefaultDrivers(MyHelperClass o0){ return null; }

    public void restoreDrivers() throws ExplorerException {
        try {
            MyHelperClass drivers = new MyHelperClass();
            drivers.clear();
            MyHelperClass URLUtil = new MyHelperClass();
            URL url =(URL)(Object) URLUtil.getResourceURL("default_drivers.xml");
            loadDefaultDrivers(url.openStream());
        } catch (UncheckedIOException e) {
            throw new ExplorerException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceURL(String o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class ExplorerException extends Exception{
	public ExplorerException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
