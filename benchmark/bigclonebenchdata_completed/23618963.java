
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c23618963 {

    public static void copyFile(File src, File dst) {
        try {
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1024];
                int i = 0;
                while ((i =(int)(Object) fis.read(buf)) != -1) fos.write(buf, 0, i);
            } catch (UncheckedIOException e) {
                throw e;
            } finally {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error coping file from " + src + " to " + dst,(IOException)(Object) e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
