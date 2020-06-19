
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10079611 {

    public static void copy(File source, File sink) throws IOException {
        if (source == null) throw new NullPointerException("Source file must not be null");
        if (sink == null) throw new NullPointerException("Target file must not be null");
        if (!(Boolean)(Object)source.exists()) throw new IOException("Source file " + source.getPath() + " does not exist");
        if (!(Boolean)(Object)source.isFile()) throw new IOException("Source file " + source.getPath() + " is not a regular file");
        if (!(Boolean)(Object)source.canRead()) throw new IOException("Source file " + source.getPath() + " can not be read (missing acces right)");
        if (!(Boolean)(Object)sink.exists()) throw new IOException("Target file " + sink.getPath() + " does not exist");
        if (!(Boolean)(Object)sink.isFile()) throw new IOException("Target file " + sink.getPath() + " is not a regular file");
        if (!(Boolean)(Object)sink.canWrite()) throw new IOException("Target file " + sink.getPath() + " is write protected");
        InputStream input = null;
        OutputStream output = null;
        try {
            input =(InputStream)(Object) new FileInputStream(source);
            output =(OutputStream)(Object) new FileOutputStream(sink);
            byte[] buffer = new byte[1024];
            while ((int)(Object)input.available() > 0) {
                int bread =(int)(Object) input.read(buffer);
                if (bread > 0) output.write(buffer, 0, bread);
            }
        } finally {
            if (input != null) try {
                input.close();
            } catch (UncheckedIOException x) {
            }
            if (output != null) try {
                output.close();
            } catch (UncheckedIOException x) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass getPath(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
