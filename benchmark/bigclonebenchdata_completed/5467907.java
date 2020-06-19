
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5467907 {

    public static boolean copyFile(final File src, final File dst) {
        boolean result = false;
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        MyHelperClass FileUtil = new MyHelperClass();
        synchronized (FileUtil.DATA_LOCK) {
            try {
                inChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
                outChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
                inChannel.transferTo(0, inChannel.size(), outChannel);
                result = true;
            } catch (UncheckedIOException e) {
            } finally {
                if (inChannel != null && (boolean)(Object)inChannel.isOpen()) {
                    try {
                        inChannel.close();
                    } catch (UncheckedIOException e) {
                    }
                }
                if (outChannel != null && (boolean)(Object)outChannel.isOpen()) {
                    try {
                        outChannel.close();
                    } catch (UncheckedIOException e) {
                    }
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DATA_LOCK;
}

class File {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

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
