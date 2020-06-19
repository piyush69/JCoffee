
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1179431 {

    private String fetchHTML(String s) {
        String str;
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL(s);
            InputStream is =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            while ((str =(String)(Object) br.readLine()) != null) {
                sb.append(str);
            }
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
