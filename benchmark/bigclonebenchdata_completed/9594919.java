
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9594919 {

//    @Override
    public boolean handle(Message m, XMPPConnection connection) {
        if ((boolean)(Object)m.getBody().toLowerCase().startsWith("http://")) {
            try {
                URL url = new URL(m.getBody());
                URLConnection urlconn =(URLConnection)(Object) url.openConnection();
                urlconn.connect();
                String type =(String)(Object) urlconn.getContentType();
                boolean found = false;
                MyHelperClass grabbers = new MyHelperClass();
                for (ContentGrabber h :(ContentGrabber[])(Object) (Object[])(Object)grabbers) {
                    if (type.equals(h.contentType)) {
                        found = true;
                        MyHelperClass SheevaSage = new MyHelperClass();
                        SheevaSage.reply(m, "Give me a moment here...", connection);
                        h.handle(urlconn);
//                        MyHelperClass SheevaSage = new MyHelperClass();
                        SheevaSage.reply(m, "Done", connection);
                        break;
                    }
                }
                if (!found) {
                    MyHelperClass SheevaSage = new MyHelperClass();
                    SheevaSage.reply(m, "I have no idea what to do with that", connection);
                }
            } catch (UncheckedIOException e) {
                MyHelperClass SheevaSage = new MyHelperClass();
                SheevaSage.reply(m, "That is one ass-ugly URL. What in the name of " + "shuddering fuck do you expect me to do with it?", connection);
                e.printStackTrace();
            } catch (ArithmeticException e) {
                MyHelperClass SheevaSage = new MyHelperClass();
                SheevaSage.reply(m, "Something's fucked up with that URL. You sure it works?", connection);
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass reply(Message o0, String o1, XMPPConnection o2){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class Message {

public MyHelperClass getBody(){ return null; }}

class XMPPConnection {

}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentType(){ return null; }
	public MyHelperClass connect(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ContentGrabber {
public MyHelperClass contentType;
public MyHelperClass handle(URLConnection o0){ return null; }}
