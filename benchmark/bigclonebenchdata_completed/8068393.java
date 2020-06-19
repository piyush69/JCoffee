
import java.io.UncheckedIOException;


class c8068393 {

    public static boolean copyFile(String fileIn, String fileOut) {
        FileChannel in = null;
        FileChannel out = null;
        boolean retour = false;
        try {
            in =(FileChannel)(Object) (new FileInputStream(fileIn).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(fileOut).getChannel());
            in.transferTo(0, in.size(), out);
            in.close();
            out.close();
            retour = true;
        } catch (UncheckedIOException e) {
            System.err.println("File : " + fileIn);
            e.printStackTrace();
        }
        return retour;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
