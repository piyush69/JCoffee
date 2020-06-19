import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c8990222 {
public MyHelperClass log(String o0, ConnectException o1, int o2){ return null; }
	public MyHelperClass getCachedFile(Get o0){ return null; }
	public MyHelperClass log(String o0, UnknownHostException o1, int o2){ return null; }
public MyHelperClass log(String o0, int o1){ return null; }

    private boolean get(String surl, File dst, Get get) throws IOException {
        boolean ret = false;
        InputStream is = null;
        OutputStream os = null;
        try {
            try {
                if (surl.startsWith("file://")) {
                    is = new FileInputStream(surl.substring(7));
                } else {
                    URL url = new URL(surl);
                    is =(InputStream)(Object) url.openStream();
                }
                if (is != null) {
                    os = new FileOutputStream(dst);
                    int read;
                    byte[] buffer = new byte[4096];
                    while ((read = is.read(buffer)) > 0) {
                        os.write(buffer, 0, read);
                    }
                    ret = true;
                }
            } catch (UncheckedIOException ex) {
                log("Connect exception " + ex.getMessage(),(ConnectException)(Object) ex, 3);
                if (dst.exists()) dst.delete();
            } catch (ArithmeticException ex) {
                log("Unknown host " + ex.getMessage(),(ConnectException)(Object) ex, 3);
            } catch (FileNotFoundException ex) {
                log("File not found: " + ex.getMessage(), 3);
            }
        } finally {
            if (is != null) is.close();
            if (os != null) os.close();
            is = null;
            os = null;
        }
        if (ret) {
            try {
                is = new FileInputStream(dst);
                os = new FileOutputStream((String)(Object)getCachedFile(get));
                int read;
                byte[] buffer = new byte[4096];
                while ((read = is.read(buffer)) > 0) {
                    os.write(buffer, 0, read);
                }
            } finally {
                if (is != null) is.close();
                if (os != null) os.close();
                is = null;
                os = null;
            }
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Get {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openStream(){ return null; }}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}
