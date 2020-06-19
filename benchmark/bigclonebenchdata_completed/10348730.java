
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10348730 {

    private void installBinaryFile(File source, File destination) {
        byte[] buffer = new byte[8192];
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(source);
            fos = new FileOutputStream(destination);
            int read;
            while ((read =(int)(Object) fis.read(buffer)) != -1) {
                fos.write(buffer, 0, read);
            }
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
            new ProjectCreateException((IOException)(Object)e, "Failed to read binary file: %1$s", source.getAbsolutePath());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ProjectCreateException extends Exception{
	public ProjectCreateException(String errorMessage) { super(errorMessage); }
	ProjectCreateException(){}
	ProjectCreateException(IOException o0, String o1, MyHelperClass o2){}
}
