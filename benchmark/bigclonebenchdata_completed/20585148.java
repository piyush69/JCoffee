
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20585148 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        try {
            client.connect("ftp.domain.com");
            client.login("admin", "secret");
            String filename = "/testing/data.txt";
            boolean deleted =(boolean)(Object) client.deleteFile(filename);
            if (deleted) {
                System.out.println("File deleted...");
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

}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass deleteFile(String o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
