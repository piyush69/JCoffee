
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19332849 {

    public String getResponse(String URLstring) {
        String str = "";
        try {
            URL url = new URL(URLstring);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String st = "";
            while ((st =(String)(Object) in.readLine()) != null) {
                str += "\n" + st;
            }
            in.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return str;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
