
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2234704 {

    public static void readAsFile(String fileName, String url) {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        URLConnection conn = null;
        try {
            conn =(URLConnection)(Object) (new URL(url).openConnection());
            conn.setDoInput(true);
            in = new BufferedInputStream(conn.getInputStream());
            out = new BufferedOutputStream(new FileOutputStream(fileName));
            int b;
            while ((b =(int)(Object) in.read()) != -1) {
                out.write(b);
            }
        } catch (Exception ex) {
            MyHelperClass log = new MyHelperClass();
            log.error(ex.getMessage(), ex);
        } finally {
            if (null != in) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (null != out) {
                try {
                    out.flush();
                    out.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
