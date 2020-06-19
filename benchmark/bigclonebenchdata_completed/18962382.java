


class c18962382 {
public MyHelperClass logger;

    protected void connect() throws SocketException, IOException, LoginFailException {
        MyHelperClass account = new MyHelperClass();
        logger.info("Connect to FTP Server " + account.getServer());
        FTPClient client;// = new FTPClient();
        client = new FTPClient();
//        MyHelperClass account = new MyHelperClass();
        client.connect(account.getServer());
//        MyHelperClass account = new MyHelperClass();
        if ((boolean)(Object)client.login(account.getId(), account.getPassword()) == false) {
//            MyHelperClass account = new MyHelperClass();
            logger.info("Fail to login with id=" + account.getId());
//            MyHelperClass account = new MyHelperClass();
            throw new LoginFailException(account.getId(), account.getPassword());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getId(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getServer(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getPassword(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class LoginFailException extends Exception{
	public LoginFailException(String errorMessage) { super(errorMessage); }
	LoginFailException(){}
	LoginFailException(MyHelperClass o0, MyHelperClass o1){}
}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}
