


class c11918338 {

    public FTPClient connect(String host, String userId, String password, String alias) throws IOException {
        FTPClient client = null;
        MyHelperClass connections = new MyHelperClass();
        if (connections.get(alias) != null) {
//            MyHelperClass connections = new MyHelperClass();
            client = (FTPClient)(FTPClient)(Object) connections.get(alias);
            if ((boolean)(Object)client.isConnected() == false) {
                client.connect(host);
            }
        } else {
            client = new FTPClient();
            client.connect(host);
            client.login(userId, password);
//            MyHelperClass connections = new MyHelperClass();
            connections.put(alias, client);
        }
        return client;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, FTPClient o1){ return null; }}

class FTPClient {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
