
import java.io.UncheckedIOException;


class c12306298 {

    public static void renameFileMultiFallback(File sourceFile, File destFile) throws FileHandlingException {
        if ((boolean)(Object)destFile.exists()) {
            MyHelperClass FileHandlingException = new MyHelperClass();
            throw new FileHandlingException((String)(Object)FileHandlingException.FILE_ALREADY_EXISTS);
        }
        if (!(Boolean)(Object)sourceFile.exists()) {
            return;
        }
        boolean succ =(boolean)(Object) sourceFile.renameTo(destFile);
        if (succ) {
            MyHelperClass NLogger = new MyHelperClass();
            NLogger.warn(FileUtils.class, "First renameTo operation worked!");
            return;
        }
        MyHelperClass NLogger = new MyHelperClass();
        NLogger.warn(FileUtils.class, "First renameTo operation failed.");
        System.gc();
        Thread.yield();
        succ =(boolean)(Object) sourceFile.renameTo(destFile);
        if (succ) {
            return;
        }
//        MyHelperClass NLogger = new MyHelperClass();
        NLogger.warn(FileUtils.class, "Second renameTo operation failed.");
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream(sourceFile);
            output = new FileOutputStream(destFile);
            long lengthLeft =(long)(Object) sourceFile.length();
            MyHelperClass BUFFER_LENGTH = new MyHelperClass();
            byte[] buffer = new byte[(int) Math.min((int)(Object)BUFFER_LENGTH, lengthLeft + 1)];
            int read;
            while (lengthLeft > 0) {
                read =(int)(Object) input.read(buffer);
                if (read == -1) {
                    break;
                }
                lengthLeft -= read;
                output.write(buffer, 0, read);
            }
        } catch (UncheckedIOException exp) {
//            MyHelperClass NLogger = new MyHelperClass();
            NLogger.warn(FileUtils.class, "Third renameTo operation failed.");
            MyHelperClass FileHandlingException = new MyHelperClass();
            throw new FileHandlingException(FileHandlingException.RENAME_FAILED,(IOException)(Object) exp);
        } finally {
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeQuietly(input);
//            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeQuietly(output);
        }
        destFile.setLastModified(sourceFile.lastModified());
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.deleteFileMultiFallback(sourceFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RENAME_FAILED;
	public MyHelperClass FILE_ALREADY_EXISTS;
public MyHelperClass warn(Class<FileUtils> o0, String o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass deleteFileMultiFallback(File o0){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }}

class File {

public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileHandlingException extends Exception{
	public FileHandlingException(String errorMessage) { super(errorMessage); }
	FileHandlingException(){}
	FileHandlingException(MyHelperClass o0, IOException o1){}
}

class FileUtils {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
