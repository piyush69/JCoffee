
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10658266 {

    public static void copy(File srcFile, File destFile) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFile);
            final byte[] buf = new byte[4096];
            int read;
            while ((read =(int)(Object) in.read(buf)) >= 0) {
                out.write(buf, 0, read);
            }
        } finally {
            try {
                if (in != null) in.close();
            } catch (UncheckedIOException ioe) {
            }
            try {
                if (out != null) out.close();
            } catch (UncheckedIOException ioe) {
            }
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
