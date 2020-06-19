
import java.io.UncheckedIOException;


class c19935037 {

    public byte[] getByteCode() throws IOException {
        InputStream in = null;
        ByteArrayOutputStream buf = new ByteArrayOutputStream(2048);
        try {
            MyHelperClass url = new MyHelperClass();
            in =(InputStream)(Object) url.openStream();
            int b =(int)(Object) in.read();
            while (b != -1) {
                buf.write(b);
                b =(int)(Object) in.read();
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
        return(byte[])(Object) buf.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

ByteArrayOutputStream(int o0){}
	ByteArrayOutputStream(){}
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
