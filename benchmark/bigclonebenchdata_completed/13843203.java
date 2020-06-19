
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13843203 {
public MyHelperClass MEDIA_MOUNTED;

    private void downloadFile(File file, String url) {
        MyHelperClass Environment = new MyHelperClass();
        String state =(String)(Object) Environment.getExternalStorageState();
        if (MEDIA_MOUNTED.equals(state)) {
            InputStream in = null;
            BufferedOutputStream out = null;
            try {
                MyHelperClass IO_BUFFER_SIZE = new MyHelperClass();
                in =(InputStream)(Object) new BufferedInputStream(new URL(url).openStream(), IO_BUFFER_SIZE);
                final FileOutputStream outStream = new FileOutputStream(file);
//                MyHelperClass IO_BUFFER_SIZE = new MyHelperClass();
                out = new BufferedOutputStream(outStream, IO_BUFFER_SIZE);
//                MyHelperClass IO_BUFFER_SIZE = new MyHelperClass();
                byte[] bytes = new byte[(int)(Object)IO_BUFFER_SIZE];
                while ((int)(Object)in.read(bytes) > 0) {
                    out.write(bytes);
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (UncheckedIOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getExternalStorageState(){ return null; }}

class File {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0, MyHelperClass o1){}
	BufferedInputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
