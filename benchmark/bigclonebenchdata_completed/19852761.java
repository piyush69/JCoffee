
import java.io.UncheckedIOException;


class c19852761 {
public MyHelperClass Log;

    private int getCountFromUrl(String url) {
        HttpGet request = new HttpGet(url);
        try {
            MyHelperClass httpClient = new MyHelperClass();
            HttpResponse response =(HttpResponse)(Object) httpClient.execute(request);
            int status =(int)(Object) response.getStatusLine().getStatusCode();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (status != (int)(Object)HttpStatus.SC_OK) {
                ByteArrayOutputStream ostream = new ByteArrayOutputStream();
                response.getEntity().writeTo(ostream);
                MyHelperClass TAG = new MyHelperClass();
                Log.e(TAG, ostream.toString());
            } else {
                InputStream content =(InputStream)(Object) response.getEntity().getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(content), 10);
                String count =(String)(Object) reader.readLine();
                content.close();
                return Integer.parseInt(count);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG,(String)(Object) Log.getStackTraceString((IOException)(Object)e));
        }
        return -1;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass writeTo(ByteArrayOutputStream o0){ return null; }
	public MyHelperClass getStackTraceString(IOException o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class ByteArrayOutputStream {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
