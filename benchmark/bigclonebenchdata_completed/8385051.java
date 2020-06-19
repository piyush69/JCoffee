


class c8385051 {

    public void play() throws FileNotFoundException, IOException, NoSuchAlgorithmException, FTPException {
        final int BUFFER = 2048;
        String host = "ftp.genome.jp";
        String username = "anonymous";
        String password = "";
        FTPClient ftp = null;
        ftp = new FTPClient();
        ftp.setRemoteHost(host);
        FTPMessageCollector listener = new FTPMessageCollector();
        ftp.setMessageListener(listener);
        System.out.println("Connecting");
        ftp.connect();
        System.out.println("Logging in");
        ftp.login(username, password);
        System.out.println("Setting up passive, ASCII transfers");
        MyHelperClass FTPConnectMode = new MyHelperClass();
        ftp.setConnectMode(FTPConnectMode.PASV);
        MyHelperClass FTPTransferType = new MyHelperClass();
        ftp.setType(FTPTransferType.ASCII);
        System.out.println("Directory before put:");
        String[] files =(String[])(Object) ftp.dir(".", true);
        for (int i = 0; i < files.length; i++) System.out.println(files[i]);
        System.out.println("Quitting client");
        ftp.quit();
        String messages =(String)(Object) listener.getLog();
        System.out.println("Listener log:");
        System.out.println(messages);
        System.out.println("Test complete");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PASV;
	public MyHelperClass ASCII;
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass dir(String o0, boolean o1){ return null; }
	public MyHelperClass setRemoteHost(String o0){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setMessageListener(FTPMessageCollector o0){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FTPMessageCollector {

public MyHelperClass getLog(){ return null; }}
