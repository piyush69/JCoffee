
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4854974 {
public MyHelperClass GeneralDAO;

    public void GetFile(ClientConnector cc, Map attributes) throws Exception {
        MyHelperClass log = new MyHelperClass();
        log.debug("Starting FTP FilePull");
        String sourceNode =(String)(Object) attributes.get("src_name");
        String sourceUser =(String)(Object) attributes.get("src_user");
        String sourcePassword =(String)(Object) attributes.get("src_password");
        String sourceFile =(String)(Object) attributes.get("src_file");
        String messageID =(String)(Object) attributes.get("messageID");
        String sourceMD5 =(String)(Object) attributes.get("src_md5");
        String sourceFileType =(String)(Object) attributes.get("src_file_type");
        Integer sourcePort = 21;
        String sourcePortString =(String)(Object) attributes.get("src_port");
        if ((sourcePortString != null) && (sourcePortString.equals(""))) {
            try {
                sourcePort = Integer.parseInt(sourcePortString);
            } catch (Exception e) {
                sourcePort = 21;
//                MyHelperClass log = new MyHelperClass();
                log.debug("Destination Port \"" + sourcePortString + "\" was not valid. Using Default (21)");
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.info("Starting FTP pull of \"" + sourceFile + "\" from \"" + sourceNode);
        if ((sourceUser == null) || (sourceUser.equals(""))) {
            List userDBVal =(List)(Object) GeneralDAO.getNodeValue(sourceNode, "ftpUser");
            if ((int)(Object)userDBVal.size() < 1) {
                MyHelperClass DEFAULTUSER = new MyHelperClass();
                sourceUser =(String)(Object) DEFAULTUSER;
            } else {
                sourceUser = (String)(String)(Object) userDBVal.get(0);
            }
        }
        if ((sourcePassword == null) || (sourcePassword.equals(""))) {
            List passwordDBVal =(List)(Object) GeneralDAO.getNodeValue(sourceNode, "ftpPassword");
            if ((int)(Object)passwordDBVal.size() < 1) {
                MyHelperClass DEFAULTPASSWORD = new MyHelperClass();
                sourcePassword =(String)(Object) DEFAULTPASSWORD;
            } else {
                sourcePassword = (String)(String)(Object) passwordDBVal.get(0);
            }
        }
        String stageFile = null;
        int stageFileID;
        try {
            stageFileID =(int)(Object) GeneralDAO.getStageFile(messageID);
            MyHelperClass STAGINGDIR = new MyHelperClass();
            stageFile = STAGINGDIR + "/" + stageFileID;
        } catch (Exception e) {
            throw new Exception("Failed to assign a staging file \"" + stageFile + "\" - ERROR: " + e);
        }
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(stageFile);
        } catch (UncheckedIOException fileNFException) {
            throw new Exception("Failed to assign the staging file \"" + stageFile + "\" - ERROR: " + fileNFException);
        }
        FTPClient ftp = new FTPClient();
        try {
//            MyHelperClass log = new MyHelperClass();
            log.debug("Connecting");
            ftp.connect(sourceNode, sourcePort);
//            MyHelperClass log = new MyHelperClass();
            log.debug("Checking Status");
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new Exception("Failed to connect to \"" + sourceNode + "\"  as user \"" + sourceUser + "\" - ERROR: " + ftp.getReplyString());
            }
//            MyHelperClass log = new MyHelperClass();
            log.debug("Logging In");
            if (!(Boolean)(Object)ftp.login(sourceUser, sourcePassword)) {
                ftp.disconnect();
                throw new Exception("Failed to connect to \"" + sourceNode + "\"  as user \"" + sourceUser + "\" - ERROR: Login Failed");
            }
        } catch (SocketException socketException) {
            throw new Exception("Failed to connect to \"" + sourceNode + "\"  as user \"" + sourceUser + "\" - ERROR: " + socketException);
        } catch (IOException ioe) {
            throw new Exception("Failed to connect to \"" + sourceNode + "\"  as user \"" + sourceUser + "\" - ERROR: " + ioe);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Performing Site Commands");
        MyHelperClass GeneralDAO = new MyHelperClass();
        Iterator siteIterator =(Iterator)(Object) GeneralDAO.getNodeValue(sourceNode, "ftpSite").iterator();
        while ((boolean)(Object)siteIterator.hasNext()) {
            String siteCommand = null;
            try {
                siteCommand = (String)(String)(Object) siteIterator.next();
                ftp.site(siteCommand);
            } catch (UncheckedIOException e) {
                throw new Exception("FTP \"site\" command \"" + siteCommand + "\" failed - ERROR: " + e);
            }
        }
        if (sourceFileType != null) {
            if (sourceFileType.equals("A")) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Set File Type to ASCII");
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.ASCII_FILE_TYPE);
            } else if (sourceFileType.equals("B")) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Set File Type to BINARY");
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
            } else if (sourceFileType.equals("E")) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Set File Type to EBCDIC");
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.EBCDIC_FILE_TYPE);
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Opening the File Stream");
        InputStream in = null;
        try {
            in =(InputStream)(Object) ftp.retrieveFileStream(sourceFile);
            if (in == null) {
                throw new Exception("Failed get the file \"" + sourceFile + "\" from \"" + sourceNode + "\"  - ERROR: " + ftp.getReplyString());
            }
        } catch (IOException ioe2) {
            ftp.disconnect();
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed get the file \"" + sourceFile + "\" from \"" + sourceNode + "\"  - ERROR: " + ioe2);
            throw new Exception("Failed to retrieve file from \"" + sourceNode + "\"  as user \"" + sourceUser + "\" - ERROR: " + ioe2);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Starting the read");
        DESCrypt encrypter = null;
        try {
            encrypter = new DESCrypt();
        } catch (Exception cryptInitError) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed to initialize the encrypt process - ERROR: " + cryptInitError);
        }
        String receivedMD5 = null;
        try {
            Object[] returnValues =(Object[])(Object) encrypter.encrypt(in, fos);
            receivedMD5 = (String) returnValues[0];
//            MyHelperClass GeneralDAO = new MyHelperClass();
            GeneralDAO.setStageFileSize(stageFileID, (Long) returnValues[1]);
        } catch (Exception cryptError) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Encrypt Error: " + cryptError);
            throw new Exception("Encrypt Error: " + cryptError);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Logging Out");
        try {
            ftp.logout();
            fos.close();
        } catch (Exception ioe3) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed close connection to \"" + sourceNode + "\"  - ERROR: " + ioe3);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Setting the File Digest");
//        MyHelperClass GeneralDAO = new MyHelperClass();
        GeneralDAO.setStageFileDigest(stageFileID, receivedMD5);
        if ((sourceMD5 != null) && (!sourceMD5.equals(""))) {
//            MyHelperClass log = new MyHelperClass();
            log.debug("File DIGEST compare - Source: " + sourceMD5.toLowerCase() + " | Received: " + receivedMD5);
            if (!receivedMD5.equals(sourceMD5.toLowerCase())) {
                throw new Exception("MD5 validation on file failed.");
            }
        }
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EBCDIC_FILE_TYPE;
	public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass ASCII_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass setStageFileDigest(int o0, String o1){ return null; }
	public MyHelperClass setStageFileSize(int o0, Long o1){ return null; }
	public MyHelperClass getStageFile(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getNodeValue(String o0, String o1){ return null; }}

class ClientConnector {

}

class Map {

public MyHelperClass get(String o0){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(String o0, Integer o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass site(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class InputStream {

}

class DESCrypt {

public MyHelperClass encrypt(InputStream o0, FileOutputStream o1){ return null; }}
