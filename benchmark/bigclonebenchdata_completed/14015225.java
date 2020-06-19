


class c14015225 {

    public void beforeMethod(TestBase testBase) throws IOException {
        TFileFactory fileFactory = new TFileFactory(new InMemoryFileSystem());
        MyHelperClass ftpServer = new MyHelperClass();
        ftpServer.cleanFileSystem(fileFactory);
        TDirectory rootDir =(TDirectory)(Object) fileFactory.dir("/");
        testBase.inject(rootDir);
        FTPClient ftpClient = new FTPClient();
        ftpClient.connect("localhost", 8021);
        ftpClient.login("anonymous", "test@test.com");
        testBase.inject(ftpClient);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass cleanFileSystem(TFileFactory o0){ return null; }}

class TestBase {

public MyHelperClass inject(TDirectory o0){ return null; }
	public MyHelperClass inject(FTPClient o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TFileFactory {

TFileFactory(InMemoryFileSystem o0){}
	TFileFactory(){}
	public MyHelperClass dir(String o0){ return null; }}

class InMemoryFileSystem {

}

class TDirectory {

}

class FTPClient {

public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}
