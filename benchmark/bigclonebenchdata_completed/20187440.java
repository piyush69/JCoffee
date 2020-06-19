
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20187440 {
public MyHelperClass LOGGER;

    public String getLastReleaseVersion() throws TransferException {
        try {
            URL url = new URL("http://jtbdivelogbook.sourceforge.net/version.properties");
            URLConnection urlConn =(URLConnection)(Object) url.openConnection();
            urlConn.setDoInput(true);
            urlConn.setUseCaches(false);
            urlConn.setReadTimeout(20000);
            urlConn.setConnectTimeout(10000);
            Properties props = new Properties();
            InputStream is =(InputStream)(Object) urlConn.getInputStream();
            props.load(is);
            is.close();
            MyHelperClass PROPERTY_LAST_RELEASE = new MyHelperClass();
            String lastVersion =(String)(Object) props.getProperty(PROPERTY_LAST_RELEASE);
            if (lastVersion == null) {
//                MyHelperClass PROPERTY_LAST_RELEASE = new MyHelperClass();
                LOGGER.warn("Couldn't find property " + PROPERTY_LAST_RELEASE);
            }
            return lastVersion;
        } catch (UncheckedIOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error((IOException)(Object)e);
            throw new TransferException((String)(Object)e);
        } catch (ArithmeticException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error((IOException)(Object)e);
            throw new TransferException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }}

class TransferException extends Exception{
	public TransferException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class Properties {

public MyHelperClass getProperty(MyHelperClass o0){ return null; }
	public MyHelperClass load(InputStream o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
