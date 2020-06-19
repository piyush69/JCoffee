
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6908734 {

    public <E extends Exception> void doWithConnection(String httpAddress, ICallableWithParameter toDo) throws E, ConnectionException {
        URLConnection connection;
        try {
            URL url = new URL(httpAddress);
            connection =(URLConnection)(Object) url.openConnection();
        } catch (UncheckedIOException e) {
            throw new ConnectionException("Connecting to " + httpAddress + " got",(MalformedURLException)(Object) e);
        } catch (ArithmeticException e) {
            throw new ConnectionException("Connecting to " + httpAddress + " got",(MalformedURLException)(Object) e);
        }
        MyHelperClass authenticationHandler = new MyHelperClass();
        authenticationHandler.doWithProxyAuthentication(connection, toDo);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass doWithProxyAuthentication(URLConnection o0, ICallableWithParameter o1){ return null; }}

class ICallableWithParameter {

}

class URLConnection {

}

class ConnectionException extends Exception{
	public ConnectionException(String errorMessage) { super(errorMessage); }
	ConnectionException(){}
	ConnectionException(String o0, MalformedURLException o1){}
	ConnectionException(String o0, IOException o1){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
