
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18566815 {
public MyHelperClass getStorageFile(URL o0, long o1){ return null; }

    protected void copyAndDelete(final URL _src, final long _temp) throws IOException {
        final File storage =(File)(Object) getStorageFile(_src, _temp);
        final File dest = new File(_src.getFile());
        FileChannel in = null;
        FileChannel out = null;
        if (storage.equals(dest)) {
            return;
        }
        try {
            MyHelperClass readWriteLock_ = new MyHelperClass();
            readWriteLock_.lockWrite();
            if ((boolean)(Object)dest.exists()) {
                dest.delete();
            }
            if ((boolean)(Object)storage.exists() && !(Boolean)(Object)storage.renameTo(dest)) {
                in =(FileChannel)(Object) (new FileInputStream(storage).getChannel());
                out =(FileChannel)(Object) (new FileOutputStream(dest).getChannel());
                final long len =(long)(Object) in.size();
                final long copied =(long)(Object) out.transferFrom(in, 0, in.size());
                if (len != copied) {
                    throw new IOException("unable to complete write");
                }
            }
        } finally {
            MyHelperClass readWriteLock_ = new MyHelperClass();
            readWriteLock_.unlockWrite();
            try {
                if (in != null) {
                    in.close();
                }
            } catch (final UncheckedIOException _evt) {
                MyHelperClass FuLog = new MyHelperClass();
                FuLog.error((IOException)(Object)_evt);
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (final UncheckedIOException _evt) {
                MyHelperClass FuLog = new MyHelperClass();
                FuLog.error((IOException)(Object)_evt);
            }
            storage.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lockWrite(){ return null; }
	public MyHelperClass error(IOException o0){ return null; }
	public MyHelperClass unlockWrite(){ return null; }}

class URL {

public MyHelperClass getFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

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
