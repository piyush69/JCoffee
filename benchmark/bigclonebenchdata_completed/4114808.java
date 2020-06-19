
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c4114808 {

    public boolean copier(String source, String nomFichierSource, java.io.File destination) {
        boolean resultat = false;
        OutputStream tmpOut;
        try {
            tmpOut =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(nomFichierSource + "001.tmp"));
            InputStream is =(InputStream)(Object) getClass().getResourceAsStream(source + nomFichierSource);
            int i;
            while ((i =(int)(Object) is.read()) != -1) tmpOut.write(i);
            tmpOut.close();
            is.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
        FileChannel in = null;
        FileChannel out = null;
        try {
            in =(FileChannel)(Object) (new FileInputStream(new File(nomFichierSource + "001.tmp")).getChannel());
            out =(FileChannel)(Object) (new FileOutputStream((String)(Object)destination).getChannel());
            in.transferTo(0, in.size(), out);
            resultat = true;
        } catch (java.io.UncheckedIOException f) {
//         } catch (java.io.ArithmeticException e) {
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
        new File(nomFichierSource + "001.tmp").delete();
        return (resultat);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class OutputStream {

public MyHelperClass write(int o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

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

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }}
