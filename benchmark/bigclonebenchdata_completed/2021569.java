
import java.io.UncheckedIOException;


class c2021569 {
public MyHelperClass password;

    public boolean getFile(String local, String remote) throws IOException {
        boolean result = false;
        GridFTP ftp = new GridFTP();
        MyHelperClass port = new MyHelperClass();
        ftp.setDefaultPort(port);
        System.out.println(this + ".getFile " + remote);
        try {
            MyHelperClass host = new MyHelperClass();
            ftp.connect(host);
            MyHelperClass username = new MyHelperClass();
            ftp.login(username, password);
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                System.err.println("FTP server refused connection.");
                return false;
            }
            ftp.get(local, remote);
            ftp.logout();
            result = true;
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(this + ".getFile return " + result);
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class GridFTP {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass get(String o0, String o1){ return null; }
	public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
