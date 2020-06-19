
import java.io.UncheckedIOException;


class c16529002 {
public static MyHelperClass MapMode;
//public MyHelperClass MapMode;

    public static boolean copy(File source, File dest) {
        FileChannel in = null, out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            long size =(long)(Object) in.size();
            MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
            out.write(buf);
            if (in != null) in.close();
            if (out != null) out.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_ONLY;
}

class File {

}

class FileChannel {

public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class MappedByteBuffer {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
