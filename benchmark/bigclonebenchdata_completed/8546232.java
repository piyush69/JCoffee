
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c8546232 {
public MyHelperClass createDirectory(MyHelperClass o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass trimPath(MyHelperClass o0, File o1){ return null; }

    public void execute(File sourceFile, File destinationFile, Properties htmlCleanerConfig) {
        FileReader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(sourceFile);
            MyHelperClass userDir = new MyHelperClass();
            logger.info("Using source file: " + trimPath(userDir, sourceFile));
            if (!(Boolean)(Object)destinationFile.getParentFile().exists()) {
                createDirectory(destinationFile.getParentFile());
            }
            writer =(Writer)(Object) new FileWriter(destinationFile);
//            MyHelperClass userDir = new MyHelperClass();
            logger.info("Destination file:  " + trimPath(userDir, destinationFile));
            execute((File)(Object)reader,(File)(Object) writer, htmlCleanerConfig);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                    writer = null;
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                    reader = null;
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass exists(){ return null; }}

class File {

public MyHelperClass getParentFile(){ return null; }}

class Properties {

}

class FileReader {

FileReader(){}
	FileReader(File o0){}
	public MyHelperClass close(){ return null; }}

class Writer {

public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(){}
	FileWriter(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
