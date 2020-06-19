import java.io.*;
import java.lang.*;
import java.util.*;



class c16475859 {
public MyHelperClass password;
	public MyHelperClass filename;
	public MyHelperClass port;

    public void ftpUpload() {
        FTPClient ftpclient = null;
        InputStream is = null;
        try {
            ftpclient = new FTPClient();
            MyHelperClass host = new MyHelperClass();
            ftpclient.connect(host, port);
            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass host = new MyHelperClass();
                logger.debug("FTP连接远程服务器：" + host);
            }
            MyHelperClass user = new MyHelperClass();
            ftpclient.login(user, password);
//            MyHelperClass logger = new MyHelperClass();
            if ((boolean)(Object)logger.isDebugEnabled()) {
//                MyHelperClass user = new MyHelperClass();
                logger.debug("登陆用户：" + user);
            }
            MyHelperClass FTP = new MyHelperClass();
            ftpclient.setFileType(FTP.BINARY_FILE_TYPE);
            MyHelperClass remotePath = new MyHelperClass();
            ftpclient.changeWorkingDirectory(remotePath);
            MyHelperClass localPath = new MyHelperClass();
            is = new FileInputStream(localPath + File.separator + filename);
            MyHelperClass filename = new MyHelperClass();
            ftpclient.storeFile(filename, is);
//            MyHelperClass remotePath = new MyHelperClass();
            logger.info("上传文件结束...路径：" + remotePath + "，文件名：" + filename);
            is.close();
            ftpclient.logout();
        } catch (IOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("上传文件失败", e);
        } finally {
            if ((boolean)(Object)ftpclient.isConnected()) {
                try {
                    ftpclient.disconnect();
                } catch (UncheckedIOException e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("断开FTP出错",(IOException)(Object) e);
                }
            }
            ftpclient = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class FTPClient {

public MyHelperClass changeWorkingDirectory(MyHelperClass o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass storeFile(MyHelperClass o0, InputStream o1){ return null; }}
