
import java.io.UncheckedIOException;


class c22424633 {

    public static void copyFile(String input, String output) {
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream("srcFilename").getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream("dstFilename").getChannel());
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
