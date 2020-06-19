


class c6306609 {

    public void UploadHubList(String server, String username, String password, String remoteFile, String filePath) throws SocketException, IOException {
        FTPClient ftp = new FTPClient();
        System.out.println("\t.");
        ftp.connect(server);
        System.out.println("\t..");
        ftp.login(username, password);
        System.out.print(ftp.getReplyString());
        System.out.println("\t...");
        ftp.storeFile(remoteFile, new FileInputStream(filePath));
        System.out.print(ftp.getReplyString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}
