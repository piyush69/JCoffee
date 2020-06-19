import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9741008 {

    public  void MetaService()  throws Throwable {
        super();
        URL url = this.getClass().getResource(Resource);
        if (null != url) {
            this.location = url;
            String value = null;
            try {
                InputStream in = url.openStream();
                try {
                    value = (new java.io.DataInputStream(in).readLine());
                    if (null != value) {
                        value = value.trim();
                        if (1 > value.length()) value = null;
                    }
                } finally {
                    in.close();
                }
            } catch (IOException exc) {
                exc.printStackTrace();
            }
            this.value = value;
        } else {
            this.location = null;
            this.value = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
