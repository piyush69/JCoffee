
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12049266 {

    private FTPClient getFTPConnection(String strUser, String strPassword, String strServer, boolean binaryTransfer, String connectionNote, boolean passiveMode) {
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(strServer);
            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogMessage(this, ResourcePool.INFO_MESSAGE, "Connected to " + strServer + ", " + connectionNote);
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
//                MyHelperClass ResourcePool = new MyHelperClass();
                ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "FTP server refused connection.");
                return null;
            }
        } catch (UncheckedIOException e) {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException f) {
                    return null;
                }
            }
            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "FTP Could not connect to server.");
//            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogException((IOException)(Object)e, this);
            return null;
        }
        try {
            if (!(Boolean)(Object)ftp.login(strUser, strPassword)) {
                ftp.logout();
                MyHelperClass ResourcePool = new MyHelperClass();
                ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "FTP login failed.");
                return null;
            }
            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogMessage(this, ResourcePool.INFO_MESSAGE, "Remote system is " + ftp.getSystemName() + ", " + connectionNote);
            if (binaryTransfer) {
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
            } else {
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.ASCII_FILE_TYPE);
            }
            if (passiveMode) {
                ftp.enterLocalPassiveMode();
            } else {
                ftp.enterLocalActiveMode();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "Server closed connection.");
//            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogException((IOException)(Object)e, this);
            return null;
        } catch (ArithmeticException e) {
            MyHelperClass ResourcePool = new MyHelperClass();
            ResourcePool.LogException((IOException)(Object)e, this);
            return null;
        }
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII_FILE_TYPE;
	public MyHelperClass INFO_MESSAGE;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass LogException(IOException o0, c12049266 o1){ return null; }
	public MyHelperClass LogMessage(c12049266 o0, MyHelperClass o1, String o2){ return null; }
	public MyHelperClass LogException(FTPConnectionClosedException o0, c12049266 o1){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPConnectionClosedException extends Exception{
	public FTPConnectionClosedException(String errorMessage) { super(errorMessage); }
}
