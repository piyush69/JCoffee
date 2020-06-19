
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9962135 {

    public static void main(String[] args) {
        System.out.println(args.length);
        FTPClient ftp = new FTPClient();
        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter((PrintStream)(Object)System.out)));
        try {
            ftp.connect("localhost");
            ftp.login("ethan", "ethan");
            MyHelperClass FTP = new MyHelperClass();
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ftp.enterLocalPassiveMode();
            InputStream input;
            input =(InputStream)(Object) new FileInputStream("d:/tech/webwork-2.2.7.zip");
            boolean is =(boolean)(Object) ftp.storeFile("backup/webwork-2.2.7.zip", input);
            input.close();
            System.out.println(is);
            FTPFile[] files =(FTPFile[])(Object) ftp.listFiles("backup");
            for (FTPFile ftpFile : files) {
                long time =(long)(Object) ftpFile.getTimestamp().getTimeInMillis();
                long days = (System.currentTimeMillis() - time) / (1000 * 60 * 60 * 24);
                if (days > 30) {
                    System.out.println(ftpFile.getName() + "is a old file");
                    ftp.deleteFile("backup/" + ftpFile.getName());
                } else {
                    System.out.println(ftpFile.getName() + "is a new file");
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            try {
                ftp.logout();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getTimeInMillis(){ return null; }}

class FTPClient {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass storeFile(String o0, InputStream o1){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass deleteFile(String o0){ return null; }
	public MyHelperClass addProtocolCommandListener(PrintCommandListener o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class PrintCommandListener {

PrintCommandListener(PrintWriter o0){}
	PrintCommandListener(){}}

class PrintWriter {

PrintWriter(){}
	PrintWriter(PrintStream o0){}}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FTPFile {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getTimestamp(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class PrintStream {

}
