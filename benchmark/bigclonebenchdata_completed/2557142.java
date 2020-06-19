import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c2557142 {
public MyHelperClass ftpClient;
	public MyHelperClass FTPReply;
	public MyHelperClass logout(){ return null; }

    public void login(LoginData loginData) throws ConnectionEstablishException, AccessDeniedException {
        try {
            int reply;
            this.ftpClient.connect(loginData.getFtpServer());
            reply =(int)(Object) this.ftpClient.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                this.ftpClient.disconnect();
                throw (new ConnectionEstablishException("FTP server refused connection."));
            }
        } catch (UncheckedIOException e) {
            if ((boolean)(Object)this.ftpClient.isConnected()) {
                try {
                    this.ftpClient.disconnect();
                } catch (UncheckedIOException f) {
                }
            }
            e.printStackTrace();
            throw (new ConnectionEstablishException("Could not connect to server.",(IOException)(Object) e));
        }
        try {
            if (!(Boolean)(Object)this.ftpClient.login(loginData.getFtpBenutzer(), loginData.getFtpPasswort())) {
                this.logout();
                throw (new AccessDeniedException("Could not login into server."));
            }
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
            throw (new AccessDeniedException("Could not login into server.",(IOException)(Object) ioe));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class LoginData {

public MyHelperClass getFtpPasswort(){ return null; }
	public MyHelperClass getFtpServer(){ return null; }
	public MyHelperClass getFtpBenutzer(){ return null; }}

class ConnectionEstablishException extends Exception{
	public ConnectionEstablishException(String errorMessage) { super(errorMessage); }
	ConnectionEstablishException(String o0, IOException o1){}
	ConnectionEstablishException(){}
}

class AccessDeniedException extends Exception{
	public AccessDeniedException(String errorMessage) { super(errorMessage); }
	AccessDeniedException(){}
	AccessDeniedException(String o0, IOException o1){}
}
