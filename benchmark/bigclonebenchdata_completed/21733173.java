import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21733173 {

    private void downloadFtp(File file, URL jurl) throws Throwable, SocketException, IOException {
        System.out.println("downloadFtp(" + file + ", " + jurl + ")");
        FTPClient client = new FTPClient();
        client.addProtocolCommandListener(new ProtocolCommandListener() {

            public void protocolCommandSent(ProtocolCommandEvent event) {
                System.out.println("downloadFtp: " + event.getMessage());
            }

            public void protocolReplyReceived(ProtocolCommandEvent event) {
                System.out.println("downloadFtp: " + event.getMessage());
            }
        });
        try {
            MyHelperClass FTP = new MyHelperClass();
            client.connect(jurl.getHost(), -1 == jurl.getPort() ? FTP.DEFAULT_PORT : jurl.getPort());
            int reply =(int)(Object) client.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                client.disconnect();
                throw new IOException("FTP server refused connection.");
            }
            if (!(Boolean)(Object)client.login("anonymous", "anonymous")) {
                client.logout();
                throw new IOException("Authentication failure.");
            }
//            MyHelperClass FTP = new MyHelperClass();
            client.setFileType(FTP.BINARY_FILE_TYPE);
            client.enterLocalPassiveMode();
            FileOutputStream out = new FileOutputStream(file);
            boolean ok =(boolean)(Object) client.retrieveFile(jurl.getPath(), out);
            out.close();
            client.logout();
            if (!ok) {
                throw new IOException("File transfer failure.");
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if ((boolean)(Object)client.isConnected()) {
                try {
                    client.disconnect();
                } catch (IOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass DEFAULT_PORT;
public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass addProtocolCommandListener(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass addProtocolCommandListener(<anonymous ProtocolCommandListener> o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class ProtocolCommandListener {

}

class ProtocolCommandEvent {

public MyHelperClass getMessage(){ return null; }}
