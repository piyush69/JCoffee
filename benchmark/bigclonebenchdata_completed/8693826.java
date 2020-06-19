
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8693826 {
public MyHelperClass Log;

    private String readJsonString() {
        StringBuilder builder = new StringBuilder();
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass SERVER_URL = new MyHelperClass();
        HttpGet httpGet = new HttpGet(SERVER_URL);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(httpGet);
            StatusLine statusLine =(StatusLine)(Object) response.getStatusLine();
            int statusCode =(int)(Object) statusLine.getStatusCode();
            if (statusCode == 200) {
                HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                InputStream content =(InputStream)(Object) entity.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(content));
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    builder.append(line);
                }
            } else {
                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, "Failed to download file");
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(){}
	HttpGet(MyHelperClass o0){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class StatusLine {

public MyHelperClass getStatusCode(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
