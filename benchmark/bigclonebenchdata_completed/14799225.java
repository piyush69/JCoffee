import java.io.*;
import java.lang.*;
import java.util.*;



class c14799225 {
public MyHelperClass ftpClient;
	public MyHelperClass FTPReply;
	public MyHelperClass log;

    public void FTPUtil(final String server) {
        log.debug("~ftp.FTPUtil() : Creating object");
        ftpClient =(MyHelperClass)(Object) new FTPClient();
        try {
            ftpClient.connect(server);
            ftpClient.login("anonymous", "");
            ftpClient.setConnectTimeout(120000);
            ftpClient.setSoTimeout(120000);
            final int reply =(int)(Object) ftpClient.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                final String errMsg = "Non-positive completion connecting FTPClient";
                log.warn("~ftp.FTPUtil() : [" + errMsg + "]");
            }
        } catch (UncheckedIOException ioe) {
            final String errMsg = "Cannot connect and login to ftpClient [" + ioe.getMessage() + "]";
            log.warn("~ftp.FTPUtil() : [" + errMsg + "]");
            ioe.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSoTimeout(int o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FTPClient {

}
