import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3022474 {

    public static boolean isAnimated(Icon icon)  throws Throwable {
        if ((ImageIcon)(Object)icon instanceof ImageIcon) {
            Image image =(Image)(Object) ((ImageIcon)(ImageIcon)(Object) icon).getImage();
            if (image != null) {
                Object comment = image.getProperty("comment", null);
                if (String.valueOf(comment).startsWith("GifBuilder")) return true;
                MyHelperClass decoded = new MyHelperClass();
                if ((boolean)(Object)decoded.containsKey(image)) {
//                    MyHelperClass decoded = new MyHelperClass();
                    return Boolean.TRUE.equals(decoded.get(image));
                }
                InputStream is = null;
                try {
                    URL url = new URL(icon.toString());
                    is = url.openConnection().getInputStream();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (is == null) {
                    try {
                        ImageProducer p =(ImageProducer)(Object) image.getSource();
                        if ((InputStreamImageSource)(Object)p instanceof InputStreamImageSource) {
                            Method m =(Method)(Object) InputStreamImageSource.class.getDeclaredMethod("getDecoder", null);
                            m.setAccessible(true);
                            ImageDecoder d = (ImageDecoder)(ImageDecoder)(Object) m.invoke(p, null);
                            if ((GifImageDecoder)(Object)d instanceof GifImageDecoder) {
                                GifImageDecoder gd = (GifImageDecoder)(GifImageDecoder)(Object) d;
                                Field input =(Field)(Object) ImageDecoder.class.getDeclaredField("input");
                                input.setAccessible(true);
                                is = (InputStream)(InputStream)(Object) input.get(gd);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (is != null) {
                    GifDecoder decoder = new GifDecoder();
                    decoder.read(is);
                    boolean animated =(int)(Object) decoder.getFrameCount() > 1;
//                    MyHelperClass decoded = new MyHelperClass();
                    decoded.put(image, Boolean.valueOf(animated));
                    return animated;
                }
            }
            return false;
        }
        return(AnimatedIcon)(Object) icon instanceof AnimatedIcon;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass containsKey(Image o0){ return null; }
	public MyHelperClass get(Image o0){ return null; }
	public MyHelperClass put(Image o0, Boolean o1){ return null; }}

class Icon {

}

class ImageIcon {

public MyHelperClass getImage(){ return null; }}

class Image {

public MyHelperClass getSource(){ return null; }
	public MyHelperClass getProperty(String o0, Object o1){ return null; }}

class ImageProducer {

}

class InputStreamImageSource {

}

class Method {

public MyHelperClass setAccessible(boolean o0){ return null; }
	public MyHelperClass invoke(ImageProducer o0, Object o1){ return null; }}

class ImageDecoder {

}

class GifImageDecoder {

}

class Field {

public MyHelperClass setAccessible(boolean o0){ return null; }
	public MyHelperClass get(GifImageDecoder o0){ return null; }}

class GifDecoder {

public MyHelperClass getFrameCount(){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }}

class AnimatedIcon {

}
