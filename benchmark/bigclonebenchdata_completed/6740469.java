
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6740469 {
public MyHelperClass getDestFile(String o0, String o1){ return null; }
	public MyHelperClass log(String o0){ return null; }

    private void copyFile(String sourceFilename, String destDirname) throws BuildException {
        log("Copying file " + sourceFilename + " to " + destDirname);
        File destFile =(File)(Object) getDestFile(sourceFilename, destDirname);
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            inStream =(InputStream)(Object) new BufferedInputStream(new FileInputStream(sourceFilename));
            outStream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(destFile));
            byte[] buffer = new byte[1024];
            int n = 0;
            while ((n =(int)(Object) inStream.read(buffer)) != -1) outStream.write(buffer, 0, n);
        } catch (Exception e) {
            throw new BuildException("Failed to copy file \"" + sourceFilename + "\" to directory \"" + destDirname + "\"");
        } finally {
            try {
                if (inStream != null) inStream.close();
            } catch (UncheckedIOException e) {
            }
            try {
                if (outStream != null) outStream.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}

class File {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
