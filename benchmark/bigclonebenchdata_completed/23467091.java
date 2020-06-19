import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c23467091 {
public MyHelperClass LISTEN_PORT;
public MyHelperClass delay;
	public MyHelperClass LISTEN_BUFFER;
	public MyHelperClass event(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }

    public void listen() {
        MyHelperClass host = new MyHelperClass();
        String url = "http://" + host + ":" + LISTEN_PORT;
        HttpURLConnection conn = null;
        while (true) {
            try {
                conn = (HttpURLConnection) (new URL(url).openConnection());
            } catch (Exception e) {
                error("Could not connect to " + url + ".", e);
                return;
            }
            BufferedInputStream in = null;
            try {
                conn.connect();
                in = new BufferedInputStream(conn.getInputStream(),(int)(Object) LISTEN_BUFFER);
                event("Connected to stream at " + url + ".");
            } catch (Exception e) {
                error("Could not get stream from " + url + ".", e);
                return;
            }
            try {
                byte[] data = new byte[(int)(Object)LISTEN_BUFFER];
                for (int i = 0; i < (int)(Object)delay; i++) {
                    in.read(data);
                }
            } catch (Exception e) {
                error("Stream unexpectedly quit from " + url + ".", e);
                return;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
