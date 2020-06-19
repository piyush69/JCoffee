
import java.io.UncheckedIOException;


class c20851065 {
public MyHelperClass setInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass setOutputStream(MyHelperClass o0){ return null; }

    public void open(String openStr) throws IOException {
        String commProtocol = "comm:";
        String rxtxProtocol = "rxtx:";
        String netProtocol = "net:";
        if (openStr.startsWith(commProtocol)) {
            MyHelperClass CommConnection = new MyHelperClass();
            CommConnection commConnection =(CommConnection)(Object) CommConnection.open(openStr.substring(commProtocol.length()));
            this.setInputStream(commConnection.getInputStream());
            this.setOutputStream(commConnection.getOutputStream());
        } else if (openStr.startsWith(rxtxProtocol)) {
            MyHelperClass RXTXConnection = new MyHelperClass();
            RXTXConnection rxtxConnection =(RXTXConnection)(Object) RXTXConnection.open(openStr.substring(commProtocol.length()));
            this.setInputStream(rxtxConnection.getInputStream());
            this.setOutputStream(rxtxConnection.getOutputStream());
        } else if (openStr.startsWith(netProtocol)) {
            MyHelperClass SocketConnection = new MyHelperClass();
            SocketConnection socketConn =(SocketConnection)(Object) SocketConnection.open(openStr.substring(netProtocol.length()));
            this.setInputStream(socketConn.getInputStream());
            this.setOutputStream(socketConn.getOutputStream());
        } else {
            URL url = new URL(openStr);
            URLConnection urlConn =(URLConnection)(Object) url.openConnection();
            this.setInputStream(urlConn.getInputStream());
            try {
                this.setOutputStream(urlConn.getOutputStream());
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass open(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CommConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class RXTXConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class SocketConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class UnknownServiceException extends Exception{
	public UnknownServiceException(String errorMessage) { super(errorMessage); }
}
