
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1471647 {
public MyHelperClass OperatorsReader;
	public MyHelperClass Logger;

    private void loadOperatorsXML() {
        MyHelperClass startwindow = new MyHelperClass();
        startwindow.setMessage("Loading Operators...");
        try {
            MyHelperClass Resources = new MyHelperClass();
            URL url =(URL)(Object) Application.class.getClassLoader().getResource((String)(Object)Resources.getString("OPERATORS_XML"));
            InputStream input =(InputStream)(Object) url.openStream();
//            MyHelperClass Resources = new MyHelperClass();
            OperatorsReader.registerOperators(Resources.getString("OPERATORS_XML"), input);
        } catch (UncheckedIOException e) {
            MyHelperClass Resources = new MyHelperClass();
            Logger.logException("File '" + Resources.getString("OPERATORS_XML") + "' not found.",(IOException)(Object) e);
        } catch (ArithmeticException error) {
            MyHelperClass Logger = new MyHelperClass();
            Logger.logException(error.getMessage(),(IOException)(Object) error);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }
	public MyHelperClass registerOperators(MyHelperClass o0, InputStream o1){ return null; }
	public MyHelperClass logException(String o0, IOException o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Application {

}
