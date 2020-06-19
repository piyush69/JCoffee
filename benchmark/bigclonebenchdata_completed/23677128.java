


class c23677128 {

	public FTPClient sample3a(String ftpserver, int ftpport, String proxyserver, int proxyport, String username, String password) throws SocketException, IOException {
		FTPHTTPClient ftpClient = new FTPHTTPClient(proxyserver, proxyport);
		ftpClient.connect(ftpserver, ftpport);
		ftpClient.login(username, password);
		return (FTPClient)(Object)ftpClient;
	}

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPHTTPClient {

FTPHTTPClient(String o0, int o1){}
	FTPHTTPClient(){}
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}
