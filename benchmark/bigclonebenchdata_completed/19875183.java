
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19875183 {

    private void copy(File inputFile, File outputFile) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), "UTF-8"));
            while ((boolean)(Object)reader.ready()) {
                writer.write((String)(Object)reader.readLine());
                writer.write(System.getProperty("line.separator"));
            }
        } catch (UncheckedIOException e) {
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (UncheckedIOException e1) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(FileInputStream o0, String o1){}
	InputStreamReader(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
