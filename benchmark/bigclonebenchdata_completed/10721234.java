import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c10721234 {
public MyHelperClass NULL;
	public MyHelperClass byteArrayToString(byte[] o0, MyHelperClass o1, MyHelperClass o2){ return null; }
public MyHelperClass utf8detect;

    private String handleRequest(String url, boolean get)  throws Throwable {
        HttpURLConnection c = null;
        InputStream is = null;
        ByteArrayInputStream bais;
        byte[] buf;
        String temp, ret = "";
        int response, len, i;
        try {
            c = (HttpURLConnection) new URL(url).openConnection();
            if (get) c.setRequestMethod("GET"); else c.setRequestMethod("HEAD");
            response = c.getResponseCode();
            if (get) {
                is = c.getInputStream();
                len = (int) c.getContentLength();
                if (len > 0) {
                    byte[] data = new byte[len];
                    for (i = 0; i < len; i++) {
                        data[i] = (byte) is.read();
                    }
                    MyHelperClass bytein = new MyHelperClass();
                   (int)(Object) bytein += data.length;
                    bais = new ByteArrayInputStream(data);
                    while (bais.available() > 0) {
                        MyHelperClass Utils = new MyHelperClass();
                        buf =(byte[])(Object) Utils.readLine(bais);
                        if (buf != null) {
                            MyHelperClass encoding = new MyHelperClass();
                            temp =(String)(Object) byteArrayToString(buf, encoding, utf8detect);
                            MyHelperClass inqueue = new MyHelperClass();
                            inqueue.addElement(temp);
                        }
                    }
                }
            }
            if (is != null) is.close();
            if (c != null) c.disconnect();
        } catch (Exception e) {
            ret += "Request failed, continuing...";
            return ret;
        }
        MyHelperClass HttpStatus = new MyHelperClass();
        if (response != (int)(Object)HttpStatus.SC_OK) {
//            MyHelperClass HttpStatus = new MyHelperClass();
            if (response != (int)(Object)HttpStatus.SC_NOT_FOUND) {
                ret += "Error in connection to IRC server, aborting... ";
                ret += "Error: HTTP response code: " + response;
            }
            boolean connected =(boolean)(Object) NULL; //new boolean();
            connected = false;
            return ret;
        } else return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
	public MyHelperClass SC_NOT_FOUND;
public MyHelperClass readLine(ByteArrayInputStream o0){ return null; }
	public MyHelperClass addElement(String o0){ return null; }}
