


class c8725960 {
public MyHelperClass pass;

    private FTPClient connectFtps() throws NoSuchAlgorithmException, IOException {
        FTPClient apacheClient;
        MyHelperClass isSecure = new MyHelperClass();
        if ((boolean)(Object)isSecure) {
            apacheClient =(FTPClient)(Object) new FTPSClient(true);
        } else {
            apacheClient = new FTPClient();
        }
        MyHelperClass LOG = new MyHelperClass();
        apacheClient.addProtocolCommandListener(new LogFtpListener(LOG));
//        MyHelperClass isSecure = new MyHelperClass();
        if ((boolean)(Object)isSecure) {
            MyHelperClass host = new MyHelperClass();
            apacheClient.connect(host, 990);
        } else {
            MyHelperClass host = new MyHelperClass();
            apacheClient.connect(host);
        }
        MyHelperClass user = new MyHelperClass();
        if (!(Boolean)(Object)apacheClient.login(user, pass)) {
            throw new IllegalArgumentException("Unrecognized Username/Password");
        }
        MyHelperClass FTPClient = new MyHelperClass();
        apacheClient.setFileType(FTPClient.BINARY_FILE_TYPE);
        apacheClient.getStatus();
        apacheClient.help();
        apacheClient.enterLocalPassiveMode();
        return apacheClient;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass help(){ return null; }
	public MyHelperClass addProtocolCommandListener(LogFtpListener o0){ return null; }
	public MyHelperClass getStatus(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPSClient {

FTPSClient(){}
	FTPSClient(boolean o0){}}

class LogFtpListener {

LogFtpListener(MyHelperClass o0){}
	LogFtpListener(){}}
