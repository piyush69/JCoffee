
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10795866 {
public MyHelperClass IOUtils;

    public String upload() {
        MyHelperClass imgFile = new MyHelperClass();
        System.out.println(imgFile);
        String destDir = "E:\\ganymede_workspace\\training01\\web\\user_imgs\\map_bg.jpg";
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(new File(destDir));
//            MyHelperClass imgFile = new MyHelperClass();
            IOUtils.copy(new FileInputStream(imgFile), fos);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fos);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return "show";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class File {

File(String o0){}
	File(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
