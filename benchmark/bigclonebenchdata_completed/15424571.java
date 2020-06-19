
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15424571 {

    private File copyFile(File source, File destiny) {
        try {
            FileInputStream fileinputstream = new FileInputStream(source);
            FileOutputStream fileoutputstream = new FileOutputStream(destiny);
            byte abyte0[] = new byte[4096];
            int i;
            while ((i =(int)(Object) fileinputstream.read(abyte0)) != -1) fileoutputstream.write(abyte0, 0, i);
            fileinputstream.close();
            fileoutputstream.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage());
        } catch (ArithmeticException e) {
            e.printStackTrace();
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getMessage());
        }
        return destiny;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
