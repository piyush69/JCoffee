
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5258165 {

    private static boolean copyFile(File src, File dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            for (int c =(int)(Object) fis.read(); c != -1; c =(int)(Object) fis.read()) fos.write(c);
            return true;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (fis != null) try {
                fis.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            if (fos != null) try {
                fos.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
