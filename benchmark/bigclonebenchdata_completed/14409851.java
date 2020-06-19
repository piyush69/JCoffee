
import java.io.UncheckedIOException;


class c14409851 {
public MyHelperClass assertEquals(String o0, String o1){ return null; }
public MyHelperClass fail(String o0){ return null; }

    public void test() throws Exception {
        MyHelperClass File = new MyHelperClass();
        File temp =(File)(Object) File.createTempFile("test", ".test");
        temp.deleteOnExit();
        StorageFile s = new StorageFile(temp, "UTF-8");
        s.addText("Test");
        s.getOutputStream().write("ing is important".getBytes("UTF-8"));
        s.getWriter().write(" but overrated");
        assertEquals("Testing is important but overrated",(String)(Object) s.getText());
        MyHelperClass ResponseStateOk = new MyHelperClass();
        s.close(ResponseStateOk.getInstance());
        assertEquals("Testing is important but overrated",(String)(Object) s.getText());
        InputStream input =(InputStream)(Object) s.getInputStream();
        StringWriter writer = new StringWriter();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(input, writer, "UTF-8");
        assertEquals("Testing is important but overrated", writer.toString());
        try {
            s.getOutputStream();
            fail("Should thow an IOException as it is closed.");
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, StringWriter o1, String o2){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

public MyHelperClass deleteOnExit(){ return null; }}

class StorageFile {

StorageFile(){}
	StorageFile(File o0, String o1){}
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass addText(String o0){ return null; }
	public MyHelperClass getWriter(){ return null; }
	public MyHelperClass close(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getText(){ return null; }}

class InputStream {

}

class StringWriter {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
