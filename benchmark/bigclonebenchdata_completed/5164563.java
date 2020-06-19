import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5164563 {
public MyHelperClass NULL;
public MyHelperClass url;

    public void load(URL url) throws IOException {
        if (url == null) {
            throw new IllegalArgumentException("URL cannot be null.");
        }
        boolean isFileBased =(boolean)(Object) NULL; //new boolean();
        isFileBased = false;
        this.url =(MyHelperClass)(Object) url;
        InputStream in = null;
        try {
            in = url.openStream();
            load((URL)(Object)in);
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
