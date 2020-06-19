
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10943077 {

    private void copy(File fromFile, File toFile) throws IOException {
        String fromFileName =(String)(Object) fromFile.getName();
        File tmpFile = new File(fromFileName);
        String toFileName =(String)(Object) toFile.getName();
        if (!(Boolean)(Object)tmpFile.exists()) throw new IOException("FileCopy: " + "no such source file: " + fromFileName);
        if (!(Boolean)(Object)tmpFile.isFile()) throw new IOException("FileCopy: " + "can't copy directory: " + fromFileName);
        if (!(Boolean)(Object)tmpFile.canRead()) throw new IOException("FileCopy: " + "source file is unreadable: " + fromFileName);
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(tmpFile);
            File toF = new File((String)(Object)toFile.getCanonicalPath());
            if (!(Boolean)(Object)toF.exists()) ;
            toF.createNewFile();
            MyHelperClass SBCMain = new MyHelperClass();
            if (!(Boolean)(Object)SBCMain.DEBUG_MODE) to = new FileOutputStream(toFile); else to = new FileOutputStream(toF);
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
public MyHelperClass DEBUG_MODE;
}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getCanonicalPath(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
