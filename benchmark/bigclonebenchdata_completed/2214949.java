
import java.io.UncheckedIOException;


class c2214949 {
public static MyHelperClass read(InputStream o0, byte[] o1){ return null; }
	public static MyHelperClass close(InputStream o0){ return null; }
//public MyHelperClass close(InputStream o0){ return null; }
//	public MyHelperClass read(InputStream o0, byte[] o1){ return null; }

    private static int get(URL url, byte[] content) throws IOException {
        int len = -1;
        InputStream in = null;
        try {
            in =(InputStream)(Object) new BufferedInputStream(url.openStream());
            MyHelperClass URLConnection = new MyHelperClass();
            String type =(String)(Object) URLConnection.guessContentTypeFromStream(in);
            if (type == null || type.compareTo("text/html") != 0) {
                return -1;
            }
            len =(int)(Object) read(in, content);
        } catch (UncheckedIOException e) {
            throw e;
        } finally {
            close(in);
        }
        return len;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass guessContentTypeFromStream(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}
