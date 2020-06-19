
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21998571 {

    private String readTwitterFead() {
        StringBuilder builder = new StringBuilder();
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("http://twitter.com/statuses/user_timeline/vogella.json");
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
                MyHelperClass Log = new MyHelperClass();
                Log.e(AndroidJsonTestingActivity.class.getName(), "Failed to download file");
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

public MyHelperClass e(String o0, String o1){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

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

class AndroidJsonTestingActivity {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
