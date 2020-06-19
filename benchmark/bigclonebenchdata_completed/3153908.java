import java.io.*;
import java.lang.*;
import java.util.*;



class c3153908 {
public MyHelperClass NULL;
public MyHelperClass getSystemKey(MyHelperClass o0){ return null; }
public MyHelperClass password;
	public MyHelperClass host;

    public boolean connentServer() {
        boolean result = false;
        try {
            FTPClient ftpClient =(FTPClient)(Object) NULL; //new FTPClient();
            ftpClient = new FTPClient();
            MyHelperClass port = new MyHelperClass();
            ftpClient.setDefaultPort(port);
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.setControlEncoding("GBK");
            String strOut =(String)(Object) NULL; //new String();
            strOut = strOut + "Connecting to host " + host + "\r\n";
            MyHelperClass host = new MyHelperClass();
            ftpClient.connect(host);
            MyHelperClass user = new MyHelperClass();
            if (!(Boolean)(Object)ftpClient.login(user, password)) return false;
//            MyHelperClass ftpClient = new MyHelperClass();
            FTPClientConfig conf = new FTPClientConfig(getSystemKey(ftpClient.getSystemName()));
            conf.setServerLanguageCode("zh");
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.configure(conf);
//            MyHelperClass strOut = new MyHelperClass();
            strOut = strOut + "User " +(MyHelperClass)(Object)(MyHelperClass)(Object) user + " login OK.\r\n";
            MyHelperClass sDir = new MyHelperClass();
            if (!(Boolean)(Object)ftpClient.changeWorkingDirectory(sDir)) {
//                MyHelperClass sDir = new MyHelperClass();
                ftpClient.makeDirectory(sDir);
//                MyHelperClass sDir = new MyHelperClass();
                ftpClient.changeWorkingDirectory(sDir);
            }
//            MyHelperClass strOut = new MyHelperClass();
            strOut = strOut + "Directory: " +(MyHelperClass)(Object)(MyHelperClass)(Object) sDir + "\r\n";
            MyHelperClass FTP = new MyHelperClass();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//            MyHelperClass strOut = new MyHelperClass();
            strOut =(MyHelperClass)(Object)(MyHelperClass)(Object) strOut + "Connect Success.\r\n";
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setControlEncoding(String o0){ return null; }}

class FTPClientConfig {

FTPClientConfig(){}
	FTPClientConfig(MyHelperClass o0){}
	public MyHelperClass setServerLanguageCode(String o0){ return null; }}

class FTPClient {

public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setControlEncoding(String o0){ return null; }}
