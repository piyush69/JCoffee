import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18544889 {

    public static boolean delete(String url, int ip, int port) {
        try {
            HttpURLConnection request = (HttpURLConnection) new URL(url).openConnection();
            request.setRequestMethod("DELETE");
            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_IP_HEADER, String.valueOf(ip));
//            MyHelperClass GameRecord = new MyHelperClass();
            request.setRequestProperty((String)(Object)GameRecord.GAME_PORT_HEADER, String.valueOf(port));
            request.connect();
            return request.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass GAME_PORT_HEADER;
	public MyHelperClass GAME_IP_HEADER;
}
