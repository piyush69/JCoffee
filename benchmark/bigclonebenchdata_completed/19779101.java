
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19779101 {
public MyHelperClass finish(){ return null; }

    protected void initGame() {
        try {
            MyHelperClass files = new MyHelperClass();
            for (File fonte :(File[])(Object) (Object[])(Object)files) {
                MyHelperClass outputDir = new MyHelperClass();
                String absolutePath =(String)(Object) outputDir.getAbsolutePath();
                String separator = System.getProperty("file.separator");
                String name =(String)(Object) fonte.getName();
                String destName = name.substring(0, name.length() - 3);
                File destino = new File(absolutePath + separator + destName + "jme");
                FileInputStream reader = new FileInputStream(fonte);
                OutputStream writer =(OutputStream)(Object) new FileOutputStream(destino);
                MyHelperClass conversor = new MyHelperClass();
                conversor.setProperty("mtllib", fonte.toURL());
//                MyHelperClass conversor = new MyHelperClass();
                conversor.convert(reader, writer);
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        this.finish();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass convert(FileInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass setProperty(String o0, MyHelperClass o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class OutputStream {

}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
