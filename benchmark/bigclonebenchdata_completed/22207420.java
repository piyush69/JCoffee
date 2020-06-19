
import java.io.UncheckedIOException;


class c22207420 {

    public static void forEachLine(final URL url, final LineListener lit, final String encoding) {
        try {
            MyHelperClass ReaderUtils = new MyHelperClass();
            ReaderUtils.forEachLine(url.openStream(), lit);
        } catch (final UncheckedIOException ioe) {
            lit.exception((IOException)(Object)ioe);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass forEachLine(MyHelperClass o0, LineListener o1){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class LineListener {

public MyHelperClass exception(IOException o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
