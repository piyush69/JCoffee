
import java.io.UncheckedIOException;


class c10178421 {
public MyHelperClass password;
	public MyHelperClass FTPReply;
	public MyHelperClass logger;

//    @Override
    public void run() {
        File file;
        try {
            MyHelperClass filePath = new MyHelperClass();
            file = new File(filePath);
            if (!(Boolean)(Object)file.canWrite()) {
                Thread.sleep(5000);
                if (!(Boolean)(Object)file.canWrite()) {
//                    MyHelperClass filePath = new MyHelperClass();
                    logger.error("Filed to gain write access to file:" + filePath);
                    boolean exitState;// = new boolean();
                    exitState = false;
                    return;
                }
            }
            BufferedInputStream fis;// = new BufferedInputStream();
            fis = new BufferedInputStream(new FileInputStream(filePath));
        } catch (UncheckedIOException e) {
            MyHelperClass filePath = new MyHelperClass();
            logger.error("File not found:" + filePath);
            boolean exitState;// = new boolean();
            exitState = false;
            return;
        } catch (java.lang.InterruptedException ie) {
            MyHelperClass filePath = new MyHelperClass();
            logger.error("Upload thread halted or interrupted on file:" + filePath);
            boolean exitState;// = new boolean();
            exitState = false;
            return;
        }
        FTPClient ftp;// = new FTPClient();
        ftp = new FTPClient();
//        MyHelperClass ftp = new MyHelperClass();
        ftp.setDefaultTimeout(20 * 1000);
        boolean uploadSuccessful = false;
        try {
//            MyHelperClass ftp = new MyHelperClass();
            ftp.enterLocalPassiveMode();
            MyHelperClass ftpHostname = new MyHelperClass();
            ftp.connect(ftpHostname);
            MyHelperClass username = new MyHelperClass();
            ftp.login(username, password);
            MyHelperClass logger = new MyHelperClass();
            logger.trace("FTP Logged In and connected");
//            MyHelperClass ftp = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(ftp.getReplyCode())) {
                boolean exitState;// = new boolean();
                exitState = false;
                return;
            }
            MyHelperClass FTPClient = new MyHelperClass();
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
//            MyHelperClass logger = new MyHelperClass();
            logger.trace("FTP Timeout Set and File Type Set");
            MyHelperClass serverDirectory = new MyHelperClass();
            ftp.changeWorkingDirectory(serverDirectory);
            MyHelperClass fis = new MyHelperClass();
            ftp.storeUniqueFile(file.getName(), fis);
//            MyHelperClass logger = new MyHelperClass();
            logger.trace("File Uploaded");
//            MyHelperClass ftp = new MyHelperClass();
            if ((boolean)(Object)FTPReply.isPositiveIntermediate(ftp.getReplyCode())) {
                System.out.println("Completing pending command");
//                MyHelperClass ftp = new MyHelperClass();
                ftp.completePendingCommand();
            }
            uploadSuccessful = true;
        } catch (Exception e) {
            try {
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
            } catch (Exception de) {
                e.printStackTrace();
            }
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error uploading file:", e);
        } finally {
            try {
                MyHelperClass fis = new MyHelperClass();
                fis.close();
                MyHelperClass logger = new MyHelperClass();
                logger.trace("File closed");
//                MyHelperClass ftp = new MyHelperClass();
                ftp.logout();
//                MyHelperClass logger = new MyHelperClass();
                logger.trace("FTP Logged Out");
//                MyHelperClass ftp = new MyHelperClass();
                ftp.disconnect();
//                MyHelperClass logger = new MyHelperClass();
                logger.trace("FTP Disconnected");
                if (uploadSuccessful) {
                    MyHelperClass filePath = new MyHelperClass();
                    logger.info("Deleting file:" + new File(filePath).getName());
//                    MyHelperClass filePath = new MyHelperClass();
                    if (!(Boolean)(Object)(new File(filePath)).delete()) {
//                        MyHelperClass logger = new MyHelperClass();
                        logger.error("Can't delete file for some reason");
                    }
                    Thread.sleep(1000);
                    boolean exitState;// = new boolean();
                    exitState = true;
                    return;
                }
            } catch (Exception e) {
                MyHelperClass logger = new MyHelperClass();
                logger.error("Exception on file upload cleanup:", e);
                boolean exitState;// = new boolean();
                exitState = false;
                return;
            }
        }
        boolean exitState;// = new boolean();
        exitState = false;
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass storeUniqueFile(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass setDefaultTimeout(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isPositiveIntermediate(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass storeUniqueFile(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass setDefaultTimeout(int o0){ return null; }}
