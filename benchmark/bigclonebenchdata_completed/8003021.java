


class c8003021 {
public MyHelperClass getAddress(){ return null; }

//    @Override
    public void run() {
        URL url = null;
        FileOutputStream fos = null;
        FTPClient ftp = null;
        try {
            url = new URL(this.getAddress());
            String host =(String)(Object) url.getHost();
            MyHelperClass StringUtils = new MyHelperClass();
            String folder =(String)(Object) StringUtils.substringBeforeLast(url.getPath(), "/");
//            MyHelperClass StringUtils = new MyHelperClass();
            String fileName =(String)(Object) StringUtils.substringAfterLast(url.getPath(), "/");
            ftp = new FTPClient(host, 21);
            if (!(Boolean)(Object)ftp.connected()) {
                ftp.connect();
            }
            ftp.login("anonymous", "me@mymail.com");
            MyHelperClass logger = new MyHelperClass();
            logger.info("Connected to " + host + ".");
//            MyHelperClass logger = new MyHelperClass();
            logger.info((String)(Object)ftp.getLastValidReply().getReplyText());
//            MyHelperClass logger = new MyHelperClass();
            logger.debug("changing dir to " + folder);
            ftp.chdir(folder);
            MyHelperClass localFileName = new MyHelperClass();
            fos = new FileOutputStream(localFileName);
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Downloading file " + fileName + "...");
            MyHelperClass FTPTransferType = new MyHelperClass();
            ftp.setType(FTPTransferType.BINARY);
            ftp.get(fos, fileName);
//            MyHelperClass logger = new MyHelperClass();
            logger.info("Done.");
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(e.getMessage());
//            MyHelperClass logger = new MyHelperClass();
            logger.debug(e.getStackTrace());
        } finally {
            try {
                ftp.quit();
                fos.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY;
public MyHelperClass getReplyText(){ return null; }
	public MyHelperClass substringBeforeLast(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass debug(StackTraceElement[] o0){ return null; }
	public MyHelperClass substringAfterLast(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FTPClient {

FTPClient(String o0, int o1){}
	FTPClient(){}
	public MyHelperClass get(FileOutputStream o0, String o1){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass connected(){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getLastValidReply(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass chdir(String o0){ return null; }}
