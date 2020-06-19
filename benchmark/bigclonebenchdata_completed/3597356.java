


class c3597356 {
public MyHelperClass _password;

    public Boolean connect() throws Exception {
        try {
            FTPClient _ftpClient;// = new FTPClient();
            _ftpClient = new FTPClient();
            MyHelperClass _url = new MyHelperClass();
            _ftpClient.connect(_url);
            MyHelperClass _username = new MyHelperClass();
            _ftpClient.login(_username, _password);
            MyHelperClass _rootPath = new MyHelperClass();
            _rootPath = _ftpClient.printWorkingDirectory();
            return true;
        } catch (Exception ex) {
            throw new Exception("Cannot connect to server.");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class FTPClient {

public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}
