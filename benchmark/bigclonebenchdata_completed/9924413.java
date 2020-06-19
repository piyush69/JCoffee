import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9924413 {
public MyHelperClass NULL;
	public MyHelperClass Thread;
	public MyHelperClass openerThread;

    private void startOpening(final URL url)  throws Throwable {
        final WebAccessor wa =(WebAccessor)(Object) this;
       (int)(Object) Thread> (int)(Object)openerThread = NULL; //new Thread>();
        openerThread =(MyHelperClass)(Object) new Thread() {

            public void run() {
                MyHelperClass iStream = new MyHelperClass();
                iStream = null;
                try {
                    MyHelperClass NULL = new MyHelperClass();
                    boolean tryProxy =(boolean)(Object) NULL; //new boolean();
                    tryProxy = false;
                    URLConnection connection = url.openConnection();
                    if (connection instanceof HttpURLConnection) {
                        HttpURLConnection htc = (HttpURLConnection) connection;
//                        MyHelperClass NULL = new MyHelperClass();
                        int contentLength =(int)(Object) NULL; //new int();
                        contentLength = htc.getContentLength();
                    }
                    InputStream i = connection.getInputStream();
//                    MyHelperClass iStream = new MyHelperClass();
                    iStream =(MyHelperClass)(Object) new LoggedInputStream(i, wa);
                } catch (ConnectException x) {
                    MyHelperClass NULL = new MyHelperClass();
                    boolean tryProxy =(boolean)(Object) NULL; //new boolean();
                    tryProxy = true;
//                    MyHelperClass NULL = new MyHelperClass();
                    ConnectException exception =(ConnectException)(Object) NULL; //new ConnectException();
                    exception = x;
                } catch (Exception x) {
                    MyHelperClass NULL = new MyHelperClass();
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
        };
//        MyHelperClass openerThread = new MyHelperClass();
        openerThread.start();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass yield(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass start(){ return null; }}

class WebAccessor {

}

class LoggedInputStream {

LoggedInputStream(InputStream o0, WebAccessor o1){}
	LoggedInputStream(){}}
