import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20423573 {

    private static String fetchFile(String urlLocation)  throws Throwable {
        try {
            URL url = new URL(urlLocation);
            URLConnection conn = url.openConnection();
            File tempFile = File.createTempFile("marla", ".jar");
            OutputStream os = new FileOutputStream(tempFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(conn.getInputStream(), os);
            return tempFile.getAbsolutePath();
        } catch (IOException ex) {
            throw new MarlaException("Unable to fetch file '" + urlLocation + "' from server", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class MarlaException extends Exception{
	public MarlaException(String errorMessage) { super(errorMessage); }
	MarlaException(){}
	MarlaException(String o0, IOException o1){}
}
