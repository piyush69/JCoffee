import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6304366 {
public static MyHelperClass FTPReply;
	public static MyHelperClass FTP;
	public static MyHelperClass splitServers(String o0){ return null; }
//public MyHelperClass FTP;
//	public MyHelperClass FTPReply;
	public MyHelperClass CofaxToolsUtil;
//	public MyHelperClass splitServers(String o0){ return null; }

    public static String uploadArticleMedia(String localPath, String articleImageName, String year, String month, String day, DataStore db, HttpSession session)  throws Throwable {
        CofaxToolsUser user = (CofaxToolsUser)(CofaxToolsUser)(Object) session.getAttribute("user");
        if (!localPath.endsWith(File.separator)) {
            localPath += File.separator;
        }
        FTPClient ftp = new FTPClient();
        String liveFTPLogin = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPLOGIN");
        String liveFTPPassword = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPPASSWORD");
        String liveImagesServer = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPSERVER");
        String liveImagesFolder = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEIMAGESFOLDER");
        if (!liveImagesFolder.endsWith("/")) {
            liveImagesFolder = liveImagesFolder + "/";
        }
        String liveImagesYearFolder = "";
        String liveImagesMonthFolder = "";
        String fileLocation = "";
        fileLocation += "/" + year + "/" + month + "/" + day;
        liveImagesYearFolder = liveImagesFolder + year;
        liveImagesMonthFolder = (liveImagesYearFolder + "/" + month);
        liveImagesFolder = (liveImagesMonthFolder + "/" + day);
        MyHelperClass CofaxToolsUtil = new MyHelperClass();
        CofaxToolsUtil.log("CofaxToolsFTP: liveImagesServer: " + liveImagesServer);
//        MyHelperClass CofaxToolsUtil = new MyHelperClass();
        CofaxToolsUtil.log("CofaxToolsFTP: liveImagesFolder: " + liveImagesFolder);
        boolean stored = false;
        ArrayList servers =(ArrayList)(Object) splitServers(liveImagesServer);
        for (int count = 0; count < servers.size(); count++) {
            String server = (String) servers.get(count);
            try {
                int reply;
                ftp.connect(server);
                CofaxToolsUtil.log("CofaxToolsFTP: uploadArticleMedia connecting to server : " + server);
                CofaxToolsUtil.log("CofaxToolsFTP: uploadArticleMedia results: " + ftp.getReplyString());
                CofaxToolsUtil.log((String)(Object)ftp.getReplyString());
                reply =(int)(Object) ftp.getReplyCode();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                    ftp.disconnect();
                    return ("CofaxToolsFTP uploadArticleMedia ERROR: FTP server refused connection.");
                } else {
                    ftp.login(liveFTPLogin, liveFTPPassword);
                }
                try {
                    ftp.setFileType(FTP.IMAGE_FILE_TYPE);
                    InputStream input;
                    CofaxToolsUtil.log("CofaxToolsFTP: opening file stream: " + localPath + articleImageName);
                    input = new FileInputStream(localPath + articleImageName);
                    CofaxToolsUtil.log("CofaxToolsFTP: attempting to change working directory to: " + liveImagesFolder);
                    boolean changed =(boolean)(Object) ftp.changeWorkingDirectory(liveImagesFolder);
                    CofaxToolsUtil.log("CofaxToolsFTP: uploadArticleMedia results: " + changed);
                    if (changed == false) {
                        CofaxToolsUtil.log("CofaxToolsFTP: uploadArticleMedia attempting to create directory :" + liveImagesFolder);
                        boolean newDirYear =(boolean)(Object) ftp.makeDirectory(liveImagesYearFolder);
                        boolean newDirMonth =(boolean)(Object) ftp.makeDirectory(liveImagesMonthFolder);
                        boolean newDir =(boolean)(Object) ftp.makeDirectory(liveImagesFolder);
                        CofaxToolsUtil.log("CofaxToolsFTP: uploadArticleMedia results: YearDir: " + newDirYear + " MonthDir: " + newDirMonth + " finalDir: " + newDir);
                        changed =(boolean)(Object) ftp.changeWorkingDirectory(liveImagesFolder);
                    }
                    if (changed) {
                        CofaxToolsUtil.log("CofaxToolsFTP: storing " + articleImageName + " to " + liveImagesFolder);
                        stored =(boolean)(Object) ftp.storeFile(articleImageName, input);
                    } else {
                        CofaxToolsUtil.log("CofaxToolsFTP: failed changing: " + liveImagesFolder);
                    }
                    if (stored) {
                        CofaxToolsUtil.log("CofaxToolsFTP: Successfully ftped file.");
                    } else {
                        CofaxToolsUtil.log("CofaxToolsFTP: Failed ftping file.");
                    }
                    input.close();
                    ftp.logout();
                    ftp.disconnect();
                } catch (CopyStreamException e) {
                    CofaxToolsUtil.log("CofaxToolsFTP: Failed ftping file." + e.toString());
                    CofaxToolsUtil.log("CofaxToolsFTP: " + e.getIOException().toString());
                    return ("Cannot upload file " + liveImagesFolder + "/" + articleImageName);
                } catch (IOException e) {
                    CofaxToolsUtil.log("CofaxToolsFTP: Failed ftping file." + e.toString());
                    return ("Cannot upload file " + liveImagesFolder + "/" + articleImageName);
                } catch (Exception e) {
                    CofaxToolsUtil.log("CofaxToolsFTP: Failed ftping file." + e.toString());
                    return ("Cannot upload file " + liveImagesFolder + "/" + articleImageName);
                }
            } catch (IOException e) {
                return ("Could not connect to server: " + e);
            }
        }
        return ("");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE_FILE_TYPE;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class DataStore {

}

class HttpSession {

public MyHelperClass getAttribute(String o0){ return null; }}

class CofaxToolsUser {
public MyHelperClass workingPubConfigElementsHash;
}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class CopyStreamException extends Exception{
	public CopyStreamException(String errorMessage) { super(errorMessage); }
}
