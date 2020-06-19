
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6304372 {
public static MyHelperClass CofaxToolsUtil;
	public static MyHelperClass FTPReply;
	public static MyHelperClass splitServers(String o0){ return null; }
//public MyHelperClass FTPReply;
//	public MyHelperClass CofaxToolsUtil;
//	public MyHelperClass splitServers(String o0){ return null; }

    public static String getUploadDeleteComboBox(String fromMode, String fromFolder, String action, String object, HttpSession session) {
        FTPClient ftp = new FTPClient();
        CofaxToolsUser user = (CofaxToolsUser)(CofaxToolsUser)(Object) session.getAttribute("user");
        StringBuffer links = new StringBuffer();
        StringBuffer folders = new StringBuffer();
        String folder = "";
        String server = "";
        String login = "";
        String password = "";
        int i = 0;
        String liveFTPServer = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPSERVER") + "";
        liveFTPServer = liveFTPServer.trim();
        if ((liveFTPServer == null) || (liveFTPServer.equals("null")) || (liveFTPServer.equals(""))) {
            return ("This tool is not " + "configured and will not operate. " + "If you wish it to do so, please edit " + "this publication's properties and add correct values to " + " the Remote Server Upstreaming section.");
        }
        if (action.equals("Upload")) {
            server = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTFTPSERVER");
            login = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTFTPLOGIN");
            password = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTFTPPASSWORD");
            MyHelperClass CofaxToolsUtil = new MyHelperClass();
            CofaxToolsUtil.log("server= " + server + " , login= " + login + " , password=" + password);
            if (object.equals("Media")) {
                folder = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTIMAGESFOLDER");
            }
            if (object.equals("Templates")) {
                folder = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTTEMPLATEFOLDER");
//                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log("testTemplateFolder= " + folder);
            }
        }
        if (action.equals("Delete")) {
            login = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPLOGIN");
            password = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPPASSWORD");
            if (object.equals("Media")) {
                server = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEIMAGESSERVER");
                folder = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEIMAGESFOLDER");
            }
            if (object.equals("Templates")) {
                server = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPSERVER");
                folder = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVETEMPLATEFOLDER");
            }
        }
        ArrayList servers =(ArrayList)(Object) splitServers(server);
        try {
            int reply;
            ftp.connect((String)(String)(Object) servers.get(0));
            CofaxToolsUtil.log("CofaxToolsFTP getUploadDeleteComboBox connecting to server: " + (String)(String)(Object) servers.get(0));
            CofaxToolsUtil.log("CofaxToolsFTP getUploadDeleteComboBox results: " + ftp.getReplyString());
            reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return ("CofaxToolsFTP getUploadDeleteComboBox ERROR: FTP server refused connection: " + server);
            } else {
                ftp.login(login, password);
                CofaxToolsUtil.log("CofaxToolsFTP getUploadDeleteComboBox login / pass " + login + " " + password);
            }
            try {
                String tempParentFolderName = folder;
                CofaxToolsUtil.log("fromfolder is " + fromFolder);
                if ((fromFolder != null) && (fromFolder.length() > folder.length())) {
                    folder = fromFolder;
                    tempParentFolderName = folder;
                    int subSt = folder.lastIndexOf("/");
                    tempParentFolderName = tempParentFolderName.substring(0, subSt);
                    String publicName = "";
                    int subStri = folder.lastIndexOf((String)(String)(Object) user.workingPubName);
                    if (subStri > -1) {
                        publicName = folder.substring(subStri);
                    }
                    folders.append("<B><A HREF=\'/tools/?mode=" + fromMode + "&hl=templates_view_templates_images&fromFolder=" + tempParentFolderName + "\'>" + tempParentFolderName + "</A></B><BR>\n");
                } else if ((fromFolder != null) && (fromFolder.length() == folder.length())) {
                    folder = fromFolder;
                    tempParentFolderName = folder;
                    int subSt = folder.lastIndexOf("/");
                    tempParentFolderName = tempParentFolderName.substring(0, subSt);
                }
                boolean changed =(boolean)(Object) ftp.changeWorkingDirectory(folder);
                CofaxToolsUtil.log("CofaxToolsFTP getUploadDeleteComboBox changing working directory to " + folder);
                CofaxToolsUtil.log("CofaxToolsFTP getUploadDeleteComboBox results " + changed);
                FTPFile[] files = null;
                if ((action.equals("Delete")) && (object.equals("Templates"))) {
                    files =(FTPFile[])(Object) ftp.listFiles(new CofaxToolsNTFileListParser());
                } else {
                    files =(FTPFile[])(Object) ftp.listFiles(new CofaxToolsNTFileListParser());
                }
                if (files == null) {
                    CofaxToolsUtil.log("null");
                }
                for (int ii = 0; ii < files.length; ii++) {
                    FTPFile thisFile = (FTPFile) files[ii];
                    String name =(String)(Object) thisFile.getName();
                    if (!(Boolean)(Object)thisFile.isDirectory()) {
                        links.append("<INPUT TYPE=CHECKBOX NAME=" + i + " VALUE=" + folder + "/" + name + ">" + name + "<BR>\n");
                        i++;
                    }
                    if ((boolean)(Object)(thisFile.isDirectory()) && (!name.startsWith(".")) && (!name.endsWith("."))) {
                        int subStr = folder.lastIndexOf((String)(String)(Object) user.workingPubName);
                        String tempFolderName = "";
                        if (subStr > -1) {
                            tempFolderName = folder.substring(subStr);
                        } else {
                            tempFolderName = folder;
                        }
                        folders.append("<LI><A HREF=\'/tools/?mode=" + fromMode + "&hl=templates_view_templates_images&fromFolder=" + folder + "/" + name + "\'>" + tempFolderName + "/" + name + "</A><BR>");
                    }
                }
                ftp.logout();
                ftp.disconnect();
            } catch (java.io.UncheckedIOException e) {
                return ("CofaxToolsFTP getUploadDeleteComboBox cannot read directory: " + folder);
            }
        } catch (UncheckedIOException e) {
            return ("Could not connect to server: " + e);
        }
        links.append("<INPUT TYPE=HIDDEN NAME=numElements VALUE=" + i + " >\n");
        links.append("<INPUT TYPE=SUBMIT VALUE=\"" + action + " " + object + "\">\n");
        return (folders.toString() + links.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

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
	public MyHelperClass listFiles(CofaxToolsNTFileListParser o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class CofaxToolsUser {
public MyHelperClass workingPubName;
	public MyHelperClass workingPubConfigElementsHash;
}

class ArrayList {

public MyHelperClass get(int o0){ return null; }}

class FTPFile {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class CofaxToolsNTFileListParser {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
