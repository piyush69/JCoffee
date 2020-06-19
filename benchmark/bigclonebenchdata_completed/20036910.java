
import java.io.UncheckedIOException;


class c20036910 {

    public static void copyFile(File srcFile, File dstFile) {
        MyHelperClass logger = new MyHelperClass();
        logger.info("Create file : " + dstFile.getPath());
        try {
            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dstFile).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }}

class File {

public MyHelperClass getPath(){ return null; }}

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
