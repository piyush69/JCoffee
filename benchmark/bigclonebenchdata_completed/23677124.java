


class c23677124 {

	public FTPClient sample1c(String server, int port, String username, String password) throws SocketException, IOException {
		FTPClient ftpClient = new FTPClient();
		ftpClient.setDefaultPort(port);
		ftpClient.connect(server);
		ftpClient.login(username, password);
		return ftpClient;
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass setDefaultPort(int o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
