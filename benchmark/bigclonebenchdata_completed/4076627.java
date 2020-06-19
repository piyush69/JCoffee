
import java.io.UncheckedIOException;


class c4076627 {
public MyHelperClass password;

    public void openFtpConnection(String workingDirectory) throws RQLException {
        try {
            FTPClient ftpClient;// = new FTPClient();
            ftpClient = new FTPClient();
            MyHelperClass server = new MyHelperClass();
            ftpClient.connect(server);
            MyHelperClass user = new MyHelperClass();
            ftpClient.login(user, password);
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.changeWorkingDirectory(workingDirectory);
        } catch (UncheckedIOException ioex) {
            throw new RQLException("FTP client could not be created. Please check attributes given in constructor.",(IOException)(Object) ioex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class RQLException extends Exception{
	public RQLException(String errorMessage) { super(errorMessage); }
	RQLException(){}
	RQLException(String o0, IOException o1){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }}
