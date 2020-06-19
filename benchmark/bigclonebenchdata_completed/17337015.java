import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17337015 {
public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass url;
	public MyHelperClass checkDownLoadDirectory(String o0){ return null; }

    public boolean downloadFile(String webdir, String fileName, String localdir)  throws Throwable {
        boolean result = false;
        checkDownLoadDirectory(localdir);
        FTPClient ftp = new FTPClient();
        try {
            ftp.connect(url);
            ftp.login(username, password);
            if (!"".equals(webdir.trim())) ftp.changeDirectory(webdir);
            ftp.download(fileName, new File(localdir + "//" + fileName));
            result = true;
            ftp.disconnect(true);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ArrayStoreException e) {
            e.printStackTrace();
        } catch (ClassCastException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass changeDirectory(String o0){ return null; }
	public MyHelperClass disconnect(boolean o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass download(String o0, File o1){ return null; }}

class FTPIllegalReplyException extends Exception{
	public FTPIllegalReplyException(String errorMessage) { super(errorMessage); }
}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPDataTransferException extends Exception{
	public FTPDataTransferException(String errorMessage) { super(errorMessage); }
}

class FTPAbortedException extends Exception{
	public FTPAbortedException(String errorMessage) { super(errorMessage); }
}
