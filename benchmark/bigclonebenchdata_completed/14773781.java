import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14773781 {

    public void testJPEGBuffImage() throws Throwable, MalformedURLException, IOException {
        System.out.println("JPEGCodec BufferedImage:");
        long start = Calendar.getInstance().getTimeInMillis();
        MyHelperClass images = new MyHelperClass();
        for (int i = 0; i < images.length; i++) {
            MyHelperClass Constants = new MyHelperClass();
            String url = Constants.getDefaultURIMediaConnectorBasePath() + "albums/hund/" + images[i];
            InputStream istream = (new URL(url)).openStream();
            MyHelperClass JPEGCodec = new MyHelperClass();
            JPEGImageDecoder dec = JPEGCodec.createJPEGDecoder(istream);
            BufferedImage image = dec.decodeAsBufferedImage();
            int width = image.getWidth();
            int height = image.getHeight();
            istream.close();
            System.out.println("w: " + width + " - h: " + height);
        }
        long stop = Calendar.getInstance().getTimeInMillis();
        System.out.println("zeit: " + (stop - start));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JPEGImageDecoder {

}

class BufferedImage {

}
