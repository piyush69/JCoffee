
import java.io.UncheckedIOException;


class c23630686 {

    private boolean copy(File in, File out) {
        try {
            FileInputStream fis = new FileInputStream(in);
            FileOutputStream fos = new FileOutputStream(out);
            FileChannel readableChannel =(FileChannel)(Object) fis.getChannel();
            FileChannel writableChannel =(FileChannel)(Object) fos.getChannel();
            writableChannel.truncate(0);
            writableChannel.transferFrom(readableChannel, 0, readableChannel.size());
            fis.close();
            fos.close();
            return true;
        } catch (UncheckedIOException ioe) {
            MyHelperClass guiBuilder = new MyHelperClass();
            guiBuilder.showError("Copy Error", "IOException during copy", ioe.getMessage());
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showError(String o0, String o1, String o2){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass truncate(int o0){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
