
import java.io.UncheckedIOException;


class c16378239 {

    public static DigitalObjectContent byReference(final InputStream inputStream) {
        try {
            MyHelperClass File = new MyHelperClass();
            File tempFile =(File)(Object) File.createTempFile("tempContent", "tmp");
            tempFile.deleteOnExit();
            FileOutputStream out = new FileOutputStream(tempFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(inputStream, out);
            out.close();
            return (DigitalObjectContent)(Object)new ImmutableContent(tempFile);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not create content for input stream: " + inputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class InputStream {

}

class DigitalObjectContent {

}

class File {

public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class ImmutableContent {

ImmutableContent(File o0){}
	ImmutableContent(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
