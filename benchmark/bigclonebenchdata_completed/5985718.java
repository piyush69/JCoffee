
import java.io.UncheckedIOException;


class c5985718 {

    private String fetchLocalPage(String page) throws IOException {
        MyHelperClass HOST = new MyHelperClass();
        final String fullUrl = HOST + page;
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("Fetching local page: " + fullUrl);
        URL url = new URL(fullUrl);
        URLConnection connection =(URLConnection)(Object) url.openConnection();
        StringBuilder sb = new StringBuilder();
        BufferedReader input = null;
        try {
            input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = null;
            while ((line =(String)(Object) input.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } finally {
            if (input != null) try {
                input.close();
            } catch (UncheckedIOException e) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Could not close reader!",(IOException)(Object) e);
            }
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
