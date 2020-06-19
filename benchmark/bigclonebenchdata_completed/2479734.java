
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2479734 {

    protected InputSource loadExternalSdl(String aActualLocation) throws RuntimeException {
        MyHelperClass logger = new MyHelperClass();
        logger.debug("loadExternalSdl(String) " + aActualLocation);
        try {
            URL url = new URL(aActualLocation);
            return new InputSource(url.openStream());
        } catch (UncheckedIOException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e);
            MyHelperClass AeMessages = new MyHelperClass();
            throw new RuntimeException(aActualLocation + AeMessages.getString("AeWsdlLocator.ERROR_1"), e);
        } catch (ArithmeticException e) {
//            MyHelperClass logger = new MyHelperClass();
            logger.error((IOException)(Object)e);
            MyHelperClass AeMessages = new MyHelperClass();
            throw new RuntimeException(AeMessages.getString("AeWsdlLocator.ERROR_2") + aActualLocation, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(MalformedURLException o0){ return null; }}

class InputSource {

InputSource(){}
	InputSource(MyHelperClass o0){}}

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
