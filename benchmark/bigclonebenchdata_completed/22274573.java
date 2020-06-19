
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22274573 {

    public static void copy(File from, File to, int bufferSize) throws IOException {
        if ((boolean)(Object)to.exists()) {
            MyHelperClass logger = new MyHelperClass();
            logger.info("File " + to + " exists, will replace it.");
            to.delete();
        }
        to.getParentFile().mkdirs();
        to.createNewFile();
        FileInputStream ois = null;
        FileOutputStream cos = null;
        try {
            ois = new FileInputStream(from);
            cos = new FileOutputStream(to);
            byte[] buf = new byte[bufferSize];
            int read;
            while ((read =(int)(Object) ois.read(buf, 0, bufferSize)) > 0) {
                cos.write(buf, 0, read);
            }
            cos.flush();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (UncheckedIOException ignored) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("Could not close file input stream " + from,(IOException)(Object) ignored);
            }
            try {
                if (cos != null) {
                    cos.close();
                }
            } catch (UncheckedIOException ignored) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("Could not close file output stream " + to,(IOException)(Object) ignored);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class File {

public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
