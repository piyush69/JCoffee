
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15418447 {

    public static boolean isImageLinkReachable(WebImage image) {
        if (image.getUrl() == null) return false;
        try {
            URL url = new URL(image.getUrl());
            url.openStream().close();
        } catch (UncheckedIOException e) {
            return false;
        } catch (ArithmeticException e) {
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass close(){ return null; }}

class WebImage {

public MyHelperClass getUrl(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
