import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20200144 {
public MyHelperClass COPY_FILE_FAILED;
	public MyHelperClass LOGGER;
	public MyHelperClass fileIOException(String o0, File o1, FileNotFoundException o2){ return null; }
	public MyHelperClass fileIOException(String o0, Object o1, Exception o2){ return null; }

    public void copyFile(final File sourceFile, final File destinationFile) throws Throwable, FileIOException {
        final FileChannel sourceChannel;
        try {
            sourceChannel = (FileChannel)(Object)new FileInputStream(sourceFile).getChannel();
        } catch (FileNotFoundException exception) {
            MyHelperClass COPY_FILE_FAILED = new MyHelperClass();
            final String message =(File)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) COPY_FILE_FAILED + (int)(Object)sourceFile + " -> " + destinationFile;
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.fatal(message);
            throw(Throwable)(Object) fileIOException(message, sourceFile, exception);
        }
        final FileChannel destinationChannel;
        try {
            destinationChannel = (FileChannel)(Object)new FileOutputStream(destinationFile).getChannel();
        } catch (FileNotFoundException exception) {
            final String message =(File)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) COPY_FILE_FAILED + (int)(Object)sourceFile + " -> " + destinationFile;
            LOGGER.fatal(message);
            throw(Throwable)(Object) fileIOException(message, destinationFile, exception);
        }
        try {
            destinationChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (Exception exception) {
            final String message =(File)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) COPY_FILE_FAILED + (int)(Object)sourceFile + " -> " + destinationFile;
            LOGGER.fatal(message);
            throw(Throwable)(Object) fileIOException(message, null, exception);
        } finally {
            if (sourceChannel != null) {
                try {
                    sourceChannel.close();
                } catch (IOException exception) {
                    LOGGER.error("closing source", exception);
                }
            }
            if (destinationChannel != null) {
                try {
                    destinationChannel.close();
                } catch (IOException exception) {
                    LOGGER.error("closing destination", exception);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class FileIOException extends Exception{
	public FileIOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}
