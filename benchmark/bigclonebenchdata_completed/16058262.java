
import java.io.UncheckedIOException;


class c16058262 {
public static MyHelperClass LOGGER;
	public static MyHelperClass workaroundCopyFile(File o0, File o1){ return null; }
//public MyHelperClass LOGGER;
//	public MyHelperClass workaroundCopyFile(File o0, File o1){ return null; }

    public static boolean copyFile(final File src, final File dest, long extent, final boolean overwrite) throws FileNotFoundException, IOException {
        boolean result = false;
        MyHelperClass Level = new MyHelperClass();
        if ((boolean)(Object)LOGGER.isLoggable(Level.FINE)) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.fine("Copying file " + src + " to " + dest + " extent " + extent + " exists " + dest.exists());
        }
        if ((boolean)(Object)dest.exists()) {
            if (overwrite) {
                dest.delete();
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.finer(dest.getAbsolutePath() + " removed before copy.");
            } else {
                return result;
            }
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel fcin = null;
        FileChannel fcout = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            fcin =(FileChannel)(Object) fis.getChannel();
            fcout =(FileChannel)(Object) fos.getChannel();
            if (extent < 0) {
                extent =(long)(Object) fcin.size();
            }
            long trans =(long)(Object) fcin.transferTo(0, extent, fcout);
            if (trans < extent) {
                result = false;
            }
            result = true;
        } catch (UncheckedIOException e) {
            String message = "Copying " + src.getAbsolutePath() + " to " + dest.getAbsolutePath() + " with extent " + extent + " got IOE: " + e.getMessage();
            if (e.getMessage().equals("Invalid argument")) {
                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.severe("Failed copy, trying workaround: " + message);
                workaroundCopyFile(src, dest);
            } else {
                IOException newE = new IOException(message);
                newE.setStackTrace(e.getStackTrace());
                throw newE;
            }
        } finally {
            if (fcin != null) {
                fcin.close();
            }
            if (fcout != null) {
                fcout.close();
            }
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FINE;
public MyHelperClass finer(String o0){ return null; }
	public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

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
	public MyHelperClass transferTo(int o0, long o1, FileChannel o2){ return null; }}
