
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13196323 {
public MyHelperClass logger;

    public void sendMessage(Message msg) {
        MyHelperClass blackList = new MyHelperClass();
        if (!(Boolean)(Object)blackList.contains(msg.getTo())) {
            Hashtable content =(Hashtable)(Object) msg.getContent();
            Enumeration keys =(Enumeration)(Object) content.keys();
            String key;
            String data = "to=" + msg.getTo() + "&from=" + msg.getFrom() + "&";
            while ((boolean)(Object)keys.hasMoreElements()) {
                key = (String)(String)(Object) keys.nextElement();
                data += key + "=" + content.get(key) + "&";
            }
            URL url = null;
            try {
                MyHelperClass Level = new MyHelperClass();
                logger.log(this, Level.FINER, "sending " + data + " to " + msg.getTo());
                url = new URL("http://" + msg.getTo() + ":8080/webmsgservice?" + data);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
                in.readLine();
                in.close();
//                MyHelperClass Level = new MyHelperClass();
                logger.log(this, Level.FINER, "message sent to " + msg.getTo());
            } catch (UncheckedIOException e) {
//                MyHelperClass blackList = new MyHelperClass();
                blackList.add(msg.getTo());
                MyHelperClass Level = new MyHelperClass();
                logger.log(this, Level.WARNING, "an error occured during message sending (" + msg.getTo() + ") : " + e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                MyHelperClass Level = new MyHelperClass();
                logger.log(this, Level.WARNING, "an error occured during message sending (" + msg.getTo() + ") : " + e.getMessage());
//                MyHelperClass blackList = new MyHelperClass();
                blackList.add(msg.getTo());
            }
        } else {
            MyHelperClass Level = new MyHelperClass();
            logger.log(this, Level.FINE, "will not send message to " + msg.getTo() + " because black listed IP");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass FINER;
	public MyHelperClass FINE;
public MyHelperClass log(c13196323 o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass contains(MyHelperClass o0){ return null; }}

class Message {

public MyHelperClass getFrom(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass getTo(){ return null; }}

class Hashtable {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class Enumeration {

public MyHelperClass hasMoreElements(){ return null; }
	public MyHelperClass nextElement(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
