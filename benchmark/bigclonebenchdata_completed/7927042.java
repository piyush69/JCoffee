import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7927042 {

    private void loadDynamically(File result, String extraPath)  throws Throwable {
        URL url = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            MyHelperClass homeServerUrl = new MyHelperClass();
            url = new URL(homeServerUrl + extraPath);
            is = url.openStream();
            fos = new FileOutputStream(result);
            byte[] buff = new byte[8192];
            int nbRead;
            while ((nbRead = is.read(buff)) > 0) fos.write(buff, 0, nbRead);
        } catch (IOException e) {
            throw new StellariumException("Cannot dynamically load " + result + " from " + url);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace(System.out);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class StellariumException extends Exception{
	public StellariumException(String errorMessage) { super(errorMessage); }
}
