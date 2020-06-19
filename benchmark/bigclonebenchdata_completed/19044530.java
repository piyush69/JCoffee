import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19044530 {
public MyHelperClass Config;
public MyHelperClass endpointURL;
	public MyHelperClass FTP;
	public MyHelperClass FTPReply;

    public void get(File fileToGet) throws IOException {
        FTPClient ftp = new FTPClient();
        try {
            int reply = 0;
            ftp.connect(this.endpointURL, Config.getFtpPort());
            reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new IOException("Ftp get server refused connection.");
            }
            if (!(Boolean)(Object)ftp.login("anonymous", "")) {
                ftp.logout();
                throw new IOException("FTP: server wrong passwd");
            }
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            OutputStream output = new FileOutputStream(fileToGet.getName());
            if ((boolean)(Object)ftp.retrieveFile(fileToGet.getName(), output) != true) {
                ftp.logout();
                output.close();
                throw new IOException("FTP get exception, maybe file not found");
            }
            ftp.logout();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getFtpPort(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass retrieveFile(String o0, OutputStream o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
