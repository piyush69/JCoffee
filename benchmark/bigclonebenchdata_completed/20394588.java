
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20394588 {

    public static Font createTrueTypeFont(URL url, int style, float size) {
        Font f = null;
        try {
            MyHelperClass Font = new MyHelperClass();
            f =(Font)(Object) Font.createFont(Font.TRUETYPE_FONT, url.openStream());
        } catch (UncheckedIOException e) {
            System.err.println("ERROR: " + url + " is not found or can not be read");
            f = new Font("Verdana", 0, 0);
        } catch (ArithmeticException e) {
            System.err.println("ERROR: " + url + " is not a valid true type font");
            f = new Font("Verdana", 0, 0);
        }
        return(Font)(Object) f.deriveFont(style, size);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRUETYPE_FONT;
public MyHelperClass createFont(MyHelperClass o0, MyHelperClass o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Font {

Font(String o0, int o1, int o2){}
	Font(){}
	public MyHelperClass deriveFont(int o0, float o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FontFormatException extends Exception{
	public FontFormatException(String errorMessage) { super(errorMessage); }
}
