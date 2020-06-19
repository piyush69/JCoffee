
import java.io.UncheckedIOException;


class c3838437 {
public static MyHelperClass LOG;
//public MyHelperClass LOG;

    public static boolean copyFile(final File inFile, final File outFile) {
        try {
            FileChannel ic =(FileChannel)(Object) (new FileInputStream(inFile).getChannel());
            FileChannel oc =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
            ic.transferTo(0, ic.size(), oc);
            ic.close();
            oc.close();
            return true;
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            LOG.log(Level.INFO, "copyFile() Exception while copy file " + inFile.getAbsolutePath() + " to " + outFile.getAbsolutePath(),(IOException)(Object) e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

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
