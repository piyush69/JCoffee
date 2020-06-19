
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7545549 {

    public static long getLastModified(URL url) throws IOException {
        if ("file".equals(url.getProtocol())) {
            String externalForm =(String)(Object) url.toExternalForm();
            File file = new File(externalForm.substring(5));
            return(long)(Object) file.lastModified();
        } else {
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            long modified =(long)(Object) connection.getLastModified();
            try {
                InputStream is =(InputStream)(Object) connection.getInputStream();
                if (is != null) is.close();
            } catch (UncheckedIOException use) {
            } catch (ArithmeticException ioe) {
            }
            return modified;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass lastModified(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getLastModified(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class UnknownServiceException extends Exception{
	public UnknownServiceException(String errorMessage) { super(errorMessage); }
}
