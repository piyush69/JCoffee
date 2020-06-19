
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22320591 {
public static MyHelperClass log;
//public MyHelperClass log;
	public static MyHelperClass loadDefaultPreferences(){ return null; }
//public MyHelperClass loadDefaultPreferences(){ return null; }

    public static void loadProperties() {
        try {
            URL url =(URL)(Object) ClassLoader.getSystemResource("OpenDarkRoom.lang.en.properties");
            MyHelperClass localization = new MyHelperClass();
            localization.load((FileInputStream)(Object)url.openStream());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        try {
            MyHelperClass userDir = new MyHelperClass();
            FileInputStream is = new FileInputStream(userDir + "OpenDarkRoom.properties");
            MyHelperClass preferences = new MyHelperClass();
            preferences.load(is);
        } catch (UncheckedIOException e) {
            MyHelperClass userDir = new MyHelperClass();
            log.warn("Preferences file " + userDir + "OpenDarkRoom.properties not found, loading defaults");
            loadDefaultPreferences();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(FileInputStream o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
