import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c2111163 {
public MyHelperClass assertEquals(String o0, String o1, String o2){ return null; }
	public MyHelperClass fail(String o0){ return null; }

    public void test_calculateLastModifiedSizeContent() {
        File file;
        String content = "Hello, world!";
        String expected;
        FileETag etag;
        try {
            file = File.createTempFile("temp", "txt");
            file.deleteOnExit();
            FileOutputStream out = new FileOutputStream(file);
            out.write(content.getBytes());
            out.flush();
            out.close();
            SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            long lastModified =(long)(Object) date.parse("06/21/2007 11:19:36").getTime();
            file.setLastModified(lastModified);
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest messageDigest =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            messageDigest.update(content.getBytes());
            StringBuffer buffer = new StringBuffer();
            buffer.append(lastModified);
            buffer.append(content.length());
            MyHelperClass Hex = new MyHelperClass();
            expected = new String((String)(Object)Hex.encodeHex(messageDigest.digest(buffer.toString().getBytes())));
            etag = new FileETag();
            MyHelperClass FileETag = new MyHelperClass();
            etag.setFlags((int)(Object)FileETag.FLAG_CONTENT | (int)(Object)FileETag.FLAG_MTIME | (int)(Object)FileETag.FLAG_SIZE);
            String value =(String)(Object) etag.calculate(file);
            assertEquals("Unexpected value", expected, value);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fail("Unexpected exception");
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected exception");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            fail("Unexpected exception");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            fail("Unexpected exception");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FLAG_CONTENT;
	public MyHelperClass FLAG_SIZE;
	public MyHelperClass FLAG_MTIME;
public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass encodeHex(MyHelperClass o0){ return null; }}

class FileETag {

public MyHelperClass calculate(File o0){ return null; }
	public MyHelperClass setFlags(int o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(){}
	SimpleDateFormat(String o0){}
	public MyHelperClass parse(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(byte[] o0){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
