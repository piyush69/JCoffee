import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14075551 {
public MyHelperClass executeRetryable(RetryHandler o0,  Retryable o1, MyHelperClass o2){ return null; }
	public MyHelperClass executeRetryable(RetryHandler o0,  Retryable o1, String o2){ return null; }
public MyHelperClass makeRemoteDir(FTPClient o0, MyHelperClass o1){ return null; }
	public MyHelperClass doSiteCommand(FTPClient o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeRetryable(RetryHandler o0){ return null; }
	public MyHelperClass doSiteCommand(FTPClient o0, String o1){ return null; }
public MyHelperClass task;
	public MyHelperClass FTPTask;
	public MyHelperClass Project;
	public MyHelperClass FTPConfigurator;
	public MyHelperClass FTP;
	public MyHelperClass getTimeDiff(FTPClient o0){ return null; }
	public MyHelperClass transferFiles(FTPClient o0){ return null; }

    public void doFTP() throws Throwable, BuildException {
        FTPClient ftp = null;
        try {
            MyHelperClass task = new MyHelperClass();
            task.log("Opening FTP connection to " + task.getServer(), Project.MSG_VERBOSE);
            ftp = new FTPClient();
//            MyHelperClass task = new MyHelperClass();
            if ((boolean)(Object)task.isConfigurationSet()) {
//                MyHelperClass task = new MyHelperClass();
                ftp =(FTPClient)(Object) FTPConfigurator.configure(ftp, task);
            }
//            MyHelperClass task = new MyHelperClass();
            ftp.setRemoteVerificationEnabled(task.getEnableRemoteVerification());
//            MyHelperClass task = new MyHelperClass();
            ftp.connect(task.getServer(), task.getPort());
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                throw new BuildException("FTP connection failed: " + ftp.getReplyString());
            }
            MyHelperClass Project = new MyHelperClass();
            task.log("connected", Project.MSG_VERBOSE);
//            MyHelperClass Project = new MyHelperClass();
            task.log("logging in to FTP server", Project.MSG_VERBOSE);
//            MyHelperClass task = new MyHelperClass();
            if ((task.getAccount() != null && !(Boolean)(Object)ftp.login(task.getUserid(), task.getPassword(), task.getAccount())) || (task.getAccount() == null && !(Boolean)(Object)ftp.login(task.getUserid(), task.getPassword()))) {
                throw new BuildException("Could not login to FTP server");
            }
//            MyHelperClass Project = new MyHelperClass();
            task.log("login succeeded", Project.MSG_VERBOSE);
//            MyHelperClass task = new MyHelperClass();
            if ((boolean)(Object)task.isBinary()) {
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
//                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                    throw new BuildException("could not set transfer type: " + ftp.getReplyString());
                }
            } else {
                ftp.setFileType(FTP.ASCII_FILE_TYPE);
//                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                    throw new BuildException("could not set transfer type: " + ftp.getReplyString());
                }
            }
//            MyHelperClass task = new MyHelperClass();
            if ((boolean)(Object)task.isPassive()) {
//                MyHelperClass Project = new MyHelperClass();
                task.log("entering passive mode", Project.MSG_VERBOSE);
                ftp.enterLocalPassiveMode();
//                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                    throw new BuildException("could not enter into passive " + "mode: " + ftp.getReplyString());
                }
            }
//            MyHelperClass task = new MyHelperClass();
            if (task.getInitialSiteCommand() != null) {
//                MyHelperClass task = new MyHelperClass();
                RetryHandler h = new RetryHandler(task.getRetriesAllowed(), task);
                final FTPClient lftp = ftp;
                executeRetryable(h, new Retryable() {

                    public void execute() throws IOException {
                        doSiteCommand(lftp, task.getInitialSiteCommand());
                    }
                MyHelperClass task = new MyHelperClass();
                }, "initial site command: " + task.getInitialSiteCommand());
            }
//            MyHelperClass task = new MyHelperClass();
            if (task.getUmask() != null) {
//                MyHelperClass task = new MyHelperClass();
                RetryHandler h = new RetryHandler(task.getRetriesAllowed(), task);
                final FTPClient lftp = ftp;
                executeRetryable(h, new Retryable() {

                    public void execute() throws IOException {
                        doSiteCommand(lftp, "umask " + task.getUmask());
                    }
                MyHelperClass task = new MyHelperClass();
                }, "umask " + task.getUmask());
            }
//            MyHelperClass task = new MyHelperClass();
            if (task.getAction() == FTPTask.MK_DIR) {
//                MyHelperClass task = new MyHelperClass();
                RetryHandler h = new RetryHandler(task.getRetriesAllowed(), task);
                final FTPClient lftp = ftp;
                executeRetryable(h, new Retryable() {

                    public void execute() throws IOException {
                        makeRemoteDir(lftp, task.getRemotedir());
                    }
                MyHelperClass task = new MyHelperClass();
                }, task.getRemotedir());
//            MyHelperClass task = new MyHelperClass();
            } else if (task.getAction() == FTPTask.SITE_CMD) {
//                MyHelperClass task = new MyHelperClass();
                RetryHandler h = new RetryHandler(task.getRetriesAllowed(), task);
                final FTPClient lftp = ftp;
                executeRetryable(h, new Retryable() {

                    public void execute() throws IOException {
                        doSiteCommand(lftp, task.getSiteCommand());
                    }
                MyHelperClass task = new MyHelperClass();
                }, "Site Command: " + task.getSiteCommand());
            } else {
//                MyHelperClass task = new MyHelperClass();
                if (task.getRemotedir() != null) {
//                    MyHelperClass Project = new MyHelperClass();
                    task.log("changing the remote directory", Project.MSG_VERBOSE);
//                    MyHelperClass task = new MyHelperClass();
                    ftp.changeWorkingDirectory(task.getRemotedir());
//                    MyHelperClass FTPReply = new MyHelperClass();
                    if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                        throw new BuildException("could not change remote " + "directory: " + ftp.getReplyString());
                    }
                }
//                MyHelperClass task = new MyHelperClass();
                if ((Boolean)(Object)task.isNewer() && (Boolean)(Object)task.isTimeDiffAuto()) {
//                    MyHelperClass task = new MyHelperClass();
                    task.setTimeDiffMillis(getTimeDiff(ftp));
                }
                MyHelperClass FTPTask = new MyHelperClass();
                task.log(FTPTask.ACTION_STRS[(int)(Object)task.getAction()] + " " + FTPTask.ACTION_TARGET_STRS[(int)(Object)task.getAction()]);
                transferFiles(ftp);
            }
        } catch (ArithmeticException ex) {
            throw new BuildException("error during FTP transfer: " + ex,(IOException)(Object) ex);
        } finally {
            if (ftp != null && (boolean)(Object)ftp.isConnected()) {
                try {
                    MyHelperClass Project = new MyHelperClass();
                    task.log("disconnecting", Project.MSG_VERBOSE);
                    ftp.logout();
                    ftp.disconnect();
                } catch (ArrayIndexOutOfBoundsException ex) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass MSG_VERBOSE;
	public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass MK_DIR;
	public MyHelperClass[] ACTION_STRS;
	public MyHelperClass SITE_CMD;
	public MyHelperClass[] ACTION_TARGET_STRS;
	public MyHelperClass ASCII_FILE_TYPE;
public MyHelperClass getPassword(){ return null; }
	public MyHelperClass configure(FTPClient o0, MyHelperClass o1){ return null; }
	public MyHelperClass isConfigurationSet(){ return null; }
	public MyHelperClass getAccount(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getRemotedir(){ return null; }
	public MyHelperClass getAction(){ return null; }
	public MyHelperClass isNewer(){ return null; }
	public MyHelperClass getSiteCommand(){ return null; }
	public MyHelperClass getServer(){ return null; }
	public MyHelperClass getRetriesAllowed(){ return null; }
	public MyHelperClass getEnableRemoteVerification(){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass isPassive(){ return null; }
	public MyHelperClass setTimeDiffMillis(MyHelperClass o0){ return null; }
	public MyHelperClass getInitialSiteCommand(){ return null; }
	public MyHelperClass isBinary(){ return null; }
	public MyHelperClass isTimeDiffAuto(){ return null; }
	public MyHelperClass log(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass getUmask(){ return null; }
	public MyHelperClass getUserid(){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
	BuildException(){}
	BuildException(String o0, IOException o1){}
}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass setRemoteVerificationEnabled(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass isConnected(){ return null; }}

class RetryHandler {

RetryHandler(MyHelperClass o0, MyHelperClass o1){}
	RetryHandler(){}}

class Retryable {

}
