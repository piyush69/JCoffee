
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19936443 {
public MyHelperClass password;
	public MyHelperClass ftp;
	public MyHelperClass port;

    public boolean connect() {
        try {
            int reply;
            MyHelperClass server = new MyHelperClass();
            ftp.connect(server, port);
            MyHelperClass ftp = new MyHelperClass();
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                MyHelperClass username = new MyHelperClass();
                if ((boolean)(Object)ftp.login(username, password)) {
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.enterLocalPassiveMode();
                    return true;
                }
            } else {
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
                System.out.println("FTP server refused connection.");
            }
        } catch (UncheckedIOException e) {
            MyHelperClass ftp = new MyHelperClass();
            if ((boolean)(Object)ftp.isConnected()) {
                try {
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.disconnect();
                } catch (UncheckedIOException f) {
                }
            }
            System.out.println("Could not connect to server.");
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
