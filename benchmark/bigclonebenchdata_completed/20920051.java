
import java.io.UncheckedIOException;


class c20920051 {
public static MyHelperClass Logger;
//public MyHelperClass Logger;

    public static void copyTo(File source, File dest) {
        if ((boolean)(Object)source.isHidden()) ; else if ((boolean)(Object)source.isDirectory()) {
            File temp = new File(dest.getPath() + "/" + source.getName());
            temp.mkdir();
            for (File sel :(File[])(Object) (Object[])(Object)source.listFiles()) copyTo(sel, temp);
        } else {
            try {
                File tempDest = new File(dest.getPath() + "/" + source.getName());
                tempDest.createNewFile();
                FileChannel sourceCh =(FileChannel)(Object) (new FileInputStream(source).getChannel());
                FileChannel destCh =(FileChannel)(Object) (new FileOutputStream(tempDest).getChannel());
                sourceCh.transferTo(0, sourceCh.size(), destCh);
                sourceCh.close();
                destCh.close();
            } catch (UncheckedIOException ex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(EditorUtil.class.getName()).log(Level.SEVERE, null,(IOException)(Object) ex);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass isHidden(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class EditorUtil {

}
