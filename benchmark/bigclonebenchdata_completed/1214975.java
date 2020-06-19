
import java.io.UncheckedIOException;


class c1214975 {

    public static void writeToFile(InputStream input, File file, ProgressListener listener, long length) {
        OutputStream output = null;
        try {
            output =(OutputStream)(Object) new CountingOutputStream(new FileOutputStream(file), listener, length);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(input, output);
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(input);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(output);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class File {

}

class ProgressListener {

}

class OutputStream {

}

class CountingOutputStream {

CountingOutputStream(FileOutputStream o0, ProgressListener o1, long o2){}
	CountingOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
