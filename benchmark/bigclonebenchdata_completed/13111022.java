
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13111022 {

    private static void copy(File source, File target) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is =(InputStream)(Object) new BufferedInputStream(new FileInputStream(source));
            os =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(target));
            int b;
            while ((b =(int)(Object) is.read()) > -1) os.write(b);
        } finally {
            try {
                if (is != null) is.close();
            } catch (UncheckedIOException ignore) {
            }
            try {
                if (os != null) os.close();
            } catch (UncheckedIOException ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
