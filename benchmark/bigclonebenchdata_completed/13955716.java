
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13955716 {

    public static void copier(final File pFichierSource, final File pFichierDest) {
        FileChannel vIn = null;
        FileChannel vOut = null;
        try {
            vIn =(FileChannel)(Object) (new FileInputStream(pFichierSource).getChannel());
            vOut =(FileChannel)(Object) (new FileOutputStream(pFichierDest).getChannel());
            vIn.transferTo(0, vIn.size(), vOut);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (vIn != null) {
                try {
                    vIn.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (vOut != null) {
                try {
                    vOut.close();
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
