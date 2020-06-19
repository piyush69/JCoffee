import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8468859 {
public MyHelperClass CONNECTNOTPOSSIBLE;
	public MyHelperClass CONNECTNOTCORRECT;
	public MyHelperClass port;
	public MyHelperClass LOGINNOTCORRECT;
	public MyHelperClass ERRORWHILECONNECT;
	public MyHelperClass LOGINACCTNOTCORRECT;
	public MyHelperClass passwd;
public MyHelperClass username;
	public MyHelperClass server;
	public MyHelperClass ftpClient;
	public MyHelperClass status;
	public MyHelperClass FTPReply;
	public MyHelperClass account;
	public MyHelperClass disconnect(){ return null; }

    public boolean connect() {
        boolean isConnected = false;
        try {
            try {
                this.ftpClient.connect(this.server, this.port);
            } catch (UncheckedIOException e) {
                status = CONNECTNOTPOSSIBLE.code;
                return false;
            } catch (ArithmeticException e) {
                status = CONNECTNOTPOSSIBLE.code;
                return false;
            }
            int reply =(int)(Object) this.ftpClient.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                this.disconnect();
                status = CONNECTNOTCORRECT.code;
                return false;
            }
            try {
                if (this.account == null) {
                    if (!(Boolean)(Object)this.ftpClient.login(this.username, this.passwd)) {
                        status = LOGINNOTCORRECT.code;
                        this.ftpClient.logout();
                        return false;
                    }
                } else if (!(Boolean)(Object)this.ftpClient.login(this.username, this.passwd, this.account)) {
                    status = LOGINACCTNOTCORRECT.code;
                    this.ftpClient.logout();
                    return false;
                }
            } catch (UncheckedIOException e) {
                status = ERRORWHILECONNECT.code;
                try {
                    this.ftpClient.logout();
                } catch (UncheckedIOException e1) {
                }
                return false;
            }
            isConnected = true;
            return true;
        } finally {
            if ((!isConnected) && (boolean)(Object)this.ftpClient.isConnected()) {
                this.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass code;
public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
