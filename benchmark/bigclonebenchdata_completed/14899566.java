
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14899566 {

    public void createZip(File zipFileName, Vector selected) {
        try {
            byte[] buffer = new byte[4096];
            ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFileName), 8096));
            MyHelperClass Deflater = new MyHelperClass();
            out.setLevel(Deflater.BEST_COMPRESSION);
            MyHelperClass ZipOutputStream = new MyHelperClass();
            out.setMethod(ZipOutputStream.DEFLATED);
            for (int i = 0; i < (int)(Object)selected.size(); i++) {
                FileInputStream in = new FileInputStream(selected.get(i));
                String file =(String)(Object) selected.get(i).getPath();
                MyHelperClass fs = new MyHelperClass();
                if (file.indexOf("\\") != -1) file = file.substring(file.lastIndexOf((int)(Object)fs) + 1, file.length());
                ZipEntry ze = new ZipEntry(file);
                out.putNextEntry(ze);
                int len;
                while ((len =(int)(Object) in.read(buffer)) > 0) out.write(buffer, 0, len);
                out.closeEntry();
                in.close();
                selected.get(i).delete();
            }
            out.close();
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        } catch (UncheckedIOException fnfe) {
            fnfe.printStackTrace();
        } catch (ArithmeticException ioe) {
            ioe.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFLATED;
	public MyHelperClass BEST_COMPRESSION;
public MyHelperClass getPath(){ return null; }
	public MyHelperClass delete(){ return null; }}

class File {

}

class Vector {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ZipOutputStream {

ZipOutputStream(){}
	ZipOutputStream(BufferedOutputStream o0){}
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass setMethod(MyHelperClass o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLevel(MyHelperClass o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, int o1){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
