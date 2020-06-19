
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2941113 {

    private void download(URL url, File outFile) throws IOException {
        System.out.println("Trying to download: " + url);
        InputStream in = null;
        OutputStream out = null;
        try {
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) conn.getInputStream();
            out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(outFile));
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buf)) > -1) {
                out.write(buf, 0, len);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("Unable to close stream.",(IOException)(Object) e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("Unable to close stream.",(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
