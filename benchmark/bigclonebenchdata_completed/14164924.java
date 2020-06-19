
import java.io.UncheckedIOException;


class c14164924 {

//    @Override
    public void copy(File source, File dest) throws IOException {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source)).getChannel();
            out =(FileChannel)(Object) (new FileOutputStream(dest)).getChannel();
            in.transferTo(0, source.length(), out);
        } catch (UncheckedIOException e) {
            throw new IOException("Wrong source or destination path for backup operation!");
        } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass length(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
