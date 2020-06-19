
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20692111 {
public MyHelperClass fatal(String o0, IOException o1){ return null; }
	public MyHelperClass fatal(String o0, ArchiveException o1){ return null; }

    public void gzip(File from, File to) {
        OutputStream out_zip = null;
        ArchiveOutputStream os = null;
        try {
            try {
                out_zip =(OutputStream)(Object) new FileOutputStream(to);
                os =(ArchiveOutputStream)(Object) (new ArchiveStreamFactory().createArchiveOutputStream("zip", out_zip));
                os.putArchiveEntry(new ZipArchiveEntry(from.getName()));
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(new FileInputStream(from), os);
                os.closeArchiveEntry();
            } finally {
                if (os != null) {
                    os.close();
                }
            }
            out_zip.close();
        } catch (UncheckedIOException ex) {
            fatal("IOException",(IOException)(Object) ex);
        } catch (ArithmeticException ex) {
            fatal("ArchiveException",(IOException)(Object) ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, ArchiveOutputStream o1){ return null; }}

class File {

public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class ArchiveOutputStream {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass putArchiveEntry(ZipArchiveEntry o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class ArchiveStreamFactory {

public MyHelperClass createArchiveOutputStream(String o0, OutputStream o1){ return null; }}

class ZipArchiveEntry {

ZipArchiveEntry(){}
	ZipArchiveEntry(MyHelperClass o0){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ArchiveException extends Exception{
	public ArchiveException(String errorMessage) { super(errorMessage); }
}
