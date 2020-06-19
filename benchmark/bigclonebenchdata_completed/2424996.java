import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2424996 {
public MyHelperClass[] EXTENSIONS;
public MyHelperClass NULL;
//public MyHelperClass EXTENSIONS;
	public MyHelperClass CTR_FILE;
	public MyHelperClass UBM_FILE;
	public MyHelperClass MTD_FILE;
	public MyHelperClass fso;

    protected void migrateOnDemand()  throws Throwable {
        try {
            MyHelperClass prefix = new MyHelperClass();
            if ((boolean)(Object)fso.fileExists(prefix + ".fat") && !(Boolean)(Object)fso.fileExists((String)(Object)(int)(Object)prefix + (int)(Object)EXTENSIONS[(int)(Object)UBM_FILE])) {
                RandomAccessFile ubm, meta, ctr, rbm;
                InputStream inputStream;
                OutputStream outputStream;
//                MyHelperClass prefix = new MyHelperClass();
                fso.renameFile(prefix + ".fat",(int)(Object) prefix + (int)(Object)EXTENSIONS[(int)(Object)UBM_FILE]);
//                MyHelperClass prefix = new MyHelperClass();
                ubm =(RandomAccessFile)(Object) fso.openFile((int)(Object)prefix + (int)(Object)EXTENSIONS[(int)(Object)UBM_FILE], "rw");
//                MyHelperClass prefix = new MyHelperClass();
                meta =(RandomAccessFile)(Object) fso.openFile((int)(Object)prefix + (int)(Object)EXTENSIONS[(int)(Object)MTD_FILE], "rw");
//                MyHelperClass prefix = new MyHelperClass();
                ctr =(RandomAccessFile)(Object) fso.openFile((int)(Object)prefix + (int)(Object)EXTENSIONS[(int)(Object)CTR_FILE], "rw");
                ubm.seek(ubm.length() - 16);
                int blockSize =(int)(Object) NULL; //new int();
                meta.writeInt(blockSize = ubm.readInt());
                int size =(int)(Object) NULL; //new int();
                meta.writeInt(size = ubm.readInt());
//                MyHelperClass blockSize = new MyHelperClass();
                ctr.setLength(ubm.readLong() + (long)(Object)blockSize);
                ctr.close();
                meta.close();
                ubm.setLength(ubm.length() - 16);
                ubm.seek(0);
//                MyHelperClass prefix = new MyHelperClass();
                rbm =(RandomAccessFile)(Object) fso.openFile((int)(Object)prefix + (int)(Object)EXTENSIONS[(int)(Object)UBM_FILE], "rw");
                inputStream = new BufferedInputStream((InputStream)(Object)new RandomAccessFileInputStream(ubm));
                outputStream = new BufferedOutputStream((OutputStream)(Object)new RandomAccessFileOutputStream(rbm));
                for (int b; (b = inputStream.read()) != -1; ) outputStream.write(b);
                outputStream.close();
                inputStream.close();
                rbm.close();
                ubm.close();
            }
        } catch (IOException ie) {
            throw new WrappingRuntimeException((String)(Object)ie);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass renameFile(String o0, int o1){ return null; }
	public MyHelperClass openFile(int o0, String o1){ return null; }
	public MyHelperClass fileExists(String o0){ return null; }}

class RandomAccessFileInputStream {

RandomAccessFileInputStream(){}
	RandomAccessFileInputStream(RandomAccessFile o0){}}

class RandomAccessFileOutputStream {

RandomAccessFileOutputStream(){}
	RandomAccessFileOutputStream(RandomAccessFile o0){}}

class WrappingRuntimeException extends Exception{
	public WrappingRuntimeException(String errorMessage) { super(errorMessage); }
}
