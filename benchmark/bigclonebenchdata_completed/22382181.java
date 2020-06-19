
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22382181 {
public MyHelperClass register(File o0){ return null; }
	public MyHelperClass delete(File o0){ return null; }

    public boolean copy(File src, File dest, byte[] b) {
        if ((boolean)(Object)src.isDirectory()) {
            String[] ss =(String[])(Object) src.list();
            for (int i = 0; i < ss.length; i++) if (!copy(new File(src, ss[i]), new File(dest, ss[i]), b)) return false;
            return true;
        }
        delete(dest);
        dest.getParentFile().mkdirs();
        try {
            FileInputStream fis = new FileInputStream(src);
            try {
                FileOutputStream fos = new FileOutputStream(dest);
                try {
                    int read;
                    while ((read =(int)(Object) fis.read(b)) != -1) fos.write(b, 0, read);
                } finally {
                    try {
                        fos.close();
                    } catch (UncheckedIOException ignore) {
                    }
                    register(dest);
                }
            } finally {
                fis.close();
            }
            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) log.debug("Success: M-COPY " + src + " -> " + dest);
            return true;
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Failed: M-COPY " + src + " -> " + dest,(IOException)(Object) e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass list(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

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
