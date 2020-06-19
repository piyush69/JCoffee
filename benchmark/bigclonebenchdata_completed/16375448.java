


class c16375448 {

    protected void entryMatched(EntryMonitor monitor, Entry entry) {
        FTPClient ftpClient = new FTPClient();
        try {
            Resource resource =(Resource)(Object) entry.getResource();
            if (!(Boolean)(Object)resource.isFile()) {
                return;
            }
            MyHelperClass server = new MyHelperClass();
            if ((int)(Object)server.length() == 0) {
                return;
            }
            MyHelperClass password = new MyHelperClass();
            String passwordToUse =(String)(Object) monitor.getRepository().getPageHandler().processTemplate(password, false);
//            MyHelperClass server = new MyHelperClass();
            ftpClient.connect(server);
            MyHelperClass user = new MyHelperClass();
            if ((int)(Object)user.length() > 0) {
//                MyHelperClass user = new MyHelperClass();
                ftpClient.login(user, password);
            }
            int reply =(int)(Object) ftpClient.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
//                MyHelperClass server = new MyHelperClass();
                monitor.handleError("FTP server refused connection:" + server, null);
                return;
            }
            MyHelperClass FTP = new MyHelperClass();
            ftpClient.setFileType(FTP.IMAGE_FILE_TYPE);
            ftpClient.enterLocalPassiveMode();
            MyHelperClass directory = new MyHelperClass();
            if ((int)(Object)directory.length() > 0) {
//                MyHelperClass directory = new MyHelperClass();
                ftpClient.changeWorkingDirectory(directory);
            }
            MyHelperClass fileTemplate = new MyHelperClass();
            String filename =(String)(Object) monitor.getRepository().getEntryManager().replaceMacros(entry, fileTemplate);
            InputStream is =(InputStream)(Object) new BufferedInputStream(monitor.getRepository().getStorageManager().getFileInputStream(new File(resource.getPath())));
            boolean ok =(boolean)(Object) ftpClient.storeUniqueFile(filename, is);
            is.close();
            if (ok) {
//                MyHelperClass directory = new MyHelperClass();
                monitor.logInfo("Wrote file:" + directory + " " + filename);
            } else {
//                MyHelperClass directory = new MyHelperClass();
                monitor.handleError("Failed to write file:" + directory + " " + filename, null);
            }
        } catch (Exception exc) {
            MyHelperClass server = new MyHelperClass();
            monitor.handleError("Error posting to FTP:" + server, exc);
        } finally {
            try {
                ftpClient.logout();
            } catch (Exception exc) {
            }
            try {
                ftpClient.disconnect();
            } catch (Exception exc) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGE_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getStorageManager(){ return null; }
	public MyHelperClass getEntryManager(){ return null; }
	public MyHelperClass getFileInputStream(File o0){ return null; }
	public MyHelperClass processTemplate(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getPageHandler(){ return null; }
	public MyHelperClass replaceMacros(Entry o0, MyHelperClass o1){ return null; }}

class EntryMonitor {

public MyHelperClass logInfo(String o0){ return null; }
	public MyHelperClass getRepository(){ return null; }
	public MyHelperClass handleError(String o0, Exception o1){ return null; }
	public MyHelperClass handleError(String o0, Object o1){ return null; }}

class Entry {

public MyHelperClass getResource(){ return null; }}

class FTPClient {

public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass storeUniqueFile(String o0, InputStream o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class Resource {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class File {

File(MyHelperClass o0){}
	File(){}}
