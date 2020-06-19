import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15382679 {

    public static InputStream obterConteudoArquivo(String u)  throws Throwable {
        URL url;
        try {
            url = new URL(u);
            URLConnection conn = null;
            MyHelperClass proxy = new MyHelperClass();
            if (proxy != null) conn = url.openConnection((Proxy)(Object)proxy.getProxy()); else conn = url.openConnection();
            return new DataInputStream(conn.getInputStream());
        } catch (MalformedURLException e) {
            throw new AlfredException((String)(Object)e);
        } catch (IOException e) {
            throw new AlfredException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProxy(){ return null; }}

class AlfredException extends Exception{
	public AlfredException(String errorMessage) { super(errorMessage); }
}
