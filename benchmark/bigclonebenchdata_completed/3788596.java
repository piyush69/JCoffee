
import java.io.UncheckedIOException;


class c3788596 {
public static MyHelperClass LOGGER;
	public static MyHelperClass COPY_FILE_ERROR;
	public static MyHelperClass closeCloseable(FileInputStream o0, File o1){ return null; }
	public static MyHelperClass buildLogString(MyHelperClass o0, Object[] o1){ return null; }
	public static MyHelperClass closeCloseable(FileOutputStream o0, File o1){ return null; }
//public MyHelperClass COPY_FILE_ERROR;
//	public MyHelperClass LOGGER;
//	public MyHelperClass closeCloseable(FileInputStream o0, File o1){ return null; }
//	public MyHelperClass buildLogString(MyHelperClass o0, Object[] o1){ return null; }
//	public MyHelperClass closeCloseable(FileOutputStream o0, File o1){ return null; }

    public static boolean copyFile(final File fileFrom, final File fileTo) {
        assert fileFrom != null : "fileFrom is null";
        assert fileTo != null : "fileTo is null";
        MyHelperClass COPY_FILE_INFO = new MyHelperClass();
        LOGGER.info(buildLogString(COPY_FILE_INFO, new Object[] { fileFrom, fileTo }));
        boolean error = true;
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(fileFrom);
            outputStream = new FileOutputStream(fileTo);
            final FileChannel inChannel =(FileChannel)(Object) inputStream.getChannel();
            final FileChannel outChannel =(FileChannel)(Object) outputStream.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
            error = false;
        } catch (final UncheckedIOException e) {
            MyHelperClass SEVERE = new MyHelperClass();
            LOGGER.log(SEVERE, buildLogString(COPY_FILE_ERROR, new Object[] { fileFrom, fileTo }),(IOException)(Object) e);
        } finally {
            closeCloseable(inputStream, fileFrom);
            closeCloseable(outputStream, fileTo);
        }
        return error;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(MyHelperClass o0, MyHelperClass o1, IOException o2){ return null; }
	public MyHelperClass info(MyHelperClass o0){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
