
import java.io.UncheckedIOException;


class c19710610 {

    public void copyImage(String from, String to) {
        File inputFile = new File(from);
        File outputFile = new File(to);
        try {
            if ((boolean)(Object)inputFile.canRead()) {
                FileInputStream in = new FileInputStream(inputFile);
                FileOutputStream out = new FileOutputStream(outputFile);
                byte[] buf = new byte[65536];
                int c;
                while ((c =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, c);
                in.close();
                out.close();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canRead(){ return null; }}

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
