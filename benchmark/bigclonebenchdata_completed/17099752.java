
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17099752 {
public MyHelperClass port;
	public MyHelperClass password;

    private FTPClient connect() throws FTPException {
        try {
            FTPClient ftp = new FTPClient();
            MyHelperClass host = new MyHelperClass();
            ftp.connect(host, port);
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                System.err.println("FTP server refused connection.");
            }
            MyHelperClass userName = new MyHelperClass();
            ftp.login(userName, password);
            MyHelperClass FTP = new MyHelperClass();
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            return ftp;
        } catch (UncheckedIOException e) {
            throw new FTPException("Failed to connect to server",(IOException)(Object) e);
        } catch (ArithmeticException e) {
            throw new FTPException("Failed to connect to server",(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
	FTPException(){}
	FTPException(String o0, IOException o1){}
	FTPException(String o0, SocketException o1){}
}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
