
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18178530 {

    public static void copyFile(File src, File dst) throws IOException {
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("Copying file '" + src.getAbsolutePath() + "' to '" + dst.getAbsolutePath() + "'");
        FileChannel in = null;
        FileChannel out = null;
        try {
            FileInputStream fis = new FileInputStream(src);
            in =(FileChannel)(Object) fis.getChannel();
            FileOutputStream fos = new FileOutputStream(dst);
            out =(FileChannel)(Object) fos.getChannel();
            out.transferFrom(in, 0, in.size());
        } finally {
            try {
                if (in != null) in.close();
            } catch (UncheckedIOException e) {
                MyHelperClass Level = new MyHelperClass();
                LOGGER.log(Level.SEVERE, e.getMessage(),(IOException)(Object) e);
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                    MyHelperClass Level = new MyHelperClass();
                    LOGGER.log(Level.SEVERE, e.getMessage(),(IOException)(Object) e);
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
