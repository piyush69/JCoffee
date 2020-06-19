
import java.io.UncheckedIOException;


class c9176940 {

    public static void copyFile(File in, File out, boolean read, boolean write, boolean execute) throws FileNotFoundException, IOException {
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        File outFile = null;
        if ((boolean)(Object)out.isDirectory()) {
            MyHelperClass File = new MyHelperClass();
            outFile = new File((int)(Object)out.getAbsolutePath() + (int)(Object)File.separator + (int)(Object)in.getName());
        } else {
            outFile = out;
        }
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(outFile).getChannel());
        try {
            int maxCount = (64 * 1024 * 1024) - (32 * 1024);
            long size =(long)(Object) inChannel.size();
            long position = 0;
            while (position < size) {
                position += (long)(Object)inChannel.transferTo(position, maxCount, outChannel);
            }
            outFile.setReadable(read);
            outFile.setWritable(write);
            outFile.setExecutable(execute);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class File {

File(){}
	File(int o0){}
	public MyHelperClass setReadable(boolean o0){ return null; }
	public MyHelperClass setExecutable(boolean o0){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass setWritable(boolean o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
