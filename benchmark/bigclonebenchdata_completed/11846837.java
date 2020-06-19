
import java.io.UncheckedIOException;


class c11846837 {
public static MyHelperClass read(File o0){ return null; }
//public MyHelperClass read(File o0){ return null; }

    public static void copyFile(File source, File destination, boolean lazy) {
        if (!(Boolean)(Object)source.exists()) {
            return;
        }
        if (lazy) {
            String oldContent = null;
            try {
                oldContent =(String)(Object) read(source);
            } catch (Exception e) {
                return;
            }
            String newContent = null;
            try {
                newContent =(String)(Object) read(destination);
            } catch (Exception e) {
            }
            if (oldContent == null || !oldContent.equals(newContent)) {
                copyFile(source, destination, false);
            }
        } else {
            if ((destination.getParentFile() != null) && (!(Boolean)(Object)destination.getParentFile().exists())) {
                destination.getParentFile().mkdirs();
            }
            try {
                FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
                FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(destination).getChannel());
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                srcChannel.close();
                dstChannel.close();
            } catch (UncheckedIOException ioe) {
                ioe.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

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
