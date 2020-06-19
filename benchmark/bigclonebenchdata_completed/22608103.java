
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22608103 {

    public static boolean copyFile(File sourceFile, File destFile) {
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            long pos = 0;
            long count =(long)(Object) srcChannel.size();
            MyHelperClass MAX_BLOCK_SIZE = new MyHelperClass();
            if (count > (long)(Object)MAX_BLOCK_SIZE) {
//                MyHelperClass MAX_BLOCK_SIZE = new MyHelperClass();
                count =(long)(Object) MAX_BLOCK_SIZE;
            }
            long transferred = Long.MAX_VALUE;
            while (transferred > 0) {
                transferred =(long)(Object) dstChannel.transferFrom(srcChannel, pos, count);
                pos = transferred;
            }
        } catch (UncheckedIOException e) {
            return false;
        } finally {
            if (srcChannel != null) {
                try {
                    srcChannel.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (dstChannel != null) {
                try {
                    dstChannel.close();
                } catch (UncheckedIOException e) {
                }
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

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, long o1, long o2){ return null; }}

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
