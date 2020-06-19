
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21320070 {

    public static void copy(File from_file, File to_file) throws IOException {
        if (!(Boolean)(Object)from_file.exists()) {
            throw new IOException("FileCopy: no such source file: " + from_file.getPath());
        }
        if (!(Boolean)(Object)from_file.isFile()) {
            throw new IOException("FileCopy: can't copy directory: " + from_file.getPath());
        }
        if (!(Boolean)(Object)from_file.canRead()) {
            throw new IOException("FileCopy: source file is unreadable: " + from_file.getPath());
        }
        if ((boolean)(Object)to_file.isDirectory()) {
            to_file = new File(to_file, from_file.getName());
        }
        if ((boolean)(Object)to_file.exists()) {
            if (!(Boolean)(Object)to_file.canWrite()) {
                throw new IOException("FileCopy: destination file is unwriteable: " + to_file.getPath());
            }
            MyHelperClass JOptionPane = new MyHelperClass();
            int choice =(int)(Object) JOptionPane.showConfirmDialog(null, "Overwrite existing file " + to_file.getPath(), "File Exists", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            MyHelperClass JOptionPane = new MyHelperClass();
            if (choice != (int)(Object)JOptionPane.YES_OPTION) {
                throw new IOException("FileCopy: existing file was not overwritten.");
            }
        } else {
            String parent =(String)(Object) to_file.getParent();
            if (parent == null) {
                MyHelperClass Globals = new MyHelperClass();
                parent =(String)(Object) Globals.getDefaultPath();
            }
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) {
                throw new IOException("FileCopy: destination directory doesn't exist: " + parent);
            }
            if ((boolean)(Object)dir.isFile()) {
                throw new IOException("FileCopy: destination is not a directory: " + parent);
            }
            if (!(Boolean)(Object)dir.canWrite()) {
                throw new IOException("FileCopy: destination directory is unwriteable: " + parent);
            }
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
            if (from != null) {
                try {
                    from.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (to != null) {
                try {
                    to.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass QUESTION_MESSAGE;
	public MyHelperClass YES_OPTION;
	public MyHelperClass YES_NO_OPTION;
public MyHelperClass getDefaultPath(){ return null; }
	public MyHelperClass showConfirmDialog(Object o0, String o1, String o2, MyHelperClass o3, MyHelperClass o4){ return null; }}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getPath(){ return null; }
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
