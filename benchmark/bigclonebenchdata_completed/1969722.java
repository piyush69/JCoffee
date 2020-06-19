import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1969722 {
public MyHelperClass url;

//    @Override
    public long getLastModifiedOn() {
        try {
            final URLConnection uc =(URLConnection)(Object) this.url.openConnection();
            uc.connect();
            final long res = uc.getLastModified();
            try {
                uc.getInputStream().close();
            } catch (final Exception ignore) {
            }
            return res;
        } catch (final IOException e) {
            return 0;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}
