import java.io.*;
import java.lang.*;
import java.util.*;



class c23619612 {

    public static void init() {
        MyHelperClass init_ = new MyHelperClass();
        if ((boolean)(Object)init_) return;
//        MyHelperClass init_ = new MyHelperClass();
        init_ =(MyHelperClass)(Object) true;
        URLStreamHandler h = new URLStreamHandler() {

            protected URLConnection openConnection(URL _url) throws IOException {
                return (URLConnection)(Object)new Connection(_url);
            }
        };
        MyHelperClass FuLib = new MyHelperClass();
        FuLib.setUrlHandler("data", h);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setUrlHandler(String o0, URLStreamHandler o1){ return null; }}

class URLStreamHandler {

}

class URL {

}

class URLConnection {

}

class Connection {

Connection(URL o0){}
	Connection(){}}
