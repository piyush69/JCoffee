
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15702555 {

//    @Override
    public BufferedImageAndBytes load(T thing) {
        MyHelperClass resolver = new MyHelperClass();
        String iurl =(String)(Object) resolver.getUrl(thing);
        URL url;
        MyHelperClass nTries = new MyHelperClass();
        for (int k = 0; k < (int)(Object)nTries; k++) {
            if (k > 0) {
                MyHelperClass logger = new MyHelperClass();
                logger.debug("retry #" + k);
            }
            try {
                url = new URL(iurl);
                URLConnection connection =(URLConnection)(Object) url.openConnection();
                MyHelperClass userAgent = new MyHelperClass();
                if (userAgent != null) {
//                    MyHelperClass userAgent = new MyHelperClass();
                    connection.setRequestProperty("User-Agent", userAgent);
                }
                InputStream is =(InputStream)(Object) new BufferedInputStream(connection.getInputStream());
                ByteArrayOutputStream baos = new ByteArrayOutputStream(40000);
                int b;
                while ((b =(int)(Object) is.read()) != -1) {
                    baos.write(b);
                }
                is.close();
                byte[] bytes =(byte[])(Object) baos.toByteArray();
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
                MyHelperClass ImageIO = new MyHelperClass();
                BufferedImage image =(BufferedImage)(Object) ImageIO.read(bais);
                return new BufferedImageAndBytes(image, bytes);
            } catch (UncheckedIOException e) {
                continue;
            } catch (ArithmeticException e) {
                continue;
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(ByteArrayInputStream o0){ return null; }
	public MyHelperClass getUrl(T o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class T {

}

class BufferedImageAndBytes {

BufferedImageAndBytes(){}
	BufferedImageAndBytes(BufferedImage o0, byte[] o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setRequestProperty(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}}

class ByteArrayOutputStream {

ByteArrayOutputStream(){}
	ByteArrayOutputStream(int o0){}
	public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}}

class BufferedImage {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
