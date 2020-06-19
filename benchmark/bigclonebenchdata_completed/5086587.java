
import java.io.UncheckedIOException;


class c5086587 {
public static MyHelperClass staticprintln(String o0){ return null; }
//public MyHelperClass staticprintln(String o0){ return null; }

    public static void copyFromTo(String src, String des) {
        staticprintln("Copying:\"" + src + "\"\nto:\"" + des + "\"");
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(des).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
