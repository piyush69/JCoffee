import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22346314 {
public MyHelperClass URLString;
	public MyHelperClass urlcon;

    public URLConnection makeURLcon() {
        URI uri;
        URL url;
        try {
            uri = new URI((String)(Object)this.URLString);
            url = uri.toURL();
            this.urlcon =(MyHelperClass)(Object) (HttpURLConnection) url.openConnection();
        } catch (final URISyntaxException e) {
            e.printStackTrace();
        } catch (final MalformedURLException e) {
            e.printStackTrace();
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return(URLConnection)(Object) this.urlcon;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
