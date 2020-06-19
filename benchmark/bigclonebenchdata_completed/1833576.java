


class c1833576 {
public MyHelperClass FTP;
public MyHelperClass prop;
	public MyHelperClass FTPReply;
	public MyHelperClass logger;
	public MyHelperClass loadConfig(){ return null; }
	public MyHelperClass extractFilename(String o0){ return null; }
	public MyHelperClass getPathName(String o0){ return null; }
	public MyHelperClass extractHostname(String o0){ return null; }

    public FTPClient getFTP(final Credentials credentials, final String remoteFile) throws NumberFormatException, SocketException, IOException, AccessDeniedException {
        String fileName =(String)(Object) extractFilename(remoteFile);
        String fileDirectory =(String)(Object) getPathName(remoteFile).substring(0, getPathName(remoteFile).indexOf(fileName));
        FTPClient ftp;
        ftp = new FTPClient();
        loadConfig();
        logger.info("FTP connection to: " + extractHostname(remoteFile));
        logger.info("FTP PORT: " + prop.getProperty("port"));
        ftp.connect(extractHostname(remoteFile), Integer.parseInt((String)(Object)prop.getProperty("port")));
        int reply =(int)(Object) ftp.getReplyCode();
        if (!(Boolean)(Object)(FTPReply.isPositiveCompletion(reply))) {
            return null;
        }
        ftp.setFileTransferMode(FTP.BINARY_FILE_TYPE);
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        if (!(Boolean)(Object)ftp.login(credentials.getUserName(), credentials.getPassword())) {
            throw new AccessDeniedException((String)(Object)prop.getProperty("login_message"));
        }
        if (fileDirectory != null) {
            ftp.changeWorkingDirectory(fileDirectory);
        }
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass substring(int o0, MyHelperClass o1){ return null; }}

class Credentials {

public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class FTPClient {

public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class AccessDeniedException extends Exception{
	public AccessDeniedException(String errorMessage) { super(errorMessage); }
}
