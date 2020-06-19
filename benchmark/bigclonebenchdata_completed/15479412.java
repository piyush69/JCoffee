
import java.io.UncheckedIOException;


class c15479412 {
public MyHelperClass logger;

    private ImageReader findImageReader(URL url) {
        ImageInputStream input = null;
        try {
            MyHelperClass ImageIO = new MyHelperClass();
            input =(ImageInputStream)(Object) ImageIO.createImageInputStream(url.openStream());
        } catch (UncheckedIOException e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.WARNING, "zly adres URL obrazka " + url,(IOException)(Object) e);
        }
        ImageReader reader = null;
        if (input != null) {
            MyHelperClass ImageIO = new MyHelperClass();
            Iterator readers =(Iterator)(Object) ImageIO.getImageReaders(input);
            while ((reader == null) && (readers != null) && (boolean)(Object)readers.hasNext()) {
                reader = (ImageReader)(ImageReader)(Object) readers.next();
            }
            reader.setInput(input);
        }
        return reader;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass getImageReaders(ImageInputStream o0){ return null; }
	public MyHelperClass createImageInputStream(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class ImageReader {

public MyHelperClass setInput(ImageInputStream o0){ return null; }}

class ImageInputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}
