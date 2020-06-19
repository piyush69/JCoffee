
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22022886 {

    public static String fetchURL(final String u) {
        String retStr = "";
        try {
            final URL url = new URL(u);
            final BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                retStr += line;
            }
            reader.close();
        } catch (final UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("MalformedURLException calling url" + e.getMessage());
        } catch (final ArithmeticException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("IOException calling url" + e.getMessage());
        }
        return retStr;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }}

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
