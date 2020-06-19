
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18516388 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass ResponseStateOk;
	public MyHelperClass fail(String o0){ return null; }

    public void test() throws Exception {
        StorageString s = new StorageString("UTF-8");
        s.addText("Test");
        try {
            s.getOutputStream();
            fail("Should throw IOException as method not supported.");
        } catch (UncheckedIOException e) {
        }
        try {
            s.getWriter();
            fail("Should throw IOException as method not supported.");
        } catch (UncheckedIOException e) {
        }
        s.addText("ing is important");
        s.close(ResponseStateOk.getInstance());
        assertEquals("Testing is important",(String)(Object) s.getText());
        InputStream input =(InputStream)(Object) s.getInputStream();
        StringWriter writer = new StringWriter();
        IOUtils.copy(input, writer, "UTF-8");
        assertEquals("Testing is important", writer.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(){ return null; }
	public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }}

class StorageString {

StorageString(){}
	StorageString(String o0){}
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addText(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass close(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getText(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class StringWriter {

}
