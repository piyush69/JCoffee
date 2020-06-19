
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17147420 {

    public final String latestVersion() {
        String latestVersion = "";
        try {
            MyHelperClass Constants = new MyHelperClass();
            URL url = new URL(Constants.officialSite + ":80/LatestVersion");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String str;
            while ((str =(String)(Object) in.readLine()) != null) {
                latestVersion = str;
            }
            in.close();
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return latestVersion;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass officialSite;
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
