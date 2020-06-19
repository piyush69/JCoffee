
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22953272 {

    public static final boolean copyFileNio(File src, File dst) throws IOException {
        FileChannel srcChannel = null, dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            {
                int safe_max = (64 * 1024 * 1024) / 4;
                long size =(long)(Object) srcChannel.size();
                long position = 0;
                while (position < size) {
                    position += (long)(Object)srcChannel.transferTo(position, safe_max, dstChannel);
                }
            }
            srcChannel.close();
            srcChannel = null;
            dstChannel.close();
            dstChannel = null;
            return true;
        } finally {
            try {
                if (srcChannel != null) srcChannel.close();
            } catch (UncheckedIOException e) {
                MyHelperClass Debug = new MyHelperClass();
                Debug.debug((IOException)(Object)e);
            }
            try {
                if (dstChannel != null) dstChannel.close();
            } catch (UncheckedIOException e) {
                MyHelperClass Debug = new MyHelperClass();
                Debug.debug((IOException)(Object)e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(IOException o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
