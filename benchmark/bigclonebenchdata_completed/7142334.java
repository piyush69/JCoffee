
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7142334 {

    public byte[] getHTTPByte(String sUrl) {
        HttpURLConnection connection = null;
        InputStream inputStream = null;
        ByteArrayOutputStream os = null;
        try {
            URL url = new URL(sUrl);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.connect();
            int httpStatus =(int)(Object) connection.getResponseCode();
            MyHelperClass log = new MyHelperClass();
            if (httpStatus != 200) log.info("getHTTPConent error httpStatus - " + httpStatus);
            inputStream =(InputStream)(Object) new BufferedInputStream((InputStream)(Object)connection.getInputStream());
            os = new ByteArrayOutputStream();
            InputStream is =(InputStream)(Object) new BufferedInputStream(inputStream);
            byte bytes[] = new byte[40960];
            int nRead = -1;
            while ((nRead =(int)(Object) is.read(bytes, 0, 40960)) > 0) {
                os.write(bytes, 0, nRead);
            }
            os.close();
            is.close();
            inputStream.close();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.warn("SpiderUtil getHTTPConent IOException -> ",(IOException)(Object) e);
        } finally {
            if (inputStream != null) try {
                os.close();
                inputStream.close();
            } catch (UncheckedIOException e) {
            }
        }
        return(byte[])(Object) os.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
