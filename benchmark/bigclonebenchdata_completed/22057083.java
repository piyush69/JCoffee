


class c22057083 {
public MyHelperClass DefaultLog;

    private void Connect() throws NpsException {
        try {
            FTPClient client;// = new FTPClient();
            client = new FTPClient();
            MyHelperClass host = new MyHelperClass();
            client.connect(host.hostname, host.remoteport);
//            MyHelperClass client = new MyHelperClass();
            int reply =(int)(Object) client.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                MyHelperClass client = new MyHelperClass();
                client.disconnect();
//                MyHelperClass client = new MyHelperClass();
                client = null;
//                MyHelperClass host = new MyHelperClass();
                DefaultLog.error_noexception("FTP Server:" + host.hostname + "refused connection.");
                return;
            }
//            MyHelperClass host = new MyHelperClass();
            client.login(host.uname, host.upasswd);
//            MyHelperClass client = new MyHelperClass();
            client.enterLocalPassiveMode();
            MyHelperClass FTPClient = new MyHelperClass();
            client.setFileType(FTPClient.BINARY_FILE_TYPE);
//            MyHelperClass host = new MyHelperClass();
            client.changeWorkingDirectory(host.remotedir);
        } catch (Exception e) {
            DefaultLog.error(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass hostname;
	public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass remoteport;
	public MyHelperClass uname;
	public MyHelperClass remotedir;
	public MyHelperClass upasswd;
public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass error_noexception(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass error(Exception o0){ return null; }}

class NpsException extends Exception{
	public NpsException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}
