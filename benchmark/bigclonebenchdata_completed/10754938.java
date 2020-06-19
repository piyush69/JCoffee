
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10754938 {

    public static URL getIconURLForUser(String id) {
        try {
            URL url = new URL("http://profiles.yahoo.com/" + id);
            BufferedReader r = new BufferedReader(new InputStreamReader(url.openStream()));
            String input = null;
            while ((input =(String)(Object) r.readLine()) != null) {
                if (input.indexOf("<a href=\"") < 0) continue;
                if (input.indexOf("<img src=\"") < 0) continue;
                if (input.indexOf("<a href=\"") > input.indexOf("<img src=\"")) continue;
                String href = input.substring(input.indexOf("<a href=\"") + 9);
                String src = input.substring(input.indexOf("<img src=\"") + 10);
                if (href.indexOf("\"") < 0) continue;
                if (src.indexOf("\"") < 0) continue;
                href = href.substring(0, href.indexOf("\""));
                src = src.substring(0, src.indexOf("\""));
                if (href.equals(src)) {
                    return new URL(href);
                }
            }
        } catch (UncheckedIOException e) {
        }
        URL toReturn = null;
        try {
            toReturn = new URL("http://us.i1.yimg.com/us.yimg.com/i/ppl/no_photo.gif");
        } catch (UncheckedIOException e) {
            MyHelperClass Debug = new MyHelperClass();
            Debug.assrt(false);
        }
        return toReturn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass assrt(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
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

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
