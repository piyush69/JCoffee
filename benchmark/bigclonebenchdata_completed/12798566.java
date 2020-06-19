
import java.io.UncheckedIOException;


class c12798566 {

    private static void process(String urlstring) {
        try {
            URL url = new URL(urlstring);
            System.out.println("Connecting to " + url);
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            MyHelperClass MARKER = new MyHelperClass();
            for (String line; (line =(String)(Object) in.readLine()) != null; ) if (line.startsWith((String)(Object)MARKER)) {
                MyHelperClass TAG = new MyHelperClass();
                System.out.println(TAG.matcher(line).replaceAll(""));
            }
            in.close();
        } catch (UncheckedIOException ioe) {
            System.err.println("" + ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass replaceAll(String o0){ return null; }
	public MyHelperClass matcher(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

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
