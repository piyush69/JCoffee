import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15193222 {
public MyHelperClass NULL;
public MyHelperClass fileChannel;
	public MyHelperClass HELPER_FILE_UTIL;
	public MyHelperClass file;

//    @Override
    public void copy(final String fileName) throws Throwable, FileIOException {
        try {
            MyHelperClass opened = new MyHelperClass();
            if ((boolean)(Object)opened) {
                MyHelperClass fileChannel = new MyHelperClass();
                fileChannel.position(0);
            } else {
                FileChannel fileChannel =(FileChannel)(Object) NULL; //new FileChannel();
                fileChannel = (FileChannel)(Object)new FileInputStream((String)(Object)file).getChannel();
            }
            FileChannel dstChannel = null;
            try {
                dstChannel = (FileChannel)(Object)new FileOutputStream(fileName).getChannel();
                MyHelperClass fileChannel = new MyHelperClass();
                dstChannel.transferFrom(fileChannel, 0, fileChannel.size());
            } finally {
                try {
                    if (dstChannel != null) {
                        dstChannel.close();
                    }
                } catch (Exception exception) {
                }
            }
//            MyHelperClass opened = new MyHelperClass();
            if ((boolean)(Object)opened) {
                MyHelperClass currentPositionInFile = new MyHelperClass();
                fileChannel.position((int)(Object)currentPositionInFile);
            } else {
                MyHelperClass fileChannel = new MyHelperClass();
                fileChannel.close();
            }
        } catch (IOException exception) {
            MyHelperClass file = new MyHelperClass();
            throw(Throwable)(Object) HELPER_FILE_UTIL.fileIOException("failed copy " + file + " to " + fileName, null, exception);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass fileIOException(String o0, Object o1, IOException o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass position(int o0){ return null; }}

class FileIOException extends Exception{
	public FileIOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass transferFrom(MyHelperClass o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}
