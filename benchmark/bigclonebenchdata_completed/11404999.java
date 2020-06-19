
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11404999 {

    public boolean moveFileSafely(final File in, final File out) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        MyHelperClass File = new MyHelperClass();
        final File tempOut =(File)(Object) File.createTempFile("move", ".tmp");
        try {
            fis = new FileInputStream(in);
            fos = new FileOutputStream(tempOut);
            inChannel =(FileChannel)(Object) fis.getChannel();
            outChannel =(FileChannel)(Object) fos.getChannel();
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } finally {
            try {
                if (inChannel != null) inChannel.close();
            } catch (UncheckedIOException e) {
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.debugf(JRobinConverter.class, "failed to close channel %s", inChannel);
            }
            try {
                if (outChannel != null) outChannel.close();
            } catch (UncheckedIOException e) {
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.debugf(JRobinConverter.class, "failed to close channel %s", outChannel);
            }
            try {
                if (fis != null) fis.close();
            } catch (UncheckedIOException e) {
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.debugf(JRobinConverter.class, "failed to close stream %s", fis);
            }
            try {
                if (fos != null) fos.close();
            } catch (UncheckedIOException e) {
                MyHelperClass LogUtils = new MyHelperClass();
                LogUtils.debugf(JRobinConverter.class, "failed to close stream %s", fos);
            }
        }
        out.delete();
        if (!(Boolean)(Object)out.exists()) {
            tempOut.renameTo(out);
            return(boolean)(Object) in.delete();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debugf(Class<JRobinConverter> o0, String o1, FileChannel o2){ return null; }
	public MyHelperClass debugf(Class<JRobinConverter> o0, String o1, FileInputStream o2){ return null; }
	public MyHelperClass debugf(Class<JRobinConverter> o0, String o1, FileOutputStream o2){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class JRobinConverter {

}
