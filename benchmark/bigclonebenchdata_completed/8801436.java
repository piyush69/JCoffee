
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8801436 {
public static MyHelperClass abort(String o0){ return null; }
//public MyHelperClass abort(String o0){ return null; }

    public static void copy(File from_file, File to_file) throws IOException {
        if (!(Boolean)(Object)from_file.exists()) abort("FileCopy: no such source file: " + from_file.getName());
        if (!(Boolean)(Object)from_file.isFile()) abort("FileCopy: can't copy directory: " + from_file.getName());
        if (!(Boolean)(Object)from_file.canRead()) abort("FileCopy: source file is unreadable: " + from_file.getName());
        if ((boolean)(Object)to_file.isDirectory()) to_file = new File(to_file, from_file.getName());
        if ((boolean)(Object)to_file.exists()) {
            if (!(Boolean)(Object)to_file.canWrite()) abort("FileCopy: destination file is unwriteable: " + to_file.getName());
        } else {
            String parent =(String)(Object) to_file.getParent();
            if (parent == null) parent = System.getProperty("user.dir");
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) abort("FileCopy: destination directory doesn't exist: " + parent);
            if ((boolean)(Object)dir.isFile()) abort("FileCopy: destination is not a directory: " + parent);
            if (!(Boolean)(Object)dir.canWrite()) abort("FileCopy: destination directory is unwriteable: " + parent);
        }
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(from_file);
            to = new FileOutputStream(to_file);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read =(int)(Object) from.read(buffer)) != -1) {
                to.write(buffer, 0, bytes_read);
            }
        } finally {
            if (from != null) try {
                from.close();
            } catch (UncheckedIOException e) {
                ;
            }
            if (to != null) try {
                to.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass getParent(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
