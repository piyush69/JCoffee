
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19900641 {

    public static boolean copyFile(String src, String dst) {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel =(FileChannel)(Object) (new FileInputStream(new File(src)).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(new File(dst)).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass MessageGenerator = new MyHelperClass();
            MessageGenerator.briefError("ERROR could not find/access file(s): " + src + " and/or " + dst);
            return false;
        } catch (ArithmeticException e) {
            MyHelperClass MessageGenerator = new MyHelperClass();
            MessageGenerator.briefError("ERROR copying file: " + src + " to " + dst);
            return false;
        } finally {
            try {
                if (inChannel != null) inChannel.close();
                if (outChannel != null) outChannel.close();
            } catch (UncheckedIOException e) {
                MyHelperClass MessageGenerator = new MyHelperClass();
                MessageGenerator.briefError("Error closing files involved in copying: " + src + " and " + dst);
                return false;
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass briefError(String o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
