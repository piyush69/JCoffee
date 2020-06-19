
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11572565 {

    public static final boolean copy(File source, File target, boolean overwrite) {
        if (!overwrite && (boolean)(Object)target.exists()) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Target file exist and it not permitted to overwrite it !");
            return false;
        }
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(source).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(target).getChannel());
            in.transferTo(0, in.size(), out);
        } catch (UncheckedIOException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getLocalizedMessage());
//            MyHelperClass LOGGER = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isDebugEnabled()) e.printStackTrace();
            return false;
        } catch (ArithmeticException e) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error(e.getLocalizedMessage());
//            MyHelperClass LOGGER = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isDebugEnabled()) e.printStackTrace();
            return false;
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
            try {
                out.close();
            } catch (Exception e) {
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class File {

public MyHelperClass exists(){ return null; }}

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

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
