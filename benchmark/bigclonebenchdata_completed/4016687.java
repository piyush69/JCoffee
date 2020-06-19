
import java.io.UncheckedIOException;


class c4016687 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        String sFTP = "ftp.miservidor.com";
        String sUser = "usuario";
        String sPassword = "password";
        try {
            System.out.println("Conectandose a " + sFTP);
            client.connect(sFTP);
            boolean login =(boolean)(Object) client.login(sUser, sPassword);
            if (login) {
                System.out.println("Login correcto");
                boolean logout =(boolean)(Object) client.logout();
                if (logout) {
                    System.out.println("Logout del servidor FTP");
                }
            } else {
                System.out.println("Error en el login.");
            }
            System.out.println("Desconectando.");
            client.disconnect();
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
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
