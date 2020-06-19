import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20086435 {

    private InputStream createInputStream(String url) throws MalformedURLException, IOException {
        if (url.startsWith("classpath://")) {
            InputStream is = XMLResource.class.getResourceAsStream(url.substring(12));
            if (is == null) throw new IOException("Couldn't open stream to [" + url + "]");
            return is;
        } else {
            return new URL(url).openStream();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class XMLResource {

}
