
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17385831 {

    public static void copyFile(String sourceName, String destName) throws IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel =(FileChannel)(Object) (new FileInputStream(sourceName).getChannel());
            destChannel =(FileChannel)(Object) (new FileOutputStream(destName).getChannel());
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } catch (UncheckedIOException exception) {
            throw exception;
        } finally {
            if (sourceChannel != null) {
                try {
                    sourceChannel.close();
                } catch (UncheckedIOException ex) {
                }
            }
            if (destChannel != null) {
                try {
                    destChannel.close();
                } catch (UncheckedIOException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
