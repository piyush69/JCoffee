


class c16798376 {
public MyHelperClass getName(){ return null; }
	public MyHelperClass getByteInputStream(){ return null; }

//    @Override
    public void run() {
        try {
            FTPClient ftp = new FTPClient();
            try {
                ftp.connect("localhost", 21);
                ftp.login("ftpuser", "ftpuser123");
                System.out.println("Current: " + ftp.printWorkingDirectory());
                MyHelperClass DIR = new MyHelperClass();
                System.out.println("Dir status: " + ftp.makeDirectory(DIR));
//                MyHelperClass DIR = new MyHelperClass();
                ftp.changeWorkingDirectory(DIR);
                MyHelperClass FILE_PREFIX = new MyHelperClass();
                System.out.println("File status: " + ftp.storeFile((int)(Object)FILE_PREFIX + (int)(Object)this.getName(), getByteInputStream()));
            } finally {
                ftp.disconnect();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass storeFile(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass makeDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }}
