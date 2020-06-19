
import java.io.UncheckedIOException;


class c3577905 {

    public static TestResponse post(String urlString, byte[] data, String contentType, String accept) throws IOException {
        HttpURLConnection httpCon = null;
        byte[] result = null;
        byte[] errorResult = null;
        try {
            URL url = new URL(urlString);
            httpCon = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("POST");
            httpCon.setRequestProperty("Content-Type", contentType);
            httpCon.setRequestProperty("Accept", accept);
            if (data != null) {
                OutputStream output =(OutputStream)(Object) httpCon.getOutputStream();
                output.write(data);
                output.close();
            }
            BufferedInputStream in = new BufferedInputStream((InputStream)(Object)httpCon.getInputStream());
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            int next =(int)(Object) in.read();
            while (next > -1) {
                os.write(next);
                next =(int)(Object) in.read();
            }
            os.flush();
            result =(byte[])(Object) os.toByteArray();
            os.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            InputStream errorStream =(InputStream)(Object) httpCon.getErrorStream();
            if (errorStream != null) {
                BufferedInputStream errorIn = new BufferedInputStream(errorStream);
                ByteArrayOutputStream errorOs = new ByteArrayOutputStream();
                int errorNext =(int)(Object) errorIn.read();
                while (errorNext > -1) {
                    errorOs.write(errorNext);
                    errorNext =(int)(Object) errorIn.read();
                }
                errorOs.flush();
                errorResult =(byte[])(Object) errorOs.toByteArray();
                errorOs.close();
            }
            return new TestResponse(httpCon.getResponseCode(), errorResult, result);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class TestResponse {

TestResponse(){}
	TestResponse(MyHelperClass o0, byte[] o1, byte[] o2){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

}
