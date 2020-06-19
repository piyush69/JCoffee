import java.io.*;
import java.lang.*;
import java.util.*;



class c9905081 {

    public boolean connect(String host, String userName, String password) throws IOException, UnknownHostException {
        try {
            MyHelperClass ftpClient = new MyHelperClass();
            if (ftpClient != null) {
//                MyHelperClass ftpClient = new MyHelperClass();
                if ((boolean)(Object)ftpClient.isConnected()) {
//                    MyHelperClass ftpClient = new MyHelperClass();
                    ftpClient.disconnect();
                }
            }
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient =(MyHelperClass)(Object) new FTPClient();
            boolean success = false;
//            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.connect(host);
//            MyHelperClass ftpClient = new MyHelperClass();
            int reply =(int)(Object) ftpClient.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                MyHelperClass ftpClient = new MyHelperClass();
                success =(boolean)(Object) ftpClient.login(userName, password);
            }
            if (!success) {
//                MyHelperClass ftpClient = new MyHelperClass();
                ftpClient.disconnect();
            }
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

class FTPClient {

}
