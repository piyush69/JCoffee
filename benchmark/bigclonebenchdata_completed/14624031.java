
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14624031 {

    public static void copyFile(File in, File out) throws ObclipseException {
        try {
            FileChannel inChannel = null;
            FileChannel outChannel = null;
            try {
                inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
                outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
                inChannel.transferTo(0, inChannel.size(), outChannel);
            } finally {
                if (inChannel != null) {
                    inChannel.close();
                }
                if (outChannel != null) {
                    outChannel.close();
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Msg = new MyHelperClass();
            Msg.error("The file ''{0}'' to copy does not exist!",(FileNotFoundException)(Object) e, in.getAbsolutePath());
        } catch (ArithmeticException e) {
            MyHelperClass Msg = new MyHelperClass();
            Msg.ioException(in, out,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, FileNotFoundException o1, MyHelperClass o2){ return null; }
	public MyHelperClass ioException(File o0, File o1, IOException o2){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class ObclipseException extends Exception{
	public ObclipseException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

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
