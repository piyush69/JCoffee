
import java.io.UncheckedIOException;


class c18696387 {

    public void Converter(String input, String output) {
        try {
            FileInputStream fis = new FileInputStream(new File(input));
            BufferedReader in = new BufferedReader(new InputStreamReader(fis, "SJIS"));
            FileOutputStream fos = new FileOutputStream(new File(output));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos, "UTF8"));
            int len = 80;
            char buf[] = new char[len];
            int numRead;
            while ((numRead =(int)(Object) in.read(buf, 0, len)) != -1) out.write(buf, 0, numRead);
            out.close();
            in.close();
        } catch (UncheckedIOException e) {
            System.out.println("An I/O Exception Occurred: " + e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class File {

File(String o0){}
	File(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass read(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(FileInputStream o0, String o1){}}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(OutputStreamWriter o0){}
	public MyHelperClass write(char[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(){}
	OutputStreamWriter(FileOutputStream o0, String o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
