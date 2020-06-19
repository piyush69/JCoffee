import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2897046 {
public MyHelperClass hostname;
	public MyHelperClass NULL;
public MyHelperClass password;
	public MyHelperClass common_h;

    public boolean execute_check()  throws Throwable {
        FTPClient ftp = new FTPClient();
        File filename = null;
        FileChannel channel;
        InputStream is;
        OutputStream os;
        int reply;
        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
//        MyHelperClass verbose = new MyHelperClass();
        MyHelperClass verbose = new MyHelperClass();
        if (super.verbose > 0) verbose = true;
        MyHelperClass port = new MyHelperClass();
        ftp.setDefaultPort(port);
        MyHelperClass timeout = new MyHelperClass();
        ftp.setDefaultTimeout(timeout);
//        MyHelperClass verbose = new MyHelperClass();
        if ((boolean)(Object)verbose) {
            MyHelperClass hostname = new MyHelperClass();
            System.out.println("Using FTP Server: " + hostname);
//            MyHelperClass port = new MyHelperClass();
            System.out.println("Using FTP Port: " + port);
//            MyHelperClass timeout = new MyHelperClass();
            System.out.println("Using Timeout of: " + timeout);
        }
        MyHelperClass passive = new MyHelperClass();
        if ((boolean)(Object)passive) {
            ftp.enterLocalPassiveMode();
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println("Using Passive Mode");
        }
        try {
            MyHelperClass file = new MyHelperClass();
            filename = new File((String)(Object)file);
            channel = (FileChannel)(Object)new RandomAccessFile(filename, "rw").getChannel();
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println("Attempting FTP Connection to " + hostname);
            MyHelperClass hostname = new MyHelperClass();
            ftp.connect(hostname);
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                MyHelperClass verbose = new MyHelperClass();
                if ((boolean)(Object)verbose) System.out.println("FTP Connection to " + hostname + " failed");
                MyHelperClass check_state = new MyHelperClass();
                check_state = common_h.STATE_CRITICAL;
                MyHelperClass check_message = new MyHelperClass();
                check_message = ftp.getReplyString();
                filename.delete();
                ftp.disconnect();
                return true;
            }
            MyHelperClass username = new MyHelperClass();
            if (username != null && password != null) {
//                MyHelperClass verbose = new MyHelperClass();
                if ((boolean)(Object)verbose) System.out.println("Attempting to log in into FTP Server " + hostname);
//                MyHelperClass username = new MyHelperClass();
                if (!(Boolean)(Object)ftp.login(username, password)) {
//                    MyHelperClass verbose = new MyHelperClass();
                    if ((boolean)(Object)verbose) System.out.println("Unable to log in to FTP Server " + hostname);
                    MyHelperClass check_state = new MyHelperClass();
                    check_state = common_h.STATE_CRITICAL;
                    MyHelperClass check_message = new MyHelperClass();
                    check_message = ftp.getReplyString();
                    ftp.disconnect();
                    filename.delete();
                    return true;
                }
            }
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println("Attempting to change to required directory");
            MyHelperClass directory = new MyHelperClass();
            if (!(Boolean)(Object)ftp.changeWorkingDirectory(directory)) {
//                MyHelperClass verbose = new MyHelperClass();
                if ((boolean)(Object)verbose) System.out.println("Required directory cannot be found!");
                MyHelperClass check_state = new MyHelperClass();
                check_state = common_h.STATE_WARNING;
                MyHelperClass check_message = new MyHelperClass();
                check_message = ftp.getReplyString();
                ftp.disconnect();
                filename.delete();
                return true;
            }
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println("Attempting to retrieve specified file!");
//            MyHelperClass file = new MyHelperClass();
            is =(InputStream)(Object) ftp.retrieveFileStream(file);
            if (is == null) {
//                MyHelperClass verbose = new MyHelperClass();
                if ((boolean)(Object)verbose) System.out.println("Unable to locate required file.");
                MyHelperClass check_state = new MyHelperClass();
                check_state = common_h.STATE_WARNING;
                MyHelperClass check_message = new MyHelperClass();
                check_message = ftp.getReplyString();
                ftp.disconnect();
                filename.delete();
                return true;
            }
            MyHelperClass Channels = new MyHelperClass();
            os =(OutputStream)(Object) Channels.newOutputStream(channel);
            byte[] buf = new byte[4096];
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println("Beginning File transfer...");
            for (int len = -1; (len = is.read(buf)) != -1; ) os.write(buf, 0, len);
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) {
                System.out.println("...transfer complete.");
                System.out.println("Attempting to finalise Command");
            }
            if (!(Boolean)(Object)ftp.completePendingCommand()) {
//                MyHelperClass verbose = new MyHelperClass();
                if ((boolean)(Object)verbose) System.out.println("Unable to finalise command");
                MyHelperClass check_state = new MyHelperClass();
                check_state = common_h.STATE_WARNING;
                MyHelperClass check_message = new MyHelperClass();
                check_message = ftp.getReplyString();
                ftp.disconnect();
                filename.delete();
                return true;
            }
//            MyHelperClass verbose = new MyHelperClass();
            if ((boolean)(Object)verbose) System.out.println("Check Completed.");
            MyHelperClass check_state = new MyHelperClass();
            check_state = common_h.STATE_OK;
            MyHelperClass check_message = new MyHelperClass();
            check_message = ftp.getReplyString();
            is.close();
            os.close();
            channel.close();
            filename.delete();
        } catch (IOException e) {
            MyHelperClass check_state = new MyHelperClass();
            check_state = common_h.STATE_CRITICAL;
            String check_message =(String)(Object) NULL; //new String();
            check_message = e.getMessage();
            if (filename != null) filename.delete();
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.logout();
                    ftp.disconnect();
                } catch (Exception e) {
                }
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass STATE_OK;
	public MyHelperClass STATE_CRITICAL;
	public MyHelperClass STATE_WARNING;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass newOutputStream(FileChannel o0){ return null; }}

class FTPClient {

public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass setDefaultPort(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass retrieveFileStream(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setDefaultTimeout(MyHelperClass o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }}
