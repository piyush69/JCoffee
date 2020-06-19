
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7309170 {

    private void zip(File input, File output) {
        OutputStream os = null;
        InputStream is = null;
        try {
            os =(OutputStream)(Object) new GZIPOutputStream(new FileOutputStream(output));
            is =(InputStream)(Object) new FileInputStream(input);
            byte[] buffer = new byte[8192];
            for (int length; (length =(int)(Object) is.read(buffer)) != -1; ) os.write(buffer, 0, length);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class GZIPOutputStream {

GZIPOutputStream(FileOutputStream o0){}
	GZIPOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
