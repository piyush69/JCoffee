
import java.io.UncheckedIOException;


class c19687731 {

    public static ByteBuffer readShaderBinary(Class context, String path) {
        try {
            MyHelperClass Locator = new MyHelperClass();
            URL url =(URL)(Object) Locator.getResource(context, path);
            if (url == null) {
                return null;
            }
            MyHelperClass StreamUtil = new MyHelperClass();
            return(ByteBuffer)(Object) StreamUtil.readAll2Buffer(new BufferedInputStream(url.openStream()));
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResource(Class o0, String o1){ return null; }
	public MyHelperClass readAll2Buffer(BufferedInputStream o0){ return null; }}

class ByteBuffer {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
