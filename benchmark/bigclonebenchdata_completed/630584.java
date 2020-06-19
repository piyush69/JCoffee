import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c630584 {
public MyHelperClass handleHTTPConnection(HttpURLConnection o0, MyHelperClass o1){ return null; }

    public void run() {
        MyHelperClass m_stats = new MyHelperClass();
        m_stats.setRunning();
//        MyHelperClass m_stats = new MyHelperClass();
        URL url =(URL)(Object) m_stats.url;
        if (url != null) {
            try {
                URLConnection connection = url.openConnection();
                if (connection instanceof HttpURLConnection) {
                    HttpURLConnection httpConnection = (HttpURLConnection) connection;
//                    MyHelperClass m_stats = new MyHelperClass();
                    handleHTTPConnection(httpConnection, m_stats);
                } else {
                    System.out.println("Unknown URL Connection Type " + url);
                }
            } catch (java.io.IOException ioe) {
//                MyHelperClass m_stats = new MyHelperClass();
                m_stats.setStatus(m_stats.IOError);
//                MyHelperClass m_stats = new MyHelperClass();
                m_stats.setErrorString("Error making or reading from connection" + ioe.toString());
            }
        }
//        MyHelperClass m_stats = new MyHelperClass();
        m_stats.setDone();
        MyHelperClass m_manager = new MyHelperClass();
        m_manager.threadFinished(this);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass url;
	public MyHelperClass IOError;
public MyHelperClass setErrorString(String o0){ return null; }
	public MyHelperClass threadFinished(c630584 o0){ return null; }
	public MyHelperClass setDone(){ return null; }
	public MyHelperClass setStatus(MyHelperClass o0){ return null; }
	public MyHelperClass setRunning(){ return null; }}
