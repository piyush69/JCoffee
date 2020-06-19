import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20386915 {

    public static String uploadFile(String urlmsg, String path, String name)  throws Throwable {
        try {
            System.out.println("Sending: " + urlmsg);
            URL url = new URL(urlmsg);
            if (url == null) {
                System.out.println("Resource " + urlmsg + " not found");
                return null;
            }
            File outFile = new File(path, name);
            FileOutputStream out = new FileOutputStream(outFile);
            InputStream in = url.openStream();
            byte[] buf = new byte[4 * 1024];
            int bytesRead;
            while ((bytesRead = in.read(buf)) != -1) {
                out.write(buf, 0, bytesRead);
            }
            out.close();
            in.close();
            return path + name;
        } catch (Exception e) {
            throw new GROBIDServiceException("An exception occured while running Grobid.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GROBIDServiceException extends Exception{
	public GROBIDServiceException(String errorMessage) { super(errorMessage); }
	GROBIDServiceException(String o0, Exception o1){}
	GROBIDServiceException(){}
}
