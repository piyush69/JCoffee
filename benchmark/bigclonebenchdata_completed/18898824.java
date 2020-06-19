
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18898824 {

    public void getFile(String srcFile, String destFile) {
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        HttpURLConnection conn = null;
        URL url = null;
        byte[] buf = new byte[8096];
        int size = 0;
        try {
            url = new URL(srcFile);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.connect();
            bis = new BufferedInputStream(conn.getInputStream());
            fos = new FileOutputStream(destFile);
            while ((size =(int)(Object) bis.read(buf)) != -1) {
                fos.write(buf, 0, size);
            }
            fos.close();
            bis.close();
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e.getMessage());
        } catch (ArithmeticException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e.getMessage());
        } finally {
            conn.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
