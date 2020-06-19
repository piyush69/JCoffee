import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5995985 {
public MyHelperClass ftpClient;
public MyHelperClass password;
	public MyHelperClass port;
public MyHelperClass username;
	public MyHelperClass server;

    private boolean connect() {
        try {
            this.ftpClient.connect(this.server, this.port);
            this.ftpClient.login(this.username, this.password);
            return true;
        } catch (UncheckedIOException iOException) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }}
