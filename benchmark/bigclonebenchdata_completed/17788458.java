import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17788458 {

    private static synchronized boolean doCopyFile(File srcFile, File destFile, boolean preserveFileDate) throws Throwable, IOException {
        if (destFile.exists() && destFile.isDirectory()) {
            MyHelperClass FILE_SEPARATOR = new MyHelperClass();
            destFile = new File((int)(Object)destFile + (int)(Object)(File)(Object)FILE_SEPARATOR + srcFile.getName());
        }
        FileInputStream input = new FileInputStream(srcFile);
        try {
            FileOutputStream output = new FileOutputStream(destFile);
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(input, output);
            } finally {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(output);
            }
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
        }
        if (srcFile.length() != destFile.length()) {
            throw new IOException("Failed to copy full contents from '" + srcFile + "' to '" + destFile + "'");
        }
        if (preserveFileDate) {
            destFile.setLastModified(srcFile.lastModified());
        }
        return destFile.exists();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}
