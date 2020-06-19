
import java.io.UncheckedIOException;


class c15429599 {

    public static boolean copyFile(File src, File dest) throws IOException {
        if (src == null) {
            throw new IllegalArgumentException("src == null");
        }
        if (dest == null) {
            throw new IllegalArgumentException("dest == null");
        }
        if (!(Boolean)(Object)src.isFile()) {
            return false;
        }
        FileChannel in =(FileChannel)(Object) (new FileInputStream(src).getChannel());
        FileChannel out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
        try {
            in.transferTo(0, in.size(), out);
            return true;
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass isFile(){ return null; }}

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
