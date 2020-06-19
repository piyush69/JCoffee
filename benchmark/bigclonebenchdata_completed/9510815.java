
import java.io.UncheckedIOException;


class c9510815 {
public static MyHelperClass close(FileChannel o0){ return null; }
//public MyHelperClass close(FileChannel o0){ return null; }

    public static void copy(File source, File target) {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            MyHelperClass BUFFER = new MyHelperClass();
            ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocateDirect(BUFFER);
            while ((int)(Object)in.read(buffer) != -1) {
                buffer.flip();
                while ((boolean)(Object)buffer.hasRemaining()) {
                    out.write(buffer);
                }
                buffer.clear();
            }
        } catch (UncheckedIOException ex) {
            throw new RuntimeException(ex);
        } finally {
            close(in);
            close(out);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class ByteBuffer {

public MyHelperClass flip(){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass clear(){ return null; }
	public static MyHelperClass allocateDirect(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
