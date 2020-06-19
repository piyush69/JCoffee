


class c1367602 {
public MyHelperClass assertTrue(MyHelperClass o0){ return null; }

    private void transferFile(String fileName) throws SocketException, IOException, Exception {
        FTPClient client = new FTPClient();
        MyHelperClass server = new MyHelperClass();
        client.connect(server.getExternalName(), server.getPort());
        int reply =(int)(Object) client.getReplyCode();
        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            throw new Exception("Failed connecting to server");
        }
//        MyHelperClass server = new MyHelperClass();
        client.login(server.getDefaultUserName(), server.getDefaultUserPassword());
        reply =(int)(Object) client.getReplyCode();
//        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            throw new Exception("Failed connecting to server");
        }
        InputStream stream =(InputStream)(Object) getClass().getClassLoader().getResourceAsStream("res/conf/ftpd.properties");
        client.storeFile(fileName, stream);
//        MyHelperClass server = new MyHelperClass();
        File transfferedFile = new File(server.getServerRootDirectory(), fileName);
        assertTrue(transfferedFile.exists());
        assertTrue(transfferedFile.delete());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getExternalName(){ return null; }
	public MyHelperClass getDefaultUserPassword(){ return null; }
	public MyHelperClass getServerRootDirectory(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getDefaultUserName(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class InputStream {

}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}
