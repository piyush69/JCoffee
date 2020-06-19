
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20282676 {
public MyHelperClass deleteFtpFile(FTPClient o0, FTPFile[] o1, File[] o2){ return null; }
	public MyHelperClass isExist(FTPFile[] o0, File o1){ return null; }

    public boolean processFtp(String serverIp, int port, String user, String password, String synchrnPath, String filePath, File[] uploadFile) throws Exception {
        boolean upload = false;
        try {
            FTPClient ftpClient = new FTPClient();
            ftpClient.setControlEncoding("euc-kr");
            MyHelperClass EgovWebUtil = new MyHelperClass();
            if (!(Boolean)(Object)EgovWebUtil.isIPAddress(serverIp)) {
                throw new RuntimeException("IP is needed. (" + serverIp + ")");
            }
            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress host =(InetAddress)(Object) InetAddress.getByName(serverIp);
            ftpClient.connect(host, port);
            if (!(Boolean)(Object)ftpClient.login(user, password)) throw new Exception("FTP Client Login Error : \n");
            if (synchrnPath.length() != 0) ftpClient.changeWorkingDirectory(synchrnPath);
            FTPFile[] fTPFile =(FTPFile[])(Object) ftpClient.listFiles(synchrnPath);
            FileInputStream fis = null;
            try {
                for (int i = 0; i < uploadFile.length; i++) {
                    if ((boolean)(Object)uploadFile[i].isFile()) {
                        if (!(Boolean)(Object)isExist(fTPFile, uploadFile[i])) {
                            fis = new FileInputStream(uploadFile[i]);
                            ftpClient.storeFile(synchrnPath + uploadFile[i].getName(), fis);
                        }
                        if (fis != null) {
                            fis.close();
                        }
                    }
                }
                fTPFile =(FTPFile[])(Object) ftpClient.listFiles(synchrnPath);
                deleteFtpFile(ftpClient, fTPFile, uploadFile);
                upload = true;
            } catch (UncheckedIOException ex) {
                System.out.println(ex);
            } finally {
                if (fis != null) try {
                    fis.close();
                } catch (UncheckedIOException ignore) {
                    System.out.println("IGNORE: " + ignore);
                }
            }
            ftpClient.logout();
        } catch (Exception e) {
            System.out.println(e);
            upload = false;
        }
        return upload;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getByName(String o0){ return null; }
	public MyHelperClass isIPAddress(String o0){ return null; }}

class File {

public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FTPClient {

public MyHelperClass setControlEncoding(String o0){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(InetAddress o0, int o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class InetAddress {

}

class FTPFile {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
