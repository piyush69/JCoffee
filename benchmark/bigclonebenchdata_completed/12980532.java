
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12980532 {

    public String htmlContentSimple(String urlStr, String charset) {
        StringBuffer html = new StringBuffer();
        URL url = null;
        BufferedReader reader = null;
        try {
            url = new URL(urlStr);
            reader = new BufferedReader(new InputStreamReader(url.openStream(), charset));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                html.append(line).append("\r\n");
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) try {
                reader.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return html.toString();
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
	InputStreamReader(MyHelperClass o0, String o1){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
