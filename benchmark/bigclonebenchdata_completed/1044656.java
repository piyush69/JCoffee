import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1044656 {
public MyHelperClass ftp;
	public MyHelperClass port;
	public MyHelperClass me;
	public MyHelperClass checkReply(String o0){ return null; }
	public MyHelperClass modeBINARY(){ return null; }

    public void open(String server, String user, String pass, int port, String option) throws Throwable, Exception {
        MyHelperClass log = new MyHelperClass();
        log.info("Login to FTP: " + server);
        this.port =(MyHelperClass)(Object) port;
        ftp =(MyHelperClass)(Object) new FTPClient();
        ftp.connect(server, port);
        ftp.login(user, pass);
        checkReply("FTP server refused connection." + server);
        modeBINARY();
        this.me =(MyHelperClass)(Object) this;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FTPClient {

}
