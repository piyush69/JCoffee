
import java.io.UncheckedIOException;


class c8119563 {

    protected boolean checkLink(URL url) {
        try {
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.connect();
            return true;
        } catch (UncheckedIOException e) {
            MyHelperClass MsgLog = new MyHelperClass();
            MsgLog.error("DapParser.checkLink(): IOException: " + e.toString());
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass connect(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
