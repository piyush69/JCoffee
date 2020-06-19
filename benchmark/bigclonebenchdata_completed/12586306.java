
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12586306 {
public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
public MyHelperClass assertNotNull(Content o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testGetContentInputStream() {
        try {
            URL url = new URL("http://www.designerfashion.de/Seiten/r2-Felljacke.html");
            InputStream in =(InputStream)(Object) url.openStream();
            MyHelperClass provider = new MyHelperClass();
            Content c =(Content)(Object) provider.getContent(in);
            assertNotNull(c);
            assertEquals("Web Page", c.getType());
            assertEquals("net.sf.iqser.plugin.web.html", c.getProvider());
            assertEquals((String)(Object)8, c.getAttributes().size());
            assertEquals("Name", c.getAttributes().iterator().next().getName());
        } catch (UncheckedIOException e) {
            fail("Malformed URL - " + e.getMessage());
        } catch (ArithmeticException e) {
            fail("Couldn't read source - " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass next(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getContent(InputStream o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class Content {

public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass getProvider(){ return null; }
	public MyHelperClass getType(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
