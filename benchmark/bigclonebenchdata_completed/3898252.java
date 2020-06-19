
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3898252 {

    public static void decoupe(String input_file_path) {
        final int BUFFER_SIZE = 2000000;
        try {
            FileInputStream fr = new FileInputStream(input_file_path);
            byte[] cbuf = new byte[BUFFER_SIZE];
            int n_read = 0;
            int i = 0;
            boolean bContinue = true;
            while (bContinue) {
                n_read =(int)(Object) fr.read(cbuf, 0, BUFFER_SIZE);
                if (n_read == -1) break;
                FileOutputStream fo = new FileOutputStream("f_" + ++i);
                fo.write(cbuf, 0, n_read);
                fo.close();
            }
            fr.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
