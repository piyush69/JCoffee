
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2742287 {

    public void run() {
        FileInputStream src;
        FileOutputStream dest;
        try {
            MyHelperClass srcName = new MyHelperClass();
            src = new FileInputStream(srcName);
            MyHelperClass destName = new MyHelperClass();
            dest = new FileOutputStream(destName);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return;
        }
        FileChannel srcC =(FileChannel)(Object) src.getChannel();
        FileChannel destC =(FileChannel)(Object) dest.getChannel();
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocate(BUFFER_SIZE);
        try {
            int i;
            System.out.println(srcC.size());
            while ((i =(int)(Object) srcC.read(buf)) > 0) {
                System.out.println(buf.getChar(2));
                buf.flip();
                destC.write(buf);
                buf.compact();
            }
            destC.close();
            dest.close();
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
            return;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass compact(){ return null; }
	public MyHelperClass getChar(int o0){ return null; }
	public static MyHelperClass allocate(MyHelperClass o0){ return null; }
	public MyHelperClass flip(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
