
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c21907869 {

    public static void copy(String source, String destination) {
        FileReader in = null;
        FileWriter out = null;
        try {
            File inputFile = new File(source);
            File outputFile = new File(destination);
            in = new FileReader(inputFile);
            out = new FileWriter(outputFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) try {
                in.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
            if (out != null) try {
                out.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileReader {

FileReader(File o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class File {

File(String o0){}
	File(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
