import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4501770 {
public MyHelperClass Level;
	public MyHelperClass FTP;
	public MyHelperClass ftpClient;
	public MyHelperClass FTPReply;
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass disconnectFtp(){ return null; }
	public MyHelperClass getMessages(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getUsername(){ return null; }

        protected final void connectFtp() throws IOException {
            try {
                if (!(Boolean)(Object)this.ftpClient.isConnected()) {
                    this.ftpClient.connect(getHost(), getPort());
                    getLog().write(Level.INFO, String.format((String)(Object)getMessages().getString("FtpSuccessfullyConnected"), getHost()));
                    int reply =(int)(Object) this.ftpClient.getReplyCode();
                    if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                        this.ftpClient.disconnect();
                        throw new IOException(String.format((String)(Object)getMessages().getString("FtpErrorConnectingRefused"), getHost()));
                    }
                    if (getUsername() != null) {
                        if (!(Boolean)(Object)this.ftpClient.login(getUsername(), getPassword())) {
                            this.ftpClient.logout();
                            disconnectFtp();
                            throw new IOException(String.format((String)(Object)getMessages().getString("FtpErrorAuthorizing"), getHost()));
                        }
                    }
                    this.ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                    this.ftpClient.enterLocalPassiveMode();
                    getLog().write(Level.INFO, String.format((String)(Object)getMessages().getString("FtpSuccessfullyAuthorized"), getHost()));
                }
            } catch (IOException ex) {
                disconnectFtp();
                throw new IOException(String.format((String)(Object)getMessages().getString("FtpErrorConnecting"), getHost(), ex.toString()));
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isConnected(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass write(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
