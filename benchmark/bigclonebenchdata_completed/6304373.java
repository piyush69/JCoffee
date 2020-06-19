
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6304373 {
public static MyHelperClass CofaxToolsUtil;
	public static MyHelperClass FTPReply;
	public static MyHelperClass splitServers(String o0){ return null; }
	public static MyHelperClass stripName(String o0){ return null; }
	public static MyHelperClass stripPath(String o0){ return null; }
//public MyHelperClass CofaxToolsUtil;
//	public MyHelperClass FTPReply;
	public MyHelperClass CofaxToolsServlet;
//	public MyHelperClass splitServers(String o0){ return null; }
//	public MyHelperClass stripName(String o0){ return null; }
//	public MyHelperClass stripPath(String o0){ return null; }

    public static String uploadOrDeleteMediaOrTemplates(String action, String object, String numElements, HttpServletRequest req, HttpSession session) {
        FTPClient ftp = new FTPClient();
        CofaxToolsUser user = (CofaxToolsUser)(CofaxToolsUser)(Object) session.getAttribute("user");
        StringBuffer links = new StringBuffer();
        StringBuffer folders = new StringBuffer();
        String folder = "";
        String server = "";
        String login = "";
        String password = "";
        MyHelperClass CofaxToolsServlet = new MyHelperClass();
        String fileTransferFolder =(String)(Object) CofaxToolsServlet.fileTransferFolder;
        String liveFolder = "";
        ArrayList servers = new ArrayList();
        StringBuffer message = new StringBuffer();
        message.append("Status:<BR>");
        if (action.equals("Upload")) {
            server = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTFTPSERVER");
            login = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTFTPLOGIN");
            password = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTFTPPASSWORD");
            if (object.equals("Media")) {
                folder = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTIMAGESFOLDER");
            }
            if (object.equals("Templates")) {
                folder = (String)(String)(Object) user.workingPubConfigElementsHash.get("TESTTEMPLATEFOLDER");
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
        ArrayList al = new ArrayList();
        int numElement = Integer.parseInt(numElements);
        for (int i = 0; i < numElement; i++) {
            String key = String.valueOf(i);
            String file =(String)(Object) req.getParameter(key);
            if (file != null) {
                al.add(file);
            }
        }
        if (action.equals("Upload")) {
            try {
                int reply;
                ftp.connect(server);
                MyHelperClass CofaxToolsUtil = new MyHelperClass();
                CofaxToolsUtil.log((String)(Object)ftp.getReplyString());
                reply =(int)(Object) ftp.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                    ftp.disconnect();
                    return ("FTP server refused connection.");
                } else {
                    ftp.login(login, password);
                }
                for (int ii = 0; ii < (int)(Object)al.size(); ii++) {
                    String fileName = (String)(String)(Object) al.get(ii);
                    String folderName =(String)(Object) stripName(fileName);
                    fileName =(String)(Object) stripPath(fileName);
                    try {
                        ftp.changeWorkingDirectory(folderName);
                        OutputStream output;
                        output =(OutputStream)(Object) new FileOutputStream(fileTransferFolder + fileName);
                        ftp.retrieveFile(fileName, output);
                        CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates retrieving file: " + ftp.getReplyString());
                        message.append("Retrieving file " + fileName + " to local disk.<BR>");
                        output.close();
                    } catch (java.io.UncheckedIOException e) {
                        return ("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: cannot write file" + e);
                    }
                }
                ftp.logout();
                ftp.disconnect();
            } catch (UncheckedIOException e) {
                CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: Could not connect to server: " + e);
                return ("Could not connect to server: " + e);
            }
            login = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPLOGIN");
            password = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPPASSWORD");
            if (object.equals("Media")) {
                server = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEIMAGESSERVER");
                liveFolder = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEIMAGESFOLDER");
            }
            if (object.equals("Templates")) {
                server = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVEFTPSERVER");
                liveFolder = (String)(String)(Object) user.workingPubConfigElementsHash.get("LIVETEMPLATEFOLDER");
            }
            servers =(ArrayList)(Object) splitServers(server);
            for (int iii = 0; iii < (int)(Object)servers.size(); iii++) {
                try {
                    int reply;
                    String connectServer = (String)(String)(Object) servers.get(iii);
                    ftp.connect(connectServer);
                    CofaxToolsUtil.log((String)(Object)ftp.getReplyString());
                    reply =(int)(Object) ftp.getReplyCode();
                    if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                        ftp.disconnect();
                        CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: server refused connection: " + connectServer);
                        return ("CofaxToolsFTP uploadOrDeleteMediaOrTemplates FTP server refused connection.");
                    } else {
                        ftp.login(login, password);
                    }
                    for (int ii = 0; ii < (int)(Object)al.size(); ii++) {
                        String fileName = (String)(String)(Object) al.get(ii);
                        CofaxToolsUtil.log("Original String " + fileName);
                        CofaxToolsUtil.log("Search for " + folder);
                        CofaxToolsUtil.log("Replace " + liveFolder);
                        String folderName =(String)(Object) CofaxToolsUtil.replace(fileName, folder, liveFolder);
                        CofaxToolsUtil.log("Results: " + folderName);
                        folderName =(String)(Object) stripName(folderName);
                        fileName =(String)(Object) stripPath(fileName);
                        try {
                            InputStream io;
                            io =(InputStream)(Object) new FileInputStream(fileTransferFolder + fileName);
                            CofaxToolsUtil.log("Reading file : " + fileTransferFolder + fileName);
                            boolean directoryExists =(boolean)(Object) ftp.changeWorkingDirectory(folderName);
                            if (directoryExists == false) {
                                CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates directory: " + folderName + " does not exist. Attempting to create.");
                                message.append("Directory: " + folderName + " does not exist. Attempting to create.<BR>");
                                boolean canCreatDir =(boolean)(Object) ftp.makeDirectory(folderName);
                                CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates results: " + canCreatDir);
                                message.append("Results: " + canCreatDir + "<BR>");
                            }
                            boolean isStored =(boolean)(Object) ftp.storeFile(fileName, io);
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates storing file: " + fileName + " in directory: " + folderName);
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates on server : " + connectServer);
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates results: " + isStored + " : " + ftp.getReplyString());
                            message.append("Storing file " + fileName + "<BR> to location " + folderName + "<BR> on server " + connectServer + ".<BR>");
                        } catch (java.io.UncheckedIOException e) {
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates cannot upload file" + fileName + "<BR>To path: " + folderName + "<BR>On server " + connectServer);
                            return ("Cannot upload file" + fileName + "<BR>To path: " + folderName + "<BR>On server " + connectServer);
                        }
                    }
                    ftp.logout();
                    ftp.disconnect();
                    message.append("Success<BR><BR>");
                } catch (UncheckedIOException e) {
                    CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates could not connect to server: " + e);
                    return ("Could not connect to server: " + e);
                }
            }
            if (object.equals("Templates")) {
                String cSServers = (String)(String)(Object) user.workingPubConfigElementsHash.get("CACHESERVERS");
                System.out.println("getting cache servers: " + cSServers);
                ArrayList cServers =(ArrayList)(Object) splitServers(cSServers);
                for (int iiii = 0; iiii < (int)(Object)cServers.size(); iiii++) {
                    String thisClearCacheServer = (String)(String)(Object) cServers.get(iiii);
                    try {
                        String connectServer = (String)(String)(Object) cServers.get(iiii);
                        for (int iiiii = 0; iiiii < (int)(Object)al.size(); iiiii++) {
                            String thisFilePath = (String)(String)(Object) al.get(iiiii);
                            String folderNameFileName =(String)(Object) CofaxToolsUtil.replace(thisFilePath, folder, liveFolder);
                            String URLToClear = CofaxToolsServlet.removeTemplateCache + folderNameFileName;
                            CofaxToolsClearCache clear = new CofaxToolsClearCache("HTTP://" + thisClearCacheServer + URLToClear);
                            clear.start();
                            message.append("Clearing Cache for " + folderNameFileName + "<BR>");
                            message.append("on server " + thisClearCacheServer + "<BR>Success<BR><BR>");
                        }
                    } catch (Exception e) {
                        CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: could not connect to server clearing cache " + e);
                    }
                }
            }
            for (int i = 0; i < (int)(Object)al.size(); i++) {
                String fileName = (String)(String)(Object) al.get(i);
                String folderName =(String)(Object) stripName(fileName);
                fileName =(String)(Object) stripPath(fileName);
                File file = new File(fileTransferFolder + fileName);
                boolean delete =(boolean)(Object) file.delete();
                CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates deleting file from local drive: " + fileTransferFolder + fileName);
                CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates results: " + delete);
            }
        }
        servers =(ArrayList)(Object) splitServers(server);
        if (action.equals("Delete")) {
            for (int iii = 0; iii < (int)(Object)servers.size(); iii++) {
                try {
                    int reply;
                    String connectServer = (String)(String)(Object) servers.get(iii);
                    ftp.connect(connectServer);
                    CofaxToolsUtil.log((String)(Object)ftp.getReplyString());
                    reply =(int)(Object) ftp.getReplyCode();
                    if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                        ftp.disconnect();
                        CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: FTP server refused connection: " + connectServer);
                        return ("FTP server refused connection.");
                    } else {
                        ftp.login(login, password);
                    }
                    for (int ii = 0; ii < (int)(Object)al.size(); ii++) {
                        String fileName = (String)(String)(Object) al.get(ii);
                        String folderName =(String)(Object) stripName(fileName);
                        fileName =(String)(Object) stripPath(fileName);
                        try {
                            ftp.changeWorkingDirectory(folderName);
                            ftp.deleteFile(fileName);
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates deleting file: " + fileName + " from directory: " + folderName);
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates on server : " + connectServer);
                            CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates results: " + ftp.getReplyString());
                            message.append("Deleting file " + fileName + "<BR>");
                            message.append("from folder " + folderName + "<BR>");
                            message.append("on server " + connectServer + "<BR>");
                        } catch (java.io.UncheckedIOException e) {
                            return ("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: cannot delete file" + fileName);
                        }
                    }
                    message.append("Success<BR><BR>");
                    ftp.logout();
                    ftp.disconnect();
                } catch (UncheckedIOException e) {
                    CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR: Could not connect to server: " + e);
                    return ("Could not connect to server: " + e);
                }
            }
            if (object.equals("Templates")) {
                String cISServers = (String)(String)(Object) user.workingPubConfigElementsHash.get("CACHESERVERS");
                ArrayList cIServers =(ArrayList)(Object) splitServers(cISServers);
                for (int iiiiii = 0; iiiiii < (int)(Object)cIServers.size(); iiiiii++) {
                    String thisClearCacheIServer = (String)(String)(Object) cIServers.get(iiiiii);
                    try {
                        String connectServer = (String)(String)(Object) cIServers.get(iiiiii);
                        for (int iiiiiii = 0; iiiiiii < (int)(Object)al.size(); iiiiiii++) {
                            String thisFilePathI = (String)(String)(Object) al.get(iiiiiii);
                            String URLToClearI = CofaxToolsServlet.removeTemplateCache + thisFilePathI;
                            CofaxToolsClearCache clearI = new CofaxToolsClearCache("HTTP://" + thisClearCacheIServer + URLToClearI);
                            clearI.start();
                            message.append("Clearing Cache for " + thisFilePathI + "<BR>");
                            message.append("on server " + thisClearCacheIServer + "<BR>Success<BR><BR>");
                        }
                    } catch (Exception e) {
                        CofaxToolsUtil.log("CofaxToolsFTP uploadOrDeleteMediaOrTemplates ERROR clearing cache " + e);
                    }
                }
            }
        }
        return (message.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass removeTemplateCache;
	public MyHelperClass fileTransferFolder;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass replace(String o0, String o1, String o2){ return null; }
	public MyHelperClass log(String o0){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }}

class HttpSession {

public MyHelperClass getAttribute(String o0){ return null; }}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass deleteFile(String o0){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass retrieveFile(String o0, OutputStream o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class CofaxToolsUser {
public MyHelperClass workingPubConfigElementsHash;
}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class CofaxToolsClearCache {

CofaxToolsClearCache(String o0){}
	CofaxToolsClearCache(){}
	public MyHelperClass start(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}
