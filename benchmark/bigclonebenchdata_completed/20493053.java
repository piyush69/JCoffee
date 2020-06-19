
import java.io.UncheckedIOException;


class c20493053 {

    public static boolean copyFile(File from, File to) {
        try {
            FileChannel fromChannel =(FileChannel)(Object) (new FileInputStream(from).getChannel());
            FileChannel toChannel =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
            toChannel.transferFrom(fromChannel, 0, fromChannel.size());
            fromChannel.close();
            toChannel.close();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("failed to copy " + from.getAbsolutePath() + " to " + to.getAbsolutePath() + ": caught exception",(IOException)(Object) e);
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
