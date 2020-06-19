
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22712288 {
public static MyHelperClass abort(String o0){ return null; }
//public MyHelperClass abort(String o0){ return null; }

    public static void fileCopy(String from_name, String to_name) throws IOException {
        File fromFile = new File(from_name);
        File toFile = new File(to_name);
        if (fromFile.equals(toFile)) abort("cannot copy on itself: " + from_name);
        if (!(Boolean)(Object)fromFile.exists()) abort("no such currentSourcepartName file: " + from_name);
        if (!(Boolean)(Object)fromFile.isFile()) abort("can't copy directory: " + from_name);
        if (!(Boolean)(Object)fromFile.canRead()) abort("currentSourcepartName file is unreadable: " + from_name);
        if ((boolean)(Object)toFile.isDirectory()) toFile = new File(toFile, fromFile.getName());
        if ((boolean)(Object)toFile.exists()) {
            if (!(Boolean)(Object)toFile.canWrite()) abort("destination file is unwriteable: " + to_name);
        } else {
            String parent =(String)(Object) toFile.getParent();
            if (parent == null) abort("destination directory doesn't exist: " + parent);
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) abort("destination directory doesn't exist: " + parent);
            if ((boolean)(Object)dir.isFile()) abort("destination is not a directory: " + parent);
            if (!(Boolean)(Object)dir.canWrite()) abort("destination directory is unwriteable: " + parent);
        }
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytes_read;
            while ((bytes_read =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytes_read);
        } finally {
            if (from != null) try {
                from.close();
            } catch (UncheckedIOException e) {
                ;
            }
            if (to != null) try {
                to.close();
            } catch (UncheckedIOException e) {
                ;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
