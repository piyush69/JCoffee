
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18349315 {

    public static boolean copyFile(File from, File to, byte[] buf) {
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        if (buf == null) buf = new byte[(int)(Object)BUFFER_SIZE];
        FileInputStream from_s = null;
        FileOutputStream to_s = null;
        try {
            from_s = new FileInputStream(from);
            to_s = new FileOutputStream(to);
            for (int bytesRead =(int)(Object) from_s.read(buf); bytesRead != -1; bytesRead =(int)(Object) from_s.read(buf)) to_s.write(buf, 0, bytesRead);
            from_s.close();
            from_s = null;
            to_s.getFD().sync();
            to_s.close();
            to_s = null;
        } catch (UncheckedIOException ioe) {
            return false;
        } finally {
            if (from_s != null) {
                try {
                    from_s.close();
                } catch (UncheckedIOException ioe) {
                }
            }
            if (to_s != null) {
                try {
                    to_s.close();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass sync(){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getFD(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
