
import java.io.UncheckedIOException;


class c4612220 {

    private void copy(File source, File destination) throws PackageException {
        try {
            FileInputStream in = new FileInputStream(source);
            FileOutputStream out = new FileOutputStream(destination);
            byte[] buff = new byte[1024];
            int len;
            while ((len =(int)(Object) in.read(buff)) > 0) out.write(buff, 0, len);
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            throw new PackageException("Unable to copy " + source.getPath() + " to " + destination.getPath() + " :: " + e.toString());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getPath(){ return null; }}

class PackageException extends Exception{
	public PackageException(String errorMessage) { super(errorMessage); }
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
