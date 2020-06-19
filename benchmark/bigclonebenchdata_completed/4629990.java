import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4629990 {
public MyHelperClass NULL;
public int noRetriesSoFar;
	public MyHelperClass password;
	public MyHelperClass logoutAndDisconnect(FTPClient o0){ return null; }
public MyHelperClass user;
	public MyHelperClass notifyAndStartWaitingFlag;
//	public MyHelperClass noRetriesSoFar;
	public MyHelperClass logger;
	public MyHelperClass errEntry;
	public MyHelperClass waitBetweenRetry(){ return null; }

    private String logonToServer(FTPClient ftpClient, String ftpAddress, int noRetries)  throws Throwable {
        String remoteHomeDir = null;
        int noRetriesSoFar =(int)(Object) NULL; //new int();
        noRetriesSoFar = 0;
        while (true) {
            try {
                MyHelperClass ftpPort = new MyHelperClass();
                ftpClient.connect(ftpAddress, ftpPort);
                int reply =(int)(Object) ftpClient.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                    ftpClient.disconnect();
                    throw new IOException();
                }
                MyHelperClass user = new MyHelperClass();
                if (!(Boolean)(Object)ftpClient.login(user, password)) {
                    throw new IOException();
                }
                remoteHomeDir =(String)(Object) ftpClient.printWorkingDirectory();
                MyHelperClass msgEntry = new MyHelperClass();
                msgEntry.setAppContext("logonToServer()");
//                MyHelperClass ftpPort = new MyHelperClass();
                msgEntry.setMessageText("Logged into FTP server " + ftpAddress + ":" + ftpPort + " as user " + user);
//                MyHelperClass msgEntry = new MyHelperClass();
                logger.logProcess(msgEntry);
                break;
            } catch (IOException e) {
                logoutAndDisconnect(ftpClient);
//                MyHelperClass noRetriesSoFar = new MyHelperClass();
                if (noRetriesSoFar++ < noRetries) {
                    waitBetweenRetry();
                    notifyAndStartWaitingFlag =(MyHelperClass)(Object) false;
                } else {
                    notifyAndStartWaitingFlag =(MyHelperClass)(Object) true;
                    errEntry.setThrowable(e);
                    errEntry.setAppContext("logonToServer()");
                    errEntry.setAppMessage("Unable to login after " + ((int)(Object)noRetriesSoFar - 1) + " retries. Max Retries.\n" + "Address:" + ftpAddress + "\n" + "User:" + user);
                    errEntry.setSubjectSendEmail("Unable to login to " + ftpAddress + " after " + ((int)(Object)noRetriesSoFar - 1) + " retries.");
                    logger.logError(errEntry);
                    break;
                }
            }
        }
        return remoteHomeDir;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setMessageText(String o0){ return null; }
	public MyHelperClass logProcess(MyHelperClass o0){ return null; }
	public MyHelperClass setSubjectSendEmail(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass setAppMessage(String o0){ return null; }
	public MyHelperClass setAppContext(String o0){ return null; }
	public MyHelperClass logError(MyHelperClass o0){ return null; }
	public MyHelperClass setThrowable(IOException o0){ return null; }}

class FTPClient {

public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(String o0, MyHelperClass o1){ return null; }}
