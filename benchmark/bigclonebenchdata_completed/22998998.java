
import java.io.UncheckedIOException;


class c22998998 {

    public static void copyFile(File sourceFile, File destFile) throws IOException {
        FileChannel inputFileChannel =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
        FileChannel outputFileChannel =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
        long offset = 0L;
        long length =(long)(Object) inputFileChannel.size();
        final long MAXTRANSFERBUFFERLENGTH = 1024 * 1024;
        try {
            for (; offset < length; ) {
                offset += (long)(Object)inputFileChannel.transferTo(offset, MAXTRANSFERBUFFERLENGTH, outputFileChannel);
                inputFileChannel.position(offset);
            }
        } finally {
            try {
                outputFileChannel.close();
            } catch (Exception ignore) {
            }
            try {
                inputFileChannel.close();
            } catch (UncheckedIOException ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass position(long o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
