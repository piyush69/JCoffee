
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4886971 {

    private static void copyFile(String srFile, String dtFile) {
        try {
            File f1 = new File(srFile);
            File f2 = new File(dtFile);
            InputStream in =(InputStream)(Object) new FileInputStream(f1);
            OutputStream out =(OutputStream)(Object) new FileOutputStream(f2);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
            in.close();
            out.close();
        } catch (UncheckedIOException ex) {
            System.out.println("Error copying " + srFile + " to " + dtFile);
            System.out.println(ex.getMessage() + " in the specified directory.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
