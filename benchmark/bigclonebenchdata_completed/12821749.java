
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c12821749 {

    public static void fastBackup(File file) {
        FileChannel in = null;
        FileChannel out = null;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            in =(FileChannel)(Object) (fin = new FileInputStream(file)).getChannel();
            out =(FileChannel)(Object) (fout = new FileOutputStream(file.getAbsolutePath() + ".bak")).getChannel();
            in.transferTo(0, in.size(), out);
        } catch (UncheckedIOException e) {
            MyHelperClass Logging = new MyHelperClass();
            Logging.getErrorLog().reportError("Fast backup failure (" + file.getAbsolutePath() + "): " + e.getMessage());
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Logging = new MyHelperClass();
                    Logging.getErrorLog().reportException("Failed to close file input stream",(IOException)(Object) e);
                }
            }
            if (fout != null) {
                try {
                    fout.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Logging = new MyHelperClass();
                    Logging.getErrorLog().reportException("Failed to close file output stream",(IOException)(Object) e);
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Logging = new MyHelperClass();
                    Logging.getErrorLog().reportException("Failed to close file channel",(IOException)(Object) e);
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Logging = new MyHelperClass();
                    Logging.getErrorLog().reportException("Failed to close file channel",(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass reportError(String o0){ return null; }
	public MyHelperClass getErrorLog(){ return null; }
	public MyHelperClass reportException(String o0, IOException o1){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
