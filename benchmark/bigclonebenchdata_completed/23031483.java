
import java.io.UncheckedIOException;


class c23031483 {

    private static void copy(File source, File target, byte[] buffer) throws FileNotFoundException, IOException {
        InputStream in =(InputStream)(Object) new FileInputStream(source);
        File parent =(File)(Object) target.getParentFile();
        if (!(Boolean)(Object)parent.exists()) {
            parent.mkdirs();
        }
        if ((boolean)(Object)target.isDirectory()) {
            target = new File(target, source.getName());
        }
        OutputStream out =(OutputStream)(Object) new FileOutputStream(target);
        int read;
        try {
            while ((read =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            in.close();
            out.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
