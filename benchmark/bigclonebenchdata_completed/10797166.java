
import java.io.UncheckedIOException;


class c10797166 {

    public static String readFromUrl(String url) {
        URL url_ = null;
        URLConnection uc = null;
        BufferedReader in = null;
        StringBuilder str = new StringBuilder();
        try {
            url_ = new URL(url);
            uc =(URLConnection)(Object) url_.openConnection();
            in = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String inputLine;
            while ((inputLine =(String)(Object) in.readLine()) != null) str.append(inputLine);
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return str.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
