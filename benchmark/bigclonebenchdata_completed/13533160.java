
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13533160 {
public MyHelperClass password;
	public MyHelperClass remotefile;
	public MyHelperClass port;

    public String[] getFile() {
        List records =(List)(Object) new ArrayList();
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            MyHelperClass FTPClientConfig = new MyHelperClass();
            FTPClientConfig conf = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
            ftp.configure(conf);
            MyHelperClass host = new MyHelperClass();
            ftp.connect(host, port);
//            MyHelperClass host = new MyHelperClass();
            System.out.println("Connected to " + host + ".");
            System.out.print(ftp.getReplyString());
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                System.err.println("FTP server refused connection.");
            }
            MyHelperClass user = new MyHelperClass();
            ftp.login(user, password);
            reply =(int)(Object) ftp.getReplyCode();
//            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                System.err.println("FTP server refused login.");
            }
            MyHelperClass remotedir = new MyHelperClass();
            InputStream is =(InputStream)(Object) ftp.retrieveFileStream(remotedir + "/" + remotefile);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line =(String)(Object) br.readLine()) != null) {
                if (!line.equals("")) {
                    records.add(line);
                }
            }
            br.close();
            isr.close();
            is.close();
            ftp.logout();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException ioe) {
                    ioe.printStackTrace();
                }
            }
        }
        return(String[])(Object) records.toArray(new String[0]);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SYST_UNIX;
public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class List {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass configure(FTPClientConfig o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FTPClientConfig {

FTPClientConfig(MyHelperClass o0){}
	FTPClientConfig(){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
