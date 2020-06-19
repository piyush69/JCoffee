import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c8535393 {

    public static InputStream getRemoteIS(URL url, String post) throws ArcImsException {
        InputStream lector = null;
        try {
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Content-length", "" + post.length());
            OutputStreamWriter wr = new OutputStreamWriter((OutputStream)(Object)conn.getOutputStream());
            wr.write(post);
            wr.flush();
            MyHelperClass logger = new MyHelperClass();
            logger.info("downloading '" + url.toString());
            lector =(InputStream)(Object) conn.getInputStream();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Timed out error",(ProtocolException)(Object) e);
            throw new ArcImsException("arcims_server_timeout");
        } catch (ArithmeticException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getMessage(),(ProtocolException)(Object) e);
            throw new ArcImsException("arcims_server_error");
        } catch (IOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getMessage(), e);
            throw new ArcImsException("arcims_server_error");
        }
        return lector;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, ProtocolException o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0, ConnectException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class ArcImsException extends Exception{
	public ArcImsException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class ProtocolException extends Exception{
	public ProtocolException(String errorMessage) { super(errorMessage); }
}
