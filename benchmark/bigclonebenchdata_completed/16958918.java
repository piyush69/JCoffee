
import java.io.UncheckedIOException;


class c16958918 {
public static MyHelperClass Logger;
	public static MyHelperClass fileExists(String o0){ return null; }
//public MyHelperClass Logger;
//	public MyHelperClass fileExists(String o0){ return null; }

    public static boolean copyFile(final String src, final String dest) {
        if ((boolean)(Object)fileExists(src)) {
            try {
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
                return true;
            } catch (UncheckedIOException e) {
                Logger.getAnonymousLogger().severe(e.getLocalizedMessage());
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAnonymousLogger(){ return null; }
	public MyHelperClass severe(String o0){ return null; }}

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
