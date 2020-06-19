import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22880847 {
public static MyHelperClass IOUtils;
	public static MyHelperClass DiskManager;
	public static MyHelperClass FIFTY_MB;
	public static MyHelperClass continueWriting(long o0, long o1){ return null; }
//public MyHelperClass DiskManager;
//	public MyHelperClass IOUtils;
//	public MyHelperClass FIFTY_MB;
//	public MyHelperClass continueWriting(long o0, long o1){ return null; }

    private static void doCopyFile(File srcFile, File destFile, boolean preserveFileDate) throws Throwable, IOException {
        if (destFile.exists() && destFile.isDirectory()) {
            throw new IOException("Destination '" + destFile + "' exists but is a directory");
        }
        long time = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel input = null;
        FileChannel output = null;
        try {
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);
            input =(FileChannel)(Object) fis.getChannel();
            output =(FileChannel)(Object) fos.getChannel();
            long size =(long)(Object) input.size();
            long pos = 0;
            long count = 0;
            while (pos < size && (boolean)(Object)continueWriting(pos, size)) {
                count = (size - pos) > (long)(Object)FIFTY_MB ? FIFTY_MB : (size - pos);
                pos += (long)(Object)output.transferFrom(input, pos, count);
            }
        } finally {
            output.close();
            IOUtils.closeQuietly(fos);
            input.close();
            IOUtils.closeQuietly(fis);
        }
        if (srcFile.length() != destFile.length()) {
            if ((boolean)(Object)DiskManager.isLocked()) throw new IOException("Copy stopped since VtM was working"); else throw new IOException("Failed to copy full contents from '" + srcFile + "' to '" + destFile + "'");
        } else {
            time = System.currentTimeMillis() - time;
            long speed = (destFile.length() / time) / 1000;
            DiskManager.addDiskSpeed(speed);
        }
        if (preserveFileDate) {
            destFile.setLastModified(srcFile.lastModified());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isLocked(){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass addDiskSpeed(long o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, long o1, long o2){ return null; }}
