
import java.io.UncheckedIOException;


class c5713525 {
public MyHelperClass ftpPassword;

    private byte[] getFileFromFtp(String remote) throws Exception {
        FTPClient ftp;// = new FTPClient();
        ftp = new FTPClient();
        int reply;
        MyHelperClass ftpServer = new MyHelperClass();
        ftp.connect(ftpServer);
//        MyHelperClass ftp = new MyHelperClass();
        reply =(int)(Object) ftp.getReplyCode();
        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//            MyHelperClass ftp = new MyHelperClass();
            ftp.disconnect();
            throw new Exception("FTP server refused connection.");
        }
        MyHelperClass ftpUsername = new MyHelperClass();
        if (!(Boolean)(Object)ftp.login(ftpUsername, ftpPassword)) {
//            MyHelperClass ftp = new MyHelperClass();
            ftp.logout();
            throw new Exception("Cann't login to ftp.");
        }
//        MyHelperClass ftp = new MyHelperClass();
        ftp.enterLocalPassiveMode();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        MyHelperClass ftp = new MyHelperClass();
        ftp.retrieveFile(remote, baos);
//        MyHelperClass ftp = new MyHelperClass();
        ftp.logout();
//        MyHelperClass ftp = new MyHelperClass();
        if ((boolean)(Object)ftp.isConnected()) {
            try {
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
            } catch (UncheckedIOException f) {
            }
        }
        return(byte[])(Object) baos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass retrieveFile(String o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass retrieveFile(String o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}
