
import java.io.UncheckedIOException;


class c8787103 {
public MyHelperClass url;

    private void headinfoThread() {
        try {
            URLConnection urlc =(URLConnection)(Object) url.openConnection();
            MyHelperClass resource = new MyHelperClass();
            resource.setFileSize(urlc.getContentLength());
//            MyHelperClass resource = new MyHelperClass();
            resource.setDate(urlc.getLastModified());
        } catch (UncheckedIOException e) {
            System.out.println("Error ResourceConnection, downloading headinfo");
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setDate(MyHelperClass o0){ return null; }
	public MyHelperClass setFileSize(MyHelperClass o0){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
