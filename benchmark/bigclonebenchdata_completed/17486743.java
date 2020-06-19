import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17486743 {
public MyHelperClass ftp;

    String connect() throws IOException {
        String reply = null;
        MyHelperClass ftp = new MyHelperClass();
        if (ftp == null) {
//            FTPClient ftp = new FTPClient();
            MyHelperClass remote = new MyHelperClass();
            ftp.connect(remote);
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
//                MyHelperClass remote = new MyHelperClass();
                throw new IOException("Connection failed: " + remote);
            }
            reply =(String)(Object) ftp.getReplyString();
            if (!(Boolean)(Object)ftp.login("anonymous", "")) {
//                MyHelperClass remote = new MyHelperClass();
                throw new IOException("Login failed: " + remote);
            }
            MyHelperClass FTP = new MyHelperClass();
            if (!(Boolean)(Object)ftp.setFileType(FTP.BINARY_FILE_TYPE)) {
//                MyHelperClass remote = new MyHelperClass();
                throw new IOException("Setting binary file type failed: " + remote);
            }
            this.ftp =(MyHelperClass)(Object) ftp;
        }
        return reply;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}
