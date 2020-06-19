
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7908169 {
public MyHelperClass IOUtils;
public MyHelperClass list(){ return null; }

    public String execute() {
        String dir = "E:\\ganymede_workspace\\training01\\web\\user_imgs\\";
        HomeMap map = new HomeMap();
        MyHelperClass description = new MyHelperClass();
        map.setDescription(description);
        MyHelperClass homeMapDao = new MyHelperClass();
        Integer id =(Integer)(Object) homeMapDao.saveHomeMap(map);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(dir + id);
            MyHelperClass imageFile = new MyHelperClass();
            IOUtils.copy(new FileInputStream(imageFile), fos);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(fos);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return(String)(Object) list();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass saveHomeMap(HomeMap o0){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class HomeMap {

public MyHelperClass setDescription(MyHelperClass o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
