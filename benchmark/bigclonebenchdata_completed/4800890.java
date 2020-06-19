


class c4800890 {
public MyHelperClass password;

    private void initFtp() throws IOException {
        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.setConnectTimeout(5000);
        MyHelperClass ftpHost = new MyHelperClass();
        ftpClient.connect(ftpHost);
        MyHelperClass userName = new MyHelperClass();
        ftpClient.login(userName, password);
        MyHelperClass workingDir = new MyHelperClass();
        if (workingDir != null) {
//            MyHelperClass workingDir = new MyHelperClass();
            ftpClient.changeWorkingDirectory(workingDir);
        }
        MyHelperClass logger = new MyHelperClass();
        logger.info("Connection established.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
