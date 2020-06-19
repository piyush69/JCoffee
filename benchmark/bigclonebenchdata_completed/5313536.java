
import java.io.UncheckedIOException;


class c5313536 {
public MyHelperClass logging;

    public void merge(VMImage image, VMSnapShot another) throws VMException {
        MyHelperClass path = new MyHelperClass();
        if (path == null || another.getPath() == null) throw new VMException("EmuVMSnapShot is NULL!");
        MyHelperClass LOG_NAME = new MyHelperClass();
        logging.debug(LOG_NAME, "merge images  " + path + " and " + another.getPath());
//        MyHelperClass path = new MyHelperClass();
        File target = new File(path);
        File src = new File(another.getPath());
        if ((Boolean)(Object)target.isDirectory() || (Boolean)(Object)src.isDirectory()) return;
        try {
            FileInputStream in = new FileInputStream(another.getPath());
            FileChannel inChannel =(FileChannel)(Object) in.getChannel();
//            MyHelperClass path = new MyHelperClass();
            FileOutputStream out = new FileOutputStream(path, true);
            FileChannel outChannel =(FileChannel)(Object) out.getChannel();
            outChannel.transferFrom(inChannel, 0, inChannel.size());
            outChannel.close();
            inChannel.close();
        } catch (UncheckedIOException e) {
            throw new VMException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(MyHelperClass o0, String o1){ return null; }}

class VMImage {

}

class VMSnapShot {

public MyHelperClass getPath(){ return null; }}

class VMException extends Exception{
	public VMException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass isDirectory(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(MyHelperClass o0, boolean o1){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
