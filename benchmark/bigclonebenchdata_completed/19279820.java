
import java.io.UncheckedIOException;


class c19279820 {

    private void copyFile(URL from, File to) {
        try {
            InputStream is =(InputStream)(Object) from.openStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, new FileOutputStream(to));
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
