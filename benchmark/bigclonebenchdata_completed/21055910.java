import java.io.*;
import java.lang.*;
import java.util.*;



class c21055910 {
public static MyHelperClass Shared;
	public static MyHelperClass now4backup(){ return null; }
public MyHelperClass Constants;
//	public MyHelperClass Shared;
//	public MyHelperClass now4backup(){ return null; }

    protected static void createBackup() throws IOException, IllegalStateException, FTPIllegalReplyException, FTPException, FileNotFoundException, FTPDataTransferException, FTPAbortedException {
        MyHelperClass Constants = new MyHelperClass();
        String cmd = "mysqldump -u " + Constants.dbUser + " -p" + Constants.dbPassword + " " + Constants.dbName + " > " + Constants.tmpDir + "Backup.sql";
//        MyHelperClass Constants = new MyHelperClass();
        FileWriter fstream = new FileWriter((String)(Object)(int)(Object)Constants.tmpDir + (int)(Object)Constants.tmpScript);
        BufferedWriter out = new BufferedWriter(fstream);
        out.write(cmd);
        out.close();
//        MyHelperClass Constants = new MyHelperClass();
        Process process = Runtime.getRuntime().exec((String)(Object)(int)(Object)Constants.tmpDir + (int)(Object)Constants.tmpScript);
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        while (br.readLine() != null) {
            ;
        }
        String fileName =(String)(Object) now4backup();
        cmd = "\"C:\\Archivos de programa\\WinRAR\\Rar.exe\" a -m5 -ed " + Constants.tmpDir + fileName + " " + Constants.tmpDir + "Backup.sql";
        process = Runtime.getRuntime().exec(cmd);
        is = process.getInputStream();
        isr = new InputStreamReader(is);
        br = new BufferedReader(isr);
        while (br.readLine() != null) {
            ;
        }
        FTPClient client = new FTPClient();
        client.connect(Constants.ftpBackupAddr);
        client.login(Constants.ftpBackupUser, Constants.ftpBackupPassword);
        client.changeDirectory("/" + Shared.getConfig("storeName"));
        File f = new File(Constants.tmpDir + fileName);
        client.upload(f);
        client.disconnect(false);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ftpBackupPassword;
	public MyHelperClass tmpDir;
	public MyHelperClass dbUser;
	public MyHelperClass dbName;
	public MyHelperClass ftpBackupUser;
	public MyHelperClass ftpBackupAddr;
	public MyHelperClass tmpScript;
	public MyHelperClass dbPassword;
public MyHelperClass getConfig(String o0){ return null; }}

class FTPIllegalReplyException extends Exception{
	public FTPIllegalReplyException(String errorMessage) { super(errorMessage); }
}

class FTPException extends Exception{
	public FTPException(String errorMessage) { super(errorMessage); }
}

class FTPDataTransferException extends Exception{
	public FTPDataTransferException(String errorMessage) { super(errorMessage); }
}

class FTPAbortedException extends Exception{
	public FTPAbortedException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass changeDirectory(String o0){ return null; }
	public MyHelperClass upload(File o0){ return null; }
	public MyHelperClass disconnect(boolean o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}
