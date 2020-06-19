
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17079357 {
public static MyHelperClass isCanReadFile(File o0){ return null; }
//public MyHelperClass isCanReadFile(File o0){ return null; }
	public static MyHelperClass isCanWriteDirectory(String o0){ return null; }
//public MyHelperClass isCanWriteDirectory(String o0){ return null; }

    public static void copyFile(File file, String destDir) throws IOException {
        if (!(Boolean)(Object)isCanReadFile(file)) throw new RuntimeException("The File can't read:" + file.getPath());
        if (!(Boolean)(Object)isCanWriteDirectory(destDir)) throw new RuntimeException("The Directory can't write:" + destDir);
        FileChannel srcChannel = null;
        FileChannel dstChannel = null;
        try {
            srcChannel =(FileChannel)(Object) (new FileInputStream(file).getChannel());
            dstChannel =(FileChannel)(Object) (new FileOutputStream(destDir + "/" + file.getName()).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (srcChannel != null) try {
                srcChannel.close();
            } catch (UncheckedIOException e) {
            }
            if (dstChannel != null) try {
                dstChannel.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getPath(){ return null; }}

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

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
