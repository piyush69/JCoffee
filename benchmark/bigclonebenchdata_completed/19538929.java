
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19538929 {
public MyHelperClass getFileExtension(MyHelperClass o0){ return null; }
public MyHelperClass OO_CALC_EXTENSION;
	public MyHelperClass getOutputFile(){ return null; }
	public MyHelperClass getInputFile(){ return null; }

    public void invoke(WorkflowContext arg0, ProgressMonitor arg1, Issues arg2) {
        File inputFile = new File(getInputFile());
        File outputFile = new File(getOutputFile());
        if (!(Boolean)(Object)getFileExtension(getInputFile()).equalsIgnoreCase(getFileExtension(getOutputFile())) || !(Boolean)(Object)getFileExtension(getInputFile()).equalsIgnoreCase(OO_CALC_EXTENSION)) {
            OpenOfficeConnection connection =(OpenOfficeConnection)(Object) new SocketOpenOfficeConnection();
            OpenOfficeDocumentConverter converter = new OpenOfficeDocumentConverter(connection);
            converter.convert(inputFile, outputFile);
            connection.disconnect();
        } else {
            FileChannel inputChannel = null;
            FileChannel outputChannel = null;
            try {
                inputChannel =(FileChannel)(Object) (new FileInputStream(inputFile).getChannel());
                outputChannel =(FileChannel)(Object) (new FileOutputStream(outputFile).getChannel());
                outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
            } catch (UncheckedIOException e) {
                arg2.addError("File not found: " + e.getMessage());
            } catch (ArithmeticException e) {
                arg2.addError("Could not copy file: " + e.getMessage());
            } finally {
                if (inputChannel != null) {
                    try {
                        inputChannel.close();
                    } catch (UncheckedIOException e) {
                        arg2.addError("Could not close input channel: " + e.getMessage());
                    }
                }
                if (outputChannel != null) {
                    try {
                        outputChannel.close();
                    } catch (UncheckedIOException e) {
                        arg2.addError("Could not close input channel: " + e.getMessage());
                    }
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(MyHelperClass o0){ return null; }}

class WorkflowContext {

}

class ProgressMonitor {

}

class Issues {

public MyHelperClass addError(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}}

class OpenOfficeConnection {

public MyHelperClass disconnect(){ return null; }}

class SocketOpenOfficeConnection {

}

class OpenOfficeDocumentConverter {

OpenOfficeDocumentConverter(){}
	OpenOfficeDocumentConverter(OpenOfficeConnection o0){}
	public MyHelperClass convert(File o0, File o1){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
