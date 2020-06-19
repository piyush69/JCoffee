import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13307307 {
public static MyHelperClass close(FileChannel o0){ return null; }
//public MyHelperClass close(FileChannel o0){ return null; }

    private static void doCopyFile(FileInputStream in, FileOutputStream out)  throws Throwable {
        FileChannel inChannel = null, outChannel = null;
        try {
            inChannel =(FileChannel)(Object) in.getChannel();
            outChannel =(FileChannel)(Object) out.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (UncheckedIOException e) {
            MyHelperClass ManagedIOException = new MyHelperClass();
            throw(Throwable)(Object) ManagedIOException.manage((IOException)(Object)e);
        } finally {
            if (inChannel != null) {
                close(inChannel);
            }
            if (outChannel != null) {
                close(outChannel);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass manage(IOException o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}
