
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22517711 {

    private static void ftpTest() {
        FTPClient f = new FTPClient();
        try {
            f.connect("oscomak.net");
            System.out.print(f.getReplyString());
            MyHelperClass FTPClient = new MyHelperClass();
            f.setFileType(FTPClient.BINARY_FILE_TYPE);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        MyHelperClass JOptionPane = new MyHelperClass();
        String password =(String)(Object) JOptionPane.showInputDialog("Enter password");
        if (password == null || password.equals("")) {
            System.out.println("No password");
            return;
        }
        try {
            f.login("oscomak_pointrel", password);
            System.out.print(f.getReplyString());
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        try {
            String workingDirectory =(String)(Object) f.printWorkingDirectory();
            System.out.println("Working directory: " + workingDirectory);
            System.out.print(f.getReplyString());
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        try {
            f.enterLocalPassiveMode();
            System.out.print(f.getReplyString());
            System.out.println("Trying to list files");
            String[] fileNames =(String[])(Object) f.listNames();
            System.out.print(f.getReplyString());
            System.out.println("Got file list fileNames: " + fileNames.length);
            for (String fileName : fileNames) {
                System.out.println("File: " + fileName);
            }
            System.out.println();
            System.out.println("done reading stream");
            System.out.println("trying alterative way to read stream");
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            f.retrieveFile(fileNames[0], outputStream);
            System.out.println("size: " + outputStream.size());
            System.out.println(outputStream.toString());
            System.out.println("done with alternative");
            System.out.println("Trying to store file back");
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            boolean storeResult =(boolean)(Object) f.storeFile("test.txt", inputStream);
            System.out.println("Done storing " + storeResult);
            f.disconnect();
            System.out.print(f.getReplyString());
            System.out.println("disconnected");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass showInputDialog(String o0){ return null; }}

class FTPClient {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass listNames(){ return null; }
	public MyHelperClass retrieveFile(String o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getReplyString(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass storeFile(String o0, ByteArrayInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass printWorkingDirectory(){ return null; }
	public MyHelperClass enterLocalPassiveMode(){ return null; }
	public MyHelperClass connect(String o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass size(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(MyHelperClass o0){}}
