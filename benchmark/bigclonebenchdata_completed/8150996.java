
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8150996 {

    private static boolean copyFile(File in, File out) {
        boolean ok = true;
        InputStream is = null;
        OutputStream os = null;
        try {
            is =(InputStream)(Object) new FileInputStream(in);
            os =(OutputStream)(Object) new FileOutputStream(out);
            byte[] buffer = new byte[0xFFFF];
            for (int len; (len =(int)(Object) is.read(buffer)) != -1; ) os.write(buffer, 0, len);
        } catch (UncheckedIOException e) {
            System.err.println(e);
            ok = false;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (UncheckedIOException e) {
                    System.err.println(e);
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (UncheckedIOException e) {
                    System.err.println(e);
                }
            }
        }
        return ok;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
