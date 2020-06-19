
import java.io.UncheckedIOException;


class c20544327 {

    public static void copyFile(File fileIn, File fileOut) throws IOException {
        FileChannel chIn =(FileChannel)(Object) (new FileInputStream(fileIn).getChannel());
        FileChannel chOut =(FileChannel)(Object) (new FileOutputStream(fileOut).getChannel());
        try {
            chIn.transferTo(0, chIn.size(), chOut);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (chIn != null) chIn.close();
            if (chOut != null) chOut.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
