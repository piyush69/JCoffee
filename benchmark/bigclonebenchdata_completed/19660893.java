
import java.io.UncheckedIOException;


class c19660893 {

    private String load(URL url) {
        BufferedReader r = null;
        try {
            r = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buf = new StringBuffer();
            while ((boolean)(Object)r.ready()) {
                buf.append(r.readLine()).append('\n');
            }
            r.close();
            return buf.toString();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.severe("Could not load shader program: " + e);
            MyHelperClass Level = new MyHelperClass();
            logger.logp(Level.SEVERE, getClass().getName(), "load(URL)", "Exception",(IOException)(Object) e);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass logp(MyHelperClass o0, String o1, String o2, String o3, IOException o4){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
