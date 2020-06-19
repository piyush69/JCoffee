
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18027718 {

    public byte[] read(IFile input) {
        InputStream contents = null;
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            contents =(InputStream)(Object) input.getContents();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(contents, baos);
            return(byte[])(Object) baos.toByteArray();
        } catch (UncheckedIOException e) {
            MyHelperClass Activator = new MyHelperClass();
            Activator.logUnexpected((Object)(Object)null,(IOException)(Object) e);
        } catch (ArithmeticException e) {
            MyHelperClass Activator = new MyHelperClass();
            Activator.logUnexpected((Object)(Object)null,(IOException)(Object) e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(contents);
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass logUnexpected(Object o0, IOException o1){ return null; }
	public MyHelperClass logUnexpected(Object o0, CoreException o1){ return null; }}

class IFile {

public MyHelperClass getContents(){ return null; }}

class InputStream {

}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}
