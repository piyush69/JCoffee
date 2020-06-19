import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2819081 {
public MyHelperClass client;
	public MyHelperClass FTP;
	public MyHelperClass StringUtils;

    public  void FTPManager(URL location) throws Throwable, IOException {
        this.client =(MyHelperClass)(Object) new FTPClient();
        String host = location.getHost();
        int port = location.getPort();
        if (port < 0) {
            this.client.connect(host);
        } else {
            this.client.connect(host, port);
        }
        String[] login =(String[])(Object) StringUtils.split(location.getUserInfo(), ':');
        this.client.login(login[0], login.length > 1 ? login[1] : "");
        if (!(Boolean)(Object)this.client.setFileType(FTP.BINARY_FILE_TYPE)) throw new IOException("Unable to set the transfert mode");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass split(String o0, char o1){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class FTPClient {

}
