import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6184983 {
public MyHelperClass logger;
	public MyHelperClass Database;
	public MyHelperClass separator(){ return null; }

//    @Override
    public boolean copyFile(String srcRootPath, String srcDir, String srcFileName, String destRootPath, String destDir, String destFileName)  throws Throwable {
        File srcPath = new File(srcRootPath + separator() + Database.getDomainName() + separator() + srcDir);
        if (!srcPath.exists()) {
            try {
                srcPath.mkdirs();
            } catch (Exception e) {
                logger.error("Can't create directory...:" + srcPath);
                return false;
            }
        }
        File destPath = new File(destRootPath + separator() + Database.getDomainName() + separator() + destDir);
        if (!destPath.exists()) {
            try {
                destPath.mkdirs();
            } catch (Exception e) {
                logger.error("Can't create directory...:" + destPath);
                return false;
            }
        }
        File from = new File((int)(Object)srcPath + (int)(Object)(File)(Object)separator() + srcFileName);
        File to = new File((int)(Object)destPath + (int)(Object)(File)(Object)separator() + destFileName);
        boolean res = true;
        FileChannel srcChannel = null;
        FileChannel destChannel = null;
        try {
            srcChannel = (FileChannel)(Object)new FileInputStream(from).getChannel();
            destChannel = (FileChannel)(Object)new FileOutputStream(to).getChannel();
            destChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } catch (Exception ex) {
            logger.error("Exception", ex);
            res = false;
        } finally {
            if (destChannel != null) {
                try {
                    destChannel.close();
                } catch (ArithmeticException ex) {
                    logger.error("Exception", ex);
                    res = false;
                }
            }
            if (srcChannel != null) {
                try {
                    srcChannel.close();
                } catch (ArrayIndexOutOfBoundsException ex) {
                    logger.error("Exception", ex);
                    res = false;
                }
            }
        }
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDomainName(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}
