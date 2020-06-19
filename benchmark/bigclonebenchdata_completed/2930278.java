import java.io.*;
import java.lang.*;
import java.util.*;



class c2930278 {
public static MyHelperClass setArg(MyHelperClass o0){ return null; }
public static MyHelperClass username;
	public static MyHelperClass ip;
	public static MyHelperClass password;
	public static MyHelperClass FTPReply;
	public static MyHelperClass getFtpConfig(){ return null; }
//	public MyHelperClass setArg(MyHelperClass o0){ return null; }
//public MyHelperClass password;
	public MyHelperClass ftpClient;
//	public MyHelperClass FTPReply;
//	public MyHelperClass username;
//	public MyHelperClass ip;
	public MyHelperClass port;
//	public MyHelperClass getFtpConfig(){ return null; }

    public static void connectServer() {
        MyHelperClass ftpClient = new MyHelperClass();
        if (ftpClient == null) {
            int reply;
            try {
                MyHelperClass configFile = new MyHelperClass();
                setArg(configFile);
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient =(MyHelperClass)(Object) new FTPClient();
                MyHelperClass port = new MyHelperClass();
                ftpClient.setDefaultPort(port);
                ftpClient.configure(getFtpConfig());
                ftpClient.connect(ip);
                ftpClient.login(username, password);
                ftpClient.setDefaultPort(port);
                System.out.print(ftpClient.getReplyString());
                reply =(int)(Object) ftpClient.getReplyCode();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                    ftpClient.disconnect();
                    System.err.println("FTP server refused connection.");
                }
            } catch (Exception e) {
                System.err.println("��¼ftp��������" + ip + "��ʧ��");
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass configure(MyHelperClass o0){ return null; }}

class FTPClient {

}
