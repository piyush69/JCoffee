
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6304370 {

    public static String[] viewFilesToImport(HttpSession session) {
        FTPClient ftp = new FTPClient();
        CofaxToolsUser user = (CofaxToolsUser)(CofaxToolsUser)(Object) session.getAttribute("user");
        String importFTPServer = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPSERVER") + "";
        String importFTPLogin = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPLOGIN") + "";
        String importFTPPassword = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPPASSWORD") + "";
        String importFTPFilePath = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPFILEPATH");
        String[] dirList = null;
        if (importFTPServer.equals("") || importFTPLogin.equals("") || importFTPPassword.equals("")) {
            return dirList;
        }
        boolean loggedIn = false;
        try {
            int reply;
            ftp.connect(importFTPServer);
            MyHelperClass CofaxToolsUtil = new MyHelperClass();
            CofaxToolsUtil.log("CofaxToolsFTP viewFilesToImport connecting: " + ftp.getReplyString());
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.logout();
                ftp.disconnect();
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP viewFilesToImport ERROR: FTP server refused connection.");
            } else {
                loggedIn =(boolean)(Object) ftp.login(importFTPLogin, importFTPPassword);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP viewFilesToImport Logging in: " + importFTPLogin + " " + importFTPPassword);
            }
            if (loggedIn) {
                try {
                    ftp.changeWorkingDirectory(importFTPFilePath);
//                    MyHelperClass CofaxToolsUtil = new MyHelperClass();
                    CofaxToolsUtil.log("CofaxToolsFTP viewFilesToImport changing dir: " + importFTPFilePath);
//                    MyHelperClass FTPReply = new MyHelperClass();
                    if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                        MyHelperClass CofaxToolsUtil = new MyHelperClass();
                        CofaxToolsUtil.log("ERROR: cannot change directory");
                    }
                    FTPFile[] remoteFileList =(FTPFile[])(Object) ftp.listFiles();
                    ArrayList tmpArray = new ArrayList();
                    for (int i = 0; i < remoteFileList.length; i++) {
                        FTPFile testFile = remoteFileList[i];
                        MyHelperClass FTP = new MyHelperClass();
                        if (testFile.getType() == FTP.ASCII_FILE_TYPE) {
                            tmpArray.add(testFile.getName());
                        }
                    }
                    dirList = (String[])(String[])(Object) tmpArray.toArray(new String[0]);
                    ftp.logout();
                    ftp.disconnect();
                } catch (java.io.UncheckedIOException e) {
//                    MyHelperClass CofaxToolsUtil = new MyHelperClass();
                    CofaxToolsUtil.log("CofaxToolsFTP viewFilesToImport cannot read directory: " + importFTPFilePath);
                }
            }
        } catch (UncheckedIOException e) {
            MyHelperClass CofaxToolsUtil = new MyHelperClass();
            CofaxToolsUtil.log("CofaxToolsFTP viewFilesToImport could not connect to server: " + e);
        }
        return (dirList);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ASCII_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass log(String o0){ return null; }}

class HttpSession {

public MyHelperClass getAttribute(String o0){ return null; }}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class CofaxToolsUser {
public MyHelperClass workingPubConfigElementsHash;
}

class FTPFile {

public MyHelperClass getType(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ArrayList {

public MyHelperClass toArray(String[] o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
