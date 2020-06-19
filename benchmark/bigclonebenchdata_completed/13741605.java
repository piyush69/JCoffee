
import java.io.UncheckedIOException;


class c13741605 {

    public static boolean copy(String source, String dest) {
        int bytes;
        MyHelperClass BUFFER_LEN = new MyHelperClass();
        byte array[] = new byte[(int)(Object)BUFFER_LEN];
        try {
            InputStream is =(InputStream)(Object) new FileInputStream(source);
            OutputStream os =(OutputStream)(Object) new FileOutputStream(dest);
//            MyHelperClass BUFFER_LEN = new MyHelperClass();
            while ((bytes =(int)(Object) is.read(array, 0, BUFFER_LEN)) > 0) os.write(array, 0, bytes);
            is.close();
            os.close();
            return true;
        } catch (UncheckedIOException e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
