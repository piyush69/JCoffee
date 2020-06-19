
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19894311 {
public static MyHelperClass Debug;
//public MyHelperClass Debug;

    public static Map getFile(DispatchContext dctx, Map context) {
        String localFilename = (String)(String)(Object) context.get("localFilename");
        OutputStream localFile = null;
        try {
            localFile =(OutputStream)(Object) new FileOutputStream(localFilename);
        } catch (UncheckedIOException ioe) {
            MyHelperClass module = new MyHelperClass();
            Debug.logError((IOException)(Object)ioe, "[getFile] Problem opening local file", module);
            MyHelperClass ServiceUtil = new MyHelperClass();
            return(Map)(Object) ServiceUtil.returnError("ERROR: Could not open local file");
        }
        List errorList =(List)(Object) new ArrayList();
        FTPClient ftp = new FTPClient();
        try {
            ftp.connect((String)(String)(Object) context.get("hostname"));
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                errorList.add("Server refused connection");
            } else {
                String username = (String)(String)(Object) context.get("username");
                String password = (String)(String)(Object) context.get("password");
                if (!(Boolean)(Object)ftp.login(username, password)) {
                    errorList.add("Login failed (" + username + ", " + password + ")");
                } else {
                    Boolean binaryTransfer = (Boolean)(Boolean)(Object) context.get("binaryTransfer");
                    boolean binary = (binaryTransfer == null) ? false : binaryTransfer.booleanValue();
                    if (binary) {
                        MyHelperClass FTP = new MyHelperClass();
                        ftp.setFileType(FTP.BINARY_FILE_TYPE);
                    }
                    Boolean passiveMode = (Boolean)(Boolean)(Object) context.get("passiveMode");
                    boolean passive = (passiveMode == null) ? false : passiveMode.booleanValue();
                    if (passive) {
                        ftp.enterLocalPassiveMode();
                    }
                    if (!(Boolean)(Object)ftp.retrieveFile((String)(String)(Object) context.get("remoteFilename"), localFile)) {
                        errorList.add("File not received succesfully: " + ftp.getReplyString());
                    }
                }
                ftp.logout();
            }
        } catch (UncheckedIOException ioe) {
            errorList.add("Problem with FTP transfer: " + ioe.getMessage());
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException dce) {
                    MyHelperClass module = new MyHelperClass();
                    Debug.logWarning((IOException)(Object)dce, "[getFile] Problem with FTP disconnect", module);
                }
            }
        }
        try {
            localFile.close();
        } catch (UncheckedIOException ce) {
            MyHelperClass module = new MyHelperClass();
            Debug.logWarning((IOException)(Object)ce, "[getFile] Problem closing local file", module);
        }
        if ((int)(Object)errorList.size() > 0) {
            MyHelperClass module = new MyHelperClass();
            Debug.logError("[getFile] The following error(s) (" + errorList.size() + ") occurred: " + errorList, module);
            MyHelperClass ServiceUtil = new MyHelperClass();
            return(Map)(Object) ServiceUtil.returnError(errorList);
        }
        MyHelperClass ServiceUtil = new MyHelperClass();
        return(Map)(Object) ServiceUtil.returnSuccess();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass returnSuccess(){ return null; }
	public MyHelperClass logError(IOException o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass logError(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass logWarning(IOException o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass returnError(String o0){ return null; }
	public MyHelperClass returnError(List o0){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }}

class DispatchContext {

}

class Map {

public MyHelperClass get(String o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass retrieveFile(String o0, OutputStream o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}
