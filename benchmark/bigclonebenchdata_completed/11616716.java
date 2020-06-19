
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11616716 {
public static MyHelperClass FILE;
//public MyHelperClass FILE;

    private static InputStream getCMSResultAsStream(String rqlQuery) throws RQLException {
        OutputStreamWriter osr = null;
        try {
            MyHelperClass HOST = new MyHelperClass();
            URL url = new URL("http", HOST, FILE);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            osr = new OutputStreamWriter(conn.getOutputStream());
            osr.write(rqlQuery);
            osr.flush();
            return(InputStream)(Object) conn.getInputStream();
        } catch (UncheckedIOException ioe) {
            throw new RQLException("IO Exception reading result from server",(IOException)(Object) ioe);
        } finally {
            if (osr != null) {
                try {
                    osr.close();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class RQLException extends Exception{
	public RQLException(String errorMessage) { super(errorMessage); }
	RQLException(){}
	RQLException(String o0, IOException o1){}
}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class URL {

URL(){}
	URL(String o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
