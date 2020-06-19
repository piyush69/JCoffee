
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14121759 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        try {
            client.connect("192.168.1.10");
            boolean login =(boolean)(Object) client.login("a", "123456");
            if (login) {
                System.out.println("Dang nhap thanh cong...");
                boolean logout =(boolean)(Object) client.logout();
                if (logout) {
                    System.out.println("Da Logout khoi FTP Server...");
                }
            } else {
                System.out.println("Dang nhap that bai...");
            }
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
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
