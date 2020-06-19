import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12049260 {
public MyHelperClass password;
	public MyHelperClass FTPWorkerThread;
public MyHelperClass user;
	public MyHelperClass server;
	public MyHelperClass fileSize;
	public MyHelperClass passiveMode;
	public MyHelperClass lastModifiedDate;
	public MyHelperClass transferType;
	public MyHelperClass destFileName;
	public MyHelperClass fileName;
	public MyHelperClass downloadTime;
	public MyHelperClass ResourcePool;
	public MyHelperClass FTP;
	public MyHelperClass FTPReply;

        private boolean downloadFile()  throws Throwable {
            FTPClient ftp = new FTPClient();
            try {
                int reply;
                ftp.connect(this.server);
                ResourcePool.LogMessage(this, ResourcePool.INFO_MESSAGE, "Connected to " + this.server);
                reply =(int)(Object) ftp.getReplyCode();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                    ftp.disconnect();
                    ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "FTP server refused connection.");
                    return false;
                }
            } catch (IOException e) {
                if ((boolean)(Object)ftp.isConnected()) {
                    try {
                        ftp.disconnect();
                    } catch (IOException f) {
                        return false;
                    }
                }
                ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "FTP Could not connect to server.");
                ResourcePool.LogException(e, this);
                return false;
            }
            try {
                if (!(Boolean)(Object)ftp.login(this.user, this.password)) {
                    ftp.logout();
                    ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "FTP login failed.");
                    return false;
                }
                ResourcePool.LogMessage(this, ResourcePool.INFO_MESSAGE, "Remote system is " + ftp.getSystemName());
                if ((this.transferType != null) && ((int)(Object)this.transferType.compareTo(FTPWorkerThread.ASCII) == 0)) {
                    ftp.setFileType(FTP.ASCII_FILE_TYPE);
                } else {
                    ftp.setFileType(FTP.BINARY_FILE_TYPE);
                }
                if ((this.passiveMode != null) && (boolean)(Object)this.passiveMode.equalsIgnoreCase(FTPWorkerThread.FALSE)) {
                    ftp.enterLocalActiveMode();
                } else {
                    ftp.enterLocalPassiveMode();
                }
            } catch (FTPConnectionClosedException e) {
                ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, "Server closed connection.");
                ResourcePool.LogException(e, this);
                return false;
            } catch (IOException e) {
                ResourcePool.LogException(e, this);
                return false;
            }
            OutputStream output;
            try {
                java.util.Date startDate = new java.util.Date();
                output = new FileOutputStream((String)(Object)this.destFileName);
                ftp.retrieveFile(this.fileName, output);
                File f = new File((String)(Object)this.destFileName);
                if (f.exists() && (this.lastModifiedDate != null)) {
                    f.setLastModified((long)(Object)this.lastModifiedDate.longValue());
                }
                java.util.Date endDate = new java.util.Date();
                this.downloadTime =(MyHelperClass)(Object)(long)(Object)(long)(Object)(long)(Object)(long)(Object)(long)(Object)(long)(Object)(long)(Object)(long)(Object) endDate.getTime() - startDate.getTime();
                double iDownLoadTime = (((int)(Object)this.downloadTime + 1) / 1000) + 1;
                ResourcePool.LogMessage(this, ResourcePool.INFO_MESSAGE, "Download Complete, Rate = " + ((double)(Object)this.fileSize / (iDownLoadTime * 1024)) + " Kb/s, Seconds = " + iDownLoadTime);
                this.downloadTime =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) ((int)(Object)this.downloadTime + 1) / 1000;
                if ((boolean)(Object)ftp.isConnected()) {
                    ftp.disconnect();
                }
            } catch (FTPConnectionClosedException e) {
                ResourcePool.LogMessage(this, ResourcePool.ERROR_MESSAGE, e.getMessage());
                ResourcePool.LogException(e, this);
                return false;
            } catch (IOException e) {
                ResourcePool.LogException(e, this);
                return false;
            }
            return true;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII_FILE_TYPE;
	public MyHelperClass ASCII;
	public MyHelperClass FALSE;
	public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass INFO_MESSAGE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass equalsIgnoreCase(MyHelperClass o0){ return null; }
	public MyHelperClass LogException(IOException o0, c12049260 o1){ return null; }
	public MyHelperClass compareTo(MyHelperClass o0){ return null; }
	public MyHelperClass LogException(FTPConnectionClosedException o0, c12049260 o1){ return null; }
	public MyHelperClass longValue(){ return null; }
	public MyHelperClass LogMessage(c12049260 o0, MyHelperClass o1, String o2){ return null; }}

class FTPClient {

public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass retrieveFile(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class FTPConnectionClosedException extends Exception{
	public FTPConnectionClosedException(String errorMessage) { super(errorMessage); }
}
