
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3631989 {

    public void run() {
        URL url;
        try {
            url = new URL("http://localhost:8080/glowaxes/dailytrend.jsp");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            MyHelperClass str = new MyHelperClass();
            while ((str = in.readLine()) != null) {
            }
            in.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
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
