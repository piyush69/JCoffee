import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3994258 {
public MyHelperClass CatException;
	public MyHelperClass setArrToFile(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass user;
	public MyHelperClass server;
	public MyHelperClass ftpClient;
	public MyHelperClass errMsg;
	public MyHelperClass dirQueue;
	public MyHelperClass bufFilePath;
	public MyHelperClass fileList;
	public MyHelperClass errCode;
	public MyHelperClass queFilePath;
	public MyHelperClass password;
	public MyHelperClass encode;
	public MyHelperClass FTPReply;
	public MyHelperClass startGetList(){ return null; }

    public boolean connectServer(String server, String user, String password)  throws Throwable {
        boolean result = true;
        try {
            if (user.equals("")) {
                user = "anonymous";
                password = "anonymous";
            }
            this.server =(MyHelperClass)(Object) server;
            this.user =(MyHelperClass)(Object) user;
            this.password =(MyHelperClass)(Object) password;
            ftpClient =(MyHelperClass)(Object) new FTPClient();
            ftpClient.setControlEncoding(encode);
            ftpClient.connect(server);
            ftpClient.setSoTimeout(1000 * 30);
            ftpClient.setDefaultTimeout(1000 * 30);
            ftpClient.setConnectTimeout(1000 * 30);
            ftpClient.enterLocalPassiveMode();
            ftpClient.login(user, password);
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                ftpClient.disconnect();
                return false;
            }
            queFilePath = "data\\" +(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) this.server + ".que";
            bufFilePath = "data\\" +(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) this.server + ".buf";
            startGetList();
        } catch (java.net.SocketTimeoutException e1) {
            errMsg = ftpClient.getReplyString();
            errCode = ftpClient.getReplyCode();
            result = false;
            setArrToFile(dirQueue, queFilePath);
            setArrToFile(fileList, bufFilePath);
            CatException.getMethod().catException(e1, "连接超时");
        } catch (Exception e) {
            errMsg = ftpClient.getReplyString();
            errCode = ftpClient.getReplyCode();
            result = false;
            setArrToFile(dirQueue, queFilePath);
            setArrToFile(fileList, bufFilePath);
            CatException.getMethod().catException(e, "未知异常");
        } finally {
            if ((boolean)(Object)ftpClient.isConnected()) {
                try {
                    ftpClient.disconnect();
                } catch (IOException ioe) {
                    CatException.getMethod().catException(ioe, "IO异常");
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass catException(Exception o0, String o1){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass catException(SocketTimeoutException o0, String o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass getMethod(){ return null; }
	public MyHelperClass setControlEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass catException(IOException o0, String o1){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass setDefaultTimeout(int o0){ return null; }
	public MyHelperClass setSoTimeout(int o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class FTPClient {

}
