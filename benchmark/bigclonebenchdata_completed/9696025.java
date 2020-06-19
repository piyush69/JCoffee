
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9696025 {

    public static boolean copyFile(File source, File dest) {
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } catch (UncheckedIOException e) {
            return false;
        } finally {
            try {
                if (srcChannel != null) {
                    srcChannel.close();
                }
            } catch (UncheckedIOException e) {
            }
            try {
                if (dstChannel != null) {
                    dstChannel.close();
                }
            } catch (UncheckedIOException e) {
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

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
