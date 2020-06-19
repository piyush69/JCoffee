
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1725721 {

    public static int writeFile(URL url, File outFilename) {
        InputStream input;
        try {
            input =(InputStream)(Object) url.openStream();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return 0;
        }
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(outFilename);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            return 0;
        }
        return writeFile((URL)(Object)input,(File)(Object) outputStream);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
