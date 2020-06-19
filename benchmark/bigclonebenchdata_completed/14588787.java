
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14588787 {

    public void saveFile(final InputStream inputStream, final String fileName) {
        MyHelperClass File = new MyHelperClass();
        final File file = new File(System.getProperty("java.io.tmpdir") + File.separator + fileName);
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, fileOut);
        } catch (UncheckedIOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("saveFile() - File Not Found." + e);
        } catch (ArithmeticException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("saveFile() - Error while saving file." + e);
        } finally {
            try {
                inputStream.close();
                if (fileOut != null) {
                    fileOut.close();
                }
            } catch (UncheckedIOException e) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error((IOException)(Object)e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}}

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
