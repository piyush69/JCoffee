


class c2114072 {
public MyHelperClass PASSWORD;
	public MyHelperClass port;

    public String readFile(String filename) throws IOException {
        FTPClient ftpClient = new FTPClient();
        MyHelperClass server = new MyHelperClass();
        ftpClient.connect(server, port);
        MyHelperClass USERNAME = new MyHelperClass();
        ftpClient.login(USERNAME, PASSWORD);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        boolean success =(boolean)(Object) ftpClient.retrieveFile(filename, outputStream);
        ftpClient.disconnect();
        if (!success) {
            throw new IOException("Retrieve file failed: " + filename);
        }
        return outputStream.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass retrieveFile(String o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class ByteArrayOutputStream {

}
