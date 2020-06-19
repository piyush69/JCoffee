import java.io.*;
import java.lang.*;
import java.util.*;



class c3710850 {

//    @Override
    public boolean connect(String host, String userName, String password) throws IOException, UnknownHostException {
        try {
            MyHelperClass ftpClient = new MyHelperClass();
            if (ftpClient != null) if ((boolean)(Object)ftpClient.isConnected()) ftpClient.disconnect();
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient =(MyHelperClass)(Object) new FTPSClient("SSL", false);
            boolean success = false;
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.connect(host);
//            MyHelperClass ftpClient = new MyHelperClass();
            int reply =(int)(Object) ftpClient.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveCompletion(reply)) success =(boolean)(Object) ftpClient.login(userName, password);
//            MyHelperClass ftpClient = new MyHelperClass();
            if (!success) ftpClient.disconnect();
            return success;
        } catch (Exception ex) {
            throw new IOException(ex.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class FTPSClient {

FTPSClient(){}
	FTPSClient(String o0, boolean o1){}}
