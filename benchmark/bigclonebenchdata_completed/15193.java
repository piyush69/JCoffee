
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15193 {

    public static void copy(String fromFileName, String toFileName) throws IOException {
        File fromFile = new File(fromFileName);
        File toFile = new File(toFileName);
        if (!(Boolean)(Object)fromFile.exists()) throw new IOException("Copy: no such source file: " + fromFileName);
        if (!(Boolean)(Object)fromFile.canRead()) throw new IOException("Copy: source file is unreadable: " + fromFileName);
        if ((boolean)(Object)toFile.isDirectory()) toFile = new File(toFile, fromFile.getName());
        if ((boolean)(Object)toFile.exists()) {
            if (!(Boolean)(Object)toFile.canWrite()) throw new IOException("Copy: destination file is unwriteable: " + toFileName);
            MyHelperClass JOptionPane = new MyHelperClass();
            if (JOptionPane.showConfirmDialog(null, "Overwrite File ?", "Overwrite File", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) return;
        } else {
            String parent =(String)(Object) toFile.getParent();
            if (parent == null) parent = System.getProperty("user.dir");
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) throw new IOException("Copy: destination directory doesn't exist: " + parent);
            if ((boolean)(Object)dir.isFile()) throw new IOException("Copy: destination is not a directory: " + parent);
            if (!(Boolean)(Object)dir.canWrite()) throw new IOException("Copy: destination directory is unwriteable: " + parent);
        }
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytesRead);
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
public MyHelperClass YES_NO_OPTION;
	public MyHelperClass NO_OPTION;
public MyHelperClass showConfirmDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }}

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
