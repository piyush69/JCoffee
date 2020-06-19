
import java.io.UncheckedIOException;


class c4020497 {

    public static void copyFile(File sourceFile, File targetFile) throws FileCopyingException {
        try {
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(targetFile);
            FileChannel readableChannel =(FileChannel)(Object) inputStream.getChannel();
            FileChannel writableChannel =(FileChannel)(Object) outputStream.getChannel();
            writableChannel.truncate(0);
            writableChannel.transferFrom(readableChannel, 0, readableChannel.size());
            inputStream.close();
            outputStream.close();
        } catch (UncheckedIOException ioException) {
            String exceptionMessage = "An error occurred when copying from the file \"" + sourceFile.getAbsolutePath() + "\" to the file \"" + targetFile.getAbsolutePath() + "\".";
            throw new FileCopyingException(exceptionMessage,(IOException)(Object) ioException);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileCopyingException extends Exception{
	public FileCopyingException(String errorMessage) { super(errorMessage); }
	FileCopyingException(String o0, IOException o1){}
	FileCopyingException(){}
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

public MyHelperClass size(){ return null; }
	public MyHelperClass truncate(int o0){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
