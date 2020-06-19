import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6357972 {
public MyHelperClass loadImage(Image o0, URL o1){ return null; }
public MyHelperClass ImageUtilities;
	public MyHelperClass getDisplay(){ return null; }

        private void loadImage(URL url)  throws Throwable {
            ImageData imageData;
            Image artworkImage = null;
            InputStream artworkStream = null;
            try {
                artworkStream = new BufferedInputStream(url.openStream());
                imageData = new ImageLoader().load(artworkStream)[0];
                Image tmpImage = new Image(getDisplay(), imageData);
                artworkImage = ImageUtilities.scaleImageTo(tmpImage, 128, 128);
                tmpImage.dispose();
            } catch (Exception e) {
            } finally {
                if (artworkStream != null) {
                    try {
                        artworkStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            loadImage(artworkImage, url);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass scaleImageTo(Image o0, int o1, int o2){ return null; }}

class ImageData {

}

class Image {

Image(){}
	Image(MyHelperClass o0, ImageData o1){}
	public MyHelperClass dispose(){ return null; }}

class ImageLoader {

public MyHelperClass load(InputStream o0){ return null; }}
