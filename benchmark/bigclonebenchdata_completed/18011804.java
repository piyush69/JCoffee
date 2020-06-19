import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18011804 {
public MyHelperClass addWindowListener(<anonymous WindowAdapter> o0){ return null; }
public MyHelperClass addWindowListener(){ return null; }
public MyHelperClass JFileChooser;
	public MyHelperClass logger;
	public MyHelperClass FTPReply;
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getToolkit(){ return null; }
	public MyHelperClass getBounds(){ return null; }

    public  c18011804() throws Throwable, HeadlessException, MalformedURLException {
        super();
        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent aEvent) {
                System.exit(0);
            }
        });
        Dimension dim =(Dimension)(Object) getToolkit().getScreenSize();
        Rectangle abounds =(Rectangle)(Object) getBounds();
        setLocation((dim.width - (int)(Object)abounds.width) / 2, (dim.height - abounds.height) / 2);
        setVisible(true);
        URL url = new URL("ftp://cendantstp/");
        char[] password = "spnr".toCharArray();
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication("spnr", password);
        FTPRemoteFileSystemView remoteFileSystemView = new FTPRemoteFileSystemView(url, passwordAuthentication);
        JFileChooser fileChooser =(JFileChooser)(Object) new InsightRemoteFileChooser(remoteFileSystemView);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        File[] selectedFiles = null;
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            selectedFiles =(File[])(Object) fileChooser.getSelectedFiles();
            for (int i = 0; i < selectedFiles.length; i++) {
                if ((FTPFileFile)(Object)selectedFiles[i] instanceof FTPFileFile) {
                    FTPFileFile ftpFile = (FTPFileFile)(FTPFileFile)(Object) selectedFiles[i];
                    logger.fine((String)(Object)ftpFile.getName());
                    logger.fine((String)(Object)ftpFile.getPath());
                } else {
                    logger.fine(selectedFiles[i].toString());
                    logger.fine(selectedFiles[i].getAbsolutePath());
                }
            }
        }
        remoteFileSystemView.disconnect();
        try {
            if (null != selectedFiles) {
                FTPClient ftpClient = new FTPClient();
                InetAddress inetAddress = InetAddress.getByName(url.getHost());
                ftpClient.connect(inetAddress);
                if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                    throw new FTPBrowseException((String)(Object)ftpClient.getReplyString());
                }
                if (null != passwordAuthentication) {
                    ftpClient.login(passwordAuthentication.getUserName(), new StringBuffer().append(passwordAuthentication.getPassword()).toString());
                }
                for (int i = 0; i < selectedFiles.length; i++) {
                    FTPFileFile file = (FTPFileFile)(FTPFileFile)(Object) selectedFiles[i];
                    logger.fine((String)(Object)file.getPath());
                    FileOutputStream fos = new FileOutputStream(new File("d:/junk/ftp/test.txt"));
                    logger.fine("" + ftpClient.retrieveFile(file.getPath().replaceAll("\\\\", "/"), fos));
                    fos.close();
                }
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILES_ONLY;
	public MyHelperClass APPROVE_OPTION;
public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass getScreenSize(){ return null; }
	public MyHelperClass isPositiveCompletion(MyHelperClass o0){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }}

class HeadlessException extends Exception{
	public HeadlessException(String errorMessage) { super(errorMessage); }
}

class WindowAdapter {

}

class Dimension {
public MyHelperClass width;
	public MyHelperClass height;
}

class Rectangle {
public MyHelperClass width;
	public MyHelperClass height;
}

class FTPRemoteFileSystemView {

FTPRemoteFileSystemView(URL o0, PasswordAuthentication o1){}
	FTPRemoteFileSystemView(){}
	public MyHelperClass disconnect(){ return null; }}

class JFileChooser {

public MyHelperClass setMultiSelectionEnabled(boolean o0){ return null; }
	public MyHelperClass setFileSelectionMode(MyHelperClass o0){ return null; }
	public MyHelperClass showOpenDialog(c18011804 o0){ return null; }
	public MyHelperClass getSelectedFiles(){ return null; }}

class InsightRemoteFileChooser {

InsightRemoteFileChooser(FTPRemoteFileSystemView o0){}
	InsightRemoteFileChooser(){}}

class FTPFileFile {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class FTPClient {

public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FTPBrowseException extends Exception{
	public FTPBrowseException(String errorMessage) { super(errorMessage); }
}

class WindowEvent {

}
