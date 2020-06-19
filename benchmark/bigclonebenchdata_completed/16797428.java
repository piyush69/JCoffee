
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16797428 {

    private void copy(File sourceFile, File destinationFile) {
        try {
            FileChannel in =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(destinationFile).getChannel());
            try {
                in.transferTo(0, in.size(), out);
                in.close();
                out.close();
            } catch (UncheckedIOException e) {
                MyHelperClass GTLogger = new MyHelperClass();
                GTLogger.getInstance().error((IOException)(Object)e);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass GTLogger = new MyHelperClass();
            GTLogger.getInstance().error((IOException)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass error(FileNotFoundException o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
