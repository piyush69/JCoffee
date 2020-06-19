
import java.io.UncheckedIOException;


class c21519782 {

    protected static void copyDeleting(File source, File dest) throws ErrorCodeException {
        byte[] buf = new byte[8 * 1024];
        FileInputStream in = null;
        try {
            in = new FileInputStream(source);
            try {
                FileOutputStream out = new FileOutputStream(dest);
                try {
                    int count;
                    while ((count =(int)(Object) in.read(buf)) >= 0) out.write(buf, 0, count);
                } finally {
                    out.close();
                }
            } finally {
                in.close();
            }
        } catch (UncheckedIOException e) {
            throw new ErrorCodeException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class ErrorCodeException extends Exception{
	public ErrorCodeException(String errorMessage) { super(errorMessage); }
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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
