import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12816795 {

    public static FileChannel getFileChannel(Object o) throws Throwable, IOException {
        Class c = o.getClass();
        try {
            Method m =(Method)(Object) c.getMethod("getChannel", null);
            return (FileChannel)(FileChannel)(Object) m.invoke(o, null);
        } catch (IllegalAccessException x) {
        } catch (NoSuchMethodException x) {
        } catch (InvocationTargetException x) {
            if (x.getTargetException() instanceof IOException) throw (IOException) x.getTargetException();
        }
        if (o instanceof FileInputStream) return(FileChannel)(Object) new MyFileChannelImpl((FileInputStream) o);
        if (o instanceof FileOutputStream) return(FileChannel)(Object) new MyFileChannelImpl((FileOutputStream) o);
        if (o instanceof RandomAccessFile) return(FileChannel)(Object) new MyFileChannelImpl((RandomAccessFile) o);
        MyHelperClass Assert = new MyHelperClass();
        Assert.UNREACHABLE(o.getClass().toString());
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass UNREACHABLE(String o0){ return null; }}

class FileChannel {

}

class Method {

public MyHelperClass invoke(Object o0, Object o1){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class MyFileChannelImpl {

MyFileChannelImpl(RandomAccessFile o0){}
	MyFileChannelImpl(FileInputStream o0){}
	MyFileChannelImpl(){}
	MyFileChannelImpl(FileOutputStream o0){}}
