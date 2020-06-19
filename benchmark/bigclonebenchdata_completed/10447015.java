
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10447015 {

    public void delete(String remoteFile) {
        MyHelperClass connector = new MyHelperClass();
        String remotePath =(String)(Object) connector.getRemoteDirectory();
        MyHelperClass PATH_SEPARATOR = new MyHelperClass();
        remotePath += PATH_SEPARATOR + remoteFile;
        FTPClient ftp = new FTPClient();
        try {
//            MyHelperClass connector = new MyHelperClass();
            String hostname =(String)(Object) connector.getUrl().getHost();
            ftp.connect(hostname);
            MyHelperClass log = new MyHelperClass();
            log.info("Connected to " + hostname);
//            MyHelperClass log = new MyHelperClass();
            log.info((String)(Object)ftp.getReplyString());
//            MyHelperClass connector = new MyHelperClass();
            boolean loggedIn =(boolean)(Object) ftp.login(connector.getUsername(), connector.getPassword());
            if (loggedIn) {
                ftp.deleteFile(remotePath);
                ftp.logout();
            }
            ftp.disconnect();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("File chmod failed with message: " + e.getMessage());
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("File chmod failed with message: " + e.getMessage());
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getRemoteDirectory(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass deleteFile(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
