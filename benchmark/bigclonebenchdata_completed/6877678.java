
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c6877678 {
public static MyHelperClass exportGestureSetsAsStream(List o0){ return null; }
public static MyHelperClass LOGGER;
//	public MyHelperClass exportGestureSetsAsStream(List o0){ return null; }
//public MyHelperClass LOGGER;

    public static void exportGestureSet(List sets, File file) {
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(exportGestureSetsAsStream(sets), outputStream);
            outputStream.close();
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            LOGGER.log(Level.SEVERE, "Could not export Gesture Sets. Export File not found.",(FileNotFoundException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass Level = new MyHelperClass();
            LOGGER.log(Level.SEVERE, "Could not export Gesture Sets.",(FileNotFoundException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, FileNotFoundException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class List {

}

class GestureSet {

}

class File {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
