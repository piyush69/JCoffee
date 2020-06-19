import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8511446 {
public static MyHelperClass getFileSize(FTPClient o0, String o1){ return null; }
//public MyHelperClass getFileSize(FTPClient o0, String o1){ return null; }

    protected static void download(FtpSiteConnector connector, File localFile, String remotePath, final IProgressMonitor monitor) throws Throwable, FtpException {
        if (!localFile.exists()) {
            FTPClient ftp = new FTPClient();
            try {
                MyHelperClass FTPClientConfig = new MyHelperClass();
                FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
                ftp.configure(conf);
                String hostname =(String)(Object) connector.getUrl().getHost();
                ftp.connect(hostname);
                MyHelperClass log = new MyHelperClass();
                log.info("Connected to " + hostname);
//                MyHelperClass log = new MyHelperClass();
                log.info((String)(Object)ftp.getReplyString());
                boolean loggedIn =(boolean)(Object) ftp.login(connector.getUsername(), connector.getPassword());
                if (loggedIn) {
//                    MyHelperClass log = new MyHelperClass();
                    log.info("downloading file: " + remotePath);
                    MyHelperClass FTPClient = new MyHelperClass();
                    ftp.setFileTransferMode(FTPClient.BINARY_FILE_TYPE);
//                    MyHelperClass FTPClient = new MyHelperClass();
                    ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
                    ftp.enterLocalPassiveMode();
                    final long fileSize =(long)(Object) getFileSize(ftp, remotePath);
                    FileOutputStream dfile = new FileOutputStream(localFile);
                    ftp.retrieveFile(remotePath, dfile, new CopyStreamListener() {

                        public int worked = 0;

                        public void bytesTransferred(long totalBytesTransferred, int bytesTransferred, long streamSize) {
                            int percent = percent(fileSize, totalBytesTransferred);
                            int delta = percent - worked;
                            if (delta > 0) {
                                if (monitor != null) {
                                    monitor.worked(delta);
                                }
                                worked = percent;
                            }
                        }

                        public void bytesTransferred(CopyStreamEvent event) {
                        }

                        private int percent(long totalBytes, long totalBytesTransferred) {
                            long percent = (totalBytesTransferred * 100) / totalBytes;
                            return Long.valueOf(percent).intValue();
                        }
                    });
                    dfile.flush();
                    dfile.close();
                    ftp.logout();
                } else {
                    throw new FtpException("Invalid login");
                }
                ftp.disconnect();
            } catch (SocketException e) {
                MyHelperClass log = new MyHelperClass();
                log.error("File download failed with message: " + e.getMessage());
                throw new FtpException("File download failed with message: " + e.getMessage());
            } catch (IOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error("File download failed with message: " + e.getMessage());
                throw new FtpException("File download failed with message: " + e.getMessage());
            } finally {
                if ((boolean)(Object)ftp.isConnected()) {
                    try {
                        ftp.disconnect();
                    } catch (UncheckedIOException ioe) {
                        throw new FtpException("File download failed with message: " + ioe.getMessage());
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYST_UNIX;
	public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getHost(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class FtpSiteConnector {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getUsername(){ return null; }}

class IProgressMonitor {

public MyHelperClass worked(int o0){ return null; }}

class FtpException extends Exception{
	public FtpException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass retrieveFile(String o0, FileOutputStream o1,  CopyStreamListener o2){ return null; }
	public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class FTPClientConfig {

FTPClientConfig(){}
	FTPClientConfig(MyHelperClass o0){}}

class CopyStreamListener {

}

class CopyStreamEvent {

}
