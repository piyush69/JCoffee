import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4262083 {

//        @Override
        public boolean exists() {
            MyHelperClass local_file = new MyHelperClass();
            if ((boolean)(Object)local_file.exists()) {
                return true;
            } else {
                try {
                    MyHelperClass remote_url = new MyHelperClass();
                    URLConnection c =(URLConnection)(Object) remote_url.openConnection();
                    try {
                        MyHelperClass CIO = new MyHelperClass();
                        c.setConnectTimeout((int)(Object)CIO.getLoadingTimeOut());
                        c.connect();
                        return c.getContentLength() > 0;
                    } catch (Exception err) {
                        err.printStackTrace();
                        return false;
                    } finally {
                        if (c instanceof HttpURLConnection) {
                            ((HttpURLConnection) c).disconnect();
                        }
                    }
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getLoadingTimeOut(){ return null; }}
