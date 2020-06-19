


class c3533703 {
public MyHelperClass ftpClient;
	public MyHelperClass port;

    private void _connect() throws SocketException, IOException {
        try {
            MyHelperClass ftpClient = new MyHelperClass();
            ftpClient.disconnect();
        } catch (Exception ex) {
        }
        MyHelperClass host = new MyHelperClass();
        ftpClient.connect(host, port);
        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.login("anonymous", "");
//        MyHelperClass ftpClient = new MyHelperClass();
        ftpClient.enterLocalActiveMode();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
