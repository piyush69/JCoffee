
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19930844 {
public MyHelperClass assertEquals(char o0, MyHelperClass o1){ return null; }
public MyHelperClass ClasspathURLConnection;
	public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testRegisterFactory() throws Exception {
        try {
            new URL("classpath:/");
            fail("MalformedURLException expected");
        } catch (UncheckedIOException e) {
            assertTrue(true);
        }
        ClasspathURLConnection.registerFactory();
        URL url = new URL("classpath:/dummy.txt");
        try {
            url.openStream();
            fail("IOException expected");
        } catch (UncheckedIOException e) {
            assertTrue(true);
        }
        ClasspathURLConnection.registerFactory();
        url = new URL("classpath:/net/sf/alster/xsl/alster.xml");
        InputStream in =(InputStream)(Object) url.openStream();
        assertEquals('<', in.read());
        in.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass registerFactory(){ return null; }}

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

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
