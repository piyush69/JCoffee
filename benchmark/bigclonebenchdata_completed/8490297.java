
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8490297 {

    public static void copyFile(File src, File dst) throws IOException {
        try {
            InputStream in =(InputStream)(Object) new FileInputStream(src);
            OutputStream out =(OutputStream)(Object) new FileOutputStream(dst);
            MyHelperClass TEMP_FILE_BUFFER_SIZE = new MyHelperClass();
            byte[] buf = new byte[(int)(Object)TEMP_FILE_BUFFER_SIZE];
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            in.close();
            out.close();
        } catch (UncheckedIOException e1) {
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.runtimeError((IOException)(Object)e1, src.toString());
        } catch (ArithmeticException e2) {
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.runtimeError((IOException)(Object)e2, src.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass runtimeError(IOException o0, String o1){ return null; }
	public MyHelperClass runtimeError(FileNotFoundException o0, String o1){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
