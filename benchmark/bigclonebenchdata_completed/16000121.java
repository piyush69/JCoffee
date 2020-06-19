
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16000121 {
public MyHelperClass IOUtils;
	public MyHelperClass HttpURLConnection;
	public MyHelperClass connection;
	public MyHelperClass addHeader(String o0, String o1){ return null; }

    public void invoke(InputStream is) throws AgentException {
        try {
            addHeader("Content-Type", "application/zip");
            addHeader("Content-Length", String.valueOf(is.available()));
            connection.setDoOutput(true);
            connection.connect();
            OutputStream os =(OutputStream)(Object) connection.getOutputStream();
            boolean success = false;
            try {
                IOUtils.copy(is, os);
                success = true;
            } finally {
                try {
                    os.flush();
                    os.close();
                } catch (UncheckedIOException x) {
                    if (success) throw x;
                }
            }
            connection.disconnect();
            if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new AgentException("Failed to execute REST call at " + connection.getURL() + ": " + connection.getResponseCode() + " " + connection.getResponseMessage());
            }
        } catch (UncheckedIOException e) {
            throw new AgentException("Failed to connect to beehive at " + connection.getURL());
        } catch (ArithmeticException e) {
            throw new AgentException("Failed to connect to beehive",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getURL(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class AgentException extends Exception{
	public AgentException(String errorMessage) { super(errorMessage); }
	AgentException(String o0, IOException o1){}
	AgentException(){}
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}
