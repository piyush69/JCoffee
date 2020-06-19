
import java.io.UncheckedIOException;


class c22249465 {
public static MyHelperClass quote(String o0){ return null; }
//public MyHelperClass quote(String o0){ return null; }

    public static String getWebPage(URL urlObj) {
        try {
            String content = "";
            InputStreamReader is = new InputStreamReader(urlObj.openStream());
            BufferedReader reader = new BufferedReader(is);
            String line;
            while ((line =(String)(Object) reader.readLine()) != null) {
                content += line;
            }
            return content;
        } catch (UncheckedIOException e) {
            throw new Error("The page " + quote(urlObj.toString()) + "could not be retrieved." + "\nThis is could be caused by a number of things:" + "\n" + "\n  - the computer hosting the web page you want is down, or has returned an error" + "\n  - your computer does not have Internet access" + "\n  - the heat death of the universe has occurred, taking down all web servers with it");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
