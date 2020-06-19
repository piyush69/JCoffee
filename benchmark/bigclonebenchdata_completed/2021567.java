
import java.io.UncheckedIOException;


class c2021567 {
public MyHelperClass password;

    public boolean storeFile(String local, String remote) throws IOException {
        boolean stored = false;
        GridFTP ftp = new GridFTP();
        MyHelperClass port = new MyHelperClass();
        ftp.setDefaultPort(port);
        System.out.println(this + ".storeFile " + remote);
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
            ftp.put(local, remote);
            ftp.logout();
            stored = true;
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
        return stored;
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
	public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
