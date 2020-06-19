
import java.io.UncheckedIOException;


class c8511445 {

    protected static void upload(FtpSiteConnector connector, File localFile, String remotePath, boolean createRootDir, IProgressMonitor monitor) throws FtpException {
        FTPClient ftp = new FTPClient();
        try {
            String hostname =(String)(Object) connector.getUrl().getHost();
            ftp.connect(hostname);
            MyHelperClass log = new MyHelperClass();
            log.info("Connected to " + hostname);
//            MyHelperClass log = new MyHelperClass();
            log.info((String)(Object)ftp.getReplyString());
            boolean loggedIn =(boolean)(Object) ftp.login(connector.getUsername(), connector.getPassword());
            if (loggedIn) {
//                MyHelperClass log = new MyHelperClass();
                log.info("User " + connector.getUsername() + " logged in");
                MyHelperClass FTPClient = new MyHelperClass();
                ftp.setFileTransferMode(FTPClient.BINARY_FILE_TYPE);
//                MyHelperClass FTPClient = new MyHelperClass();
                ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
                ftp.enterLocalPassiveMode();
                MyHelperClass FtpUtils = new MyHelperClass();
                FtpUtils.store(ftp, localFile, remotePath, createRootDir, monitor);
                ftp.logout();
            } else {
                throw new FtpException("Invalid login");
            }
            ftp.disconnect();
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error("File upload failed with message: " + e.getMessage());
            throw new FtpException("File upload failed with message: " + e.getMessage());
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException ioe) {
                    throw new FtpException("File upload failed with message: " + ioe.getMessage());
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getHost(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass store(FTPClient o0, File o1, String o2, boolean o3, IProgressMonitor o4){ return null; }}

class FtpSiteConnector {

public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class File {

}

class IProgressMonitor {

}

class FtpException extends Exception{
	public FtpException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
