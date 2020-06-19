import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18544887 {
public MyHelperClass port;
	public MyHelperClass df;
	public MyHelperClass ip;
	public MyHelperClass message;
	public MyHelperClass lon;
	public MyHelperClass lat;

    public boolean add(String url) {
        try {
            HttpURLConnection request = (HttpURLConnection) new URL(url).openConnection();
            request.setRequestMethod("POST");
            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_IP_HEADER, String.valueOf(ip));
//            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_PORT_HEADER, String.valueOf(port));
//            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_MESSAGE_HEADER,(String)(Object) message);
//            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_LATITUDE_HEADER,(String)(Object) df.format(lat));
//            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_LONGITUDE_HEADER,(String)(Object) df.format(lon));
            request.setRequestProperty("Content-Length", "0");
            request.connect();
            if (request.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new IOException("Unexpected response: " + request.getResponseCode() + " " + request.getResponseMessage());
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GAME_PORT_HEADER;
	public MyHelperClass GAME_MESSAGE_HEADER;
	public MyHelperClass GAME_LONGITUDE_HEADER;
	public MyHelperClass GAME_LATITUDE_HEADER;
	public MyHelperClass GAME_IP_HEADER;
public MyHelperClass format(MyHelperClass o0){ return null; }}
