import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13339653 {

    public void write(String resource, String destinationPath) throws Throwable, IOException, CoreException {
        OutputStream output = null;
        InputStream contentStream = null;
        try {
            contentStream = new BufferedInputStream(new FileInputStream(resource));
            output = new BufferedOutputStream(new FileOutputStream(destinationPath));
            int available = contentStream.available();
            MyHelperClass DEFAULT_BUFFER_SIZE = new MyHelperClass();
            available = available <= 0 ? DEFAULT_BUFFER_SIZE : available;
//            MyHelperClass DEFAULT_BUFFER_SIZE = new MyHelperClass();
            int chunkSize = Math.min((int)(Object)DEFAULT_BUFFER_SIZE, available);
            byte[] readBuffer = new byte[chunkSize];
            int n = contentStream.read(readBuffer);
            while (n > 0) {
                output.write(readBuffer, 0, n);
                n = contentStream.read(readBuffer);
            }
        } finally {
            if (contentStream != null) {
                try {
                    contentStream.close();
                } catch (IOException e) {
                    MyHelperClass IDEWorkbenchPlugin = new MyHelperClass();
                    IDEWorkbenchPlugin.log("Error closing input stream for file: " + resource, e);
                }
            }
            if (output != null) {
                output.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0, IOException o1){ return null; }}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
