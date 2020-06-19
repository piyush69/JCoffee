import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1969721 {
public MyHelperClass url;

//    @Override
    public final boolean exists() {
        try {
            final URLConnection uc =(URLConnection)(Object) this.url.openConnection();
            uc.connect();
            uc.getInputStream().close();
            return true;
        } catch (final IOException e) {
            return false;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}
