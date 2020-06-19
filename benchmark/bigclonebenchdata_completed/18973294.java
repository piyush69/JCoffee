
import java.io.UncheckedIOException;


class c18973294 {
public static MyHelperClass copyFile(File o0, InputStream o1){ return null; }
//public MyHelperClass copyFile(File o0, InputStream o1){ return null; }

    protected static File UrlToAFile(File target, String urlSt, String fileName) throws CaughtException {
        try {
            MyHelperClass logger = new MyHelperClass();
            logger.info("copy from url: " + urlSt);
            URL url = new URL(urlSt);
            InputStream input =(InputStream)(Object) url.openStream();
            MyHelperClass tempDir = new MyHelperClass();
            File dir =(File)(Object) tempDir;
            File tempFile = new File(target, fileName);
//            MyHelperClass logger = new MyHelperClass();
            logger.info("created: " + tempFile.getAbsolutePath());
            copyFile(tempFile, input);
            return tempFile;
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            throw new CaughtException((IOException)(Object)e, logger);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class File {

File(File o0, String o1){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class CaughtException extends Exception{
	public CaughtException(String errorMessage) { super(errorMessage); }
	CaughtException(IOException o0, MyHelperClass o1){}
	CaughtException(){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
