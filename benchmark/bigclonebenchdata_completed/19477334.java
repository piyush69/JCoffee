
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19477334 {
public MyHelperClass Log;

    public String postData(String url, List nameValuePairs) {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        HttpPost httppost = new HttpPost(url);
        StringBuilder sb = new StringBuilder();
        try {
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            Header[] headers =(Header[])(Object) response.getAllHeaders();
            for (int i = 0; i < headers.length; i++) {
                MyHelperClass TAG = new MyHelperClass();
                Log.i(TAG, "HEADER: " + headers[i].getName() + " - " + headers[i].getValue());
            }
            InputStream is =(InputStream)(Object) response.getEntity().getContent();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while ((line =(String)(Object) reader.readLine()) != null) {
                System.out.println("Parsing line... " + line);
                sb.append(line);
                if (line.contains("<html xmlns:fn")) {
                    String gtinCode = line.substring(line.indexOf("GLN:") + 165, line.indexOf("GLN:") + 176);
                    MyHelperClass TAG = new MyHelperClass();
                    Log.i(TAG, "OUT: " + gtinCode);
                    break;
                }
            }
            MyHelperClass TAG = new MyHelperClass();
            Log.i(TAG, "Post Communication OK");
        } catch (UncheckedIOException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "ClientProtocolException ",(IOException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass TAG = new MyHelperClass();
            Log.e(TAG, "HTTP Not Available",(IOException)(Object) e);
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass i(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1, ClientProtocolException o2){ return null; }
	public MyHelperClass getContent(){ return null; }}

class List {

}

class NameValuePair {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getAllHeaders(){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
