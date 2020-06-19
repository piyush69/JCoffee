
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4267635 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static boolean copyFile(final File src, final File dst) throws FileNotFoundException {
        if (src == null || dst == null || src.equals(dst)) {
            return false;
        }
        boolean result = false;
        if ((boolean)(Object)src.exists()) {
            if ((boolean)(Object)dst.exists() && !(Boolean)(Object)dst.canWrite()) {
                return false;
            }
            final FileInputStream srcStream = new FileInputStream(src);
            final FileOutputStream dstStream = new FileOutputStream(dst);
            final FileChannel srcChannel =(FileChannel)(Object) srcStream.getChannel();
            final FileChannel dstChannel =(FileChannel)(Object) dstStream.getChannel();
            FileLock dstLock = null;
            FileLock srcLock = null;
            try {
                srcLock =(FileLock)(Object) srcChannel.tryLock(0, Long.MAX_VALUE, true);
                dstLock =(FileLock)(Object) dstChannel.tryLock();
                if (srcLock != null && dstLock != null) {
                    int maxCount = 64 * 1024 * 1024 - 32 * 1024;
                    long size =(long)(Object) srcChannel.size();
                    long position = 0;
                    while (position < size) {
                        position += (long)(Object)srcChannel.transferTo(position, maxCount, dstChannel);
                    }
                }
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
            } finally {
                if (srcChannel != null) {
                    try {
                        if (srcLock != null) {
                            srcLock.release();
                        }
                        srcChannel.close();
                        srcStream.close();
                    } catch (UncheckedIOException ex) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                    }
                }
                if (dstChannel != null) {
                    try {
                        if (dstLock != null) {
                            dstLock.release();
                        }
                        dstChannel.close();
                        dstStream.close();
                        result = true;
                    } catch (UncheckedIOException ex) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
                    }
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class File {

public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
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

public MyHelperClass tryLock(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass tryLock(int o0, long o1, boolean o2){ return null; }}

class FileLock {

public MyHelperClass release(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileUtils {

}
