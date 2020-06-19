


class c8446070 {
public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass getRepository(){ return null; }

    private FTPClient getFtpClient(Entry parentEntry) throws Exception {
        Object[] values =(Object[])(Object) parentEntry.getValues();
        if (values == null) {
            return null;
        }
        MyHelperClass COL_SERVER = new MyHelperClass();
        String server = (String) values[(int)(Object)COL_SERVER];
        MyHelperClass COL_BASEDIR = new MyHelperClass();
        String baseDir = (String) values[(int)(Object)COL_BASEDIR];
        MyHelperClass COL_USER = new MyHelperClass();
        String user = (String) values[(int)(Object)COL_USER];
        MyHelperClass COL_PASSWORD = new MyHelperClass();
        String password = (String) values[(int)(Object)COL_PASSWORD];
        if (password != null) {
            password =(String)(Object) getRepository().getPageHandler().processTemplate(password, false);
        } else {
            password = "";
        }
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server);
            if (user != null) {
                ftpClient.login(user, password);
            }
            int reply =(int)(Object) ftpClient.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                System.err.println("FTP server refused connection.");
                return null;
            }
            ftpClient.setFileType(FTP.IMAGE_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            return ftpClient;
        } catch (Exception exc) {
            System.err.println("Could not connect to ftp server:" + exc);
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE_FILE_TYPE;
public MyHelperClass getPageHandler(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass processTemplate(String o0, boolean o1){ return null; }}

class Entry {

public MyHelperClass getValues(){ return null; }}

class FTPClient {

public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
