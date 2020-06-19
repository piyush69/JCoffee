
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3874060 {

    public static void copyFile(File sourceFile, File targetFile) throws IOException {
        if (sourceFile == null || targetFile == null) {
            throw new NullPointerException("Source file and target file must not be null");
        }
        File directory =(File)(Object) targetFile.getParentFile();
        if (!(Boolean)(Object)directory.exists() && !(Boolean)(Object)directory.mkdirs()) {
            throw new IOException("Could not create directory '" + directory + "'");
        }
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream =(InputStream)(Object) new BufferedInputStream(new FileInputStream(sourceFile));
            outputStream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(targetFile));
            try {
                byte[] buffer = new byte[32768];
                for (int readBytes =(int)(Object) inputStream.read(buffer); readBytes > 0; readBytes =(int)(Object) inputStream.read(buffer)) {
                    outputStream.write(buffer, 0, readBytes);
                }
            } catch (UncheckedIOException ex) {
                targetFile.delete();
                throw ex;
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (UncheckedIOException ex) {
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (UncheckedIOException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
