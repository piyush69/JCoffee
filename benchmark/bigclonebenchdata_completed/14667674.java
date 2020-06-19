


class c14667674 {
public MyHelperClass getFilePathItem(){ return null; }

//    @Override
    protected FTPClient ftpConnect() throws SocketException, IOException, NoSuchAlgorithmException {
        FilePathItem fpi =(FilePathItem)(Object) getFilePathItem();
        FTPClient f =(FTPClient)(Object) new FTPSClient();
        f.connect(fpi.getHost());
        f.login(fpi.getUsername(), fpi.getPassword());
        return f;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class FilePathItem {

public MyHelperClass getHost(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class FTPSClient {

}
