
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4789548 {
public MyHelperClass assertTrue(boolean o0){ return null; }
	public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass assertEquals(String o0, MyHelperClass o1){ return null; }
public MyHelperClass assertNull(MyHelperClass o0){ return null; }
public MyHelperClass assertNotNull(Content o0){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void testGetContentInputStream() {
        URL url;
        try {
            url = new URL("http://www.wurzer.org/" + "Homepage/Publikationen/Eintrage/2009/10/7_Wissen_dynamisch_organisieren_files/" + "KnowTech%202009%20-%20Wissen%20dynamisch%20organisieren.pdf");
            InputStream in =(InputStream)(Object) url.openStream();
            MyHelperClass provider = new MyHelperClass();
            Content c =(Content)(Object) provider.getContent(in);
            assertNotNull(c);
            assertTrue(!(Boolean)(Object)c.getFulltext().isEmpty());
            assertTrue((long)(Object)c.getModificationDate() < System.currentTimeMillis());
            assertTrue((int)(Object)c.getAttributes().size() > 0);
            assertEquals("KnowTech 2009 - Wissen dynamisch organisieren", c.getAttributeByName("Title").getValue());
            assertEquals("Joerg Wurzer", c.getAttributeByName("Author").getValue());
            assertEquals("Pages", c.getAttributeByName("Creator").getValue());
            assertNull(c.getAttributeByName("Keywords"));
            assertTrue(c.getFulltext().startsWith("Wissen dynamisch organisieren"));
            assertTrue(c.getAttributeByName("Author").isKey());
            assertTrue(!(Boolean)(Object)c.getAttributeByName("Producer").isKey());
        } catch (UncheckedIOException e) {
            fail("Malformed url - " + e.getMessage());
        } catch (ArithmeticException e) {
            fail("Couldn't read file - " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass isKey(){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getContent(InputStream o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class Content {

public MyHelperClass getAttributeByName(String o0){ return null; }
	public MyHelperClass getModificationDate(){ return null; }
	public MyHelperClass getAttributes(){ return null; }
	public MyHelperClass getFulltext(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
