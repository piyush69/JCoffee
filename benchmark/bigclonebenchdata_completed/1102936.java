
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1102936 {

    public static void writeInputStreamToFile(final InputStream stream, final File target) {
        long size = 0;
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream(target);
            MyHelperClass IOUtils = new MyHelperClass();
            size =(long)(Object) IOUtils.copyLarge(stream, fileOut);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isInfoEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.info("Wrote " + size + " bytes to " + target.getAbsolutePath());
        } else {
            System.out.println("Wrote " + size + " bytes to " + target.getAbsolutePath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class InputStream {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
