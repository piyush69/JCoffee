
import java.io.UncheckedIOException;


class c17241450 {

    public static boolean copyFile(File src, File des) {
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(src));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(des));
            int b;
            while ((b =(int)(Object) in.read()) != -1) out.write(b);
            out.flush();
            out.close();
            in.close();
            return true;
        } catch (UncheckedIOException ie) {
            MyHelperClass m_logCat = new MyHelperClass();
            m_logCat.error("Copy file + " + src + " to " + des + " failed!",(IOException)(Object) ie);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
