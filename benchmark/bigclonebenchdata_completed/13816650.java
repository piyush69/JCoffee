import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13816650 {
public MyHelperClass NULL;
public MyHelperClass FTPReply;

    private synchronized void createFTPConnection() throws Throwable, RemoteClientException {
        FTPClient ftpClient =(FTPClient)(Object) NULL; //new FTPClient();
        ftpClient = new FTPClient();
        try {
            MyHelperClass fileset = new MyHelperClass();
            URL url =(URL)(Object) fileset.getHostURL();
//            MyHelperClass fileset = new MyHelperClass();
            PasswordAuthentication passwordAuthentication =(PasswordAuthentication)(Object) fileset.getPasswordAuthentication();
            if (null == passwordAuthentication) {
                MyHelperClass anonPassAuth = new MyHelperClass();
                passwordAuthentication =(PasswordAuthentication)(Object) anonPassAuth;
            }
            InetAddress inetAddress = InetAddress.getByName(url.getHost());
            if (url.getPort() == -1) {
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.connect(inetAddress);
            } else {
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.connect(inetAddress, url.getPort());
            }
//            MyHelperClass ftpClient = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
//                MyHelperClass ftpClient = new MyHelperClass();
                throw new FTPBrowseException((String)(Object)ftpClient.getReplyString());
            }
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.login(passwordAuthentication.getUserName(), new StringBuffer().append(passwordAuthentication.getPassword()).toString());
            if (url.getPath().length() > 0) {
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.changeWorkingDirectory(url.getPath());
            }
        } catch (UnknownHostException e) {
            throw new RemoteClientException("Host not found.", e);
        } catch (UncheckedIOException e) {
            throw new RemoteClientException("Socket cannot be opened.",(SocketException)(Object) e);
        } catch (IOException e) {
            throw new RemoteClientException("Socket cannot be opened.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass getPasswordAuthentication(){ return null; }
	public MyHelperClass getHostURL(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }}

class RemoteClientException extends Exception{
	public RemoteClientException(String errorMessage) { super(errorMessage); }
	RemoteClientException(){}
	RemoteClientException(String o0, SocketException o1){}
	RemoteClientException(String o0, IOException o1){}
	RemoteClientException(String o0, UnknownHostException o1){}
}

class FTPBrowseException extends Exception{
	public FTPBrowseException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }}
