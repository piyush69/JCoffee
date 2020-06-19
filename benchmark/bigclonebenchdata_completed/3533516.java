
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3533516 {
public MyHelperClass FTP;
	public MyHelperClass FTPReply;
	public MyHelperClass getWebserver(){ return null; }
	public MyHelperClass getSeminarID(){ return null; }
	public MyHelperClass getId(){ return null; }

    public boolean saveLecturerecordingsXMLOnWebserver() {
        boolean error = false;
        FTPClient ftp = new FTPClient();
        String lecture = "";
        try {
            URL url = new URL("http://localhost:8080/virtPresenterVerwalter/lecturerecordings.jsp?seminarid=" + this.getSeminarID());
            HttpURLConnection http = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
            String zeile = "";
            while ((zeile =(String)(Object) in.readLine()) != null) {
                lecture += zeile + "\n";
            }
            in.close();
            http.disconnect();
        } catch (Exception e) {
            System.err.println("Konnte lecturerecordings.xml nicht lesen.");
        }
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
                ftp.changeWorkingDirectory(this.getWebserver().getDefaultPath() + "/" + tmpSeminarID + "/lectures/");
            } catch (Exception e) {
                ftp.makeDirectory(this.getWebserver().getDefaultPath() + "/" + tmpSeminarID + "/lectures/");
                ftp.changeWorkingDirectory(this.getWebserver().getDefaultPath() + "/" + tmpSeminarID + "/lectures/");
            }
            ftp.setFileType(FTP.BINARY_FILE_TYPE);
            ByteArrayInputStream lectureIn = new ByteArrayInputStream(lecture.getBytes());
            System.err.println("FTP Verzeichnis: " + ftp.printWorkingDirectory());
            ftp.storeFile("lecturerecordings.xml", lectureIn);
            lectureIn.close();
            ftp.logout();
            ftp.disconnect();
        } catch (UncheckedIOException e) {
            System.err.println("Job " + this.getId() + ": Datei lecturerecordings.xml konnte nicht auf Webserver kopiert werden.");
            error = true;
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.err.println("Job " + this.getId() + ": Datei lecturerecordings.xml konnte nicht auf Webserver kopiert werden. (Kein Webserver zugewiesen)");
            error = true;
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
	public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
