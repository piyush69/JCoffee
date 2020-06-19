


class c4085696 {

    private static FTPClient getFtpClient(String ftpHost, String ftpUsername, String ftpPassword) throws SocketException, IOException {
        FTPClient ftp = new FTPClient();
        ftp.connect(ftpHost);
        int reply =(int)(Object) ftp.getReplyCode();
        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            return null;
        }
        if (!(Boolean)(Object)ftp.login(ftpUsername, ftpPassword)) {
            return null;
        }
        MyHelperClass FTP = new MyHelperClass();
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        ftp.enterLocalPassiveMode();
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
