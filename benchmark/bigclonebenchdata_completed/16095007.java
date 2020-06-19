


class c16095007 {
public static MyHelperClass saveInputStreamToFile(InputStream o0, File o1){ return null; }
public static MyHelperClass Log;
//	public MyHelperClass saveInputStreamToFile(InputStream o0, File o1){ return null; }
//public MyHelperClass Log;

    private static void getFileFtp(String user, String password, String host, int port, String fileName, String location) throws Exception {
        MyHelperClass NEW_LINE = new MyHelperClass();
        Log.info("\nretrieve " + fileName + NEW_LINE);
        FTPClient client = new FTPClient();
        client.connect(host, port);
        int reply =(int)(Object) client.getReplyCode();
        MyHelperClass FTPReply = new MyHelperClass();
        if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
            throw new Exception("FTP fail to connect");
        }
        if (!(Boolean)(Object)client.login(user, password)) {
            throw new Exception("FTP fail to login");
        }
        try {
            File locationFile = new File(location);
            File dest = new File(locationFile, fileName);
            if ((boolean)(Object)dest.exists()) {
                dest.delete();
            } else {
                locationFile.mkdirs();
            }
            boolean status =(boolean)(Object) client.changeWorkingDirectory("/");
//            MyHelperClass NEW_LINE = new MyHelperClass();
            Log.info("chdir-status:" + status + NEW_LINE);
            MyHelperClass FTPClient = new MyHelperClass();
            client.setFileTransferMode(FTPClient.BINARY_FILE_TYPE);
//            MyHelperClass FTPClient = new MyHelperClass();
            client.setFileType(FTPClient.BINARY_FILE_TYPE);
            client.enterLocalActiveMode();
            InputStream in =(InputStream)(Object) client.retrieveFileStream(fileName);
            if (in == null) {
                MyHelperClass Log = new MyHelperClass();
                Log.error("Input stream is null\n");
                throw new Exception("Fail to retrieve file " + fileName);
            }
            Thread.sleep(3000);
            saveInputStreamToFile(in, new File(location, fileName));
        } finally {
            client.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class FTPClient {

public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class File {

File(){}
	File(String o0, String o1){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class InputStream {

}
