


class c1906172 {
public MyHelperClass ftp;
	public MyHelperClass port;
	public MyHelperClass log;
	public MyHelperClass password;
	public MyHelperClass deleteDir(MyHelperClass o0){ return null; }
	public MyHelperClass storeFolder(String o0, MyHelperClass o1){ return null; }

    public void deploy(String baseDir, boolean clean) throws IOException {
        try {
            MyHelperClass hostname = new MyHelperClass();
            ftp.connect(hostname, port);
//            MyHelperClass hostname = new MyHelperClass();
            log.debug("Connected to: " + hostname + ":" + port);
            MyHelperClass username = new MyHelperClass();
            ftp.login(username, password);
            MyHelperClass ftp = new MyHelperClass();
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                throw new IOException("Error logging onto ftp server. FTPClient returned code: " + reply);
            }
            MyHelperClass log = new MyHelperClass();
            log.debug("Logged in");
            MyHelperClass FTPClient = new MyHelperClass();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
            if (clean) {
                MyHelperClass remoteDir = new MyHelperClass();
                deleteDir(remoteDir);
            }
            MyHelperClass remoteDir = new MyHelperClass();
            storeFolder(baseDir, remoteDir);
        } finally {
            MyHelperClass ftp = new MyHelperClass();
            ftp.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
