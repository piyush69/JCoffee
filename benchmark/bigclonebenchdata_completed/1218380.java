import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1218380 {

    public static void main(String[] args)  throws Throwable {
        try {
            MyHelperClass Naming = new MyHelperClass();
            Object o = Naming.lookup("Server");
            IServer serverStub = (IServer) o;
            File srcDir = new File(args[0]);
            File dstDir = new File(args[1]);
            File[] srcFiles = srcDir.listFiles();
            long position = 0;
            for (File f : srcFiles) {
                if (f.isDirectory()) continue;
                try {
                    FileChannel srcChannel = (FileChannel)(Object)new FileInputStream(f).getChannel();
                    String fileName = dstDir.getAbsolutePath() + System.getProperty("file.separator") + f.getName();
                    FileChannel dstChannel = (FileChannel)(Object)new FileOutputStream(fileName).getChannel();
                    System.out.println("Coping " + fileName);
                    MyHelperClass ByteBuffer = new MyHelperClass();
                    ByteBuffer buffer =(ByteBuffer)(Object) ByteBuffer.allocate(65536);
                    int nr = 0;
                    srcChannel.position(nr);
                    nr =(int)(Object) srcChannel.read(buffer);
                    while (nr > -1) {
                        buffer.flip();
                        byte[] bytes = new byte[(int)(Object)buffer.limit()];
                        buffer.get(bytes);
                        position =(long)(Object) serverStub.write(bytes, position);
                        buffer.clear();
                        nr =(int)(Object) srcChannel.read(buffer);
                    }
                    System.out.println("Done ");
                    srcChannel.close();
                    dstChannel.close();
                } catch (IOException e) {
                }
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass allocate(int o0){ return null; }
	public MyHelperClass lookup(String o0){ return null; }}

class IServer {

public MyHelperClass write(byte[] o0, long o1){ return null; }}

class FileChannel {

public MyHelperClass read(ByteBuffer o0){ return null; }
	public MyHelperClass position(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteBuffer {

public MyHelperClass get(byte[] o0){ return null; }
	public MyHelperClass flip(){ return null; }
	public MyHelperClass limit(){ return null; }
	public MyHelperClass clear(){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class NotBoundException extends Exception{
	public NotBoundException(String errorMessage) { super(errorMessage); }
}
