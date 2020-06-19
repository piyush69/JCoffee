


class c13546467 {
public MyHelperClass FTP;
	public MyHelperClass log;
	public MyHelperClass FTPReply;
	public MyHelperClass getIp(){ return null; }
	public MyHelperClass getEncoding(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPort(){ return null; }

    private FTPClient getClient() throws SocketException, IOException {
        FTPClient ftp = new FTPClient();
        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter((PrintStream)(Object)System.out)));
        ftp.setDefaultPort(getPort());
        ftp.connect(getIp());
        int reply =(int)(Object) ftp.getReplyCode();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            log.warn("FTP server refused connection: {}", getIp());
            ftp.disconnect();
            return null;
        }
        if (!(Boolean)(Object)ftp.login(getUsername(), getPassword())) {
            log.warn("FTP server refused login: {}, user: {}", getIp(), getUsername());
            ftp.logout();
            ftp.disconnect();
            return null;
        }
        ftp.setControlEncoding(getEncoding());
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        ftp.enterLocalPassiveMode();
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass warn(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass warn(String o0, MyHelperClass o1){ return null; }}

class FTPClient {

public MyHelperClass setControlEncoding(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass addProtocolCommandListener(PrintCommandListener o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintCommandListener {

PrintCommandListener(PrintWriter o0){}
	PrintCommandListener(){}}

class PrintWriter {

PrintWriter(PrintStream o0){}
	PrintWriter(){}}

class PrintStream {

}
