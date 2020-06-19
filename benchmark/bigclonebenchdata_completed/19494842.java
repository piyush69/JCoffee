
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19494842 {
public MyHelperClass servicePath;
	public MyHelperClass attributes;

    private void callService() {
        try {
            MyHelperClass baseUrl = new MyHelperClass();
            URL url = new URL((int)(Object)baseUrl + (int)(Object)servicePath + (int)(Object)attributes);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            StringBuffer buf = new StringBuffer();
            while ((inputLine =(String)(Object) in.readLine()) != null) {
                buf.append(inputLine);
            }
            in.close();
            String answer;// = new String();
            answer = buf.toString();
        } catch (UncheckedIOException e) {
            String answer;// = new String();
            answer = "Malformed Url:" + e.getMessage();
            return;
        } catch (ArithmeticException e) {
            String answer;// = new String();
            answer = "I/O exception: " + e.getMessage();
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(int o0){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
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
