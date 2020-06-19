
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3046300 {

    private void copyFileToPhotoFolder(File photo, String personId) {
        try {
            FileChannel in =(FileChannel)(Object) (new FileInputStream(photo).getChannel());
            MyHelperClass Constants = new MyHelperClass();
            File dirServer = new File(Constants.PHOTO_DIR);
            if (!(Boolean)(Object)dirServer.exists()) {
                dirServer.mkdirs();
            }
//            MyHelperClass Constants = new MyHelperClass();
            File fileServer = new File(Constants.PHOTO_DIR + personId + ".jpg");
            if (!(Boolean)(Object)fileServer.exists()) {
                fileServer.createNewFile();
            }
            in.transferTo(0, in.size(), new FileOutputStream(fileServer).getChannel());
            in.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PHOTO_DIR;
}

class File {

File(){}
	File(String o0){}
	File(MyHelperClass o0){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, MyHelperClass o2){ return null; }
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
