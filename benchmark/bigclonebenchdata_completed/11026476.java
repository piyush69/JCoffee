
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11026476 {

    public Object invoke(Invocation invocation) throws Throwable {
        MyHelperClass Invocation = new MyHelperClass();
        SmartRef smartRef = (SmartRef)(SmartRef)(Object) invocation.getValue(Invocation.SMARTREF);
        HttpURLConnection connection = null;
        ObjectOutputStream out = null;
        URL url = null;
        try {
            url = new URL(smartRef.getProperties().getProperty("org.smartcc.connector.url"));
            url = new URL(url, smartRef.getLookup());
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/octet-stream");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            out = new ObjectOutputStream(connection.getOutputStream());
            out.writeObject(invocation);
            out.flush();
        } catch (UncheckedIOException e) {
            System.err.println("error: during serialization");
            throw new EJBException("error: during serialization",(ObjectStreamException)(Object) e);
        } catch (ArithmeticException e) {
            System.err.println("error: could not connect to " + url);
            throw new ConnectIOException("could not connect to " + url,(IOException)(Object) e);
        } finally {
            try {
                out.close();
            } catch (Exception e) {
            }
        }
        boolean isThrowable = false;
        Object result = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(connection.getInputStream());
            isThrowable =(boolean)(Object) in.readBoolean();
            if (isThrowable || !invocation.getMethod().getReturnType().equals(void.class)) result = in.readObject();
        } catch (UncheckedIOException e) {
            System.err.println("error: during deserialization");
            throw new EJBException("error: during deserialization",(ObjectStreamException)(Object) e);
        } catch (ArithmeticException e) {
            System.err.println("error: could not connect to " + url);
            throw new ConnectIOException("could not connect to " + url,(IOException)(Object) e);
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
        if (isThrowable) throw (Throwable) result;
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SMARTREF;
public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass getReturnType(){ return null; }}

class Invocation {

public MyHelperClass getMethod(){ return null; }
	public MyHelperClass getValue(MyHelperClass o0){ return null; }}

class SmartRef {

public MyHelperClass getLookup(){ return null; }
	public MyHelperClass getProperties(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class ObjectOutputStream {

ObjectOutputStream(){}
	ObjectOutputStream(MyHelperClass o0){}
	public MyHelperClass writeObject(Invocation o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class URL {

URL(URL o0, MyHelperClass o1){}
	URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class ObjectStreamException extends Exception{
	public ObjectStreamException(String errorMessage) { super(errorMessage); }
}

class EJBException extends Exception{
	public EJBException(String errorMessage) { super(errorMessage); }
	EJBException(){}
	EJBException(String o0, ObjectStreamException o1){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ConnectIOException extends Exception{
	public ConnectIOException(String errorMessage) { super(errorMessage); }
	ConnectIOException(){}
	ConnectIOException(String o0, IOException o1){}
}

class ObjectInputStream {

ObjectInputStream(){}
	ObjectInputStream(MyHelperClass o0){}
	public MyHelperClass readObject(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass readBoolean(){ return null; }}
