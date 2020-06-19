
import java.io.UncheckedIOException;


class c18973299 {
public static MyHelperClass copyFile(File o0, InputStream o1){ return null; }
//public MyHelperClass copyFile(File o0, InputStream o1){ return null; }

    protected static File UrlGzipToAFile(File dir, String urlSt, String fileName) throws CaughtException {
        try {
            URL url = new URL(urlSt);
            InputStream zipped =(InputStream)(Object) url.openStream();
            InputStream unzipped =(InputStream)(Object) new GZIPInputStream(zipped);
            File tempFile = new File(dir, fileName);
            copyFile(tempFile, unzipped);
            return tempFile;
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            throw new CaughtException((IOException)(Object)e, logger);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(File o0, String o1){}
	File(){}}

class CaughtException extends Exception{
	public CaughtException(String errorMessage) { super(errorMessage); }
	CaughtException(IOException o0, MyHelperClass o1){}
	CaughtException(){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
