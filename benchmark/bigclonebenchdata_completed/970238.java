


class c970238 {

    public static FTPClient getFtpClient(TopAnalysisConfig topAnalyzerConfig) throws SocketException, IOException {
        FTPClient ftp = new FTPClient();
        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter((PrintStream)(Object)System.out)));
        ftp.connect(topAnalyzerConfig.getFtpServer());
        int reply =(int)(Object) ftp.getReplyCode();
        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            throw new java.lang.RuntimeException("PullFileJobWorker connect ftp error!");
        }
        if (!(Boolean)(Object)ftp.login(topAnalyzerConfig.getFtpUserName(), topAnalyzerConfig.getFtpPassWord())) {
            ftp.logout();
            throw new java.lang.RuntimeException("PullFileJobWorker login ftp error!");
        }
        MyHelperClass logger = new MyHelperClass();
        logger.info("Remote system is " + ftp.getSystemName());
        MyHelperClass FTP = new MyHelperClass();
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        if ((boolean)(Object)topAnalyzerConfig.isLocalPassiveMode()) ftp.enterLocalPassiveMode();
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass info(String o0){ return null; }}

class TopAnalysisConfig {

public MyHelperClass getFtpServer(){ return null; }
	public MyHelperClass getFtpUserName(){ return null; }
	public MyHelperClass isLocalPassiveMode(){ return null; }
	public MyHelperClass getFtpPassWord(){ return null; }}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass addProtocolCommandListener(PrintCommandListener o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getSystemName(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
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
