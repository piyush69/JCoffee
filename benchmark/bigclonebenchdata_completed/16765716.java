
import java.io.UncheckedIOException;


class c16765716 {

    public static void uploadFile(String localPath, String hostname, String username, String password, String remotePath) {
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(hostname);
            int reply =(int)(Object) ftpClient.getReplyCode();
            boolean success = false;
            MyHelperClass FTPReply = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                success =(boolean)(Object) ftpClient.login(username, password);
                if (!success) {
                    MyHelperClass Output = new MyHelperClass();
                    Output.error("Failed to login with username/password " + username + "/" + password);
                    return;
                }
                ftpClient.enterLocalPassiveMode();
                MyHelperClass FTP = new MyHelperClass();
                ftpClient.setFileType(FTP.ASCII_FILE_TYPE);
            }
            FileInputStream in = new FileInputStream(localPath);
            boolean result =(boolean)(Object) ftpClient.storeFile(remotePath, in);
            if (!result) {
                MyHelperClass Output = new MyHelperClass();
                Output.error("Logged in but failed to upload " + localPath + " to " + remotePath + "\nPerhaps one of the paths was wrong.");
            }
            in.close();
            ftpClient.disconnect();
        } catch (UncheckedIOException ioe) {
            MyHelperClass Output = new MyHelperClass();
            Output.error("Error ftp'ing using " + "\nlocalPath: " + localPath + "\nhostname: " + hostname + "\nusername: " + username + "\npassword: " + password + "\nremotePath: " + remotePath,(IOException)(Object) ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class FTPClient {

public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
