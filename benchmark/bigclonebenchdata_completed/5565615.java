
import java.io.UncheckedIOException;


class c5565615 {
public MyHelperClass targetPasswd;
	public MyHelperClass LOG;
	public MyHelperClass targetPort;
	public MyHelperClass setPassive(FTPClient o0){ return null; }

    protected FTPClient openFTP() throws CruiseControlException {
        MyHelperClass targetHost = new MyHelperClass();
        LOG.info("Opening FTP connection to " + targetHost);
        FTPClient ftp = new FTPClient();
        try {
//            MyHelperClass targetHost = new MyHelperClass();
            ftp.connect(targetHost, targetPort);
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                throw new CruiseControlException("FTP connection failed: " + ftp.getReplyString());
            }
            MyHelperClass LOG = new MyHelperClass();
            LOG.info("logging in to FTP server");
            MyHelperClass targetUser = new MyHelperClass();
            if (!(Boolean)(Object)ftp.login(targetUser, targetPasswd)) {
                throw new CruiseControlException("Could not login to FTP server");
            }
//            MyHelperClass LOG = new MyHelperClass();
            LOG.info("login succeeded");
            MyHelperClass passive = new MyHelperClass();
            if ((boolean)(Object)passive) {
                setPassive(ftp);
            }
        } catch (UncheckedIOException ioe) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error((IOException)(Object)ioe);
            throw new CruiseControlException(ioe.getMessage());
        }
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class CruiseControlException extends Exception{
	public CruiseControlException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
