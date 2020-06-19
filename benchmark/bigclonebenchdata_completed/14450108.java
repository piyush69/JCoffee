import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c14450108 {
public MyHelperClass NULL;
public MyHelperClass password;
	public MyHelperClass fireFTPEvent(MyHelperClass o0){ return null; }

    public FTPFile[] connect() {
        MyHelperClass ftpe = new MyHelperClass();
        if (ftpe == null) {
//            MyHelperClass ftpe = new MyHelperClass();
            ftpe =(MyHelperClass)(Object) new FTPEvent(this);
        }
        MyHelperClass ftp = new MyHelperClass();
        if (ftp == null) {
//            MyHelperClass ftp = new MyHelperClass();
            ftp =(MyHelperClass)(Object) new FTPClient();
//        MyHelperClass ftp = new MyHelperClass();
        } else if ((boolean)(Object)ftp.isConnected()) {
            String path =(String)(Object) NULL; //new String();
            path = "";
            try {
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
            } catch (UncheckedIOException e1) {
                MyHelperClass log = new MyHelperClass();
                log.error("could not disconnect -" + e1.getMessage());
            }
        }
        FTPFile[] currentDir =(FTPFile[])(Object) NULL; //new FTPFile[]();
        currentDir = new FTPFile[0];
        MyHelperClass log = new MyHelperClass();
        log.debug("try to connect");
        try {
            int reply;
            MyHelperClass ftpsite = new MyHelperClass();
            ftp.connect(ftpsite);
//            MyHelperClass ftp = new MyHelperClass();
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
//                MyHelperClass log = new MyHelperClass();
                log.error("FTP server refused connection.");
            }
        } catch (UncheckedIOException e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("FTPConnection error: " + e.getMessage());
//            MyHelperClass ftp = new MyHelperClass();
            if ((boolean)(Object)ftp.isConnected()) {
                try {
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.disconnect();
                } catch (UncheckedIOException f) {
                }
            }
        }
        try {
            MyHelperClass user = new MyHelperClass();
            if (!(Boolean)(Object)ftp.login(user, password)) {
//                MyHelperClass user = new MyHelperClass();
                log.error("could not login with: " + user);
//                MyHelperClass ftp = new MyHelperClass();
                ftp.logout();
            }
//            MyHelperClass ftp = new MyHelperClass();
            log.debug("Remote system is " + ftp.getSystemName());
//            MyHelperClass ftp = new MyHelperClass();
            ftp.enterLocalPassiveMode();
//            MyHelperClass currentDir = new MyHelperClass();
            currentDir =(FTPFile[])(Object) ftp.listFiles();
        } catch (UncheckedIOException e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("FTPConnectionClosedException: " + e.getMessage());
        } catch (ArithmeticException e) {
//            MyHelperClass log = new MyHelperClass();
            log.error("IOException: " + e.getMessage());
        }
        MyHelperClass FTPEvent = new MyHelperClass();
        ftpe.setType(FTPEvent.CONNECT);
//        MyHelperClass ftpe = new MyHelperClass();
        fireFTPEvent(ftpe);
//        MyHelperClass currentDir = new MyHelperClass();
        return (FTPFile[])(Object)currentDir;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONNECT;
public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FTPFile {

}

class FTPConnectionClosedException extends Exception{
	public FTPConnectionClosedException(String errorMessage) { super(errorMessage); }
}

class FTPEvent {

FTPEvent(c14450108 o0){}
	FTPEvent(){}}

class FTPClient {

}
