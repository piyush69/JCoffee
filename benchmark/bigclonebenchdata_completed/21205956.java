import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21205956 {
public MyHelperClass url;
public MyHelperClass connection;

    public void connect() throws IOException {
        if (this.connection == null) {
            this.connection =(MyHelperClass)(Object) (HttpURLConnection) (new URL((String)(Object)url)).openConnection();
            this.connection.setRequestMethod("POST");
            this.connection.setUseCaches(false);
            this.connection.setDoOutput(true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }}
