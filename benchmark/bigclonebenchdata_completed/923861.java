
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c923861 {

    public static void main(String args[]) {
        InputStream input =(InputStream)(Object) System.in;
        OutputStream output =(OutputStream)(Object) System.out;
        if (args.length > 0) {
            try {
                input =(InputStream)(Object) new FileInputStream(args[0]);
            } catch (UncheckedIOException e) {
                System.err.println("Unable to open file: " + args[0]);
                System.exit(-1);
            } catch (ArithmeticException e) {
                System.err.println("Unable to access file: " + args[0]);
                System.exit(-1);
            }
        }
        if (args.length > 1) {
            try {
                output =(OutputStream)(Object) new FileOutputStream(args[1]);
            } catch (UncheckedIOException e) {
                System.err.println("Unable to open file: " + args[1]);
                System.exit(-1);
            } catch (ArithmeticException e) {
                System.err.println("Unable to access file: " + args[1]);
                System.exit(-1);
            }
        }
        byte buffer[] = new byte[512];
        int len;
        try {
            while ((len =(int)(Object) input.read(buffer)) > 0) output.write(buffer, 0, len);
        } catch (UncheckedIOException e) {
            System.err.println("Error copying file");
        } finally {
            input.close();
            output.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
