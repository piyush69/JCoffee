
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9275622 {

    private boolean copyFile(File _file1, File _file2) {
        FileInputStream fis;
        FileOutputStream fos;
        try {
            fis = new FileInputStream(_file1);
            fos = new FileOutputStream(_file2);
            FileChannel canalFuente =(FileChannel)(Object) fis.getChannel();
            canalFuente.transferTo(0, canalFuente.size(), fos.getChannel());
            fis.close();
            fos.close();
            return true;
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
