
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11154758 {

    public static void main(String[] args) {
        FTPClient client = new FTPClient();
        FileOutputStream fos = null;
        try {
            client.connect("192.168.1.10");
            client.login("a", "123456");
            String filename = "i.exe";
            fos = new FileOutputStream(filename);
            client.retrieveFile("/" + filename, fos);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                client.disconnect();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FTPClient {

public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(String o0){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
