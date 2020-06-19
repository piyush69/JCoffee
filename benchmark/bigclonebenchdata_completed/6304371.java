
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6304371 {

    public static String getImportFileBody(String fileName, HttpSession session) {
        FTPClient ftp = new FTPClient();
        CofaxToolsUser user = (CofaxToolsUser)(CofaxToolsUser)(Object) session.getAttribute("user");
        MyHelperClass CofaxToolsServlet = new MyHelperClass();
        String fileTransferFolder =(String)(Object) CofaxToolsServlet.fileTransferFolder;
        String importFTPServer = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPSERVER");
        String importFTPLogin = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPLOGIN");
        String importFTPPassword = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPPASSWORD");
        String importFTPFilePath = (String)(String)(Object) user.workingPubConfigElementsHash.get("IMPORTFTPFILEPATH");
        String body = ("");
        try {
            int reply;
            ftp.connect(importFTPServer);
            MyHelperClass CofaxToolsUtil = new MyHelperClass();
            CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody connecting to server " + importFTPServer);
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return ("CofaxToolsFTP getImportFileBody ERROR: FTP server refused connection.");
            } else {
                ftp.login(importFTPLogin, importFTPPassword);
            }
            try {
                boolean change =(boolean)(Object) ftp.changeWorkingDirectory(importFTPFilePath);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody changing to directory: " + importFTPFilePath);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("Results: " + change);
                OutputStream output;
                output =(OutputStream)(Object) new FileOutputStream(fileTransferFolder + fileName);
                boolean retrieve =(boolean)(Object) ftp.retrieveFile(fileName, output);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody retrieving file: " + fileName);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody results: " + change);
                output.close();
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                body =(String)(Object) CofaxToolsUtil.readFile(fileTransferFolder + fileName, true);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody deleting remote file: " + importFTPFilePath + fileName);
                boolean delete =(boolean)(Object) ftp.deleteFile(importFTPFilePath + fileName);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody results: " + delete);
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("CofaxToolsFTP getImportFileBody disconnecting from server:" + importFTPServer);
                ftp.logout();
                ftp.disconnect();
            } catch (java.io.UncheckedIOException e) {
                return ("CofaxToolsFTP getImportFileBody ERROR: cannot write file: " + fileName);
            }
        } catch (UncheckedIOException e) {
            return ("CofaxToolsFTP getImportFileBody  ERROR: could not connect to server: " + e);
        }
        return (body);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass fileTransferFolder;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass readFile(String o0, boolean o1){ return null; }
	public MyHelperClass log(String o0){ return null; }}

class HttpSession {

public MyHelperClass getAttribute(String o0){ return null; }}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass deleteFile(String o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass retrieveFile(String o0, OutputStream o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class CofaxToolsUser {
public MyHelperClass workingPubConfigElementsHash;
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
