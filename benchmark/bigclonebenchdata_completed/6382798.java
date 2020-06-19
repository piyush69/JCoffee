import java.io.*;
import java.lang.*;
import java.util.*;



class c6382798 {
public MyHelperClass readTimeout;

    public String readURL(URL url) throws JasenException {
        OutputStream out = new ByteArrayOutputStream();
        InputStream in = null;
        String html = null;
        NonBlockingStreamReader reader = null;
        try {
            in =(InputStream)(Object) url.openStream();
            reader = new NonBlockingStreamReader();
            MyHelperClass readBufferSize = new MyHelperClass();
            reader.read(in, out, readBufferSize, readTimeout, null);
            html = new String(((ByteArrayOutputStream) out).toByteArray());
        } catch (UncheckedIOException e) {
            throw new JasenException((String)(Object)e);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignore) {
                }
            }
        }
        return html;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class JasenException extends Exception{
	public JasenException(String errorMessage) { super(errorMessage); }
}

class NonBlockingStreamReader {

public MyHelperClass read(InputStream o0, OutputStream o1, MyHelperClass o2, MyHelperClass o3, Object o4){ return null; }}
