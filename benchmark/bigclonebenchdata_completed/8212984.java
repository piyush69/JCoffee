
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8212984 {
public MyHelperClass createURLStringExistRESTGetXQuery(String o0){ return null; }

    private void readCard() {
        try {
            MyHelperClass cata = new MyHelperClass();
            final String urlString =(String)(Object) createURLStringExistRESTGetXQuery("//scheda[cata = \"" + cata + "\"]");
            InputStream inputStream =(InputStream)(Object) (new URL(urlString).openStream());
            MyHelperClass uiSchedaXml = new MyHelperClass();
            uiSchedaXml.read(inputStream);
            inputStream.close();
        } catch (UncheckedIOException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(InputStream o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

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
