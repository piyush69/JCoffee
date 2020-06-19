
import java.io.UncheckedIOException;


class c22410173 {

    public static void copyFile(File source, File dest) throws IOException {
        FileChannel in = null, out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            in.transferTo(0, in.size(), out);
        } catch (UncheckedIOException fnfe) {
            MyHelperClass Log = new MyHelperClass();
            Log.debug((FileNotFoundException)(Object)fnfe);
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(FileNotFoundException o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
