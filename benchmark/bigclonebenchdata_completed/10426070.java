
import java.io.UncheckedIOException;


class c10426070 {
public static MyHelperClass close(OutputStream o0){ return null; }
	public static MyHelperClass flush(OutputStream o0){ return null; }
	public static MyHelperClass close(InputStream o0){ return null; }
//public MyHelperClass flush(OutputStream o0){ return null; }
//	public MyHelperClass close(InputStream o0){ return null; }
//	public MyHelperClass close(OutputStream o0){ return null; }

    public static long copy(File src, long amount, File dst) {
        final int BUFFER_SIZE = 1024;
        long amountToRead = amount;
        InputStream in = null;
        OutputStream out = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(src));
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(dst));
            byte[] buf = new byte[BUFFER_SIZE];
            while (amountToRead > 0) {
                int read =(int)(Object) in.read(buf, 0, (int) Math.min(BUFFER_SIZE, amountToRead));
                if (read == -1) break;
                amountToRead -= read;
                out.write(buf, 0, read);
            }
        } catch (UncheckedIOException e) {
        } finally {
            close(in);
            flush(out);
            close(out);
        }
        return amount - amountToRead;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
