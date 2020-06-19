
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10005879 {
public MyHelperClass setContentView(TextView o0){ return null; }

//    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet httpGetRequest = new HttpGet("http://www.google.com/");
        String line = "", responseString = "";
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(httpGetRequest);
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
                while ((line =(String)(Object) br.readLine()) != null) {
                    responseString += line;
                }
                br.close();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        tv.setText(responseString);
        setContentView(tv);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Bundle {

}

class TextView {

TextView(){}
	TextView(c10005879 o0){}
	public MyHelperClass setText(String o0){ return null; }}

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

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
