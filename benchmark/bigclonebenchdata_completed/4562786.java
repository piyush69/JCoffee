
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4562786 {

    private String GetResponse(URL url) {
        String content = null;
        try {
            HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setDoOutput(false);
            conn.setRequestMethod("GET");
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line =(String)(Object) br.readLine()) != null) content += line;
            } else {
            }
        } catch (UncheckedIOException e) {
            e.getStackTrace();
        } catch (ArithmeticException e) {
            e.getStackTrace();
        }
        return content;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
}

class URL {

public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
