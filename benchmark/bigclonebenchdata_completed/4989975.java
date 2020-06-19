
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4989975 {

    public InputStream sendReceive(String trackerURL) throws TorrentException {
        try {
            URL url = new URL(trackerURL);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            conn.setDoOutput(true);
            MyHelperClass in = new MyHelperClass();
            in = conn.getInputStream();
        } catch (UncheckedIOException e) {
            throw new TorrentException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new TorrentException((String)(Object)e);
        }
        MyHelperClass in = new MyHelperClass();
        return (InputStream)(Object)in;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

}

class TorrentException extends Exception{
	public TorrentException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
