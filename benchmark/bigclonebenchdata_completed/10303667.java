import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10303667 {
public MyHelperClass HELPER_FILE_UTIL;
	public MyHelperClass opened;
	public MyHelperClass file;
	public MyHelperClass FAILED_OPEN;
	public MyHelperClass openImpl(){ return null; }
	public MyHelperClass closeImpl(){ return null; }
	public MyHelperClass seek(long o0){ return null; }

//    @Override
    public void copy(final String fileName) throws Throwable, FileIOException {
        MyHelperClass currentPositionInFile = new MyHelperClass();
        final long savedCurrentPositionInFile =(long)(Object) currentPositionInFile;
        MyHelperClass opened = new MyHelperClass();
        if ((boolean)(Object)opened) {
            closeImpl();
        }
        final FileInputStream fis;
        try {
            fis = new FileInputStream((String)(Object)file);
        } catch (FileNotFoundException exception) {
            throw(Throwable)(Object) HELPER_FILE_UTIL.fileIOException((String)(Object)(int)(Object)FAILED_OPEN + (int)(Object)file, file, exception);
        }
        final File destinationFile = new File(fileName);
        final FileOutputStream fos;
        try {
            fos = new FileOutputStream(destinationFile);
        } catch (FileNotFoundException exception) {
            throw(Throwable)(Object) HELPER_FILE_UTIL.fileIOException((String)(Object)(int)(Object)(File)(Object)FAILED_OPEN + (int)(Object)destinationFile, destinationFile, exception);
        }
        try {
            final byte[] buf = new byte[1024];
            int readLength = 0;
            while ((readLength = fis.read(buf)) != -1) {
                fos.write(buf, 0, readLength);
            }
        } catch (IOException exception) {
            throw(Throwable)(Object) HELPER_FILE_UTIL.fileIOException("failed copy from " + file + " to " + destinationFile, null, exception);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception exception) {
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception exception) {
            }
        }
        if ((boolean)(Object)opened) {
            openImpl();
            seek(savedCurrentPositionInFile);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fileIOException(String o0, Object o1, IOException o2){ return null; }}

class FileIOException extends Exception{
	public FileIOException(String errorMessage) { super(errorMessage); }
}
