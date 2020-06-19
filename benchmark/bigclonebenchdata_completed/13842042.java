
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13842042 {

//    @Override
    protected Properties loadFile(String fileName) {
        Properties prop = new Properties();
        try {
            URL url =(URL)(Object) (new File(fileName).toURI().toURL());
            final InputStream input =(InputStream)(Object) url.openStream();
            prop.load(input);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return prop;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toURL(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass toURI(){ return null; }}

class InputStream {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
