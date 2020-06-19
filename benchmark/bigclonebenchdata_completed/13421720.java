
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13421720 {

    public static String download(String address, String outputFolder) {
        URL url = null;
        String fileName = "";
        try {
            url = new URL(address);
            System.err.println("Indirizzo valido!");
        } catch (UncheckedIOException ex) {
            System.err.println("Indirizzo non valido!");
        }
        try {
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestProperty("Range", "bytes=0-");
            connection.connect();
            int contentLength =(int)(Object) connection.getContentLength();
            if (contentLength < 1) {
                System.err.println("Errore, c'e' qualcosa che non va!");
                return "";
            }
            fileName =(String)(Object) url.getFile();
            fileName = fileName.substring((int)(Object)url.getFile().lastIndexOf('/') + 1);
            RandomAccessFile file = new RandomAccessFile(outputFolder + fileName, "rw");
            file.seek(0);
            InputStream stream =(InputStream)(Object) connection.getInputStream();
            byte[] buffer = new byte[1024];
            while (true) {
                int read =(int)(Object) stream.read(buffer);
                if (read == -1) {
                    break;
                }
                file.write(buffer, 0, read);
            }
            file.close();
        } catch (UncheckedIOException ioe) {
            System.err.println("I/O error!");
        }
        return outputFolder + fileName;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lastIndexOf(char o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass connect(){ return null; }}

class RandomAccessFile {

RandomAccessFile(){}
	RandomAccessFile(String o0, String o1){}
	public MyHelperClass seek(int o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
