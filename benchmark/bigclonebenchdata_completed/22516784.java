


class c22516784 {
public static MyHelperClass assertValidReplyCode(MyHelperClass o0, FTPClient o1){ return null; }
//public MyHelperClass assertValidReplyCode(MyHelperClass o0, FTPClient o1){ return null; }

    public static void ftpUpload(FTPConfig config, String directory, File file, String remoteFileName) throws IOException {
        FTPClient server = new FTPClient();
        server.connect(config.host, config.port);
        assertValidReplyCode(server.getReplyCode(), server);
        server.login(config.userName, config.password);
        assertValidReplyCode(server.getReplyCode(), server);
        assertValidReplyCode(server.cwd(directory), server);
        MyHelperClass FTP = new MyHelperClass();
        server.setFileTransferMode(FTP.IMAGE_FILE_TYPE);
//        MyHelperClass FTP = new MyHelperClass();
        server.setFileType(FTP.IMAGE_FILE_TYPE);
        server.storeFile(remoteFileName, new FileInputStream(file));
        assertValidReplyCode(server.getReplyCode(), server);
        server.sendNoOp();
        server.disconnect();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE_FILE_TYPE;
}

class FTPConfig {
public MyHelperClass password;
	public MyHelperClass port;
	public MyHelperClass userName;
	public MyHelperClass host;
}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass cwd(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass sendNoOp(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
