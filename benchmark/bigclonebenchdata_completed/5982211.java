import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5982211 {
public MyHelperClass NULL;
public MyHelperClass FTPReply;

    private synchronized void createFTPConnection() throws FTPBrowseException {
        FTPClient ftpClient =(FTPClient)(Object) NULL; //new FTPClient();
        ftpClient = new FTPClient();
        try {
            MyHelperClass url = new MyHelperClass();
            InetAddress inetAddress = InetAddress.getByName((String)(Object)url.getHost());
//            MyHelperClass url = new MyHelperClass();
            if ((int)(Object)url.getPort() == -1) {
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.connect(inetAddress);
            } else {
//                MyHelperClass url = new MyHelperClass();
                ftpClient.connect(inetAddress, url.getPort());
            }
//            MyHelperClass ftpClient = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
//                MyHelperClass ftpClient = new MyHelperClass();
                throw new FTPBrowseException((String)(Object)ftpClient.getReplyString());
            }
            MyHelperClass passwordAuthentication = new MyHelperClass();
            if (null != passwordAuthentication) {
//                MyHelperClass passwordAuthentication = new MyHelperClass();
                ftpClient.login(passwordAuthentication.getUserName(), new StringBuffer().append(passwordAuthentication.getPassword()).toString());
            }
//            MyHelperClass url = new MyHelperClass();
            if ((int)(Object)url.getPath().length() > 0) {
//                MyHelperClass url = new MyHelperClass();
                ftpClient.changeWorkingDirectory(url.getPath());
            }
            MyHelperClass homeDirectory = new MyHelperClass();
            homeDirectory = ftpClient.printWorkingDirectory();
        } catch (UnknownHostException e) {
            throw new FTPBrowseException(e.getMessage());
        } catch (UncheckedIOException e) {
            throw new FTPBrowseException(e.getMessage());
        } catch (FTPBrowseException e) {
            throw e;
        } catch (IOException e) {
            throw new FTPBrowseException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass login(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass connect(InetAddress o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }}

class FTPBrowseException extends Exception{
	public FTPBrowseException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass login(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass connect(InetAddress o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
