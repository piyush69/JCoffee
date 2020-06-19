import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c18811090 {
public static MyHelperClass base64Encode(String o0){ return null; }
//public MyHelperClass base64Encode(String o0){ return null; }

    public static int doPost(String urlString, String username, String password, Map<String, String> parameters) throws IOException {
        PrintWriter out = null;
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            if (username != null && password != null) {
                String encoding =(String)(Object) base64Encode(username + ':' + password);
                connection.setRequestProperty("Authorization", "Basic " + encoding);
            }
            connection.setDoOutput(true);
            out = new PrintWriter(connection.getOutputStream());
            boolean first = true;
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (first) {
                    first = false;
                } else {
                    out.print('&');
                }
                out.print(entry.getKey());
                out.print('=');
                out.print(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
            out.close();
            connection.connect();
            if (!(connection instanceof HttpURLConnection)) {
                throw new IOException();
            }
            return ((HttpURLConnection) connection).getResponseCode();
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
