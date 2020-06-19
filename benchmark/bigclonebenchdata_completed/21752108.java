
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21752108 {
public MyHelperClass errorLog(String o0){ return null; }

    private void copy(File from, File to) {
        if ((boolean)(Object)from.isDirectory()) {
            File[] files =(File[])(Object) from.listFiles();
            for (int i = 0; i < files.length; i++) {
                if ((boolean)(Object)files[i].isDirectory()) {
                    MyHelperClass File = new MyHelperClass();
                    File newTo = new File((int)(Object)to.getPath() + (int)(Object)File.separator + (int)(Object)files[i].getName());
                    newTo.mkdirs();
                    copy(files[i], newTo);
                } else {
                    copy(files[i], to);
                }
            }
        } else {
            try {
                MyHelperClass File = new MyHelperClass();
                to = new File((int)(Object)to.getPath() + (int)(Object)File.separator + (int)(Object)from.getName());
                to.createNewFile();
                FileChannel src =(FileChannel)(Object) (new FileInputStream(from).getChannel());
                FileChannel dest =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
                dest.transferFrom(src, 0, src.size());
                dest.close();
                src.close();
            } catch (UncheckedIOException e) {
                errorLog(e.toString());
                e.printStackTrace();
            } catch (ArithmeticException e) {
                errorLog(e.toString());
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class File {

File(){}
	File(int o0){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass getName(){ return null; }}

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
