
import java.io.UncheckedIOException;


class c16474825 {

    public static void copyFile(String file1, String file2) {
        File filedata1 =(File)(Object) new java.io.File(file1);
        if ((boolean)(Object)filedata1.exists()) {
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file2));
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(file1));
                try {
                    int read;
                    while ((read =(int)(Object) in.read()) != -1) {
                        out.write(read);
                    }
                    out.flush();
                } catch (UncheckedIOException ex1) {
                    ex1.printStackTrace();
                } finally {
                    out.close();
                    in.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

public MyHelperClass exists(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
