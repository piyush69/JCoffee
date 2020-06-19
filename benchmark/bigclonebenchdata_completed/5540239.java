
import java.io.UncheckedIOException;


class c5540239 {

        public static int my_rename(String source, String dest) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug("RENAME " + source + " to " + dest);
            if (source == null || dest == null) return -1;
            {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("\tMoving file across file systems.");
                FileChannel srcChannel = null;
                FileChannel dstChannel = null;
                FileLock lock = null;
                try {
                    srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
                    dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                    lock =(FileLock)(Object) dstChannel.lock();
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    dstChannel.force(true);
                } catch (UncheckedIOException e) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fatal("Error while copying file '" + source + "' to file '" + dest + "'. " + e.getMessage(),(IOException)(Object) e);
                    MyHelperClass common_h = new MyHelperClass();
                    return(int)(Object) common_h.ERROR;
                } finally {
                    try {
                        lock.release();
                    } catch (Throwable t) {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.fatal("Error releasing file lock - " + dest);
                    }
                    try {
                        srcChannel.close();
                    } catch (Throwable t) {
                    }
                    try {
                        dstChannel.close();
                    } catch (Throwable t) {
                    }
                }
            }
            MyHelperClass common_h = new MyHelperClass();
            return(int)(Object) common_h.OK;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK;
	public MyHelperClass ERROR;
public MyHelperClass fatal(String o0, IOException o1){ return null; }
	public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FileChannel {

public MyHelperClass lock(){ return null; }
	public MyHelperClass force(boolean o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class FileLock {

public MyHelperClass release(){ return null; }}

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
