
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3533515 {
public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass getWebserver(){ return null; }
	public MyHelperClass getSeminarID(){ return null; }
	public MyHelperClass getId(){ return null; }

    public boolean saveVideoXMLOnWebserver(String text) {
        boolean error = false;
        FTPClient ftp = new FTPClient();
        try {
            int reply;
            ftp.connect(this.getWebserver().getUrl());
            System.out.println("Connected to " + this.getWebserver().getUrl() + ".");
            System.out.print(ftp.getReplyString());
            reply =(int)(Object) ftp.getReplyCode();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                System.err.println("FTP server refused connection.");
                return false;
            }
            if (!(Boolean)(Object)ftp.login(this.getWebserver().getFtpBenutzer(), this.getWebserver().getFtpPasswort())) {
                System.err.println("FTP server: Login incorrect");
            }
            String tmpSeminarID =(String)(Object) this.getSeminarID();
            if (tmpSeminarID == null) tmpSeminarID = "unbekannt";
            try {
                ftp.changeWorkingDirectory(this.getWebserver().getDefaultPath() + "/" + tmpSeminarID + "/lectures/" + this.getId() + "/data");
            } catch (Exception e) {
                ftp.makeDirectory(this.getWebserver().getDefaultPath() + "/" + tmpSeminarID + "/lectures/" + this.getId() + "/data");
                ftp.changeWorkingDirectory(this.getWebserver().getDefaultPath() + "/" + tmpSeminarID + "/lectures/" + this.getId() + "/data");
            }
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ByteArrayInputStream videoIn = new ByteArrayInputStream(text.getBytes());
            ftp.enterLocalPassiveMode();
            ftp.storeFile("video.xml", videoIn);
            videoIn.close();
            ftp.logout();
            ftp.disconnect();
        } catch (UncheckedIOException e) {
            System.err.println("Job " + this.getId() + ": Datei video.xml konnte nicht auf Webserver kopiert werden.");
            error = true;
            e.printStackTrace();
        } finally {
            if ((boolean)(Object)ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (UncheckedIOException ioe) {
                }
            }
        }
        return error;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getFtpPasswort(){ return null; }
	public MyHelperClass getFtpBenutzer(){ return null; }
	public MyHelperClass getDefaultPath(){ return null; }}

class FTPClient {

public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass storeFile(String o0, ByteArrayInputStream o1){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass makeDirectory(String o0){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
