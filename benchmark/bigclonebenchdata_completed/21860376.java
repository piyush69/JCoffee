
import java.io.UncheckedIOException;


class c21860376 {
public MyHelperClass Logger;

    public boolean checkConnection() {
        int tries = 3;
        for (int i = 0; i < tries; i++) {
            try {
                MyHelperClass wsURL = new MyHelperClass();
                final URL url = new URL(wsURL);
                final URLConnection conn =(URLConnection)(Object) url.openConnection();
                conn.setReadTimeout(3000);
                conn.getContent();
                return true;
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(ExternalSalesHelper.class.getName()).log(Level.SEVERE,(Object)(Object) null,(IOException)(Object) ex);
            }
            try {
                Thread.currentThread().sleep(2000);
            } catch (InterruptedException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(OrdersSync.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, InterruptedException o2){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ExternalSalesHelper {

}

class OrdersSync {

}
