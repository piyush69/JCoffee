import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22054404 {
public MyHelperClass Logger;

    private void copyfile(File srcFile, File dstDir) throws Throwable, FileNotFoundException, IOException {
        if (srcFile.isDirectory()) {
            File newDestDir = new File(dstDir, srcFile.getName());
            newDestDir.mkdir();
            String fileNameList[] = srcFile.list();
            for (int i = 0; i < fileNameList.length; i++) {
                File newSouceFile = new File(srcFile, fileNameList[i]);
                copyfile(newSouceFile, newDestDir);
            }
        } else {
            File newDestFile = new File(dstDir, srcFile.getName());
            FileInputStream in = new FileInputStream(srcFile);
            FileOutputStream out = new FileOutputStream(newDestFile);
            FileChannel inChannel =(FileChannel)(Object) in.getChannel();
            FileChannel outChannel =(FileChannel)(Object) out.getChannel();
            long i;
            MyHelperClass copiedSize = new MyHelperClass();
            Logger.log("copyFile before- copiedSize = " + copiedSize);
            MyHelperClass BLOCK_LENGTH = new MyHelperClass();
            for (i = 0; i < srcFile.length() - (long)(Object)BLOCK_LENGTH; i += (long)(Object)BLOCK_LENGTH) {
                synchronized (this) {
//                    MyHelperClass BLOCK_LENGTH = new MyHelperClass();
                    inChannel.transferTo(i, BLOCK_LENGTH, outChannel);
//                    MyHelperClass copiedSize = new MyHelperClass();
                   (int)(Object) copiedSize += (int)(Object)BLOCK_LENGTH;
                }
            }
            synchronized (this) {
                inChannel.transferTo(i, srcFile.length() - i, outChannel);
//                MyHelperClass copiedSize = new MyHelperClass();
               (long)(Object) copiedSize += srcFile.length() - i;
            }
//            MyHelperClass copiedSize = new MyHelperClass();
            Logger.log("copyFile after copy- copiedSize = " + copiedSize + "srcFile.length = " + srcFile.length() + "diff = " + ((long)(Object)copiedSize - srcFile.length()));
            in.close();
            out.close();
            outChannel = null;
            MyHelperClass Logger = new MyHelperClass();
            Logger.log("File copied.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }}

class FileChannel {

public MyHelperClass transferTo(long o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}
