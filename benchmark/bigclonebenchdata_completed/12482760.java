import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12482760 {
public MyHelperClass formatFTPReplyString(MyHelperClass o0){ return null; }
public MyHelperClass protection;
	public MyHelperClass impliciteSec;
	public MyHelperClass Util;
	public MyHelperClass protocol;
	public MyHelperClass debug(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }
public MyHelperClass remotePort;
	public MyHelperClass client;
	public MyHelperClass controlEncoding;
	public MyHelperClass connectionId;
	public MyHelperClass Logger;
	public MyHelperClass remoteServer;
	public MyHelperClass passivMode;
	public MyHelperClass login;
	public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass password;
	public MyHelperClass checkLocked(){ return null; }
	public MyHelperClass resetClient(IOException o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass resetClient(UnknownHostException o0){ return null; }
	public MyHelperClass resetClient(SocketException o0){ return null; }
	public MyHelperClass isSecured(){ return null; }
	public MyHelperClass updateOpTime(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass clearCache(){ return null; }

    public synchronized void connect() throws Throwable, FTPConnectionException {
        checkLocked();
        try {
            int reply;
            this.disconnect();
            if ((boolean)(Object)isSecured()) {
                this.client =(MyHelperClass)(Object) new FTPSClient(protocol, protection, impliciteSec, null, null);
            } else {
                this.client =(MyHelperClass)(Object) new FTPClient();
            }
            if (this.controlEncoding != null) {
                this.client.setControlEncoding(this.controlEncoding);
                debug("control encoding : ", controlEncoding);
            }
            Logger.defaultLogger().info("Trying to connect to server : " + this.remoteServer + " ...");
            debug("connect : connect", remoteServer);
            client.connect(remoteServer, this.remotePort);
            Logger.defaultLogger().info("Received FTP server response : " + formatFTPReplyString(client.getReplyString()));
            this.connectionId = Util.getRndLong();
            reply =(int)(Object) client.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                String msg =(String)(Object) formatFTPReplyString(client.getReplyString());
                this.disconnect();
                throw new FTPConnectionException("Unable to communicate with remote FTP server. Got message : " + msg);
            } else {
                Logger.defaultLogger().info("Trying to log in with user : " + this.login + " ...");
                debug("connect : login", login + "/" + password);
                if (!(Boolean)(Object)client.login(this.login, this.password)) {
                    String msg =(String)(Object) formatFTPReplyString(client.getReplyString());
                    this.disconnect();
                    throw new FTPConnectionException("Unable to login on FTP server (" + login + "/" + password + "). Received response : " + msg);
                } else {
                    Logger.defaultLogger().info("Logged in with user : " + this.login + ". Received response : " + formatFTPReplyString(client.getReplyString()));
                    if ((boolean)(Object)this.passivMode) {
                        Logger.defaultLogger().info("Switching to passive mode ...");
                        debug("connect : pasv");
                        client.enterLocalPassiveMode();
                        reply =(int)(Object) client.getReplyCode();
                        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                            String msg =(String)(Object) formatFTPReplyString(client.getReplyString());
                            this.disconnect();
                            throw new FTPConnectionException("Unable to switch to passiv mode. Received response : " + msg);
                        } else {
                            this.updateOpTime();
                        }
                    } else {
                        this.updateOpTime();
                    }
                    debug("connect : bin");
                    client.setFileType(FTP.BINARY_FILE_TYPE);
                    Logger.defaultLogger().info("Connected to server : " + this.remoteServer);
                }
            }
        } catch (ArithmeticException e) {
            resetClient((IOException)(Object)e);
            throw new FTPConnectionException("Unknown FTP server : " + this.remoteServer);
        } catch (ArrayIndexOutOfBoundsException e) {
            resetClient((IOException)(Object)e);
            throw new FTPConnectionException("Error during FTP connection : " + e.getMessage());
        } catch (ArrayStoreException e) {
            resetClient((IOException)(Object)e);
            throw new FTPConnectionException("Error during FTP connection : " + e.getMessage());
        } finally {
            clearCache();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getRndLong(){ return null; }
	public MyHelperClass setControlEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass defaultLogger(){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class FTPConnectionException extends Exception{
	public FTPConnectionException(String errorMessage) { super(errorMessage); }
}

class FTPSClient {

FTPSClient(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, Object o3, Object o4){}
	FTPSClient(){}}

class FTPClient {

}
