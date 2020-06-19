
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13017908 {

    public static boolean downFile(String url, String username, String password, String remotePath, Date DBLastestDate, String localPath) {
        File dFile = new File(localPath);
        if (!(Boolean)(Object)dFile.exists()) {
            dFile.mkdir();
        }
        boolean success = false;
        FTPClient ftp = new FTPClient();
        MyHelperClass connectTimeout = new MyHelperClass();
        ftp.setConnectTimeout(connectTimeout);
        System.out.println("FTP begin!!");
        try {
            int reply;
            ftp.connect(url);
            ftp.login(username, password);
            reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                return success;
            }
            ftp.changeWorkingDirectory(remotePath);
            String[] filesName =(String[])(Object) ftp.listNames();
            if (DBLastestDate == null) {
                System.out.println(" 初次下载，全部下载 ");
                for (String string : filesName) {
                    if (!string.matches("[0-9]{12}")) {
                        continue;
                    }
                    File localFile = new File(localPath + "/" + string);
                    OutputStream is =(OutputStream)(Object) new FileOutputStream(localFile);
                    ftp.retrieveFile(string, is);
                    is.close();
                }
            } else {
                System.out.println(" 加一下载 ");
                Date date = DBLastestDate;
                long ldate =(long)(Object) date.getTime();
                Date nowDate = new Date();
                MyHelperClass Constants = new MyHelperClass();
                String nowDateStr =(String)(Object) Constants.DatetoString(nowDate, Constants.Time_template_LONG);
                String fileName;
                do {
                    ldate += 60 * 1000;
                    Date converterDate = new Date(ldate);
//                    MyHelperClass Constants = new MyHelperClass();
                    fileName =(String)(Object) Constants.DatetoString(converterDate, Constants.Time_template_LONG);
                    File localFile = new File(localPath + "/" + fileName);
                    OutputStream is =(OutputStream)(Object) new FileOutputStream(localFile);
                    if (!(Boolean)(Object)ftp.retrieveFile(fileName, is)) {
                        localFile.delete();
                    }
                    is.close();
                } while (fileName.compareTo(nowDateStr) < 0);
            }
            ftp.logout();
            success = true;
        } catch (UncheckedIOException e) {
            System.out.println("FTP timeout return");
            e.printStackTrace();
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        return success;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass Time_template_LONG;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass DatetoString(Date o0, MyHelperClass o1){ return null; }}

class Date {

Date(){}
	Date(long o0){}
	public MyHelperClass getTime(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FTPClient {

public MyHelperClass isConnected(){ return null; }
	public MyHelperClass listNames(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass retrieveFile(String o0, OutputStream o1){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
