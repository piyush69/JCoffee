
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10118200 {

    public static final boolean zipExtract(String zipfile, String name, String dest) {
        boolean f = false;
        try {
            InputStream in =(InputStream)(Object) new BufferedInputStream(new FileInputStream(zipfile));
            ZipInputStream zin = new ZipInputStream(in);
            ZipEntry e;
            while ((e =(ZipEntry)(Object) zin.getNextEntry()) != null) {
                if (e.getName().equals(name)) {
                    FileOutputStream out = new FileOutputStream(dest);
                    MyHelperClass TEMP_FILE_BUFFER_SIZE = new MyHelperClass();
                    byte b[] = new byte[(int)(Object)TEMP_FILE_BUFFER_SIZE];
                    int len = 0;
                    while ((len =(int)(Object) zin.read(b)) != -1) out.write(b, 0, len);
                    out.close();
                    f = true;
                    break;
                }
            }
            zin.close();
        } catch (UncheckedIOException e) {
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.runtimeError((IOException)(Object)e, "extractZip " + zipfile + " " + name);
        } catch (ArithmeticException e) {
            MyHelperClass MLUtil = new MyHelperClass();
            MLUtil.runtimeError((IOException)(Object)e, "extractZip " + zipfile + " " + name);
        }
        return (f);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass runtimeError(IOException o0, String o1){ return null; }
	public MyHelperClass runtimeError(FileNotFoundException o0, String o1){ return null; }}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(FileInputStream o0){}}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(InputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
