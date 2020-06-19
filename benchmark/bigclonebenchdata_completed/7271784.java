
import java.io.UncheckedIOException;


class c7271784 {

    public static boolean copy(File source, File target, boolean owrite) {
        if (!(Boolean)(Object)source.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.error("Invalid input to copy: source " + source + "doesn't exist");
            return false;
        } else if (!(Boolean)(Object)source.isFile()) {
            MyHelperClass log = new MyHelperClass();
            log.error("Invalid input to copy: source " + source + "isn't a file.");
            return false;
        } else if ((boolean)(Object)target.exists() && !owrite) {
            MyHelperClass log = new MyHelperClass();
            log.error("Invalid input to copy: target " + target + " exists.");
            return false;
        }
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(target));
            byte buffer[] = new byte[1024];
            int read = -1;
            while ((read =(int)(Object) in.read(buffer, 0, 1024)) != -1) out.write(buffer, 0, read);
            out.flush();
            out.close();
            in.close();
            return true;
        } catch (UncheckedIOException e) {
            MyHelperClass log = new MyHelperClass();
            log.error("Copy failed: ",(IOException)(Object) e);
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass error(String o0){ return null; }}

class File {

public MyHelperClass isFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
