
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17573230 {

    public static boolean copyFile(String sourceFileName, String destFileName) {
        FileChannel ic = null;
        FileChannel oc = null;
        try {
            ic =(FileChannel)(Object) (new FileInputStream(sourceFileName).getChannel());
            oc =(FileChannel)(Object) (new FileOutputStream(destFileName).getChannel());
            ic.transferTo(0, ic.size(), oc);
            return true;
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            try {
                ic.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            try {
                oc.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
