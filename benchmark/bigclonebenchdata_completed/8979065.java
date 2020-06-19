import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8979065 {

    public void copyFile(File source, File destination)  throws Throwable {
        try {
            FileInputStream sourceStream = new FileInputStream(source);
            try {
                FileOutputStream destinationStream = new FileOutputStream(destination);
                try {
                    FileChannel sourceChannel =(FileChannel)(Object) sourceStream.getChannel();
                    sourceChannel.transferTo(0, sourceChannel.size(), destinationStream.getChannel());
                } finally {
                    try {
                        destinationStream.close();
                    } catch (Exception e) {
                        MyHelperClass IoMode = new MyHelperClass();
                        throw new RuntimeIoException(e, IoMode.CLOSE);
                    }
                }
            } finally {
                try {
                    sourceStream.close();
                } catch (Exception e) {
                    MyHelperClass IoMode = new MyHelperClass();
                    throw new RuntimeIoException(e, IoMode.CLOSE);
                }
            }
        } catch (IOException e) {
            MyHelperClass IoMode = new MyHelperClass();
            throw new RuntimeIoException(e, IoMode.COPY);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COPY;
	public MyHelperClass CLOSE;
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, java.nio.channels.FileChannel o2){ return null; }}

class RuntimeIoException extends Exception{
	public RuntimeIoException(String errorMessage) { super(errorMessage); }
	RuntimeIoException(Exception o0, MyHelperClass o1){}
	RuntimeIoException(){}
	RuntimeIoException(IOException o0, MyHelperClass o1){}
}
