
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21369319 {

    private String readLine(final String urlStr) {
        BufferedReader reader;
        String line = null;
        try {
            URL url = new URL(urlStr);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            line =(String)(Object) reader.readLine();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error((MalformedURLException)(Object)e,(MalformedURLException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error((MalformedURLException)(Object)e,(MalformedURLException)(Object) e);
        }
        return line;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(MalformedURLException o0, MalformedURLException o1){ return null; }
	public MyHelperClass error(IOException o0, IOException o1){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
