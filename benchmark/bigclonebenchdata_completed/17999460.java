
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17999460 {

    public static long toFile(final DigitalObject object, final File file) {
        try {
            FileOutputStream fOut = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            long bytesCopied =(long)(Object) IOUtils.copyLarge(object.getContent().getInputStream(), fOut);
            fOut.close();
            return bytesCopied;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class DigitalObject {

public MyHelperClass getContent(){ return null; }}

class File {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
