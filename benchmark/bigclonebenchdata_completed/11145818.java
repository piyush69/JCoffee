
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11145818 {

    private void copy(File sourceFile, File destinationFile) {
        try {
            FileChannel in =(FileChannel)(Object) (new FileInputStream(sourceFile).getChannel());
            FileChannel out =(FileChannel)(Object) (new FileOutputStream(destinationFile).getChannel());
            try {
                in.transferTo(0, in.size(), out);
                in.close();
                out.close();
            } catch (UncheckedIOException e) {
            }
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

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
