
import java.io.UncheckedIOException;


class c8843442 {

    public static void copyFile(String target, String source) {
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (UncheckedIOException e) {
            MyHelperClass ExceptionHelper = new MyHelperClass();
            ExceptionHelper.showErrorDialog((IOException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showErrorDialog(IOException o0){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
