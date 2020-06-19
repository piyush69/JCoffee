
import java.io.UncheckedIOException;


class c20428223 {

    public void extractSong(Song s, File dir) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        File dest = new File(dir, s.file.getName());
        if (dest.equals(s.file)) return;
        MyHelperClass COPY_BLOCKSIZE = new MyHelperClass();
        byte[] buf = new byte[(int)(Object)COPY_BLOCKSIZE];
        try {
            fin = new FileInputStream(s.file);
            fout = new FileOutputStream(dest);
            int read = 0;
            do {
                read =(int)(Object) fin.read(buf);
                if (read > 0) fout.write(buf, 0, read);
            } while (read > 0);
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
            MyHelperClass Dialogs = new MyHelperClass();
            Dialogs.showErrorDialog("xtract.error");
        } finally {
            try {
                fin.close();
                fout.close();
            } catch (Exception ex) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass showErrorDialog(String o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class Song {
public MyHelperClass file;
}

class File {

File(File o0, MyHelperClass o1){}
	File(){}}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
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
