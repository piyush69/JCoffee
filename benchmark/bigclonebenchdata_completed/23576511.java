


class c23576511 {

    public void connect(String ftpHost, int ftpPort, String ftpUser, String ftpPwd) throws IOException {
        FTPClient ftpClient;// = new FTPClient();
        ftpClient = new FTPClient();
//        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.setReaderThread(false);
//        MyHelperClass ftpClient = new MyHelperClass();
        if (ftpPort == -1) ftpClient.connect(ftpHost); else ftpClient.connect(ftpHost, ftpPort);
        MyHelperClass logger = new MyHelperClass();
        logger.info("FTP Connection Successful: " + ftpHost);
//        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.login(ftpUser, ftpPwd);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass setReaderThread(boolean o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass setReaderThread(boolean o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}
