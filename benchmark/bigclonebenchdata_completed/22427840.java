
import java.io.UncheckedIOException;


class c22427840 {

        public static void copyFile(File from, File to) {
            try {
                FileInputStream in = new FileInputStream(from);
                FileOutputStream out = new FileOutputStream(to);
                byte[] buffer = new byte[1024 * 16];
                int read = 0;
                while ((read =(int)(Object) in.read(buffer)) >= 0) {
                    out.write(buffer, 0, read);
                }
                in.close();
                out.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
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
