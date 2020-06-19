import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c17590757 {
public MyHelperClass password;
	public MyHelperClass getServer(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass getPassword(){ return null; }

    private boolean initConnection() {
        try {
            MyHelperClass ftp = new MyHelperClass();
            if (ftp == null) {
//                MyHelperClass ftp = new MyHelperClass();
                ftp =(MyHelperClass)(Object) new FTPClient();
                MyHelperClass serverIP = new MyHelperClass();
                serverIP = getServer();
                MyHelperClass userName = new MyHelperClass();
                userName = getUserName();
                MyHelperClass password = new MyHelperClass();
                password = getPassword();
            }
            MyHelperClass serverIP = new MyHelperClass();
            ftp.connect(serverIP);
            MyHelperClass userName = new MyHelperClass();
            ftp.login(userName, password);
            return true;
        } catch (UncheckedIOException a_excp) {
            throw new RuntimeException(a_excp);
        } catch (ArithmeticException a_excp) {
            throw new RuntimeException(a_excp);
        } catch (Throwable a_th) {
            throw new RuntimeException(a_th);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

}
