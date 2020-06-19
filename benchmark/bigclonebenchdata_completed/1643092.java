import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1643092 {

    private static URL handleRedirectUrl(URL url) {
        try {
            URLConnection cn = url.openConnection();
            MyHelperClass Utils = new MyHelperClass();
            Utils.setHeader(cn);
            if (!(cn instanceof HttpURLConnection)) {
                return url;
            }
            HttpURLConnection hcn = (HttpURLConnection) cn;
            hcn.setInstanceFollowRedirects(false);
            int resCode = hcn.getResponseCode();
            if (resCode == 200) {
                System.out.println("URL: " + url);
                return url;
            }
            String location = hcn.getHeaderField("Location");
            hcn.disconnect();
            return handleRedirectUrl(new URL(location.replace(" ", "%20")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return url;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setHeader(URLConnection o0){ return null; }}
