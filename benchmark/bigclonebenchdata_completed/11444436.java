


class c11444436 {

    public void run() {
        try {
            FTPClient c = new FTPClient();
            MyHelperClass ftpConfig = new MyHelperClass();
            c.configure(ftpConfig);
            MyHelperClass logger = new MyHelperClass();
            logger.debug("Trying to connect");
            c.connect("127.0.0.1", 21211);
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("Connected");
            c.setSoTimeout(5000);
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(c.getReplyCode())) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Houston, we have a problem. D/C");
                c.disconnect();
                throw new Exception();
            }
            if ((boolean)(Object)c.login("drftpd", "drftpd")) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Logged-in, now waiting 5 secs and kill the thread.");
                MyHelperClass _sc = new MyHelperClass();
                _sc.addSuccess();
                Thread.sleep(5000);
                c.disconnect();
            } else {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Login failed, D/C!");
                throw new Exception();
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.debug(e, e);
            MyHelperClass _sc = new MyHelperClass();
            _sc.addFailure();
        }
        MyHelperClass logger = new MyHelperClass();
        logger.debug("exiting");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(Exception o0, Exception o1){ return null; }
	public MyHelperClass addSuccess(){ return null; }
	public MyHelperClass addFailure(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }}

class FTPClient {

public MyHelperClass setSoTimeout(int o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass configure(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
