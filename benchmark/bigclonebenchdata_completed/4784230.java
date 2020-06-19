


class c4784230 {
public MyHelperClass HOST;
	public MyHelperClass ftpClient;
	public MyHelperClass INTACT_FOLDER;

    public void connect() throws IOException {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("Connecting to: " + HOST);
        MyHelperClass HOST = new MyHelperClass();
        ftpClient.connect(HOST);
//        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("\tReply: " + ftpClient.getReplyString());
//        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("Login as anonymous");
        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.login("anonymous", "");
//        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isDebugEnabled()) log.debug("\tReply: " + ftpClient.getReplyString());
        MyHelperClass folder = new MyHelperClass();
        folder = INTACT_FOLDER;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
