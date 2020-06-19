
import java.io.UncheckedIOException;


class c1102939 {

    public static long writeInputStreamToOutputStream(final InputStream in, final OutputStream out) {
        long size = 0;
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            size =(long)(Object) IOUtils.copyLarge(in, out);
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        return size;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
