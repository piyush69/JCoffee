
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c356222 {
public MyHelperClass getCodeBase(){ return null; }

    public String connectToServlet() {
        URL urlStory = null;
        BufferedReader brStory;
        String result = "";
        try {
            urlStory = new URL(getCodeBase(), "http://localhost:8080/javawebconsole/ToApplet");
        } catch (UncheckedIOException MUE) {
            MUE.printStackTrace();
        }
        try {
            brStory = new BufferedReader(new InputStreamReader(urlStory.openStream()));
            while ((boolean)(Object)brStory.ready()) {
                result += brStory.readLine();
            }
        } catch (UncheckedIOException IOE) {
            IOE.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(MyHelperClass o0, String o1){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
