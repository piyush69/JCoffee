
import java.io.UncheckedIOException;


class c16929855 {
public MyHelperClass SHORT_NAME;
	public MyHelperClass mstrSourceDirectory;
	public MyHelperClass mstrRemoteServer;
	public MyHelperClass mstrServerPwd;
	public MyHelperClass File;
	public MyHelperClass mstrServerUsr;
	public MyHelperClass mstrTargetDirectory;
	public MyHelperClass mstrFilename;
	public MyHelperClass FTPReply;
	public MyHelperClass getTaskPlugins(){ return null; }
	public MyHelperClass getFTPDefinition(){ return null; }
	public MyHelperClass getResources(){ return null; }

    public void runTask(HashMap pjobParms) throws Exception {
        FTPClient lftpClient = null;
        FileInputStream lfisSourceFile = null;
        JBJFPluginDefinition lpluginCipher = null;
        IJBJFPluginCipher theCipher = null;
        try {
            JBJFFTPDefinition lxmlFTP = null;
            if (getFTPDefinition() != null) {
                lxmlFTP =(JBJFFTPDefinition)(Object) getFTPDefinition();
                MyHelperClass mstrSourceDirectory = new MyHelperClass();
                this.mstrSourceDirectory = lxmlFTP.getSourceDirectory();
                MyHelperClass mstrTargetDirectory = new MyHelperClass();
                this.mstrTargetDirectory = lxmlFTP.getTargetDirectory();
                MyHelperClass mstrFilename = new MyHelperClass();
                this.mstrFilename = lxmlFTP.getFilename();
                MyHelperClass mstrRemoteServer = new MyHelperClass();
                this.mstrRemoteServer = lxmlFTP.getServer();
                if ((boolean)(Object)getResources().containsKey("plugin-cipher")) {
                    lpluginCipher = (JBJFPluginDefinition)(JBJFPluginDefinition)(Object) getResources().get("plugin-cipher");
                }
                if (lpluginCipher != null) {
                    theCipher =(IJBJFPluginCipher)(Object) getTaskPlugins().getCipherPlugin(lpluginCipher.getPluginId());
                }
                if (theCipher != null) {
                    MyHelperClass mstrServerUsr = new MyHelperClass();
                    this.mstrServerUsr = theCipher.decryptString(lxmlFTP.getUser());
                    MyHelperClass mstrServerPwd = new MyHelperClass();
                    this.mstrServerPwd = theCipher.decryptString(lxmlFTP.getPass());
                } else {
                    MyHelperClass mstrServerUsr = new MyHelperClass();
                    this.mstrServerUsr = lxmlFTP.getUser();
                    MyHelperClass mstrServerPwd = new MyHelperClass();
                    this.mstrServerPwd = lxmlFTP.getPass();
                }
            } else {
                throw new Exception("Work unit [ " + SHORT_NAME + " ] is missing an FTP Definition.  Please check" + " your JBJF Batch Definition file an make sure" + " this work unit has a <resource> element added" + " within the <task> element.");
            }
            lfisSourceFile = new FileInputStream((int)(Object)mstrSourceDirectory + (int)(Object)File.separator + (int)(Object)mstrFilename);
            lftpClient = new FTPClient();
            lftpClient.connect(mstrRemoteServer);
            lftpClient.setFileType(lxmlFTP.getFileTransferType());
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(lftpClient.getReplyCode())) {
                throw new Exception("FTP server [ " + mstrRemoteServer + " ] refused connection.");
            }
            if (!(Boolean)(Object)lftpClient.login(mstrServerUsr, mstrServerPwd)) {
                throw new Exception("Unable to login to server [ " + mstrTargetDirectory + " ].");
            }
            if (!(Boolean)(Object)lftpClient.changeWorkingDirectory(mstrTargetDirectory)) {
                throw new Exception("Unable to change to remote directory [ " + mstrTargetDirectory + "]");
            }
            lftpClient.enterLocalPassiveMode();
            if (!(Boolean)(Object)lftpClient.storeFile(mstrFilename, lfisSourceFile)) {
                throw new Exception("Unable to upload [ " + mstrSourceDirectory + "/" + mstrFilename + " ]" + " to " + mstrTargetDirectory + File.separator + mstrFilename + " to " + mstrRemoteServer);
            }
            lfisSourceFile.close();
            lftpClient.logout();
        } catch (Exception e) {
            throw e;
        } finally {
            if (lftpClient != null && (boolean)(Object)lftpClient.isConnected()) {
                try {
                    lftpClient.disconnect();
                } catch (UncheckedIOException ioe) {
                }
            }
            if (lfisSourceFile != null) {
                try {
                    lfisSourceFile.close();
                } catch (Exception e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass getCipherPlugin(MyHelperClass o0){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }}

class HashMap {

}

class FTPClient {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass storeFile(MyHelperClass o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FileInputStream {

FileInputStream(int o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class JBJFPluginDefinition {

public MyHelperClass getPluginId(){ return null; }}

class IJBJFPluginCipher {

public MyHelperClass decryptString(MyHelperClass o0){ return null; }}

class JBJFFTPDefinition {

public MyHelperClass getFilename(){ return null; }
	public MyHelperClass getFileTransferType(){ return null; }
	public MyHelperClass getUser(){ return null; }
	public MyHelperClass getPass(){ return null; }
	public MyHelperClass getTargetDirectory(){ return null; }
	public MyHelperClass getServer(){ return null; }
	public MyHelperClass getSourceDirectory(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
