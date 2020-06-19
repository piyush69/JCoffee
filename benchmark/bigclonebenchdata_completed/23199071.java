import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23199071 {

//            @Override
            public InputStream getInputStream() {
                try {
                    MyHelperClass webBrowserObject = new MyHelperClass();
                    String url =(String)(Object) webBrowserObject.resourcePath;
                    MyHelperClass Utils = new MyHelperClass();
                    File file =(File)(Object) Utils.getLocalFile(url);
                    if (file != null) {
//                        MyHelperClass webBrowserObject = new MyHelperClass();
                        url =(String)(Object) webBrowserObject.getLocalFileURL(file);
                    }
                    MyHelperClass resource = new MyHelperClass();
                    url = url.substring(0, url.lastIndexOf('/')) + "/" + resource;
                    return new URL(url).openStream();
                } catch (Exception e) {
                }
                return null;
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass resourcePath;
public MyHelperClass getLocalFileURL(File o0){ return null; }
	public MyHelperClass getLocalFile(String o0){ return null; }}
