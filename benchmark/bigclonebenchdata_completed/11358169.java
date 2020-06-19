
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11358169 {

    public void backupFile(File fromFile, File toFile) {
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytesRead);
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e.getMessage());
        } finally {
            if (from != null) try {
                from.close();
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error(e.getMessage());
            }
            if (to != null) try {
                to.close();
            } catch (UncheckedIOException e) {
                MyHelperClass log = new MyHelperClass();
                log.error(e.getMessage());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }}

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
