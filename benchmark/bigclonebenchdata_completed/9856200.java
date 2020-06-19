import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9856200 {

    public static void copyFile(File srcFile, File destFolder)  throws Throwable {
        try {
            File destFile = new File(destFolder, srcFile.getName());
            if (destFile.exists()) {
                throw new BuildException("Could not copy " + srcFile + " to " + destFolder + " as " + destFile + " already exists");
            }
            FileChannel srcChannel = null;
            FileChannel destChannel = null;
            try {
                srcChannel = (FileChannel)(Object)new FileInputStream(srcFile).getChannel();
                destChannel = (FileChannel)(Object)new FileOutputStream(destFile).getChannel();
                destChannel.transferFrom(srcChannel, 0, srcChannel.size());
            } finally {
                if (srcChannel != null) {
                    srcChannel.close();
                }
                if (destChannel != null) {
                    destChannel.close();
                }
            }
            destFile.setLastModified((srcFile.lastModified()));
        } catch (IOException e) {
            throw new BuildException("Could not copy " + srcFile + " to " + destFolder + ": " + e, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
	BuildException(){}
	BuildException(String o0, IOException o1){}
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}
