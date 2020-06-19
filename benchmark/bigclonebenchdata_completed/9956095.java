
import java.io.UncheckedIOException;


class c9956095 {
public MyHelperClass JOptionPane;
	public MyHelperClass I18N;
	public MyHelperClass HttpURLConnection;
	public MyHelperClass setDefaultAuthenticator(){ return null; }

    public void exportNotesToServer() {
        boolean uploaded = true;
        try {
            MyHelperClass UserSettings = new MyHelperClass();
            File f = new File(UserSettings.getInstance().getNotesFile());
            FileInputStream fis = new FileInputStream(f);
            MyHelperClass protocol = new MyHelperClass();
            String urlString = protocol + "://" + UserSettings.getInstance().getServerAddress() + UserSettings.getInstance().getServerDir() + f.getName();
            setDefaultAuthenticator();
            URL url = new URL(urlString);
            HttpURLConnection urlc = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlc.setDoOutput(true);
            urlc.setRequestMethod("PUT");
            OutputStream os =(OutputStream)(Object) urlc.getOutputStream();
            int nextByte =(int)(Object) fis.read();
            while (nextByte != -1) {
                os.write(nextByte);
                nextByte =(int)(Object) fis.read();
            }
            fis.close();
            os.close();
            if (urlc.getResponseCode() != HttpURLConnection.HTTP_CREATED && urlc.getResponseCode() != HttpURLConnection.HTTP_NO_CONTENT) {
                uploaded = false;
            }
        } catch (UncheckedIOException e) {
            JOptionPane.showMessageDialog(null, I18N.getInstance().getString("error.sslcertificateerror"), I18N.getInstance().getString("error.title"), JOptionPane.ERROR_MESSAGE);
            uploaded = false;
        } catch (Exception e) {
            uploaded = false;
        }
        if (uploaded) {
            JOptionPane.showMessageDialog(null, I18N.getInstance().getString("info.notesfileuploaded"), I18N.getInstance().getString("info.title"), JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, I18N.getInstance().getString("error.notesfilenotuploaded"), I18N.getInstance().getString("error.title"), JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass HTTP_NO_CONTENT;
	public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass HTTP_CREATED;
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

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class SSLHandshakeException extends Exception{
	public SSLHandshakeException(String errorMessage) { super(errorMessage); }
}
