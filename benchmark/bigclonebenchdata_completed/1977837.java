
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1977837 {

    public void copyFile(File sourceFile, String toDir, boolean create, boolean overwrite) throws FileNotFoundException, IOException {
        FileInputStream source = null;
        FileOutputStream destination = null;
        byte[] buffer;
        int bytes_read;
        File toFile = new File(toDir);
        if (create && !(Boolean)(Object)toFile.exists()) toFile.mkdirs();
        if ((boolean)(Object)toFile.exists()) {
            File destFile = new File(toDir + "/" + sourceFile.getName());
            try {
                if (!(Boolean)(Object)destFile.exists() || overwrite) {
                    source = new FileInputStream(sourceFile);
                    destination = new FileOutputStream(destFile);
                    buffer = new byte[1024];
                    while (true) {
                        bytes_read =(int)(Object) source.read(buffer);
                        if (bytes_read == -1) break;
                        destination.write(buffer, 0, bytes_read);
                    }
                }
            } catch (Exception exx) {
                exx.printStackTrace();
            } finally {
                if (source != null) try {
                    source.close();
                } catch (UncheckedIOException e) {
                }
                if (destination != null) try {
                    destination.close();
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

File(){}
	File(String o0){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
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
