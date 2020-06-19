
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14510383 {
public MyHelperClass format(String o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass format(String o0, MyHelperClass o1){ return null; }

//    @Override
    public void copyFile2File(final File src, final File dest, final boolean force) throws C4JException {
        if ((boolean)(Object)dest.exists()) if (force && !(Boolean)(Object)dest.delete()) throw new C4JException((String)(Object)format("Copying ‘%s’ to ‘%s’ failed; cannot overwrite existing file.", src.getPath(), dest.getPath()));
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        try {
            inChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            outChannel =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
            inChannel.transferTo(0, inChannel.size(), outChannel);
            if ((boolean)(Object)src.canExecute()) dest.setExecutable(true, false);
        } catch (final UncheckedIOException e) {
            throw new C4JException(format("Could not copy ‘%s’ to ‘%s’.", src.getPath(), dest.getPath()),(IOException)(Object) e);
        } finally {
            if (inChannel != null) try {
                try {
                    inChannel.close();
                } catch (final UncheckedIOException e) {
                    throw new C4JException(format("Could not close input stream for ‘%s’.", src.getPath()),(IOException)(Object) e);
                }
            } finally {
                if (outChannel != null) try {
                    outChannel.close();
                } catch (final UncheckedIOException e) {
                    throw new C4JException(format("Could not close output stream for ‘%s’.", dest.getPath()),(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass setExecutable(boolean o0, boolean o1){ return null; }
	public MyHelperClass canExecute(){ return null; }}

class C4JException extends Exception{
	public C4JException(String errorMessage) { super(errorMessage); }
	C4JException(MyHelperClass o0, IOException o1){}
	C4JException(){}
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

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
