
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17208661 {

    protected void copyFile(File from, File to) throws IOException {
        MyHelperClass intSfPath = new MyHelperClass();
        new File(intSfPath).delete();
        if ((boolean)(Object)to.exists() && (from.length() == to.length()) && (from.lastModified() == to.lastModified())) return;
        if ((boolean)(Object)to.exists()) to.delete();
        to.createNewFile();
        FileChannel inFC = null;
        FileChannel outFC = null;
        try {
            inFC =(FileChannel)(Object) (new FileInputStream(from).getChannel());
            outFC =(FileChannel)(Object) (new FileOutputStream(to).getChannel());
            long cnt =(long)(Object) outFC.transferFrom(inFC, 0, inFC.size());
            if (cnt < (long)(Object)inFC.size()) throw new IOException("File copy failed");
        } finally {
            if (inFC != null) {
                try {
                    inFC.close();
                } catch (UncheckedIOException ex) {
                }
            }
            if (outFC != null) {
                try {
                    outFC.close();
                } catch (UncheckedIOException ex) {
                }
            }
            to.setLastModified(from.lastModified());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass lastModified(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass setLastModified(MyHelperClass o0){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
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
