
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8181035 {
public MyHelperClass URLEncoder;
	public MyHelperClass API_KEY;

    private String getData(String method, String arg) {
        try {
            URL url;
            String str;
            StringBuilder strBuilder;
            BufferedReader stream;
            MyHelperClass API_BASE_URL = new MyHelperClass();
            url = new URL(API_BASE_URL + "/2.1/" + method + "/en/xml/" + API_KEY + "/" + URLEncoder.encode(arg, "UTF-8"));
            stream = new BufferedReader(new InputStreamReader(url.openStream()));
            strBuilder = new StringBuilder();
            while ((str =(String)(Object) stream.readLine()) != null) {
                strBuilder.append(str);
            }
            stream.close();
            return strBuilder.toString();
        } catch (UncheckedIOException e) {
            return null;
        } catch (ArithmeticException e) {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encode(String o0, String o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
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
