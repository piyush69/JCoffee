import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c15170914 {
public MyHelperClass RESULT_OK;
	public MyHelperClass RESULT_ERROR;
	public MyHelperClass RESULT_TRANSFER_ERROR;
	public MyHelperClass FTPClient;
	public MyHelperClass log;
	public MyHelperClass RESULT_NO_NEW_FILE;
	public MyHelperClass getOutputFile(){ return null; }
	public MyHelperClass getUserName(){ return null; }
	public MyHelperClass uncompress(){ return null; }
	public MyHelperClass getPassword(){ return null; }

    public int download() {
        FTPClient client = null;
        URL url = null;
        try {
            client = new FTPClient();
            MyHelperClass ratingsUrl = new MyHelperClass();
            url = new URL(ratingsUrl);
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Downloading " + url);
            client.connect(url.getHost());
            int reply =(int)(Object) client.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isErrorEnabled()) log.error("Connection to " + url + " refused");
                MyHelperClass RESULT_CONNECTION_REFUSED = new MyHelperClass();
                return (int)(Object)RESULT_CONNECTION_REFUSED;
            }
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Logging in  l:" + getUserName() + " p:" + getPassword());
            client.login(getUserName(), getPassword());
            client.changeWorkingDirectory(url.getPath());
            FTPFile[] files =(FTPFile[])(Object) client.listFiles(url.getPath());
            if ((files == null) || (files.length != 1)) throw new FileNotFoundException("No remote file");
            FTPFile remote = files[0];
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Remote file data: " + remote);
            File local = new File((String)(Object)getOutputFile());
            if (local.exists()) {
                if ((local.lastModified() == (long)(Object)remote.getTimestamp().getTimeInMillis())) {
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("File " + local.getAbsolutePath() + " is not changed on the server");
                    return (int)(Object)RESULT_NO_NEW_FILE;
                }
            }
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Setting binary transfer modes");
            client.mode(FTPClient.BINARY_FILE_TYPE);
            client.setFileType(FTPClient.BINARY_FILE_TYPE);
            OutputStream fos = new FileOutputStream(local);
            boolean result =(boolean)(Object) client.retrieveFile(url.getPath(), fos);
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("The transfer result is :" + result);
            fos.flush();
            fos.close();
            local.setLastModified((long)(Object)remote.getTimestamp().getTimeInMillis());
            if (result) uncompress();
            if (result) return (int)(Object)RESULT_OK; else return (int)(Object)RESULT_TRANSFER_ERROR;
        } catch (UncheckedIOException e) {
            return (int)(Object)RESULT_ERROR;
        } catch (ArithmeticException e) {
            return (int)(Object)RESULT_ERROR;
        } catch (FileNotFoundException e) {
            return (int)(Object)RESULT_ERROR;
        } catch (IOException e) {
            return (int)(Object)RESULT_ERROR;
        } finally {
            if (client != null) {
                try {
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("Logging out");
                    client.logout();
                } catch (Exception e) {
                }
                try {
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("Disconnecting");
                    client.disconnect();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getTimeInMillis(){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass isErrorEnabled(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FTPClient {

public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass mode(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass listFiles(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass retrieveFile(MyHelperClass o0, OutputStream o1){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getHost(){ return null; }}

class FTPFile {

public MyHelperClass getTimestamp(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}
