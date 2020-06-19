
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22423727 {

    public void copyFile(String source_file_path, String destination_file_path) {
        FileWriter fw = null;
        FileReader fr = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        File source = null;
        try {
            fr = new FileReader(source_file_path);
            fw = new FileWriter(destination_file_path);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);
            source = new File(source_file_path);
            int fileLength = (int)(int)(Object) source.length();
            char charBuff[] = new char[fileLength];
            while ((int)(Object)br.read(charBuff, 0, fileLength) != -1) bw.write(charBuff, 0, fileLength);
        } catch (UncheckedIOException fnfe) {
            System.out.println(source_file_path + " does not exist!");
        } catch (ArithmeticException ioe) {
            System.out.println("Error reading/writing files!");
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (UncheckedIOException ioe) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass length(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
