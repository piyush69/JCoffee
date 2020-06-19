
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9766481 {
public MyHelperClass LogHelper;
	public MyHelperClass toObjectString(){ return null; }

    public void copy(final File source, final File target) throws FileSystemException {
        MyHelperClass log = new MyHelperClass();
        LogHelper.logMethod(log, toObjectString(), "copy(), source = " + source + ", target = " + target);
        FileChannel sourceChannel = null;
        FileChannel targetChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            targetChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            sourceChannel.transferTo(0L, sourceChannel.size(), targetChannel);
//            MyHelperClass log = new MyHelperClass();
            log.info("Copied " + source + " to " + target);
        } catch (UncheckedIOException e) {
            throw new FileSystemException("Unexpected FileNotFoundException while copying a file",(FileNotFoundException)(Object) e);
        } catch (ArithmeticException e) {
            throw new FileSystemException("Unexpected IOException while copying a file",(FileNotFoundException)(Object) e);
        } finally {
            if (sourceChannel != null) {
                try {
                    sourceChannel.close();
                } catch (UncheckedIOException e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("IOException during source channel close after copy",(IOException)(Object) e);
                }
            }
            if (targetChannel != null) {
                try {
                    targetChannel.close();
                } catch (UncheckedIOException e) {
//                    MyHelperClass log = new MyHelperClass();
                    log.error("IOException during target channel close after copy",(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass logMethod(MyHelperClass o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

}

class FileSystemException extends Exception{
	public FileSystemException(String errorMessage) { super(errorMessage); }
	FileSystemException(){}
	FileSystemException(String o0, FileNotFoundException o1){}
	FileSystemException(String o0, IOException o1){}
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

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
