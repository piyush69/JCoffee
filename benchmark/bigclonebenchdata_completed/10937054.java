
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10937054 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        FileInputStream fis = null;
        try {
            client.connect("192.168.1.10");
            client.login("a", "123456");
            String filename = "D:\\DHTH5CLT\\HK3\\Ung dung phan tan\\FTP_JAVA\\FTP_DETAI\\FTP\\src\\DemoFTP\\filename\\5s.txt";
            fis = new FileInputStream(filename);
            client.storeFile(filename, fis);
            client.logout();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                client.disconnect();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
