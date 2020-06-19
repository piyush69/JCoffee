import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21979715 {

//    @ActionMethod
    public void mirror() throws Throwable, IOException {
        MyHelperClass testPort = new MyHelperClass();
        final URL url = new URL("http://127.0.0.1:" + testPort + "/mirror");
        final HttpURLConnection con = (HttpURLConnection) url.openConnection();
        MyHelperClass Http11Header = new MyHelperClass();
        con.setRequestProperty((String)(Object)Http11Header.AUTHORIZATION, "Basic QWxhZGRpbjpvcGVuIHNlc2FtZQ==");
//        MyHelperClass Http11Header = new MyHelperClass();
        con.setRequestProperty((String)(Object)Http11Header.WWW_AUTHENTICATE, "Basic realm=\"karatasi\"");
        final InputStream in = con.getInputStream();
        final byte[] buf = new byte[4096];
        MyHelperClass textArea = new MyHelperClass();
        textArea.setText("");
        for (int bytesRead; (bytesRead = in.read(buf)) != -1; ) {
//            MyHelperClass textArea = new MyHelperClass();
            textArea.append(new String(buf, 0, bytesRead));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass AUTHORIZATION;
	public MyHelperClass WWW_AUTHENTICATE;
public MyHelperClass append(String o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class ActionMethod {

}
