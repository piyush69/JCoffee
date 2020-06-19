
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11245902 {

    public static void uploadFile(File in, String out, String host, int port, String path, String login, String password, boolean renameIfExist) throws IOException {
        FTPClient ftp = null;
        try {
            MyHelperClass m_logCat = new MyHelperClass();
            m_logCat.info("Uploading " + in + " to " + host + ":" + port + " at " + path);
            ftp = new FTPClient();
            int reply;
            ftp.connect(host, port);
//            MyHelperClass m_logCat = new MyHelperClass();
            m_logCat.info("Connected to " + host + "... Trying to authenticate");
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
//                MyHelperClass m_logCat = new MyHelperClass();
                m_logCat.error("FTP server " + host + " refused connection.");
                throw new IOException("Cannot connect to the FTP Server: connection refused.");
            }
            if (!(Boolean)(Object)ftp.login(login, password)) {
                ftp.logout();
                throw new IOException("Cannot connect to the FTP Server: login / password is invalid!");
            }
            MyHelperClass FTP = new MyHelperClass();
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            if (!(Boolean)(Object)ftp.changeWorkingDirectory(path)) {
//                MyHelperClass m_logCat = new MyHelperClass();
                m_logCat.warn("Remote working directory: " + path + "does not exist on the FTP Server ...");
//                MyHelperClass m_logCat = new MyHelperClass();
                m_logCat.info("Trying to create remote directory: " + path);
                if (!(Boolean)(Object)ftp.makeDirectory(path)) {
//                    MyHelperClass m_logCat = new MyHelperClass();
                    m_logCat.error("Failed to create remote directory: " + path);
                    throw new IOException("Failed to store " + in + " in the remote directory: " + path);
                }
                if (!(Boolean)(Object)ftp.changeWorkingDirectory(path)) {
//                    MyHelperClass m_logCat = new MyHelperClass();
                    m_logCat.error("Failed to change directory. Unexpected error");
                    throw new IOException("Failed to change to remote directory : " + path);
                }
            }
            if (out == null) {
                out =(String)(Object) in.getName();
                if (out.startsWith("/")) {
                    out = out.substring(1);
                }
            }
            if (renameIfExist) {
                String[] files =(String[])(Object) ftp.listNames();
                String f = in + out;
                for (int i = 0; i < files.length; i++) {
                    if (files[i].equals(out)) {
//                        MyHelperClass m_logCat = new MyHelperClass();
                        m_logCat.debug("Found existing file on the server: " + out);
                        boolean rename_ok = false;
                        String bak = "_bak";
                        int j = 0;
                        String newExt = null;
                        while (!rename_ok) {
                            if (j == 0) newExt = bak; else newExt = bak + j;
                            if ((boolean)(Object)ftp.rename(out, out + newExt)) {
//                                MyHelperClass m_logCat = new MyHelperClass();
                                m_logCat.info(out + " renamed to " + out + newExt);
                                rename_ok = true;
                            } else {
//                                MyHelperClass m_logCat = new MyHelperClass();
                                m_logCat.warn("Renaming to " + out + newExt + " has failed!, trying again ...");
                                j++;
                            }
                        }
                        break;
                    }
                }
            }
            InputStream input =(InputStream)(Object) new FileInputStream(in);
//            MyHelperClass m_logCat = new MyHelperClass();
            m_logCat.info("Starting transfert of " + in);
            ftp.storeFile(out, input);
//            MyHelperClass m_logCat = new MyHelperClass();
            m_logCat.info(in + " uploaded successfully");
            input.close();
            ftp.logout();
        } catch (UncheckedIOException e) {
            MyHelperClass m_logCat = new MyHelperClass();
            m_logCat.error("Server closed connection.",(FTPConnectionClosedException)(Object) e);
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException f) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass error(String o0, FTPConnectionClosedException o1){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass rename(String o0, String o1){ return null; }
	public MyHelperClass listNames(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FTPConnectionClosedException extends Exception{
	public FTPConnectionClosedException(String errorMessage) { super(errorMessage); }
}
