
import java.io.UncheckedIOException;


class c17722894 {

    public static String loadResource(String resource) {
        URL url =(URL)(Object) ClassLoader.getSystemResource("resources/" + resource);
        StringBuffer buffer = new StringBuffer();
        if (url == null) {
            MyHelperClass ErrorMessage = new MyHelperClass();
            ErrorMessage.handle(new NullPointerException("URL for resources/" + resource + " not found"));
        } else {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    buffer.append(line + "\n");
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return buffer.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass handle(NullPointerException o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
