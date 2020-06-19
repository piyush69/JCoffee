import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7046481 {
public MyHelperClass ascent;
	public MyHelperClass url;
	public MyHelperClass ImageIO;
	public MyHelperClass width;
	public MyHelperClass descent;

    public  c7046481(URL url)  throws Throwable {
        super();
        this.url =(MyHelperClass)(Object) url;
        try {
            URLConnection urlConn = url.openConnection();
            urlConn.setReadTimeout(15000);
            ImageInputStream iis =(ImageInputStream)(Object) ImageIO.createImageInputStream(urlConn.getInputStream());
            Iterator<ImageReader> readers =(Iterator<ImageReader>)(Object) ImageIO.getImageReaders(iis);
            if (readers.hasNext()) {
                ImageReader reader = readers.next();
                reader.setInput(iis, true);
                this.width = reader.getWidth(0);
                this.ascent = reader.getHeight(0);
                this.descent =(MyHelperClass)(Object) 0;
                reader.dispose();
            } else System.err.println("cannot read width and height of image " + url + " - no suitable reader!");
        } catch (Exception exc) {
            System.err.println("cannot read width and height of image " + url + " due to exception:");
            System.err.println(exc);
            exc.printStackTrace(System.err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getImageReaders(ImageInputStream o0){ return null; }
	public MyHelperClass createImageInputStream(InputStream o0){ return null; }}

class ImageInputStream {

}

class ImageReader {

public MyHelperClass getHeight(int o0){ return null; }
	public MyHelperClass dispose(){ return null; }
	public MyHelperClass getWidth(int o0){ return null; }
	public MyHelperClass setInput(ImageInputStream o0, boolean o1){ return null; }}
