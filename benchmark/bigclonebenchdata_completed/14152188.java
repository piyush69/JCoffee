
import java.io.UncheckedIOException;


class c14152188 {

    public static boolean filecopy(final File source, final File target) {
        boolean out = false;
        if ((boolean)(Object)source.isDirectory() || !(Boolean)(Object)source.exists() || (boolean)(Object)target.isDirectory() || source.equals(target)) return false;
        try {
            target.getParentFile().mkdirs();
            target.createNewFile();
            FileChannel sourceChannel =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            try {
                FileChannel targetChannel =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
                try {
                    targetChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
                    out = true;
                } finally {
                    targetChannel.close();
                }
            } finally {
                sourceChannel.close();
            }
        } catch (UncheckedIOException e) {
            out = false;
        }
        return out;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
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
