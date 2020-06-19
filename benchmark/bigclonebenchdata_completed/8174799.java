
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8174799 {

//    @Override
    public String getFeedFeed(String sUrl) {
        try {
            URL url = new URL(sUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String result = "";
            String line;
            for (; (line =(String)(Object) reader.readLine()) != null; result += line) {
            }
            reader.close();
            return result;
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return null;
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
