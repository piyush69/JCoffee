
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20267500 {
public static MyHelperClass AudioSystem;
//public MyHelperClass AudioSystem;

    public static AudioInputStream getWavFromURL(String urlstr) {
        URL url;
        AudioInputStream ais = null;
        try {
            url = new URL(urlstr);
            URLConnection c =(URLConnection)(Object) url.openConnection();
            c.connect();
            InputStream stream =(InputStream)(Object) c.getInputStream();
            MyHelperClass playFormat = new MyHelperClass();
            ais = new AudioInputStream(stream, playFormat, AudioSystem.NOT_SPECIFIED);
            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("[getWavFromURL]Getting audio from URL: {0}");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return ais;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NOT_SPECIFIED;
public MyHelperClass debug(String o0){ return null; }}

class AudioInputStream {

AudioInputStream(){}
	AudioInputStream(InputStream o0, MyHelperClass o1, MyHelperClass o2){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class InputStream {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
