
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12977779 {

    public void run() {
        FileInputStream src;
        FileOutputStream dest;
        try {
            MyHelperClass srcName = new MyHelperClass();
            dest = new FileOutputStream(srcName);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return;
        }
        FileChannel destC =(FileChannel)(Object) dest.getChannel();
        FileChannel srcC;
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        ByteBuffer buf =(ByteBuffer)(Object) ByteBuffer.allocateDirect(BUFFER_SIZE);
        try {
            int fileNo = 0;
            while (true) {
                int i = 1;
                MyHelperClass srcName = new MyHelperClass();
                String destName = srcName + "_" + fileNo;
                src = new FileInputStream(destName);
                srcC =(FileChannel)(Object) src.getChannel();
                while ((i > 0)) {
                    i =(int)(Object) srcC.read(buf);
                    buf.flip();
                    destC.write(buf);
                    buf.compact();
                }
                srcC.close();
                src.close();
                fileNo++;
            }
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

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass write(ByteBuffer o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(ByteBuffer o0){ return null; }}

class ByteBuffer {

public MyHelperClass compact(){ return null; }
	public static MyHelperClass allocateDirect(MyHelperClass o0){ return null; }
	public MyHelperClass flip(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
