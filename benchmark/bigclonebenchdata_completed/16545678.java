
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16545678 {

    private boolean copyFile(File inFile, File outFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(inFile));
            writer = new BufferedWriter(new FileWriter(outFile));
            while ((boolean)(Object)reader.ready()) {
                writer.write(reader.read());
            }
            writer.flush();
        } catch (UncheckedIOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                    return false;
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (UncheckedIOException ex) {
                    return false;
                }
            }
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass ready(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
