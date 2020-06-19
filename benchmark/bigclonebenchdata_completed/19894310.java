
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19894310 {
public static MyHelperClass Debug;
//public MyHelperClass Debug;

    public static Map putFile(DispatchContext dctx, Map context) {
        MyHelperClass module = new MyHelperClass();
        Debug.logInfo("[putFile] starting...", module);
        InputStream localFile = null;
        try {
            localFile =(InputStream)(Object) new FileInputStream((String)(String)(Object) context.get("localFilename"));
        } catch (UncheckedIOException ioe) {
//            MyHelperClass module = new MyHelperClass();
            Debug.logError((IOException)(Object)ioe, "[putFile] Problem opening local file", module);
            MyHelperClass ServiceUtil = new MyHelperClass();
            return(Map)(Object) ServiceUtil.returnError("ERROR: Could not open local file");
        }
        List errorList =(List)(Object) new ArrayList();
        FTPClient ftp = new FTPClient();
        try {
//            MyHelperClass module = new MyHelperClass();
            Debug.logInfo("[putFile] connecting to: " + (String)(String)(Object) context.get("hostname"), module);
            ftp.connect((String)(String)(Object) context.get("hostname"));
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
//                MyHelperClass module = new MyHelperClass();
                Debug.logInfo("[putFile] Server refused connection", module);
                errorList.add("connection refused");
            } else {
                String username = (String)(String)(Object) context.get("username");
                String password = (String)(String)(Object) context.get("password");
//                MyHelperClass module = new MyHelperClass();
                Debug.logInfo("[putFile] logging in: username=" + username + ", password=" + password, module);
                if (!(Boolean)(Object)ftp.login(username, password)) {
//                    MyHelperClass module = new MyHelperClass();
                    Debug.logInfo("[putFile] login failed", module);
                    errorList.add("Login failed (" + username + ", " + password + ")");
                } else {
                    Boolean binaryTransfer = (Boolean)(Boolean)(Object) context.get("binaryTransfer");
                    boolean binary = (binaryTransfer == null) ? false : binaryTransfer.booleanValue();
                    if (binary) {
                        MyHelperClass FTP = new MyHelperClass();
                        ftp.setFileType(FTP.BINARY_FILE_TYPE);
                    }
                    Boolean passiveMode = (Boolean)(Boolean)(Object) context.get("passiveMode");
                    boolean passive = (passiveMode == null) ? true : passiveMode.booleanValue();
                    if (passive) {
                        ftp.enterLocalPassiveMode();
                    }
//                    MyHelperClass module = new MyHelperClass();
                    Debug.logInfo("[putFile] storing local file remotely as: " + context.get("remoteFilename"), module);
                    if (!(Boolean)(Object)ftp.storeFile((String)(String)(Object) context.get("remoteFilename"), localFile)) {
//                        MyHelperClass module = new MyHelperClass();
                        Debug.logInfo("[putFile] store was unsuccessful", module);
                        errorList.add("File not sent succesfully: " + ftp.getReplyString());
                    } else {
//                        MyHelperClass module = new MyHelperClass();
                        Debug.logInfo("[putFile] store was successful", module);
                        List siteCommands = (List)(List)(Object) context.get("siteCommands");
                        if (siteCommands != null) {
                            Iterator ci =(Iterator)(Object) siteCommands.iterator();
                            while ((boolean)(Object)ci.hasNext()) {
                                String command = (String)(String)(Object) ci.next();
//                                MyHelperClass module = new MyHelperClass();
                                Debug.logInfo("[putFile] sending SITE command: " + command, module);
                                if (!(Boolean)(Object)ftp.sendSiteCommand(command)) {
                                    errorList.add("SITE command (" + command + ") failed: " + ftp.getReplyString());
                                }
                            }
                        }
                    }
                }
                ftp.logout();
            }
        } catch (UncheckedIOException ioe) {
//            MyHelperClass module = new MyHelperClass();
            Debug.log((IOException)(Object)ioe, "[putFile] caught exception: " + ioe.getMessage(), module);
            errorList.add("Problem with FTP transfer: " + ioe.getMessage());
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException dce) {
//                    MyHelperClass module = new MyHelperClass();
                    Debug.logWarning((IOException)(Object)dce, "[putFile] Problem with FTP disconnect", module);
                }
            }
        }
        try {
            localFile.close();
        } catch (UncheckedIOException ce) {
//            MyHelperClass module = new MyHelperClass();
            Debug.logWarning((IOException)(Object)ce, "[putFile] Problem closing local file", module);
        }
        if ((int)(Object)errorList.size() > 0) {
//            MyHelperClass module = new MyHelperClass();
            Debug.logError("[putFile] The following error(s) (" + errorList.size() + ") occurred: " + errorList, module);
            MyHelperClass ServiceUtil = new MyHelperClass();
            return(Map)(Object) ServiceUtil.returnError(errorList);
        }
//        MyHelperClass module = new MyHelperClass();
        Debug.logInfo("[putFile] finished successfully", module);
        MyHelperClass ServiceUtil = new MyHelperClass();
        return(Map)(Object) ServiceUtil.returnSuccess();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass returnSuccess(){ return null; }
	public MyHelperClass logError(IOException o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass logInfo(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass logError(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass logWarning(IOException o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass returnError(String o0){ return null; }
	public MyHelperClass returnError(List o0){ return null; }
	public MyHelperClass log(IOException o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }}

class DispatchContext {

}

class Map {

public MyHelperClass get(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class List {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass sendSiteCommand(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
