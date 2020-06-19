


class c19361396 {
public static MyHelperClass FTP_HOST_IP;
	public static MyHelperClass FTP_PASSWORD;
	public static MyHelperClass FTP_USERNAME;
	public static MyHelperClass FTP_SENDER_DIRECTORY_FULL_PATH;
	public static MyHelperClass FTP_WORKING_DIRECTORY_PATH;
//public MyHelperClass FTP_SENDER_DIRECTORY_FULL_PATH;
//	public MyHelperClass FTP_PASSWORD;
//	public MyHelperClass FTP_USERNAME;
//	public MyHelperClass FTP_WORKING_DIRECTORY_PATH;
//	public MyHelperClass FTP_HOST_IP;

    public static void main(String[] args) throws Exception {
        String ftpHostIP = System.getProperty(FTP_HOST_IP.toString());
        String ftpUsername = System.getProperty(FTP_USERNAME.toString());
        String ftpPassword = System.getProperty(FTP_PASSWORD.toString());
        String ftpWorkingDirectory = System.getProperty(FTP_WORKING_DIRECTORY_PATH.toString());
        String ftpSenderDirectory = System.getProperty(FTP_SENDER_DIRECTORY_FULL_PATH.toString());
        if (ftpHostIP == null) {
            System.err.println("The FTP_HOST_IP system property must be filled out.");
            System.exit(1);
        }
        if (ftpUsername == null) {
            System.err.println("The FTP_USERNAME system property must be filled out.");
            System.exit(1);
        }
        if (ftpPassword == null) {
            System.err.println("The FTP_PASSWORD system property must be filled out.");
            System.exit(1);
        }
        if (ftpWorkingDirectory == null) {
            System.err.println("The FTP_WORKING_DIRECTORY_PATH system property must be filled out.");
            System.exit(1);
        }
        if (ftpSenderDirectory == null) {
            System.err.println("The FTP_SENDER_DIRECTORY_FULL_PATH system property must be filled out.");
            System.exit(1);
        }
        FTPClient ftp = new FTPClient();
        ftp.connect(ftpHostIP);
        ftp.login(ftpUsername, ftpPassword);
        ftp.changeWorkingDirectory(ftpWorkingDirectory);
        ByteArrayInputStream bais = new ByteArrayInputStream(new byte[1024]);
        ftp.storeFile("sampleFile.txt", bais);
        MyHelperClass FileTransferUtil = new MyHelperClass();
        IFileDescriptor fileDescriptor =(IFileDescriptor)(Object) FileTransferUtil.readAFile(ftpSenderDirectory);
        bais = new ByteArrayInputStream((byte[])(Object)fileDescriptor.getFileContent());
        long initTime = System.currentTimeMillis();
        ftp.storeFile((String)(Object)fileDescriptor.getFileName(), bais);
        long endTime = System.currentTimeMillis();
        System.out.println("File " + fileDescriptor.getFileName() + " transfer by FTP in " + (endTime - initTime) + " miliseconds.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readAFile(String o0){ return null; }}

class FTPClient {

public MyHelperClass storeFile(String o0, ByteArrayInputStream o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class IFileDescriptor {

public MyHelperClass getFileName(){ return null; }
	public MyHelperClass getFileContent(){ return null; }}
