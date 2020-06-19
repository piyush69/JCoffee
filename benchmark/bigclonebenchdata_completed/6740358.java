import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6740358 {

//    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Image getGoogleMapImage(final BigDecimal latitude, final BigDecimal longitude, final Integer zoomLevel)  throws Throwable {
        if (longitude == null) {
            throw new IllegalArgumentException("Longitude cannot be null.");
        }
        if (latitude == null) {
            throw new IllegalArgumentException("Latitude cannot be null.");
        }
        if (zoomLevel == null) {
            throw new IllegalArgumentException("ZoomLevel cannot be null.");
        }
        MyHelperClass GoogleMapsUtils = new MyHelperClass();
        final URI url = GoogleMapsUtils.buildGoogleMapsStaticUrl(latitude, longitude, zoomLevel);
        BufferedImage img;
        try {
            URLConnection conn = url.toURL().openConnection();
            MyHelperClass ImageIO = new MyHelperClass();
            img = ImageIO.read(conn.getInputStream());
        } catch (UnknownHostException e) {
             static MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Google static MAPS web service is not reachable (UnknownHostException).", e);
            MyHelperClass GoogleMapsUtils = new MyHelperClass();
            img = new BufferedImage(GoogleMapsUtils.defaultWidth, 100, BufferedImage.TYPE_INT_RGB);
            final Graphics2D graphics = img.createGraphics();
            MyHelperClass CollectionUtils = new MyHelperClass();
            final Map<Object, Object> renderingHints = CollectionUtils.getHashMap();
            MyHelperClass RenderingHints = new MyHelperClass();
            renderingHints.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            graphics.addRenderingHints(renderingHints);
            MyHelperClass Color = new MyHelperClass();
            graphics.setBackground(Color.WHITE);
            MyHelperClass Color = new MyHelperClass();
            graphics.setColor(Color.GRAY);
            MyHelperClass GoogleMapsUtils = new MyHelperClass();
            graphics.clearRect(0, 0, GoogleMapsUtils.defaultWidth, 100);
            graphics.drawString("Not Available", 30, 30);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return img;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Image {

}

class Transactional {

}

class BufferedImage {

}

class Graphics2D {

}
