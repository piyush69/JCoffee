
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11036037 {

    public static void copy(String srcFilename, String destFilename) throws IOException {
        int bytes_read = 0;
        byte[] buffer = new byte[512];
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            fin = new FileInputStream(srcFilename);
            try {
                fout = new FileOutputStream(destFilename);
                while ((bytes_read =(int)(Object) fin.read(buffer)) != -1) {
                    fout.write(buffer, 0, bytes_read);
                }
            } finally {
                try {
                    if (fout != null) {
                        fout.close();
                        fout = null;
                    }
                } catch (UncheckedIOException e) {
                }
            }
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                    fin = null;
                }
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
