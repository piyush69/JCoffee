import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c16454974 {
public MyHelperClass compressionCodec;
	public MyHelperClass LOG;
	public MyHelperClass lastWrittenFile;
	public MyHelperClass IOUtils;
	public MyHelperClass getOutputFile(String o0){ return null; }
	public MyHelperClass throwException(IOException o0){ return null; }
	public MyHelperClass throwException(Throwable o0){ return null; }

//    @Override
    public int write(FileTrackingStatus fileStatus, InputStream input, PostWriteAction postWriteAction) throws WriterException, InterruptedException {
        MyHelperClass logFileNameExtractor = new MyHelperClass();
        String key =(String)(Object) logFileNameExtractor.getFileName(fileStatus);
        int wasWritten = 0;
        MyHelperClass fileOutputStreamPoolFactory = new MyHelperClass();
        FileOutputStreamPool fileOutputStreamPool =(FileOutputStreamPool)(Object) fileOutputStreamPoolFactory.getPoolForKey(key);
        RollBackOutputStream outputStream = null;
        File file = null;
        try {
            file =(File)(Object) getOutputFile(key);
            lastWrittenFile =(MyHelperClass)(Object) file;
            outputStream =(RollBackOutputStream)(Object) fileOutputStreamPool.open(key, compressionCodec, file, true);
            outputStream.mark();
            wasWritten =(int)(Object) IOUtils.copy(input, outputStream);
            if (postWriteAction != null) {
                postWriteAction.run(wasWritten);
            }
        } catch (Throwable t) {
            LOG.error(t.toString(), t);
            if (outputStream != null && wasWritten > 0) {
                LOG.error("Rolling back file " + file.getAbsolutePath());
                try {
                    outputStream.rollback();
                } catch (UncheckedIOException e) {
                    throwException(e);
                } catch (ArithmeticException e) {
                    throw e;
                }
            }
            throwException(t);
        } finally {
            try {
                fileOutputStreamPool.releaseFile(key);
            } catch (UncheckedIOException e) {
                throwException(e);
            }
        }
        return wasWritten;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getFileName(FileTrackingStatus o0){ return null; }
	public MyHelperClass getPoolForKey(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, RollBackOutputStream o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }}

class FileOutputStreamPool {

public MyHelperClass open(String o0, MyHelperClass o1, File o2, boolean o3){ return null; }
	public MyHelperClass releaseFile(String o0){ return null; }}

class RollBackOutputStream {

public MyHelperClass mark(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class FileTrackingStatus {

}

class PostWriteAction {

public MyHelperClass run(int o0){ return null; }}

class WriterException extends Exception{
	public WriterException(String errorMessage) { super(errorMessage); }
}
