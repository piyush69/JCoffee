
import java.io.UncheckedIOException;


class c3187685 {
public MyHelperClass fLog;

    private void copyJar(File src, File dst) throws IOException {
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            fLog.log(Level.SEVERE, e.getMessage(),(IOException)(Object) e);
        } finally {
            srcChannel.close();
            dstChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
