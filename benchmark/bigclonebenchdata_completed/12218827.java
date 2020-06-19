import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12218827 {
public MyHelperClass Codec;
public MyHelperClass password;
public MyHelperClass headers;
	public MyHelperClass username;
	public MyHelperClass checkFileBody(HttpURLConnection o0){ return null; }

        private HttpURLConnection prepare(URL url, String method) {
            if (this.username != null && this.password != null) {
                this.headers.put("Authorization", "Basic " + Codec.encodeBASE64(this.username + ":" + this.password));
            }
            try {
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                checkFileBody(connection);
                connection.setRequestMethod(method);
                for (String key :(String[])(Object) (Object[])(Object)this.headers.keySet()) {
                    connection.setRequestProperty(key,(String)(Object) headers.get(key));
                }
                return connection;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass encodeBASE64(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}
