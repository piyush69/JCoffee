
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22320592 {

    private static void loadDefaultPreferences() {
        try {
            URL url =(URL)(Object) ClassLoader.getSystemResource("OpenDarkRoom.defaults.properties");
            MyHelperClass preferences = new MyHelperClass();
            preferences.load(url.openStream());
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Default preferences file not found");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
