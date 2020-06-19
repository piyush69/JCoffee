
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14882263 {

    private void UploadActionPerformed(ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.jpg", "jpg");
        chooser.setFileFilter(filter);
        File dir = new File(System.getProperty("user.home"));
        chooser.setCurrentDirectory(dir);
        Component parent = null;
        int returnVal =(int)(Object) chooser.showOpenDialog(parent);
        MyHelperClass JFileChooser = new MyHelperClass();
        if (returnVal == (int)(Object)JFileChooser.APPROVE_OPTION) {
            MyHelperClass UserStatus = new MyHelperClass();
            UserStatus.setText("Bitte warten");
        }
        try {
            MyHelperClass Pic = new MyHelperClass();
            Pic.setVisible(false);
            FTPClient client = new FTPClient();
            client.connect("showus.de");
            client.login("web2", "kcinnay88");
            client.enterLocalActiveMode();
            MyHelperClass FTPClient = new MyHelperClass();
            client.setFileTransferMode(FTPClient.BINARY_FILE_TYPE);
//            MyHelperClass FTPClient = new MyHelperClass();
            client.setFileType(FTPClient.BINARY_FILE_TYPE);
            int reply =(int)(Object) client.getReplyCode();
            System.out.println("Connect returned: " + reply);
            FileInputStream in = new FileInputStream(chooser.getSelectedFile().getAbsolutePath());
            System.out.println("Uploading File");
            MyHelperClass Config = new MyHelperClass();
            client.storeFile("/html/Applet/user/" + Config.id + ".jpg", in);
            client.logout();
            in.close();
            System.out.println("done");
            MyHelperClass UserStatus = new MyHelperClass();
            UserStatus.setText("Upload fertig, Bild wird aktuallisiert");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            MyHelperClass UserStatus = new MyHelperClass();
            UserStatus.setText("Fehler beim Upload");
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass id;
	public MyHelperClass APPROVE_OPTION;
	public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class ActionEvent {

}

class JFileChooser {

public MyHelperClass setFileFilter(FileNameExtensionFilter o0){ return null; }
	public MyHelperClass setCurrentDirectory(File o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }
	public MyHelperClass showOpenDialog(Component o0){ return null; }}

class FileNameExtensionFilter {

FileNameExtensionFilter(){}
	FileNameExtensionFilter(String o0, String o1){}}

class File {

File(String o0){}
	File(){}}

class Component {

}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass enterLocalActiveMode(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
