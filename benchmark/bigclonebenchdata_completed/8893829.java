import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c8893829 {

//                @Override
                public InputStream getInputStream() {
                    MyHelperClass resourceURL_ = new MyHelperClass();
                    String url =(String)(Object) resourceURL_;
                    try {
                        return new URL(url).openStream();
                    } catch (Exception e) {
                    }
                    try {
                        return new FileInputStream("/" + url);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return null;
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
