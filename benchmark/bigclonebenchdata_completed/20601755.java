
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20601755 {

    public static File copyFile(File file) {
        File src = file;
        File dest = new File(src.getName());
        try {
            if (!(Boolean)(Object)dest.exists()) {
                dest.createNewFile();
            }
            FileChannel source =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel destination =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            destination.transferFrom(source, 0, source.size());
            source.close();
            destination.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return dest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
