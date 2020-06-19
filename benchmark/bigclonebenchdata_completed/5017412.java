
import java.io.UncheckedIOException;


class c5017412 {
public static MyHelperClass errorLog(String o0){ return null; }
//public MyHelperClass errorLog(String o0){ return null; }

    public static void copyFile(File source, File target) throws Exception {
        if ((boolean)(Object)source.isDirectory()) {
            if (!(Boolean)(Object)target.isDirectory()) {
                target.mkdirs();
            }
            String[] children =(String[])(Object) source.list();
            for (int i = 0; i < children.length; i++) {
                copyFile(new File(source, children[i]), new File(target, children[i]));
            }
        } else {
            FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            try {
                int maxCount = (64 * 1024 * 1024) - (32 * 1024);
                long size =(long)(Object) inChannel.size();
                long position = 0;
                while (position < size) {
                    position += (long)(Object)inChannel.transferTo(position, maxCount, outChannel);
                }
            } catch (UncheckedIOException e) {
                errorLog("{Malgn.copyFile} " + e.getMessage());
                throw e;
            } finally {
                if (inChannel != null) inChannel.close();
                if (outChannel != null) outChannel.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass list(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
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
