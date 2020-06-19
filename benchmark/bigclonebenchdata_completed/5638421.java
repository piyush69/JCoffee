
import java.io.UncheckedIOException;


class c5638421 {
public MyHelperClass fail(String o0){ return null; }

    private void copy(File in, File out) {
        MyHelperClass log = new MyHelperClass();
        log.info("Copying yam file from: " + in.getName() + " to: " + out.getName());
        try {
            FileChannel ic =(FileChannel)(Object) (new FileInputStream(in).getChannel());
            FileChannel oc =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
            ic.transferTo(0, ic.size(), oc);
            ic.close();
            oc.close();
        } catch (UncheckedIOException ioe) {
            fail("Failed testing while copying modified file: " + ioe.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class File {

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
