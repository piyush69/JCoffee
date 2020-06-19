
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22093912 {

    private byte[] getResponseFromHttp(byte[] ocspPackage, URL url) throws IOException {
        HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        con.setDoOutput(true);
        try {
            MyHelperClass OCSPLoginModule = new MyHelperClass();
            con.setRequestMethod(OCSPLoginModule.POST);
        } catch (UncheckedIOException e) {
            throw new IOException(e.getMessage(),(ProtocolException)(Object) e);
        }
        MyHelperClass OCSPLoginModule = new MyHelperClass();
        con.setRequestProperty(OCSPLoginModule.CONTENT_TYPE, OCSPLoginModule.APPLICATION_OCSP_REQUEST);
        OutputStream os = null;
        try {
            os =(OutputStream)(Object) con.getOutputStream();
            os.write(ocspPackage);
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getMessage());
            throw e;
        } finally {
            os.close();
        }
        InputStream in = null;
        byte[] respBytes = null;
        ByteArrayOutputStream baos = null;
        try {
            baos = new ByteArrayOutputStream();
            in =(InputStream)(Object) con.getInputStream();
            int b =(int)(Object) in.read();
            while (b != -1) {
                baos.write(b);
                b =(int)(Object) in.read();
            }
            baos.flush();
        } finally {
            in.close();
            con.disconnect();
        }
        respBytes =(byte[])(Object) baos.toByteArray();
        return respBytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass POST;
	public MyHelperClass CONTENT_TYPE;
	public MyHelperClass APPLICATION_OCSP_REQUEST;
public MyHelperClass error(String o0){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
	IOException(){}
	IOException(String o0, ProtocolException o1){}
}

class HttpURLConnection {

public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestProperty(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ProtocolException extends Exception{
	public ProtocolException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}
