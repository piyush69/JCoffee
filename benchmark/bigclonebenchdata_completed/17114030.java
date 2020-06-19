
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17114030 {
public static MyHelperClass printDir(FTPClient o0, String o1){ return null; }
//public MyHelperClass printDir(FTPClient o0, String o1){ return null; }

    public static void main(String[] args) {
        try {
            FTPClient p = new FTPClient();
            p.connect("url");
            p.login("login", "pass");
            int sendCommand =(int)(Object) p.sendCommand("SYST");
            System.out.println("TryMe.main() - " + sendCommand + " (sendCommand)");
            sendCommand =(int)(Object) p.sendCommand("PWD");
            System.out.println("TryMe.main() - " + sendCommand + " (sendCommand)");
            sendCommand =(int)(Object) p.sendCommand("NOOP");
            System.out.println("TryMe.main() - " + sendCommand + " (sendCommand)");
            sendCommand =(int)(Object) p.sendCommand("PASV");
            System.out.println("TryMe.main() - " + sendCommand + " (sendCommand)");
            p.changeWorkingDirectory("/");
            try {
                printDir(p, "/");
            } catch (Exception e) {
                e.printStackTrace();
            }
            p.logout();
            p.disconnect();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass sendCommand(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class UnknownHostException extends Exception{
	public UnknownHostException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
