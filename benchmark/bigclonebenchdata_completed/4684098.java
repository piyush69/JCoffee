
import java.io.UncheckedIOException;


class c4684098 {

    public static void copyFile(String sIn, String sOut) throws IOException {
        File fIn = new File(sIn);
        File fOut = new File(sOut);
        FileChannel fcIn =(FileChannel)(Object) (new FileInputStream(fIn).getChannel());
        FileChannel fcOut =(FileChannel)(Object) (new FileOutputStream(fOut).getChannel());
        try {
            fcIn.transferTo(0, fcIn.size(), fcOut);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (fcIn != null) fcIn.close();
            if (fcOut != null) fcOut.close();
        }
        fOut.setReadable(fIn.canRead());
        fOut.setWritable(fIn.canWrite());
        fOut.setExecutable(fIn.canExecute());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass setWritable(MyHelperClass o0){ return null; }
	public MyHelperClass setReadable(MyHelperClass o0){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass canExecute(){ return null; }
	public MyHelperClass setExecutable(MyHelperClass o0){ return null; }}

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
