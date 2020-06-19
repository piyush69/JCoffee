


class c10151252 {

    public static void upload(FTPDetails ftpDetails) {
        FTPClient ftp = new FTPClient();
        try {
            String host =(String)(Object) ftpDetails.getHost();
            MyHelperClass logger = new MyHelperClass();
            logger.info("Connecting to ftp host: " + host);
            ftp.connect(host);
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Received reply from ftp :" + ftp.getReplyString());
            ftp.login(ftpDetails.getUserName(), ftpDetails.getPassword());
            MyHelperClass FTP = new MyHelperClass();
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.makeDirectory(ftpDetails.getRemoterDirectory());
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Created directory :" + ftpDetails.getRemoterDirectory());
            ftp.changeWorkingDirectory(ftpDetails.getRemoterDirectory());
            BufferedInputStream ftpInput = new BufferedInputStream(new FileInputStream(new File(ftpDetails.getLocalFilePath())));
            OutputStream storeFileStream =(OutputStream)(Object) ftp.storeFileStream(ftpDetails.getRemoteFileName());
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(ftpInput, storeFileStream);
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Copied file : " + ftpDetails.getLocalFilePath() + " >>> " + host + ":/" + ftpDetails.getRemoterDirectory() + "/" + ftpDetails.getRemoteFileName());
            ftpInput.close();
            storeFileStream.close();
            ftp.logout();
            ftp.disconnect();
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Logged out. ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass copy(BufferedInputStream o0, OutputStream o1){ return null; }}

class FTPDetails {

public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass getLocalFilePath(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getRemoteFileName(){ return null; }
	public MyHelperClass getRemoterDirectory(){ return null; }}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass storeFileStream(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class File {

File(MyHelperClass o0){}
	File(){}}

class OutputStream {

public MyHelperClass close(){ return null; }}
