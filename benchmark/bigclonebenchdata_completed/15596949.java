
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15596949 {
public static MyHelperClass fixFilename(String o0){ return null; }
//public MyHelperClass fixFilename(String o0){ return null; }

    private static Image tryLoadImageFromFile(String filename, String path, int width, int height) {
        Image image = null;
        try {
            URL url;
            MyHelperClass pathSeparator = new MyHelperClass();
            url = new URL("file:" + path + pathSeparator + fixFilename(filename));
            if (url.openStream() != null) {
                MyHelperClass Toolkit = new MyHelperClass();
                image =(Image)(Object) Toolkit.getDefaultToolkit().getImage(url);
            }
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        if (image != null) {
            return(Image)(Object) image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        } else {
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getImage(URL o0){ return null; }
	public MyHelperClass getDefaultToolkit(){ return null; }}

class Image {

public MyHelperClass getScaledInstance(int o0, int o1, int o2){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
