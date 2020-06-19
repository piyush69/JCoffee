
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23482023 {
public MyHelperClass disconnectFtp(FTPClient o0){ return null; }

    public boolean uploadFromServlet(InputStream is, String serverFileName, String serverPath, String serverUrl, int serverPort, String userName, String passWord) throws IOException {
        FTPClient ftp = new FTPClient();
        FTPClientConfig conf = new FTPClientConfig();
        conf.setServerLanguageCode("zh_CN");
        conf.setServerTimeZoneId("Asia/Chongqing");
        try {
            ftp.configure(conf);
            int reply;
            ftp.setDefaultPort(serverPort);
            ftp.connect(serverUrl);
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new IOException("FTP server refused connection.");
            }
        } catch (IOException e) {
            disconnectFtp(ftp);
        }
        try {
            if (!(Boolean)(Object)ftp.login(userName, passWord)) {
                throw new IOException("Can not log in with given username and password.");
            }
            if (!(Boolean)(Object)ftp.changeWorkingDirectory(serverPath)) {
                throw new IOException("Can not change to working directory.");
            }
            MyHelperClass FTP = new MyHelperClass();
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            if (!(Boolean)(Object)ftp.storeFile(serverFileName, is)) {
                throw new IOException("Can not store file to FTP server.");
            }
            is.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (ftp != null && (boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.logout();
                    ftp.disconnect();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass setDefaultPort(int o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FTPClientConfig {

public MyHelperClass setServerLanguageCode(String o0){ return null; }
	public MyHelperClass setServerTimeZoneId(String o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}
