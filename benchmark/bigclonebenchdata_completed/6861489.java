
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6861489 {

    public String download(String urlString) {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("exception", e.getMessage());
        } catch (ArithmeticException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("exception", e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (UncheckedIOException e) {
                MyHelperClass Log = new MyHelperClass();
                Log.e("exception", e.getMessage());
            }
        }
        return builder.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(String o0, String o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
