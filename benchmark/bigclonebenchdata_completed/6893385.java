
import java.io.UncheckedIOException;


class c6893385 {
public MyHelperClass LogUtils;
	public MyHelperClass IOUtils;

//    @Override
    public void end() {
        MyHelperClass m_zipFormatter = new MyHelperClass();
        m_zipFormatter.end();
        MyHelperClass m_outputStream = new MyHelperClass();
        IOUtils.closeQuietly((FileInputStream)(Object)m_outputStream);
        final FTPClient ftp = new FTPClient();
        FileInputStream fis = null;
        try {
            MyHelperClass m_url = new MyHelperClass();
            if ((int)(Object)m_url.getPort() == -1 ||(int)(Object) m_url.getPort() == 0 || m_url.getPort() == m_url.getDefaultPort()) {
//                MyHelperClass m_url = new MyHelperClass();
                ftp.connect(m_url.getHost());
            } else {
//                MyHelperClass m_url = new MyHelperClass();
                ftp.connect(m_url.getHost(), m_url.getPort());
            }
//            MyHelperClass m_url = new MyHelperClass();
            if (m_url.getUserInfo() != null &&(int)(Object) m_url.getUserInfo().length() > 0) {
//                MyHelperClass m_url = new MyHelperClass();
                final String[] userInfo =(String[])(Object) m_url.getUserInfo().split(":", 2);
                ftp.login(userInfo[0], userInfo[1]);
            } else {
                ftp.login("anonymous", "opennmsftp@");
            }
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.errorf(this, "FTP server refused connection.");
                return;
            }
//            MyHelperClass m_url = new MyHelperClass();
            String path =(String)(Object) m_url.getPath();
            if (path.endsWith("/")) {
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.errorf(this, "Your FTP URL must specify a filename.");
                return;
            }
            File f = new File(path);
            path =(String)(Object) f.getParent();
            if (!(Boolean)(Object)ftp.changeWorkingDirectory(path)) {
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.infof(this, "unable to change working directory to %s", path);
                return;
            }
            MyHelperClass LogUtils = new MyHelperClass();
            LogUtils.infof(this, "uploading %s to %s", f.getName(), path);
            MyHelperClass FTP = new MyHelperClass();
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            MyHelperClass m_zipFile = new MyHelperClass();
            fis = new FileInputStream(m_zipFile);
            if (!(Boolean)(Object)ftp.storeFile(f.getName(), fis)) {
//                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.infof(this, "unable to store file");
                return;
            }
//            MyHelperClass LogUtils = new MyHelperClass();
            LogUtils.infof(this, "finished uploading");
        } catch (final Exception e) {
            MyHelperClass m_url = new MyHelperClass();
            LogUtils.errorf(this, e, "Unable to FTP file to %s", m_url);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fis);
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getUserInfo(){ return null; }
	public MyHelperClass getDefaultPort(){ return null; }
	public MyHelperClass end(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass errorf(c6893385 o0, String o1){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass split(String o0, int o1){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass closeQuietly(FileInputStream o0){ return null; }
	public MyHelperClass infof(c6893385 o0, String o1){ return null; }
	public MyHelperClass errorf(c6893385 o0, Exception o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass infof(c6893385 o0, String o1, MyHelperClass o2, String o3){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass infof(c6893385 o0, String o1, String o2){ return null; }}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass storeFile(MyHelperClass o0, FileInputStream o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
