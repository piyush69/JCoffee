import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19850714 {
public MyHelperClass jsonMessage;
	public MyHelperClass connection;

    public void HttpClient(String urlString, String jsonMessage) throws Exception {
        this.jsonMessage =(MyHelperClass)(Object) jsonMessage;
        connection =(MyHelperClass)(Object) (HttpURLConnection) (new URL(urlString)).openConnection();
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-type", "text/plain");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }}
