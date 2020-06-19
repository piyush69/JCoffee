
import java.io.UncheckedIOException;


class c10671994 {

    public static void copy(File src, File dst) {
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            srcChannel = null;
            dstChannel.close();
            dstChannel = null;
        } catch (UncheckedIOException ex) {
            MyHelperClass Tools = new MyHelperClass();
            Tools.logException(Tools.class,(IOException)(Object) ex, dst.getAbsolutePath());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass logException(Class<Tools> o0, IOException o1, MyHelperClass o2){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Tools {

}
