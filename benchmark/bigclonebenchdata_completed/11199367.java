
import java.io.UncheckedIOException;


class c11199367 {

    private void copy(FileInfo inputFile, FileInfo outputFile) {
        try {
            FileReader in = new FileReader(inputFile.file);
            FileWriter out = new FileWriter(outputFile.file);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
            outputFile.file.setLastModified(inputFile.lastModified);
        } catch (UncheckedIOException e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setLastModified(MyHelperClass o0){ return null; }}

class FileInfo {
public MyHelperClass lastModified;
	public MyHelperClass file;
}

class FileReader {

FileReader(MyHelperClass o0){}
	FileReader(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(MyHelperClass o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
