
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2232617 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
public MyHelperClass assertEquals(String o0, String o1){ return null; }
public MyHelperClass ResponseStateOk;
	public MyHelperClass fail(String o0){ return null; }

    public void testStorageString() throws Exception {
        TranslationResponseInMemory r = new TranslationResponseInMemory(2048, "UTF-8");
        r.addText("This is an example");
        r.addText(" and another one.");
        assertEquals("This is an example and another one.",(String)(Object) r.getText());
        InputStream input =(InputStream)(Object) r.getInputStream();
        StringWriter writer = new StringWriter();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, writer, "UTF-8");
        } finally {
            input.close();
            writer.close();
        }
        assertEquals("This is an example and another one.", writer.toString());
        try {
            r.getOutputStream();
            fail("Once addText() is used the text is stored as a String and you cannot use getOutputStream anymore");
        } catch (UncheckedIOException e) {
        }
        try {
            r.getWriter();
            fail("Once addText() is used the text is stored as a String and you cannot use getOutputStream anymore");
        } catch (UncheckedIOException e) {
        }
        r.setEndState(ResponseStateOk.getInstance());
        assertTrue(r.hasEnded());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class TranslationResponseInMemory {

TranslationResponseInMemory(){}
	TranslationResponseInMemory(int o0, String o1){}
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addText(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass hasEnded(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setEndState(MyHelperClass o0){ return null; }
	public MyHelperClass getText(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
