
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19014667 {

    public static boolean copyFileChannel(final File _fileFrom, final File _fileTo, final boolean _append) {
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(_fileFrom).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(_fileTo, _append).getChannel());
            if (_append) {
                dstChannel.transferFrom(srcChannel, dstChannel.size(), srcChannel.size());
            } else {
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            }
            srcChannel.close();
            dstChannel.close();
        } catch (final UncheckedIOException e) {
            return false;
        } finally {
            try {
                if (srcChannel != null) {
                    srcChannel.close();
                }
            } catch (final UncheckedIOException _evt) {
                MyHelperClass FuLog = new MyHelperClass();
                FuLog.error((IOException)(Object)_evt);
            }
            try {
                if (dstChannel != null) {
                    dstChannel.close();
                }
            } catch (final UncheckedIOException _evt) {
                MyHelperClass FuLog = new MyHelperClass();
                FuLog.error((IOException)(Object)_evt);
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0){ return null; }}

class File {

}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
