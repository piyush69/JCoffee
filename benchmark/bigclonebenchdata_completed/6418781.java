
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6418781 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        try {
            client.connect("192.168.1.10");
            client.login("a", "123456");
            String[] names =(String[])(Object) client.listNames();
            for (String name : names) {
                System.out.println("Name = " + name);
            }
            FTPFile[] ftpFiles =(FTPFile[])(Object) client.listFiles();
            for (FTPFile ftpFile : ftpFiles) {
                MyHelperClass FTPFile = new MyHelperClass();
                if (ftpFile.getType() == FTPFile.FILE_TYPE) {
                    MyHelperClass FileUtils = new MyHelperClass();
                    System.out.println("FTPFile: " + ftpFile.getName() + "; " + FileUtils.byteCountToDisplaySize(ftpFile.getSize()));
                }
            }
            client.logout();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILE_TYPE;
public MyHelperClass byteCountToDisplaySize(MyHelperClass o0){ return null; }}

class FTPClient {

public MyHelperClass listNames(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class FTPFile {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
