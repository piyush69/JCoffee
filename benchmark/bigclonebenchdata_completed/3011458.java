


class c3011458 {

    public String FTPupload(String filepath) {
        String fileUrl = null;
        Long clicks = System.currentTimeMillis();
        String currentDateTimeString = clicks.toString();
        String[] tmpSplite = filepath.split("/");
        String filename = currentDateTimeString + tmpSplite[tmpSplite.length - 1];
        String host = "140.112.31.165:8080/sound/";
        MyHelperClass Log = new MyHelperClass();
        Log.d("test", "get in");
        FTPClient ftp = new FTPClient();
//        MyHelperClass Log = new MyHelperClass();
        Log.d("test", "initial ftp");
        try {
            ftp.connect("140.112.31.165");
            ftp.enterLocalPassiveMode();
//            MyHelperClass Log = new MyHelperClass();
            Log.d("test", "we connected");
            if (!(Boolean)(Object)ftp.login("tacowu", "4565686")) {
                ftp.logout();
                return fileUrl;
            }
            int replyCode =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(replyCode)) {
//                MyHelperClass Log = new MyHelperClass();
                Log.d("test", "get in trouble");
                ftp.disconnect();
                return fileUrl;
            }
//            MyHelperClass Log = new MyHelperClass();
            Log.d("test", "we logged in");
            ftp.setFileType(ftp.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            File file = new File(filepath);
//            MyHelperClass Log = new MyHelperClass();
            if (file == null) Log.d("test", "file open faild"); else Log.d("test", "file open sucess");
            FileInputStream aInputStream = new FileInputStream(file);
            boolean aRtn =(boolean)(Object) ftp.storeFile(filename, aInputStream);
            aInputStream.close();
            ftp.disconnect();
        } catch (Exception ex) {
        }
        fileUrl = host + filename;
        return fileUrl;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }}

class FTPClient {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass logout(){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}
