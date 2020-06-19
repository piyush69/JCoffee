
import java.io.UncheckedIOException;


class c6844411 {

    public static void copyFileTo(String destFileName, String resourceFileName) {
        if (destFileName == null || resourceFileName == null) throw new IllegalArgumentException("Argument cannot be null.");
        try {
            FileInputStream in = null;
            FileOutputStream out = null;
            File resourceFile = new File(resourceFileName);
            if (!(Boolean)(Object)resourceFile.isFile()) {
                System.out.println(resourceFileName + " cannot be opened.");
                return;
            }
            in = new FileInputStream(resourceFile);
            out = new FileOutputStream(new File(destFileName));
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
