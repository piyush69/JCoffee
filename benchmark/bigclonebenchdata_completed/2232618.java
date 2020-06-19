
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2232618 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }
	public MyHelperClass assertFalse(MyHelperClass o0){ return null; }
public MyHelperClass assertEquals(String o0, String o1){ return null; }
public MyHelperClass fail(String o0){ return null; }

    public void testStorageByteArray() throws Exception {
        TranslationResponseInMemory r = new TranslationResponseInMemory(2048, "UTF-8");
        {
            OutputStream output =(OutputStream)(Object) r.getOutputStream();
            output.write("This is an example".getBytes("UTF-8"));
            output.write(" and another one.".getBytes("UTF-8"));
            assertEquals("This is an example and another one.",(String)(Object) r.getText());
        }
        {
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
        }
        {
            OutputStream output =(OutputStream)(Object) r.getOutputStream();
            output.write(" and another line".getBytes("UTF-8"));
            assertEquals("This is an example and another one. and another line",(String)(Object) r.getText());
        }
        {
            Writer output =(Writer)(Object) r.getWriter();
            output.write(" and write some more");
            assertEquals("This is an example and another one. and another line and write some more",(String)(Object) r.getText());
        }
        {
            r.addText(" and even more.");
            assertEquals("This is an example and another one. and another line and write some more and even more.",(String)(Object) r.getText());
        }
        assertFalse(r.hasEnded());
        MyHelperClass ResponseStateOk = new MyHelperClass();
        r.setEndState(ResponseStateOk.getInstance());
        assertTrue(r.hasEnded());
        try {
            r.getOutputStream();
            fail("Previous line should throw IOException as result closed.");
        } catch (UncheckedIOException e) {
        }
        try {
            r.getWriter();
            fail("Previous line should throw IOException as result closed.");
        } catch (UncheckedIOException e) {
        }
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

class OutputStream {

public MyHelperClass write(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

public MyHelperClass close(){ return null; }}

class Writer {

public MyHelperClass write(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
