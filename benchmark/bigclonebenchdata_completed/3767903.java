
import java.io.UncheckedIOException;


class c3767903 {

    public static void copy(File source, File destination) throws FileNotFoundException, IOException {
        if (source == null) throw new NullPointerException("The source may not be null.");
        if (destination == null) throw new NullPointerException("The destination may not be null.");
        FileInputStream sourceStream = new FileInputStream(source);
        destination.getParentFile().mkdirs();
        FileOutputStream destStream = new FileOutputStream(destination);
        try {
            FileChannel sourceChannel =(FileChannel)(Object) sourceStream.getChannel();
            FileChannel destChannel =(FileChannel)(Object) destStream.getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        } finally {
            try {
                sourceStream.close();
                destStream.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
