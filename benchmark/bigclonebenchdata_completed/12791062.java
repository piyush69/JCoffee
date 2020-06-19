
import java.io.UncheckedIOException;


class c12791062 {

    public static boolean isUrlAvailable(String url) {
        boolean flag = true;
        try {
            URLConnection conn =(URLConnection)(Object) (new URL(url)).openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.connect();
            if ((int)(Object)conn.getDate() == 0) {
                flag = false;
            }
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error((IOException)(Object)e);
            flag = false;
        }
        return flag;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0){ return null; }}

class URLConnection {

public MyHelperClass getDate(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
