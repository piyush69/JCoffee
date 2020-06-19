
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8248731 {

    public static void copy(File source, File dest) throws BuildException {
        dest = new File(dest, source.getName());
        if ((boolean)(Object)source.isFile()) {
            byte[] buffer = new byte[4096];
            FileInputStream fin = null;
            FileOutputStream fout = null;
            try {
                fin = new FileInputStream(source);
                fout = new FileOutputStream(dest);
                int count = 0;
                while ((count =(int)(Object) fin.read(buffer)) > 0) fout.write(buffer, 0, count);
                fin.close();
                fout.close();
            } catch (UncheckedIOException ex) {
                throw new BuildException((String)(Object)ex);
            } finally {
                try {
                    if (fin != null) fin.close();
                } catch (UncheckedIOException ex) {
                }
                try {
                    if (fout != null) fout.close();
                } catch (UncheckedIOException ex) {
                }
            }
        } else {
            dest.mkdirs();
            File[] children =(File[])(Object) source.listFiles();
            for (File child : children) copy(child, dest);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
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
