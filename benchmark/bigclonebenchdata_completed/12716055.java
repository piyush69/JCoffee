
import java.io.UncheckedIOException;


class c12716055 {

    public void copyFile(File a_fileSrc, File a_fileDest, boolean a_append) throws IOException {
        a_fileDest.getParentFile().mkdirs();
        FileInputStream in = null;
        FileOutputStream out = null;
        FileChannel fcin = null;
        FileChannel fcout = null;
        try {
            in = new FileInputStream(a_fileSrc);
            out = new FileOutputStream(a_fileDest, a_append);
            fcin =(FileChannel)(Object) in.getChannel();
            fcout =(FileChannel)(Object) out.getChannel();
            MyHelperClass ByteBuffer = new MyHelperClass();
            ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(16 * 1024);
            while (true) {
                buffer.clear();
                int r =(int)(Object) fcin.read(buffer);
                if (r == -1) {
                    break;
                }
                buffer.flip();
                fcout.write(buffer);
            }
        } catch (UncheckedIOException ex) {
            throw ex;
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            if (fcin != null) {
                fcin.close();
            }
            if (fcout != null) {
                fcout.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass clear(){ return null; }
	public MyHelperClass flip(){ return null; }}
