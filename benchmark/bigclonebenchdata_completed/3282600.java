
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3282600 {

    private static void copyFile(String src, String dst) throws InvocationTargetException {
        try {
            FileChannel srcChannel;
            srcChannel =(FileChannel)(Object) (new FileInputStream(src).getChannel());
            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(dst).getChannel());
            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            srcChannel.close();
            dstChannel.close();
        } catch (UncheckedIOException e) {
            MyHelperClass Messages = new MyHelperClass();
            throw new InvocationTargetException((IOException)(Object)e, Messages.ALFWizardCreationAction_errorSourceFilesNotFound);
        } catch (ArithmeticException e) {
            MyHelperClass Messages = new MyHelperClass();
            throw new InvocationTargetException((IOException)(Object)e, Messages.ALFWizardCreationAction_errorCopyingFiles);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ALFWizardCreationAction_errorCopyingFiles;
	public MyHelperClass ALFWizardCreationAction_errorSourceFilesNotFound;
}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
	InvocationTargetException(){}
	InvocationTargetException(IOException o0, MyHelperClass o1){}
	InvocationTargetException(FileNotFoundException o0, MyHelperClass o1){}
}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
