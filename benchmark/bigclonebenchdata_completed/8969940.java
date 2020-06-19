
import java.io.UncheckedIOException;


class c8969940 {
public MyHelperClass BitmapFactory;
	public MyHelperClass getError(){ return null; }

    private void Download(String uri) throws MalformedURLException {
        URL url = new URL(uri);
        try {
            MyHelperClass bm = new MyHelperClass();
            bm = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (UncheckedIOException ex) {
            MyHelperClass bm = new MyHelperClass();
            bm = getError();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass decodeStream(MyHelperClass o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
