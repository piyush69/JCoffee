
import java.io.UncheckedIOException;


class c17398520 {
public MyHelperClass Buffer;
	public MyHelperClass getTmp(){ return null; }

    public void SendFile(File testfile) {
        try {
            MyHelperClass SocketChannel = new MyHelperClass();
            SocketChannel sock =(SocketChannel)(Object) SocketChannel.open(new InetSocketAddress("127.0.0.1", 1234));
            sock.configureBlocking(true);
            while (!(Boolean)(Object)sock.finishConnect()) {
                System.out.println("NOT connected!");
            }
            System.out.println("CONNECTED!");
            FileInputStream fis = new FileInputStream(testfile);
            FileChannel fic =(FileChannel)(Object) fis.getChannel();
            long len =(long)(Object) fic.size();
            MyHelperClass Buffer = new MyHelperClass();
            Buffer.clear();
//            MyHelperClass Buffer = new MyHelperClass();
            Buffer.putLong(len);
//            MyHelperClass Buffer = new MyHelperClass();
            Buffer.flip();
//            MyHelperClass Buffer = new MyHelperClass();
            sock.write(Buffer);
            long cnt = 0;
            while (cnt < len) {
//                MyHelperClass Buffer = new MyHelperClass();
                Buffer.clear();
//                MyHelperClass Buffer = new MyHelperClass();
                int add =(int)(Object) fic.read(Buffer);
                cnt += add;
//                MyHelperClass Buffer = new MyHelperClass();
                Buffer.flip();
//                MyHelperClass Buffer = new MyHelperClass();
                while ((boolean)(Object)Buffer.hasRemaining()) {
//                    MyHelperClass Buffer = new MyHelperClass();
                    sock.write(Buffer);
                }
            }
            fic.close();
            File tmpfile =(File)(Object) getTmp().createNewFile("tmp", "tmp");
            FileOutputStream fos = new FileOutputStream(tmpfile);
            FileChannel foc =(FileChannel)(Object) fos.getChannel();
            int mlen = -1;
            do {
                Buffer.clear();
                mlen =(int)(Object) sock.read(Buffer);
                Buffer.flip();
                if (mlen > 0) {
                    foc.write(Buffer);
                }
            } while (mlen > 0);
            foc.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass putLong(long o0){ return null; }
	public MyHelperClass hasRemaining(){ return null; }
	public MyHelperClass open(InetSocketAddress o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass createNewFile(String o0, String o1){ return null; }
	public MyHelperClass clear(){ return null; }}

class File {

}

class SocketChannel {

public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass configureBlocking(boolean o0){ return null; }
	public MyHelperClass finishConnect(){ return null; }}

class InetSocketAddress {

InetSocketAddress(String o0, int o1){}
	InetSocketAddress(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass read(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
