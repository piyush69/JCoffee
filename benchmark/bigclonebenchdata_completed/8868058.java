
import java.io.UncheckedIOException;


class c8868058 {

    private String getPage(String urlString) throws Exception {
        MyHelperClass pageBuffer = new MyHelperClass();
        if ((boolean)(Object)pageBuffer.containsKey(urlString)) return(String)(Object) pageBuffer.get(urlString);
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        connection.connect();
        BufferedReader in = null;
        StringBuilder page = new StringBuilder();
        try {
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line =(String)(Object) in.readLine()) != null) {
                page.append(line);
                page.append("\n");
            }
        } catch (UncheckedIOException ioe) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Failed to read web page");
        } finally {
            if (in != null) {
                in.close();
            }
        }
        return page.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

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
