
import java.io.UncheckedIOException;


class c9805906 {

    public static boolean dump(File source, File target) {
        boolean done = false;
        try {
            InputStream is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(source));
            OutputStream os =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(target));
            while ((int)(Object)is.available() > 0) {
                os.write(is.read());
            }
            os.flush();
            os.close();
            is.close();
            return true;
        } catch (UncheckedIOException e) {
        }
        return done;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
