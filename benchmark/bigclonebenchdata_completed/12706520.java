


class c12706520 {
public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass DEFAULT_BUFFER_SIZE;
	public MyHelperClass getConf(){ return null; }

    private FTPClient connect() throws IOException {
        FTPClient client = null;
        Configuration conf =(Configuration)(Object) getConf();
        String host =(String)(Object) conf.get("fs.ftp.host");
        int port =(int)(Object) conf.getInt("fs.ftp.host.port", FTP.DEFAULT_PORT);
        String user =(String)(Object) conf.get("fs.ftp.user." + host);
        String password =(String)(Object) conf.get("fs.ftp.password." + host);
        client = new FTPClient();
        client.connect(host, port);
        int reply =(int)(Object) client.getReplyCode();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            throw new IOException("Server - " + host + " refused connection on port - " + port);
        } else if ((boolean)(Object)client.login(user, password)) {
            client.setFileTransferMode(FTP.BLOCK_TRANSFER_MODE);
            client.setFileType(FTP.BINARY_FILE_TYPE);
            client.setBufferSize(DEFAULT_BUFFER_SIZE);
        } else {
            throw new IOException("Login failed on server - " + host + ", port - " + port);
        }
        return client;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass DEFAULT_PORT;
	public MyHelperClass BLOCK_TRANSFER_MODE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class FTPClient {

public MyHelperClass setBufferSize(MyHelperClass o0){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Configuration {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getInt(String o0, MyHelperClass o1){ return null; }}
