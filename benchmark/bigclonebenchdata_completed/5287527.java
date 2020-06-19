import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5287527 {
public MyHelperClass NULL;

    protected InputStream getInputStream() throws Throwable, IOException {
        MyHelperClass source = new MyHelperClass();
        if ((URL)(Object)source instanceof URL) {
//            MyHelperClass source = new MyHelperClass();
            URL url = (URL)(URL)(Object) source;
            String location =(String)(Object) NULL; //new String();
            location = url.toString();
            return url.openStream();
//        MyHelperClass source = new MyHelperClass();
        } else if ((File)(Object)source instanceof File) {
            String location =(String)(Object) NULL; //new String();
            location = ((File)(File)(Object) source).getAbsolutePath();
//            MyHelperClass source = new MyHelperClass();
            return new FileInputStream((File)(File)(Object) source);
//        MyHelperClass source = new MyHelperClass();
        } else if ((String)(Object)source instanceof String) {
            String location =(String)(Object) NULL; //new String();
            location = (String)(String)(Object) source;
//            MyHelperClass source = new MyHelperClass();
            return new FileInputStream((String)(String)(Object) source);
//        MyHelperClass source = new MyHelperClass();
        } else if ((InputStream)(Object)source instanceof InputStream) {
//            MyHelperClass source = new MyHelperClass();
            return (InputStream)(InputStream)(Object) source;
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
