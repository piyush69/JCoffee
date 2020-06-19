


class c9356670 {
public MyHelperClass mWorkspacePassword;
	public MyHelperClass mSharedWorkspacePort;

    private FTPClient loginToSharedWorkspace() throws SocketException, IOException {
        FTPClient ftp = new FTPClient();
        MyHelperClass mSwarm = new MyHelperClass();
        ftp.connect(mSwarm.getHost(), mSharedWorkspacePort);
        MyHelperClass SHARED_WORKSPACE_LOGIN_NAME = new MyHelperClass();
        if (!(Boolean)(Object)ftp.login(SHARED_WORKSPACE_LOGIN_NAME, mWorkspacePassword)) {
            throw new IOException("Unable to login to shared workspace.");
        }
        MyHelperClass FTPClient = new MyHelperClass();
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
        return ftp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getHost(){ return null; }}

class FTPClient {

public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
