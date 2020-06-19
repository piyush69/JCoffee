import java.io.*;
import java.lang.*;
import java.util.*;



class c18454388 {

    public final void conectar() throws IOException, FTPException {
        MyHelperClass ftp = new MyHelperClass();
        ftp = null;
//        MyHelperClass ftp = new MyHelperClass();
        ftp =(MyHelperClass)(Object) new FTPClient();
        MyHelperClass cfg = new MyHelperClass();
        ftp.setRemoteHost(cfg.getFTPHost());
//        MyHelperClass ftp = new MyHelperClass();
        ftp.connect();
//        MyHelperClass cfg = new MyHelperClass();
        ftp.login(cfg.getFTPUser(), cfg.getFTPPass());
        MyHelperClass pMonitor = new MyHelperClass();
        ftp.setProgressMonitor(pMonitor);
        MyHelperClass FTPConnectMode = new MyHelperClass();
        ftp.setConnectMode(FTPConnectMode.PASV);
        MyHelperClass FTPTransferType = new MyHelperClass();
        ftp.setType(FTPTransferType.BINARY);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PASV;
	public MyHelperClass BINARY;
public MyHelperClass getFTPUser(){ return null; }
	public MyHelperClass setRemoteHost(MyHelperClass o0){ return null; }
	public MyHelperClass getFTPHost(){ return null; }
	public MyHelperClass setProgressMonitor(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getFTPPass(){ return null; }}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

}
