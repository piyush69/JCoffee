import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19480308 {
public MyHelperClass _complete;
	public MyHelperClass _uri;
	public MyHelperClass _input_stream;

//        @Override
//        @SuppressWarnings("empty-statement")
        public void run()  throws Throwable {
            String server = System.getProperty("server.downsampler");
            MyHelperClass FALLBACK = new MyHelperClass();
            if (server == null) server =(String)(Object) FALLBACK;
            String url = server + "cgi-bin/downsample.cgi?" + this._uri.toString();
            url = url.replaceAll("\\?#$", "");
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setDoInput(true);
                this._input_stream =(MyHelperClass)(Object) connection.getInputStream();
                while ((char)(Object)this._input_stream.read() != '\n') ;
                this._complete =(MyHelperClass)(Object) true;
            } catch (Exception e) {
                new ErrorEvent().send(e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass read(){ return null; }}

class ErrorEvent {

public MyHelperClass send(Exception o0){ return null; }}
