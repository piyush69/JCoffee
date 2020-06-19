import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19193061 {

    public static URL getWikipediaPage(String concept, String language) throws MalformedURLException, IOException {
        MyHelperClass UTF_8_ENCODING = new MyHelperClass();
        String url = "http://" + language + ".wikipedia.org/wiki/Special:Search?search=" + URLEncoder.encode(concept,(String)(Object) UTF_8_ENCODING) + "&go=Go";
        HttpURLConnection.setFollowRedirects(false);
        HttpURLConnection httpConnection = null;
        try {
            httpConnection = (HttpURLConnection) new URL(url).openConnection();
            httpConnection.connect();
            int responseCode = httpConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                return null;
            } else if (responseCode == HttpURLConnection.HTTP_MOVED_TEMP || responseCode == HttpURLConnection.HTTP_MOVED_PERM) {
                return new URL(httpConnection.getHeaderField("Location"));
            } else {
                MyHelperClass logger = new MyHelperClass();
                logger.warn("Unexpected response code (" + responseCode + ").");
                return null;
            }
        } finally {
            if (httpConnection != null) {
                httpConnection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0){ return null; }}
