
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14710734 {

    public static boolean writeFile(HttpServletResponse resp, File reqFile) {
        boolean retVal = false;
        InputStream in = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(reqFile));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, resp.getOutputStream());
            MyHelperClass logger = new MyHelperClass();
            logger.debug("File successful written to servlet response: " + reqFile.getAbsolutePath());
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Resource not found: " + reqFile.getAbsolutePath());
        } catch (ArithmeticException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("Error while rendering [%s]: %s", reqFile.getAbsolutePath(), e.getMessage()),(IOException)(Object) e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
        return retVal;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
