
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14896033 {

    private static void copySmallFile(File sourceFile, File targetFile) throws BusinessException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("Copying SMALL file '" + sourceFile.getAbsolutePath() + "' to '" + targetFile.getAbsolutePath() + "'.");
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(targetFile).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            throw new BusinessException("Could not copy file from '" + sourceFile.getAbsolutePath() + "' to '" + targetFile.getAbsolutePath() + "'!",(IOException)(Object) e);
        } finally {
            try {
                if (inChannel != null) inChannel.close();
            } catch (UncheckedIOException e) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Could not close input stream!",(IOException)(Object) e);
            }
            try {
                if (outChannel != null) outChannel.close();
            } catch (UncheckedIOException e) {
//                MyHelperClass LOG = new MyHelperClass();
                LOG.error("Could not close output stream!",(IOException)(Object) e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class BusinessException extends Exception{
	public BusinessException(String errorMessage) { super(errorMessage); }
	BusinessException(){}
	BusinessException(String o0, IOException o1){}
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
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
