
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9632237 {

    private boolean copy_to_file_io(File src, File dst) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is =(InputStream)(Object) new FileInputStream(src);
            is =(InputStream)(Object) new BufferedInputStream(is);
            os =(OutputStream)(Object) new FileOutputStream(dst);
            os =(OutputStream)(Object) new BufferedOutputStream(os);
            byte buffer[] = new byte[1024 * 64];
            int read;
            while ((read =(int)(Object) is.read(buffer)) > 0) {
                os.write(buffer, 0, read);
            }
            return true;
        } finally {
            try {
                if (is != null) is.close();
            } catch (UncheckedIOException e) {
                MyHelperClass Debug = new MyHelperClass();
                Debug.debug((IOException)(Object)e);
            }
            try {
                if (os != null) os.close();
            } catch (UncheckedIOException e) {
                MyHelperClass Debug = new MyHelperClass();
                Debug.debug((IOException)(Object)e);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(IOException o0){ return null; }}

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

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(OutputStream o0){}
	BufferedOutputStream(){}}
