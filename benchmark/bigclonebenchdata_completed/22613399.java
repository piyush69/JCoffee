
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22613399 {

    public Font getFont(String urlToFont) {
        Font testFont = null;
        try {
            InputStream inps =(InputStream)(Object) (new URL(urlToFont)).openStream();
            MyHelperClass Font = new MyHelperClass();
            testFont =(Font)(Object) Font.createFont(Font.TRUETYPE_FONT, inps);
        } catch (UncheckedIOException ffe) {
            ffe.printStackTrace();
        } catch (ArithmeticException ioe) {
            MyHelperClass JOptionPane = new MyHelperClass();
            JOptionPane.showMessageDialog(null, "Could not load font - " + urlToFont, "Unable to load font", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return testFont;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TRUETYPE_FONT;
	public MyHelperClass WARNING_MESSAGE;
public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass createFont(MyHelperClass o0, InputStream o1){ return null; }}

class Font {

}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FontFormatException extends Exception{
	public FontFormatException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
