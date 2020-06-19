
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22724697 {

    private Bitmap getBitmap(String imageUrl) {
        URL url;
        InputStream input = null;
        try {
            MyHelperClass address = new MyHelperClass();
            url = new URL(address + imageUrl);
            input =(InputStream)(Object) url.openStream();
            MyHelperClass BitmapFactory = new MyHelperClass();
            return(Bitmap)(Object) BitmapFactory.decodeStream(input);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return null;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass decodeStream(InputStream o0){ return null; }}

class Bitmap {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
