
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c7631411 {

    public static final byte[] getHttpStream(final String uri) {
        URL url;
        try {
            url = new URL(uri);
        } catch (Exception e) {
            return null;
        }
        InputStream is = null;
        try {
            is =(InputStream)(Object) url.openStream();
        } catch (Exception e) {
            return null;
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        byte[] arrayByte = null;
        try {
            arrayByte = new byte[4096];
            int read;
            while ((read =(int)(Object) is.read(arrayByte)) >= 0) {
                os.write(arrayByte, 0, read);
            }
            arrayByte =(byte[])(Object) os.toByteArray();
        } catch (UncheckedIOException e) {
            return null;
        } finally {
            try {
                if (os != null) {
                    os.close();
                    os = null;
                }
                if (is != null) {
                    is.close();
                    is = null;
                }
            } catch (UncheckedIOException e) {
            }
        }
        return arrayByte;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
