import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1769603 {

    public static int getFilesize(String theURL) {
        URL url;
        URLConnection conn;
        int size = -1;
        try {
            url = new URL(theURL);
            conn = url.openConnection();
            MyHelperClass Main = new MyHelperClass();
            conn.setRequestProperty("User-Agent",(String)(Object) Main.USER_AGENT);
//            MyHelperClass Main = new MyHelperClass();
            conn.setConnectTimeout((int)(Object)Main.CONNECT_TIMEOUT * 2);
//            MyHelperClass Main = new MyHelperClass();
            conn.setReadTimeout((int)(Object)Main.READ_TIMEOUT * 2);
            size = conn.getContentLength();
            conn.getInputStream().close();
        } catch (FileNotFoundException fnfe) {
            return -2;
        } catch (ConnectException ce) {
            return -3;
        } catch (ProtocolException fpe) {
            return -2;
        } catch (IOException ioe) {
            return -2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return size;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass READ_TIMEOUT;
	public MyHelperClass CONNECT_TIMEOUT;
	public MyHelperClass USER_AGENT;
}
