import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23611215 {
public MyHelperClass DateUtil;
public MyHelperClass getFileName(){ return null; }

    public String uploadFile(String url, int port, String uname, String upass, InputStream input)  throws Throwable {
        MyHelperClass config = new MyHelperClass();
        String serverPath =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) config.getServerPath() + (int)(Object)DateUtil.getSysmonth();
        FTPClient ftp = new FTPClient();
        try {
            int replyCode;
            ftp.connect(url, port);
            ftp.login(uname, upass);
            replyCode =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(replyCode)) {
                ftp.disconnect();
//                MyHelperClass config = new MyHelperClass();
                return(String)(Object) config.getServerPath();
            }
            if (!(Boolean)(Object)ftp.changeWorkingDirectory(serverPath)) {
                MyHelperClass DateUtil = new MyHelperClass();
                ftp.makeDirectory(DateUtil.getSysmonth());
                ftp.changeWorkingDirectory(serverPath);
            }
            ftp.storeFile(getFileName(), input);
            input.close();
            ftp.logout();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serverPath;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getSysmonth(){ return null; }
	public MyHelperClass getServerPath(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass storeFile(MyHelperClass o0, InputStream o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }}
