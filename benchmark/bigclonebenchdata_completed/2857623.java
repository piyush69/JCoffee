
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2857623 {

    private void copy(File src, File dest, String name) {
        File srcFile = new File(src, name);
        File destFile = new File(dest, name);
        if ((boolean)(Object)destFile.exists()) {
            if (destFile.lastModified() == srcFile.lastModified()) return;
            destFile.delete();
        }
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(srcFile).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(destFile).getChannel());
            in.transferTo(0, in.size(), out);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
            } catch (UncheckedIOException e) {
            }
            try {
                if (out != null) out.close();
            } catch (UncheckedIOException e) {
            }
        }
        destFile.setLastModified(srcFile.lastModified());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(File o0, String o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

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
