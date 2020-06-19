
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17014629 {

    public static void fileCopy(File src, File dest) throws IOException {
        IOException xforward = null;
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel fcin = null;
        FileChannel fcout = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            fcin =(FileChannel)(Object) fis.getChannel();
            fcout =(FileChannel)(Object) fos.getChannel();
            final int MB32 = 32 * 1024 * 1024;
            long size =(long)(Object) fcin.size();
            long position = 0;
            while (position < size) {
                position += (long)(Object)fcin.transferTo(position, MB32, fcout);
            }
        } catch (UncheckedIOException xio) {
            xforward =(IOException)(Object) xio;
        } finally {
            if (fis != null) try {
                fis.close();
                fis = null;
            } catch (UncheckedIOException xio) {
            }
            if (fos != null) try {
                fos.close();
                fos = null;
            } catch (UncheckedIOException xio) {
            }
            if (fcin != null && (boolean)(Object)fcin.isOpen()) try {
                fcin.close();
                fcin = null;
            } catch (UncheckedIOException xio) {
            }
            if (fcout != null && (boolean)(Object)fcout.isOpen()) try {
                fcout.close();
                fcout = null;
            } catch (UncheckedIOException xio) {
            }
        }
        if (xforward != null) {
            throw xforward;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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

public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }}
