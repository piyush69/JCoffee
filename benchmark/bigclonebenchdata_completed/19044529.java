import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19044529 {
public MyHelperClass Config;
public MyHelperClass log;
	public MyHelperClass endpointURL;
	public MyHelperClass FTP;
	public MyHelperClass FTPReply;

    public void put(File fileToPut) throws IOException {
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(this.endpointURL, Config.getFtpPort());
            log.debug("Ftp put reply: " + ftp.getReplyString());
            reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new IOException("Ftp put server refused connection.");
            }
            if (!(Boolean)(Object)ftp.login("anonymous", "")) {
                ftp.logout();
                throw new IOException("FTP: server wrong passwd");
            }
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            InputStream input = new FileInputStream(fileToPut);
            if ((boolean)(Object)ftp.storeFile(fileToPut.getName(), input) != true) {
                ftp.logout();
                input.close();
                throw new IOException("FTP put exception");
            }
            input.close();
            ftp.logout();
        } catch (Exception e) {
            log.error("Ftp client exception: " + e.getMessage(), e);
            throw new IOException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getFtpPort(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
