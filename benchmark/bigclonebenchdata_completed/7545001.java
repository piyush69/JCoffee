import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7545001 {

    public static Object GET(String url, String[][] props) throws IOException {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        for (int i = 0; i < props.length; ++i) {
            conn.addRequestProperty(props[i][0], URLEncoder.encode(props[i][1], "UTF-8"));
        }
        conn.connect();
        try {
            return conn.getContent();
        } finally {
            conn.disconnect();
        }
    }

}
