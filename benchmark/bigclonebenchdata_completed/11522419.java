
import java.io.UncheckedIOException;


class c11522419 {

    public static void copyFile(File in, File out) {
        int len;
        byte[] buffer = new byte[1024];
        try {
            FileInputStream fin = new FileInputStream(in);
            FileOutputStream fout = new FileOutputStream(out);
            while ((len =(int)(Object) fin.read(buffer)) >= 0) fout.write(buffer, 0, len);
            fin.close();
            fout.close();
        } catch (UncheckedIOException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileInputStream {

FileInputStream(File o0){}
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
