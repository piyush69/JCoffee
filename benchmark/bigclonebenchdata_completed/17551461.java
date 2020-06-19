
import java.io.UncheckedIOException;


class c17551461 {

    public static void copyFromFileToFileUsingNIO(File inputFile, File outputFile) throws FileNotFoundException, IOException {
        FileChannel inputChannel =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
        FileChannel outputChannel =(FileChannel)(Object) (new FileOutputStream(outputFile).getChannel());
        try {
            inputChannel.transferTo(0, inputChannel.size(), outputChannel);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            if (inputChannel != null) inputChannel.close();
            if (outputChannel != null) outputChannel.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
