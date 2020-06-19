
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22670950 {

    private void writeInputStreamToFile(InputStream stream, File file) {
        try {
            FileOutputStream fOut = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(stream, fOut);
            fOut.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

}

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
