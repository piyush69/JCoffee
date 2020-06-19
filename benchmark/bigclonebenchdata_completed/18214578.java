
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18214578 {
public MyHelperClass loadFromJad(URL o0){ return null; }
public MyHelperClass jad;
	public MyHelperClass setStatusBar(String o0){ return null; }

    public void openJadFile(URL url) {
        try {
            setStatusBar("Loading...");
            jad.clear();
            jad.load(url.openStream());
            loadFromJad(url);
        } catch (UncheckedIOException ex) {
            System.err.println("Cannot found " + url.getPath());
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.err.println("Cannot open jad " + url.getPath());
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.err.println("Cannot open jad " + url.getPath());
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
            System.err.println("Cannot open jad " + url.getPath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class URL {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
