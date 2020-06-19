import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20052285 {

    private void copyFile(String path)  throws Throwable {
        try {
            MyHelperClass srcdir = new MyHelperClass();
            File srcfile = new File((String)(Object)srcdir, path);
            MyHelperClass destdir = new MyHelperClass();
            File destfile = new File((String)(Object)destdir, path);
            File parent = destfile.getParentFile();
            if (!parent.exists()) {
                parent.mkdirs();
            }
            FileInputStream fis = new FileInputStream(srcfile);
            FileOutputStream fos = new FileOutputStream(destfile);
            int bytes_read = 0;
            byte buffer[] = new byte[512];
            while ((bytes_read = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes_read);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            throw new BuildException("Error while copying file " + path);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}
