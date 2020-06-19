
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13930320 {

    private boolean CheckConnection() {
        boolean b = false;
        MyHelperClass Settings = new MyHelperClass();
        String host = "" + Settings.getHost();
//        MyHelperClass Settings = new MyHelperClass();
        String user = "" + Settings.getUser();
//        MyHelperClass Settings = new MyHelperClass();
        String pass = "" + Settings.getPass();
//        MyHelperClass Settings = new MyHelperClass();
        int port =(int)(Object) Settings.getPort();
        MyHelperClass ftp = new MyHelperClass();
        if (!(Boolean)(Object)ftp.isConnected()) {
            try {
                int reply;
//                MyHelperClass ftp = new MyHelperClass();
                ftp.connect(host, port);
//                MyHelperClass ftp = new MyHelperClass();
                ftp.login(user, pass);
//                MyHelperClass ftp = new MyHelperClass();
                ftp.enterLocalPassiveMode();
//                MyHelperClass ftp = new MyHelperClass();
                reply =(int)(Object) ftp.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.disconnect();
//                    MyHelperClass Settings = new MyHelperClass();
                    Settings.out("Error, connection refused from the FTP server." + host, 4);
                    b = false;
                } else {
                    b = true;
                }
            } catch (UncheckedIOException e) {
                b = false;
//                MyHelperClass Settings = new MyHelperClass();
                Settings.out("Error : " + e.toString(), 4);
//                MyHelperClass ftp = new MyHelperClass();
                if ((boolean)(Object)ftp.isConnected()) {
                    try {
//                        MyHelperClass ftp = new MyHelperClass();
                        ftp.disconnect();
                    } catch (UncheckedIOException ioe) {
                    }
                }
            }
        } else {
            b = true;
        }
        return b;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getUser(){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass getPass(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass out(String o0, int o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
