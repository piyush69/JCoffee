import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15066035 {
public MyHelperClass NULL;

    private void connect(byte[] bData) {
        MyHelperClass url = new MyHelperClass();
        System.out.println("Connecting to: " + url.toString());
        String SOAPAction = "";
        URLConnection connection = null;
        try {
//            MyHelperClass url = new MyHelperClass();
            connection =(URLConnection)(Object) url.openConnection();
            HttpURLConnection httpConn =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
            httpConn = (HttpURLConnection) connection;
//            MyHelperClass httpConn = new MyHelperClass();
            httpConn.setRequestProperty("Content-Length", String.valueOf(bData.length));
//            MyHelperClass httpConn = new MyHelperClass();
            httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
//            MyHelperClass httpConn = new MyHelperClass();
            httpConn.setRequestProperty("SOAPAction", SOAPAction);
//            MyHelperClass httpConn = new MyHelperClass();
            httpConn.setRequestMethod("POST");
//            MyHelperClass httpConn = new MyHelperClass();
            httpConn.setDoOutput(true);
//            MyHelperClass httpConn = new MyHelperClass();
            httpConn.setDoInput(true);
        } catch (IOException ioExp) {
            MyHelperClass CommonLogger = new MyHelperClass();
            CommonLogger.error(this, "Error while connecting to  SOAP server !", ioExp);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass error(c15066035 o0, String o1, IOException o2){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}
