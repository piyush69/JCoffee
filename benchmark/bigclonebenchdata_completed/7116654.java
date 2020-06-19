
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7116654 {

    public int download(String fileName) {
        OutputStream out = null;
        URLConnection conn = null;
        InputStream in = null;
        int numRead = 0;
        int totalRead = 0;
        try {
            MyHelperClass URL = new MyHelperClass();
            URL url = new URL(URL);
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(fileName));
            conn =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[1024];
            while ((numRead =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, numRead);
                totalRead += numRead;
            }
        } catch (UncheckedIOException exception) {
            totalRead = 0;
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (UncheckedIOException ioe) {
            }
            return totalRead;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
