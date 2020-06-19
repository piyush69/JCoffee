
import java.io.UncheckedIOException;


class c10689659 {

    public static void copyFile(File fromFile, File toFile) throws OWFileCopyException {
        try {
            FileChannel src =(FileChannel)(Object) (new FileInputStream(fromFile).getChannel());
            FileChannel dest =(FileChannel)(Object) (new FileOutputStream(toFile).getChannel());
            dest.transferFrom(src, 0, src.size());
            src.close();
            dest.close();
        } catch (UncheckedIOException e) {
            throw (new OWFileCopyException("An error occurred while copying a file",(IOException)(Object) e));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class OWFileCopyException extends Exception{
	public OWFileCopyException(String errorMessage) { super(errorMessage); }
	OWFileCopyException(){}
	OWFileCopyException(String o0, IOException o1){}
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
