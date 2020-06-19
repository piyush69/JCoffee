import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14773780 {

    public void testImageInfo() throws Throwable, MalformedURLException, IOException {
        System.out.println("ImageInfo:");
        long start = Calendar.getInstance().getTimeInMillis();
        MyHelperClass images = new MyHelperClass();
        for (int i = 0; i < images.length; i++) {
            MyHelperClass Constants = new MyHelperClass();
            String url = Constants.getDefaultURIMediaConnectorBasePath() + "albums/hund/" + images[i];
            InputStream istream = (new URL(url)).openStream();
            ImageInfo ii = new ImageInfo();
            ii.setInput(istream);
            assertTrue("Not a supported image file format.", ii.check());
            int width = ii.getWidth();
            int height = ii.getHeight();
            System.out.println(width + "x" + height);
        }
        long stop = Calendar.getInstance().getTimeInMillis();
        System.out.println("zeit: " + (stop - start));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ImageInfo {

}
