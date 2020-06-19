import java.io.*;
import java.lang.*;
import java.util.*;



class c21715891 {

    protected void copy(File src, File dest) throws IOException {
        if (src.isDirectory() && dest.isFile()) throw new IOException("Cannot copy a directory to a file");
        if (src.isDirectory()) {
            File newDir = new File(dest, src.getName());
            if (!newDir.mkdirs()) throw new IOException("Cannot create a new Directory");
            File[] entries = src.listFiles();
            for (int i = 0; i < entries.length; ++i) copy(entries[i], newDir);
            return;
        }
        if (dest.isDirectory()) {
            File newFile = new File(dest, src.getName());
            newFile.createNewFile();
            copy(src, newFile);
            return;
        }
        try {
            if (src.length() == 0) {
                dest.createNewFile();
                return;
            }
            FileChannel fc =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            long transfered = 0;
            long totalLength = src.length();
            while (transfered < totalLength) {
                long num =(long)(Object) fc.transferTo(transfered, totalLength - transfered, dstChannel);
                if (num == 0) throw new IOException("Error while copying");
                transfered += num;
            }
            dstChannel.close();
            fc.close();
        } catch (IOException e) {
            MyHelperClass os = new MyHelperClass();
            if (os.equals("Unix")) {
                MyHelperClass _logger = new MyHelperClass();
                _logger.fine("Trying to use cp to copy file...");
                File cp = new File("/usr/bin/cp");
                if (!cp.exists()) cp = new File("/bin/cp");
                if (!cp.exists()) cp = new File("/usr/local/bin/cp");
                if (!cp.exists()) cp = new File("/sbin/cp");
                if (!cp.exists()) cp = new File("/usr/sbin/cp");
                if (!cp.exists()) cp = new File("/usr/local/sbin/cp");
                if (cp.exists()) {
                    Process cpProcess = Runtime.getRuntime().exec(cp.getAbsolutePath() + " '" + src.getAbsolutePath() + "' '" + dest.getAbsolutePath() + "'");
                    int errCode;
                    try {
                        errCode = cpProcess.waitFor();
                    } catch (java.lang.InterruptedException ie) {
                        throw e;
                    }
                    return;
                }
            }
            throw e;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass fine(String o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(long o0, long o1, FileChannel o2){ return null; }}
