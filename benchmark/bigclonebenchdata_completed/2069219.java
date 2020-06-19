
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2069219 {

    public static void copieFichier(File fichier1, File fichier2) {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(fichier1).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream(fichier2).getChannel());
            in.transferTo(0, in.size(), out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
