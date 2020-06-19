
import java.io.UncheckedIOException;


class c6844412 {

    public static void copyResourceFileTo(String destFileName, String resourceFileName) {
        if (destFileName == null || resourceFileName == null) throw new IllegalArgumentException("Argument cannot be null.");
        try {
            FileInputStream in = null;
            FileOutputStream out = null;
            URL url =(URL)(Object) HelperMethods.class.getResource(resourceFileName);
            if (url == null) {
                System.out.println("URL " + resourceFileName + " cannot be created.");
                return;
            }
            String fileName =(String)(Object) url.getFile();
            fileName = fileName.replaceAll("%20", " ");
            File resourceFile = new File(fileName);
            if (!(Boolean)(Object)resourceFile.isFile()) {
                System.out.println(fileName + " cannot be opened.");
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

class URL {

public MyHelperClass getFile(){ return null; }}

class HelperMethods {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass isFile(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
