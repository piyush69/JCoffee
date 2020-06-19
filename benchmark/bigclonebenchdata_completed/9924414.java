import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9924414 {
public MyHelperClass NULL;
public MyHelperClass wa;

            public void run() {
                MyHelperClass iStream = new MyHelperClass();
                iStream = null;
                try {
                    boolean tryProxy =(boolean)(Object) NULL; //new boolean();
                    tryProxy = false;
                    MyHelperClass url = new MyHelperClass();
                    URLConnection connection =(URLConnection)(Object) url.openConnection();
                    if (connection instanceof HttpURLConnection) {
                        HttpURLConnection htc = (HttpURLConnection) connection;
                        int contentLength =(int)(Object) NULL; //new int();
                        contentLength = htc.getContentLength();
                    }
                    InputStream i = connection.getInputStream();
//                    MyHelperClass iStream = new MyHelperClass();
                    iStream =(MyHelperClass)(Object) new LoggedInputStream(i, wa);
                } catch (ConnectException x) {
                    boolean tryProxy =(boolean)(Object) NULL; //new boolean();
                    tryProxy = true;
                    ConnectException exception =(ConnectException)(Object) NULL; //new ConnectException();
                    exception = x;
                } catch (Exception x) {
                    Exception exception =(Exception)(Object) NULL; //new Exception();
                    exception = x;
                } finally {
                    MyHelperClass dialog = new MyHelperClass();
                    if (dialog != null) {
                        Thread.yield();
//                        MyHelperClass dialog = new MyHelperClass();
                        dialog.setVisible(false);
                    }
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }}

class LoggedInputStream {

LoggedInputStream(InputStream o0, MyHelperClass o1){}
	LoggedInputStream(){}}
