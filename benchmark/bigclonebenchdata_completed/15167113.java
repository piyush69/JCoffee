
import java.io.UncheckedIOException;


class c15167113 {
public static MyHelperClass getAccessURL(String o0){ return null; }
//public MyHelperClass getAccessURL(String o0){ return null; }

    public static void doHttpPost(String urlName, byte[] data, String contentType, String cookieData) throws InteropException {
        URL url =(URL)(Object) getAccessURL(urlName);
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Cookie", cookieData);
            connection.setRequestProperty("Content-type", contentType);
            connection.setRequestProperty("Content-length", "" + data.length);
            OutputStream stream =(OutputStream)(Object) connection.getOutputStream();
            stream.write(data);
            stream.flush();
            stream.close();
            connection.connect();
            InputStream inputStream =(InputStream)(Object) connection.getInputStream();
            inputStream.close();
        } catch (UncheckedIOException ex) {
            throw new InteropException("Error POSTing to " + urlName,(IOException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InteropException extends Exception{
	public InteropException(String errorMessage) { super(errorMessage); }
	InteropException(String o0, IOException o1){}
	InteropException(){}
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
