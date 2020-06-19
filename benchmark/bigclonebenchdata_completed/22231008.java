


class c22231008 {

    public static FTPClient getClient(String serverAddress, String login, String password, boolean PASV) throws SocketException, IOException {
        FTPClient client = new FTPClient();
        client.connect(serverAddress);
        if (PASV) {
            client.enterLocalPassiveMode();
        }
        client.login(login, password);
        return client;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
