import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14106232 {

    public void copyFile(File from, File to)  throws Throwable {
        try {
            InputStream in = new FileInputStream(from);
            OutputStream out = new FileOutputStream(to);
            int readCount;
            byte[] bytes = new byte[1024];
            while ((readCount = in.read(bytes)) != -1) {
                out.write(bytes, 0, readCount);
            }
            out.flush();
            in.close();
            out.close();
        } catch (Exception ex) {
            throw new BuildException(ex.getMessage(), ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
	BuildException(String o0, Exception o1){}
	BuildException(){}
}
