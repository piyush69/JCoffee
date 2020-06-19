
import java.io.UncheckedIOException;


class c11088628 {

    public static void copyWithClose(InputStream is, OutputStream os) throws IOException {
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
        } catch (UncheckedIOException ioe) {
            try {
                if (os != null) os.close();
            } catch (Exception e) {
            }
            try {
                if (is != null) is.close();
            } catch (Exception e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
