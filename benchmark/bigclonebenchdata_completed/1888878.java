
import java.io.UncheckedIOException;


class c1888878 {

    protected void copyFile(File source, File destination) throws ApplicationException {
        try {
            OutputStream out =(OutputStream)(Object) new FileOutputStream(destination);
            DataInputStream in = new DataInputStream(new FileInputStream(source));
            byte[] buf = new byte[8192];
            for (int nread =(int)(Object) in.read(buf); nread > 0; nread =(int)(Object) in.read(buf)) {
                out.write(buf, 0, nread);
            }
            in.close();
            out.close();
        } catch (UncheckedIOException e) {
            throw new ApplicationException("Can't copy file " + source + " to " + destination);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class ApplicationException extends Exception{
	public ApplicationException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class DataInputStream {

DataInputStream(FileInputStream o0){}
	DataInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
