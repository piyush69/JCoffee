import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16502637 {
public MyHelperClass getResource(String o0){ return null; }

    public InputStream getResourceAsStream(String name) {
        try {
            URL url =(URL)(Object) getResource(name);
            System.out.println("Loading \"" + url + "\"...");
            URLConnection urlConnection = url.openConnection();
            if (urlConnection instanceof HttpURLConnection) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
                httpURLConnection.setFollowRedirects(true);
                httpURLConnection.setRequestMethod("GET");
                int responseCode = httpURLConnection.getResponseCode();
                System.out.println(httpURLConnection.getResponseMessage() + ", " + httpURLConnection.getContentLength() + " bytes" + ", " + new Date(httpURLConnection.getDate()) + ", " + new Date(httpURLConnection.getLastModified()));
                if (responseCode != HttpURLConnection.HTTP_OK) {
                    return null;
                }
            }
            return urlConnection.getInputStream();
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
