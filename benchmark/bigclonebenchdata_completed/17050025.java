
import java.io.UncheckedIOException;


class c17050025 {
public static MyHelperClass exceptionLocalizer;
//public MyHelperClass exceptionLocalizer;

    private static String retrieveVersion(InputStream is) throws RepositoryException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, buffer);
        } catch (UncheckedIOException e) {
            MyHelperClass DeviceRepositoryConstants = new MyHelperClass();
            throw new RepositoryException(exceptionLocalizer.format("device-repository-file-missing", DeviceRepositoryConstants.VERSION_FILENAME),(IOException)(Object) e);
        }
        return buffer.toString().trim();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERSION_FILENAME;
public MyHelperClass format(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class InputStream {

}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
	RepositoryException(){}
	RepositoryException(MyHelperClass o0, IOException o1){}
}

class ByteArrayOutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
