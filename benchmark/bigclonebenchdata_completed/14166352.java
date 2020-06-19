import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14166352 {

    public static boolean downloadFile(String urlString, String outputFile, int protocol)  throws Throwable {
        InputStream is = null;
        File file = new File(outputFile);
        FileOutputStream fos = null;
        MyHelperClass HTTP_PROTOCOL = new MyHelperClass();
        if (protocol == (int)(Object)HTTP_PROTOCOL) {
            try {
                URL url = new URL(urlString);
                URLConnection ucnn = null;
                MyHelperClass BlueXStatics = new MyHelperClass();
                if (BlueXStatics.proxy == null || url.getProtocol().equals("file")) ucnn = url.openConnection(); else ucnn = url.openConnection((Proxy)(Object)BlueXStatics.proxy);
                is = ucnn.getInputStream();
                fos = new FileOutputStream(file);
                byte[] data = new byte[4096];
                int offset;
                while ((offset = is.read(data)) != -1) {
                    fos.write(data, 0, offset);
                }
                return true;
            } catch (Exception ex) {
            } finally {
                try {
                    is.close();
                } catch (Exception e) {
                }
                try {
                    fos.close();
                } catch (Exception e) {
                }
            }
        } else throw new ProtocolNotSupportedException("The protocol selected is not supported by this version of downloadFile() method.");
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass proxy;
}

class ProtocolNotSupportedException extends Exception{
	public ProtocolNotSupportedException(String errorMessage) { super(errorMessage); }
}
