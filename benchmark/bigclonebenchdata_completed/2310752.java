
import java.io.UncheckedIOException;


class c2310752 {

    public static void copy(final String source, final String dest) {
        final File s = new File(source);
        final File w = new File(dest);
        try {
            final FileInputStream in = new FileInputStream(s);
            final FileOutputStream out = new FileOutputStream(w);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (UncheckedIOException ioe) {
            System.out.println("Error reading/writing files!");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}}

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

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
