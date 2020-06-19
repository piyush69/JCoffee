import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c16549081 {
public static MyHelperClass bytesToHexString(MyHelperClass o0){ return null; }
public static MyHelperClass MessageFormat;
//	public MyHelperClass bytesToHexString(MyHelperClass o0){ return null; }
//public MyHelperClass MessageFormat;

    public static String copy(URL url, File dest) throws IOException {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.debug("Fetching: " + url);
        }
        IOException error = null;
        MyHelperClass MAX_RETRIES = new MyHelperClass();
        for (int retries = 0; retries < (int)(Object)MAX_RETRIES; retries++) {
            try {
                OutputStream out = null;
                InputStream is = null;
                try {
                    out = new FileOutputStream(dest);
                    if (url.getProtocol().equals("http")) {
                        is =(InputStream)(Object) new WebFileInputStream(url);
                    } else {
                        is =(InputStream)(Object) url.openStream();
                    }
                    MyHelperClass MessageDigest = new MyHelperClass();
                    MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = is.read(buf)) > 0) {
                        out.write(buf, 0, len);
                        md.update(buf, 0, len);
                    }
                    out.flush();
                    return(String)(Object) bytesToHexString(md.digest());
                } catch (UncheckedIOException e) {
                    if (error == null) {
                        error =(IOException)(Object) e;
                    }
//                    MyHelperClass MAX_RETRIES = new MyHelperClass();
                    if (retries <(int)(Object) MAX_RETRIES - 1) {
                        MyHelperClass MessageFormat = new MyHelperClass();
                        log.error(MessageFormat.format("Unable to fetch URL {0}, connection timed out. Will retry...", url.toExternalForm()));
                        try {
                            MyHelperClass FileHelper = new MyHelperClass();
                            Thread.sleep((long)(Object)FileHelper.RETRY_SLEEP_TIME);
                        } catch (InterruptedException e2) {
                        }
                    }
                } catch (ArithmeticException e) {
                    if (error == null) {
                        error =(IOException)(Object) e;
                    }
//                    MyHelperClass MAX_RETRIES = new MyHelperClass();
                    if (retries <(int)(Object) MAX_RETRIES - 1) {
                        MyHelperClass MessageFormat = new MyHelperClass();
                        log.error(MessageFormat.format("Unable to fetch URL {0}, timed out. Will retry...", url.toExternalForm()));
                        try {
                            MyHelperClass FileHelper = new MyHelperClass();
                            Thread.sleep((long)(Object)FileHelper.RETRY_SLEEP_TIME);
                        } catch (InterruptedException e2) {
                        }
                    }
                } catch (IOException e) {
                    if (dest.exists()) {
                        try {
                            MyHelperClass FileHelper = new MyHelperClass();
                            FileHelper.delete(dest);
                        } catch (UncheckedIOException e1) {
                            MyHelperClass Messages = new MyHelperClass();
                            log.error(MessageFormat.format(Messages.getString("FileHelper.UNABLE_DELETE_FILE"), dest),(IOException)(Object) e1);
                        }
                    }
                    throw e;
                } finally {
                    if (is != null) {
                        try {
                            is.close();
                        } catch (IOException e) {
                            MyHelperClass Messages = new MyHelperClass();
                            log.error(Messages.getString("FileHelper.UNABLE_CLOSE_STREAM"), e);
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();
                        } catch (IOException e) {
                            MyHelperClass Messages = new MyHelperClass();
                            log.error(Messages.getString("FileHelper.UNABLE_CLOSE_STREAM"), e);
                        }
                    }
                }
            } catch (UncheckedIOException e) {
                MyHelperClass Messages = new MyHelperClass();
                throw new IOException((String)(Object)MessageFormat.format(Messages.getString("FileHelper.UNABLE_DOWNLOAD_URL"), url), e);
            }
        }
        throw error;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RETRY_SLEEP_TIME;
public MyHelperClass error(MyHelperClass o0, IOException o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass error(MyHelperClass o0){ return null; }
	public MyHelperClass format(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass format(MyHelperClass o0, URL o1){ return null; }
	public MyHelperClass format(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass delete(File o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class URL {

public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class WebFileInputStream {

WebFileInputStream(URL o0){}
	WebFileInputStream(){}}

class MessageDigest {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass digest(){ return null; }}

class ConnectException extends Exception{
	public ConnectException(String errorMessage) { super(errorMessage); }
}

class SocketTimeoutException extends Exception{
	public SocketTimeoutException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
