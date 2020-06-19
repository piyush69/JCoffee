
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4822222 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static void copy(String srcFileName, String destFileName) throws IOException {
        if (srcFileName == null) {
            throw new IllegalArgumentException("srcFileName is null");
        }
        if (destFileName == null) {
            throw new IllegalArgumentException("destFileName is null");
        }
        FileChannel src = null;
        FileChannel dest = null;
        try {
            src =(FileChannel)(Object) (new FileInputStream(srcFileName).getChannel());
            dest =(FileChannel)(Object) (new FileOutputStream(destFileName).getChannel());
            long n =(long)(Object) src.size();
            MappedByteBuffer buf =(MappedByteBuffer)(Object) src.map(MapMode.READ_ONLY, 0, n);
            dest.write(buf);
        } finally {
            if (dest != null) {
                try {
                    dest.close();
                } catch (UncheckedIOException e1) {
                }
            }
            if (src != null) {
                try {
                    src.close();
                } catch (UncheckedIOException e1) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}
