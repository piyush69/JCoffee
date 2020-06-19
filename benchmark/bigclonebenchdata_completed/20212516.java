
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20212516 {

    public static boolean copy(String from, String to) {
        boolean result;
        String newLine;
        FileInputStream input;
        FileOutputStream output;
        File source;
        int fileLength;
        byte byteBuff[];
        result = false;
        input = null;
        output = null;
        source = null;
        try {
            input = new FileInputStream(from);
            output = new FileOutputStream(to);
            source = new File(from);
            fileLength = (int)(int)(Object) source.length();
            byteBuff = new byte[fileLength];
            while ((int)(Object)input.read(byteBuff, 0, fileLength) != -1) output.write(byteBuff, 0, fileLength);
            result = true;
        } catch (UncheckedIOException e) {
            System.out.println(from + " does not exist!");
        } catch (ArithmeticException e) {
            System.out.println("Error reading/writing files!");
        } finally {
            try {
                if (input != null) input.close();
                if (output != null) output.close();
            } catch (UncheckedIOException e) {
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
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
