
import java.io.UncheckedIOException;


class c17425238 {

    public static NSData sendSynchronousRequest(NSMutableURLRequest req, NSHTTPURLResponseHolder resp, NSErrorHolder error) {
        NSData data = null;
        URL url =(URL)(Object) req.URL().xmlvmGetURL();
        URLConnection conn;
        try {
            conn =(URLConnection)(Object) url.openConnection();
            data = new NSData(conn.getInputStream());
        } catch (UncheckedIOException e) {
        }
        return data;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass xmlvmGetURL(){ return null; }}

class NSMutableURLRequest {

public MyHelperClass URL(){ return null; }}

class NSHTTPURLResponseHolder {

}

class NSErrorHolder {

}

class NSData {

NSData(MyHelperClass o0){}
	NSData(){}}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
