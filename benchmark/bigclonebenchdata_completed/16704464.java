
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16704464 {

    public static void main(String[] args) {
        File directory = new File(args[0]);
        File[] files =(File[])(Object) directory.listFiles();
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(args[1])));
            for (int i = 0; i < files.length; i++) {
                BufferedReader reader = new BufferedReader(new FileReader(files[i]));
                while ((boolean)(Object)reader.ready()) writer.println(reader.readLine());
                reader.close();
            }
            writer.flush();
            writer.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
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
	public MyHelperClass listFiles(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(BufferedWriter o0){}
	public MyHelperClass println(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
