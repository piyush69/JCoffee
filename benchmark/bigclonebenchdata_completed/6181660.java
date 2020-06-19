import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6181660 {
public MyHelperClass UserException;
	public MyHelperClass ChellowLogger;
	public MyHelperClass Level;
	public MyHelperClass FTPReply;
	public MyHelperClass FTPFile;
	public MyHelperClass hhImporter;
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass getUri(){ return null; }
	public MyHelperClass getContract(){ return null; }

    public void run()  throws Throwable {
        FTPClient ftp = null;
        try {
            StarkHhDownloaderEtcProperties etcProperties = new StarkHhDownloaderEtcProperties(getUri());
            StarkHhDownloaderVarProperties varProperties = new StarkHhDownloaderVarProperties(getUri());
            ftp = new FTPClient();
            int reply;
            ftp.connect(etcProperties.getHostname());
            log("Connecting to ftp server at " + etcProperties.getHostname() + ".");
            log("Server replied with '" + ftp.getReplyString() + "'.");
            reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                throw(Throwable)(Object) UserException.newOk("FTP server refused connection.");
            }
            log("Connected to server, now logging in.");
            ftp.login(etcProperties.getUsername(), etcProperties.getPassword());
            log("Server replied with '" + ftp.getReplyString() + "'.");
            List<String> directories =(List<String>)(Object) etcProperties.getDirectories();
            for (int i = 0; i < directories.size(); i++) {
                log("Checking the directory '" + directories.get(i) + "'.");
                boolean found = false;
                FTPFile[] filesArray =(FTPFile[])(Object) ftp.listFiles(directories.get(i));
                List<FTPFile> files = Arrays.asList(filesArray);
                Collections.sort(files, new Comparator<FTPFile>() {

                    public int compare(FTPFile file1, FTPFile file2) {
                        if (file2.getTimestamp().getTime().equals(file1.getTimestamp().getTime())) {
                            return(int)(Object) file2.getName().compareTo(file1.getName());
                        } else {
                            return(int)(Object) file1.getTimestamp().getTime().compareTo(file2.getTimestamp().getTime());
                        }
                    }
                });
                for (FTPFile file : files) {
                    if (file.getType() ==(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) FTPFile.FILE_TYPE && (varProperties.getLastImportDate(i) == null ? true : (file.getTimestamp().getTime().equals(varProperties.getLastImportDate(i).getDate()) ?(int)(Object) file.getName().compareTo(varProperties.getLastImportName(i)) < 0 : file.getTimestamp().getTime().after(varProperties.getLastImportDate(i).getDate())))) {
                        String fileName = directories.get(i) + "\\" + file.getName();
                        if ((int)(Object)file.getSize() == 0) {
                            log("Ignoring '" + fileName + "'because it has zero length");
                        } else {
                            log("Attempting to download '" + fileName + "'.");
                            InputStream is =(InputStream)(Object) ftp.retrieveFileStream(fileName);
                            if (is == null) {
                                reply =(int)(Object) ftp.getReplyCode();
                                throw(Throwable)(Object) UserException.newOk("Can't download the file '" + file.getName() + "', server says: " + reply + ".");
                            }
                            log("File stream obtained successfully.");
                            hhImporter =(MyHelperClass)(Object) new HhDataImportProcess(getContract().getId(), new Long(0), is, fileName + ".df2", file.getSize());
                            hhImporter.run();
                            List<VFMessage> messages =(List<VFMessage>)(Object) hhImporter.getMessages();
                            hhImporter = null;
                            if (messages.size() > 0) {
                                for (VFMessage message : messages) {
                                    log((String)(Object)message.getDescription());
                                }
                                throw(Throwable)(Object) UserException.newInvalidParameter("Problem loading file.");
                            }
                        }
                        if (!(Boolean)(Object)ftp.completePendingCommand()) {
                            throw(Throwable)(Object) UserException.newOk("Couldn't complete ftp transaction: " + ftp.getReplyString());
                        }
                        varProperties.setLastImportDate(i, new MonadDate(file.getTimestamp().getTime()));
                        varProperties.setLastImportName(i, file.getName());
                        found = true;
                    }
                }
                if (!found) {
                    log("No new files found.");
                }
            }
        } catch (UserException e) {
            try {
                log(e.getVFMessage().getDescription());
            } catch (ProgrammerException e1) {
                throw new RuntimeException(e1);
            } catch (UserException e1) {
                throw new RuntimeException(e1);
            }
        } catch (IOException e) {
            try {
                log(e.getMessage());
            } catch (ProgrammerException e1) {
                throw new RuntimeException(e1);
            } catch (UserException e1) {
                throw new RuntimeException(e1);
            }
        } catch (Throwable e) {
            try {
                log("Exception: " + e.getClass().getName() + " Message: " + e.getMessage());
            } catch (ProgrammerException e1) {
                throw new RuntimeException(e1);
            } catch (UserException e1) {
                throw new RuntimeException(e1);
            }
            ChellowLogger.getLogger().logp(Level.SEVERE, "ContextListener", "contextInitialized", "Can't initialize context.", e);
        } finally {
            if (ftp != null && (boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.logout();
                    ftp.disconnect();
                    log("Logged out.");
                } catch (IOException ioe) {
                } catch (ProgrammerException e) {
                } catch (UserException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass FILE_TYPE;
public MyHelperClass logp(MyHelperClass o0, String o1, String o2, String o3, Throwable o4){ return null; }
	public MyHelperClass newOk(String o0){ return null; }
	public MyHelperClass run(){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass getDate(){ return null; }
	public MyHelperClass newInvalidParameter(String o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass compareTo(MyHelperClass o0){ return null; }
	public MyHelperClass after(MyHelperClass o0){ return null; }
	public MyHelperClass getMessages(){ return null; }}

class FTPClient {

public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass getReplyString(){ return null; }}

class StarkHhDownloaderEtcProperties {

StarkHhDownloaderEtcProperties(MyHelperClass o0){}
	StarkHhDownloaderEtcProperties(){}
	public MyHelperClass getHostname(){ return null; }
	public MyHelperClass getDirectories(){ return null; }
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class StarkHhDownloaderVarProperties {

StarkHhDownloaderVarProperties(MyHelperClass o0){}
	StarkHhDownloaderVarProperties(){}
	public MyHelperClass setLastImportDate(int o0, MonadDate o1){ return null; }
	public MyHelperClass getLastImportName(int o0){ return null; }
	public MyHelperClass setLastImportName(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass getLastImportDate(int o0){ return null; }}

class FTPFile {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getTimestamp(){ return null; }}

class HhDataImportProcess {

HhDataImportProcess(MyHelperClass o0, Long o1, InputStream o2, String o3, MyHelperClass o4){}
	HhDataImportProcess(){}}

class VFMessage {

public MyHelperClass getDescription(){ return null; }}

class MonadDate {

MonadDate(MyHelperClass o0){}
	MonadDate(){}}

class UserException extends Exception{
	public UserException(String errorMessage) { super(errorMessage); }
}

class ProgrammerException extends Exception{
	public ProgrammerException(String errorMessage) { super(errorMessage); }
}
