
import java.io.UncheckedIOException;


class c18998637 {
public MyHelperClass Level;
	public MyHelperClass logger;
	public MyHelperClass addLast(String o0){ return null; }
	public MyHelperClass contains(String o0){ return null; }

    public boolean loadResource(String resourcePath) {
        try {
            URL url =(URL)(Object) Thread.currentThread().getContextClassLoader().getResource(resourcePath);
            if (url == null) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Cannot find the resource named: '" + resourcePath + "'. Failed to load the keyword list.");
                return false;
            }
            InputStreamReader isr = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(isr);
            String ligne =(String)(Object) br.readLine();
            while (ligne != null) {
                if (!(Boolean)(Object)contains(ligne.toUpperCase())) {
                    addLast(ligne.toUpperCase());
                }
                ligne =(String)(Object) br.readLine();
            }
            return true;
        } catch (UncheckedIOException ioe) {
            logger.log(Level.ERROR, "Cannot load default SQL keywords file.",(IOException)(Object) ioe);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass error(String o0){ return null; }}

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
