


class c23677131 {

	public FTPClient sample1(String server, int port, String username, String password) throws IllegalStateException, IOException, FTPIllegalReplyException, FTPException {
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect(server, port);
		ftpClient.login(username, password);
		return ftpClient;
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPIllegalReplyException extends Exception{
	public FTPIllegalReplyException(String errorMessage) { super(errorMessage); }
}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}
