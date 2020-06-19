
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18793126 {

    private Image2D resolvePNG(URI uri) {
        Image2D image2D = null;
        if (uri.getScheme() != null) {
            try {
                URL url = new URL(uri.toString());
                InputStream is =(InputStream)(Object) url.openStream();
                MyHelperClass PNGDecoder = new MyHelperClass();
                BufferedImage image =(BufferedImage)(Object) PNGDecoder.decode(is);
                MyHelperClass Image2D = new MyHelperClass();
                int imageType =(int)(Object) Image2D.RGB;
                MyHelperClass BufferedImage = new MyHelperClass();
                if (image.getType() == BufferedImage.TYPE_INT_RGB) imageType =(int)(Object) Image2D.RGB; else if (image.getType() == BufferedImage.TYPE_INT_ARGB) imageType =(int)(Object) Image2D.RGBA;
                image2D = new Image2D(imageType, image);
            } catch (UncheckedIOException ex) {
            }
        } else {
            String path =(String)(Object) uri.getPath();
            File file = new File(path);
            if ((boolean)(Object)file.getAbsoluteFile().exists()) {
                try {
                    FileInputStream is = new FileInputStream(file);
                    MyHelperClass PNGDecoder = new MyHelperClass();
                    BufferedImage image =(BufferedImage)(Object) PNGDecoder.decode(is);
                    MyHelperClass Image2D = new MyHelperClass();
                    int imageType =(int)(Object) Image2D.RGB;
                    MyHelperClass BufferedImage = new MyHelperClass();
                    if (image.getType() == BufferedImage.TYPE_INT_RGB) imageType =(int)(Object) Image2D.RGB; else if (image.getType() == BufferedImage.TYPE_INT_ARGB) imageType =(int)(Object) Image2D.RGBA;
                    image2D = new Image2D(imageType, image);
                } catch (UncheckedIOException ex) {
                } catch (ArithmeticException ex) {
                }
            }
        }
        return image2D;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_INT_RGB;
	public MyHelperClass TYPE_INT_ARGB;
	public MyHelperClass RGB;
	public MyHelperClass RGBA;
public MyHelperClass exists(){ return null; }
	public MyHelperClass decode(InputStream o0){ return null; }
	public MyHelperClass decode(FileInputStream o0){ return null; }}

class URI {

public MyHelperClass getScheme(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class Image2D {

Image2D(){}
	Image2D(int o0, BufferedImage o1){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class BufferedImage {

public MyHelperClass getType(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getAbsoluteFile(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
