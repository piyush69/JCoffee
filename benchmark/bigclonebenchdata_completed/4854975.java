
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4854975 {
public MyHelperClass GeneralDAO;

    public void PutFile(ClientConnector cc, Map attributes) throws Exception {
        String destinationNode =(String)(Object) attributes.get("dest_name");
        String destinationUser =(String)(Object) attributes.get("dest_user");
        String destinationPassword =(String)(Object) attributes.get("dest_password");
        String destinationFile =(String)(Object) attributes.get("dest_file");
        String messageID =(String)(Object) attributes.get("messageID");
        String destinationFileType =(String)(Object) attributes.get("dest_file_type");
        Integer destinationPort = 21;
        String destinationPortString =(String)(Object) attributes.get("dest_port");
        if ((destinationPortString != null) && (destinationPortString.equals(""))) {
            try {
                destinationPort = Integer.parseInt(destinationPortString);
            } catch (Exception e) {
                destinationPort = 21;
                MyHelperClass log = new MyHelperClass();
                log.debug("Destination Port \"" + destinationPortString + "\" was not valid. Using Default (21)");
            }
        }
        MyHelperClass log = new MyHelperClass();
        log.info("Starting FTP push of \"" + destinationFile + "\" to \"" + destinationNode);
        if ((destinationUser == null) || (destinationUser.equals(""))) {
            List userDBVal =(List)(Object) GeneralDAO.getNodeValue(destinationNode, "ftpUser");
            if ((int)(Object)userDBVal.size() < 1) {
                MyHelperClass DEFAULTUSER = new MyHelperClass();
                destinationUser =(String)(Object) DEFAULTUSER;
            } else {
                destinationUser = (String)(String)(Object) userDBVal.get(0);
            }
        }
        if ((destinationPassword == null) || (destinationPassword.equals(""))) {
            List passwordDBVal =(List)(Object) GeneralDAO.getNodeValue(destinationNode, "ftpPassword");
            if ((int)(Object)passwordDBVal.size() < 1) {
                MyHelperClass DEFAULTPASSWORD = new MyHelperClass();
                destinationPassword =(String)(Object) DEFAULTPASSWORD;
            } else {
                destinationPassword = (String)(String)(Object) passwordDBVal.get(0);
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Getting Stage File ID");
        String stageFile = null;
        try {
            MyHelperClass STAGINGDIR = new MyHelperClass();
            stageFile = STAGINGDIR + "/" + GeneralDAO.getStageFile(messageID);
        } catch (Exception stageException) {
            throw new Exception("Failed to assign a staging file \"" + stageFile + "\" - ERROR: " + stageException);
        }
        InputStream in;
        try {
            in =(InputStream)(Object) new FileInputStream(stageFile);
        } catch (UncheckedIOException fileNFException) {
            throw new Exception("Failed to get the staging file \"" + stageFile + "\" - ERROR: " + fileNFException);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Sending File");
        FTPClient ftp = new FTPClient();
        try {
//            MyHelperClass log = new MyHelperClass();
            log.debug("Connecting");
            ftp.connect(destinationNode, destinationPort);
//            MyHelperClass log = new MyHelperClass();
            log.debug("Checking Status");
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                throw new Exception("Failed to connect to \"" + destinationNode + "\"  as user \"" + destinationUser + "\" - ERROR: " + ftp.getReplyString());
            }
//            MyHelperClass log = new MyHelperClass();
            log.debug("Logging In");
            if (!(Boolean)(Object)ftp.login(destinationUser, destinationPassword)) {
                ftp.disconnect();
                throw new Exception("Failed to connect to \"" + destinationNode + "\"  as user \"" + destinationUser + "\" - ERROR: Login Failed");
            }
        } catch (SocketException socketException) {
            throw new Exception("Failed to connect to \"" + destinationNode + "\"  as user \"" + destinationUser + "\" - ERROR: " + socketException);
        } catch (IOException ioe) {
            throw new Exception("Failed to connect to \"" + destinationNode + "\"  as user \"" + destinationUser + "\" - ERROR: " + ioe);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Performing Site Commands");
        MyHelperClass GeneralDAO = new MyHelperClass();
        Iterator siteIterator =(Iterator)(Object) GeneralDAO.getNodeValue(destinationNode, "ftpSite").iterator();
        while ((boolean)(Object)siteIterator.hasNext()) {
            String siteCommand = null;
            try {
                siteCommand = (String)(String)(Object) siteIterator.next();
                ftp.site(siteCommand);
            } catch (UncheckedIOException e) {
                throw new Exception("FTP \"site\" command \"" + siteCommand + "\" failed - ERROR: " + e);
            }
        }
        if (destinationFileType != null) {
            if (destinationFileType.equals("A")) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Set File Type to ASCII");
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.ASCII_FILE_TYPE);
            } else if (destinationFileType.equals("B")) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Set File Type to BINARY");
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.BINARY_FILE_TYPE);
            } else if (destinationFileType.equals("E")) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Set File Type to EBCDIC");
                MyHelperClass FTP = new MyHelperClass();
                ftp.setFileType(FTP.EBCDIC_FILE_TYPE);
            }
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Pushing File");
        OutputStream out = null;
        try {
            out =(OutputStream)(Object) ftp.storeFileStream(destinationFile);
            if (out == null) {
                throw new Exception("Failed send the file \"" + destinationFile + "\" to \"" + destinationNode + "\"  - ERROR: " + ftp.getReplyString());
            }
        } catch (IOException ioe2) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed to push the file \"" + destinationFile + "\" to \"" + destinationNode + "\"  - ERROR: " + ioe2);
        }
        DESCrypt decrypter = null;
        try {
            decrypter = new DESCrypt();
        } catch (Exception cryptInitError) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed to initialize the encrypt process - ERROR: " + cryptInitError);
        }
        try {
            decrypter.decrypt(in, out);
        } catch (Exception cryptError) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Send Error" + cryptError);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Logging Out");
        try {
            out.close();
            ftp.logout();
            in.close();
        } catch (UncheckedIOException ioe3) {
//            MyHelperClass log = new MyHelperClass();
            log.error("Failed close connection to \"" + destinationNode + "\"  - ERROR: " + ioe3);
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

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass storeFileStream(String o0){ return null; }
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

class OutputStream {

public MyHelperClass close(){ return null; }}

class DESCrypt {

public MyHelperClass decrypt(InputStream o0, OutputStream o1){ return null; }}
