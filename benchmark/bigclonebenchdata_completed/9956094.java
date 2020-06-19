
import java.io.UncheckedIOException;


class c9956094 {
public MyHelperClass UserSettings;
	public MyHelperClass I18N;
	public MyHelperClass protocol;
	public MyHelperClass HttpURLConnection;
	public MyHelperClass JOptionPane;
	public MyHelperClass restoreFileFromBackup(){ return null; }
	public MyHelperClass makeBackupFile(){ return null; }
	public MyHelperClass deleteBackupFile(){ return null; }
	public MyHelperClass setDefaultAuthenticator(){ return null; }

    public void importNotesFromServer() {
        boolean downloaded = true;
        try {
            makeBackupFile();
            File f = new File(UserSettings.getInstance().getNotesFile());
            FileOutputStream fos = new FileOutputStream(f);
            String urlString = protocol + "://" + UserSettings.getInstance().getServerAddress() + UserSettings.getInstance().getServerDir() + f.getName();
            setDefaultAuthenticator();
            URL url = new URL(urlString);
            HttpURLConnection urlc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            InputStream is =(InputStream)(Object) urlc.getInputStream();
            int nextByte =(int)(Object) is.read();
            while (nextByte != -1) {
                fos.write(nextByte);
                nextByte =(int)(Object) is.read();
            }
            fos.close();
            if (urlc.getResponseCode() != HttpURLConnection.HTTP_OK) {
                downloaded = false;
            }
        } catch (UncheckedIOException e) {
            JOptionPane.showMessageDialog(null, I18N.getInstance().getString("error.sslcertificateerror"), I18N.getInstance().getString("error.title"), JOptionPane.ERROR_MESSAGE);
            downloaded = false;
        } catch (Exception e) {
            downloaded = false;
        }
        if (downloaded) {
            deleteBackupFile();
            JOptionPane.showMessageDialog(null, I18N.getInstance().getString("info.notesfiledownloaded"), I18N.getInstance().getString("info.title"), JOptionPane.INFORMATION_MESSAGE);
        } else {
            restoreFileFromBackup();
            JOptionPane.showMessageDialog(null, I18N.getInstance().getString("error.notesfilenotdownloaded"), I18N.getInstance().getString("error.title"), JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass HTTP_OK;
	public MyHelperClass INFORMATION_MESSAGE;
public MyHelperClass getNotesFile(){ return null; }
	public MyHelperClass getServerDir(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass showMessageDialog(Object o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getServerAddress(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class SSLHandshakeException extends Exception{
	public SSLHandshakeException(String errorMessage) { super(errorMessage); }
}
