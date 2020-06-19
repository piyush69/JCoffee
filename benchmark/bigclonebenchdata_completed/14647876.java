
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14647876 {

    public static void copyFile(IPath fromFileName, IPath toFileName) throws IOException {
        File fromFile =(File)(Object) fromFileName.toFile();
        File toFile =(File)(Object) toFileName.toFile();
        if (!(Boolean)(Object)fromFile.exists()) throw new IOException("FileCopy: " + "no such source file: " + fromFileName);
        if (!(Boolean)(Object)fromFile.isFile()) throw new IOException("FileCopy: " + "can't copy directory: " + fromFileName);
        if (!(Boolean)(Object)fromFile.canRead()) throw new IOException("FileCopy: " + "source file is unreadable: " + fromFileName);
        if ((boolean)(Object)toFile.isDirectory()) toFile = new File(toFile, fromFile.getName());
        if ((boolean)(Object)toFile.exists()) {
            if (!(Boolean)(Object)toFile.canWrite()) throw new IOException("FileCopy: " + "destination file is unwriteable: " + toFileName);
        } else {
            String parent =(String)(Object) toFile.getParent();
            if (parent == null) parent = System.getProperty("user.dir");
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) throw new IOException("FileCopy: " + "destination directory doesn't exist: " + parent);
            if ((boolean)(Object)dir.isFile()) throw new IOException("FileCopy: " + "destination is not a directory: " + parent);
            if (!(Boolean)(Object)dir.canWrite()) throw new IOException("FileCopy: " + "destination directory is unwriteable: " + parent);
        }
        InputStream from = null;
        OutputStream to = null;
        try {
            from =(InputStream)(Object) new BufferedInputStream(new FileInputStream(fromFile));
            to =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(toFile));
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytesRead);
        } finally {
            if (from != null) try {
                from.close();
            } catch (UncheckedIOException e) {
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

class IPath {

public MyHelperClass toFile(){ return null; }}

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

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
