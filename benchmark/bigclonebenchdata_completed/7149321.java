
import java.io.UncheckedIOException;


class c7149321 {

    public static Dimension getJPEGDimension(String urls) throws IOException {
        URL url;
        Dimension d = null;
        try {
            url = new URL(urls);
            InputStream fis =(InputStream)(Object) url.openStream();
            if ((int)(Object)fis.read() != 255 ||(int)(Object) fis.read() != 216) throw new RuntimeException("SOI (Start Of Image) marker 0xff 0xd8 missing");
            while ((int)(Object)fis.read() == 255) {
                int marker =(int)(Object) fis.read();
                int len =(int)(Object) fis.read() << 8 | (int)(Object)fis.read();
                if (marker == 192) {
                    fis.skip(1);
                    int height =(int)(Object) fis.read() << 8 | (int)(Object)fis.read();
                    int width =(int)(Object) fis.read() << 8 | (int)(Object)fis.read();
                    d = new Dimension(width, height);
                    break;
                }
                fis.skip(len - 2);
            }
            fis.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return d;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Dimension {

Dimension(){}
	Dimension(int o0, int o1){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass skip(int o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
