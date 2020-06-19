
import java.io.UncheckedIOException;


class c4301353 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        String sFTP = "ftp.servidor.com";
        String sUser = "usuario";
        String sPassword = "pasword";
        try {
            System.out.println("Conectandose a " + sFTP);
            client.connect(sFTP);
            client.login(sUser, sPassword);
            System.out.println(client.printWorkingDirectory());
            client.changeWorkingDirectory("\\httpdocs");
            System.out.println(client.printWorkingDirectory());
            System.out.println("Desconectando.");
            client.logout();
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
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
