import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19747399 {
public MyHelperClass NULL;

//    @Before
    public void setUp() throws Throwable, Exception {
        ConnectionDigestHandlerDefaultImpl connectionDigestHandler =(ConnectionDigestHandlerDefaultImpl)(Object) NULL; //new ConnectionDigestHandlerDefaultImpl();
        connectionDigestHandler = new ConnectionDigestHandlerDefaultImpl();
        URL url = null;
        try {
            url = new URL("http://dev2dev.bea.com.cn/bbs/servlet/D2DServlet/download/64104-35000-204984-2890/webwork2guide.pdf");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            URLConnection uc =(URLConnection)(Object) NULL; //new URLConnection();
            uc = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Before {

}

class ConnectionDigestHandlerDefaultImpl {

}
