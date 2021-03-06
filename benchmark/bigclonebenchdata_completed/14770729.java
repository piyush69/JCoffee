import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14770729 {

    public static boolean joinFiles(File dest, Collection<File> sources)  throws Throwable {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        boolean rv = false;
        byte[] buf = new byte[1000000];
        int bytesRead = 0;
        if (!dest.getParentFile().exists()) dest.getParentFile().mkdirs();
        try {
            fos = new FileOutputStream(dest);
            for (File source : sources) {
                fis = new FileInputStream(source);
                while ((bytesRead = fis.read(buf)) > 0) fos.write(buf, 0, bytesRead);
                fis.close();
                fis = null;
            }
            fos.close();
            fos = null;
            rv = true;
        } catch (Throwable t) {
            throw new ApplicationException("error joining files to " + dest.getAbsolutePath(), t);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                }
                fis = null;
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                }
                fos = null;
            }
        }
        return rv;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
	ApplicationException(){}
	ApplicationException(String o0, Throwable o1){}
}
