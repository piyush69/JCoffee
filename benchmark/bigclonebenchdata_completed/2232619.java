
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2232619 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }
public MyHelperClass ResponseStateOk;
	public MyHelperClass fail(String o0){ return null; }

    public void testStorageStringWriter() throws Exception {
        TranslationResponseInMemory r = new TranslationResponseInMemory(2048, "UTF-8");
        {
            Writer w =(Writer)(Object) r.getWriter();
            w.write("This is an example");
            w.write(" and another one.");
            w.flush();
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
        try {
            r.getOutputStream();
            fail("Is not allowed as you already called getWriter().");
        } catch (UncheckedIOException e) {
        }
        {
            Writer output =(Writer)(Object) r.getWriter();
            output.write(" and another line");
            output.write(" and write some more");
            assertEquals("This is an example and another one. and another line and write some more",(String)(Object) r.getText());
        }
        {
            r.addText(" and some more.");
            assertEquals("This is an example and another one. and another line and write some more and some more.",(String)(Object) r.getText());
        }
        r.setEndState(ResponseStateOk.getInstance());
        assertEquals((String)(Object)ResponseStateOk.getInstance(),(String)(Object) r.getEndState());
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
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setEndState(MyHelperClass o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getEndState(){ return null; }}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class StringWriter {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
