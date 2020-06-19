
import java.io.UncheckedIOException;


class c4260650 {

    public void copyFile(File sourceFile, File destFile) throws IOException {
        if (!(Boolean)(Object)destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        Closer c = new Closer();
        try {
            source =(FileChannel)(Object) c.register(new FileInputStream(sourceFile).getChannel());
            destination =(FileChannel)(Object) c.register(new FileOutputStream(destFile).getChannel());
            destination.transferFrom(source, 0, source.size());
        } catch (UncheckedIOException e) {
            c.doNotThrow();
            throw e;
        } finally {
            c.closeAll();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass exists(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class Closer {

public MyHelperClass closeAll(){ return null; }
	public MyHelperClass register(MyHelperClass o0){ return null; }
	public MyHelperClass doNotThrow(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}
