


class c21605296 {
public MyHelperClass transportRecursive(FTPClient o0, File o1){ return null; }
public MyHelperClass getOption(String o0){ return null; }

    public void transport(File file) throws TransportException {
        FTPClient client = new FTPClient();
        try {
            client.connect(getOption("host"));
            client.login(getOption("username"), getOption("password"));
            client.changeWorkingDirectory(getOption("remotePath"));
            transportRecursive(client, file);
            client.disconnect();
        } catch (Exception e) {
            throw new TransportException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class TransportException extends Exception{
	public TransportException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}
