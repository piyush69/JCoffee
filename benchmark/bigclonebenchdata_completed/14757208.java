import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14757208 {

    private URL resolveRedirects(URL url, int redirectCount) throws IOException {
        URLConnection uc = url.openConnection();
        if (uc instanceof HttpURLConnection) {
            HttpURLConnection huc = (HttpURLConnection) uc;
            huc.setInstanceFollowRedirects(false);
            huc.connect();
            int responseCode = huc.getResponseCode();
            String location = huc.getHeaderField("location");
            huc.disconnect();
            if ((responseCode == HttpURLConnection.HTTP_MOVED_TEMP) && (redirectCount < 5)) {
                try {
                    URL newUrl = new URL(location);
                    return resolveRedirects(newUrl, redirectCount + 1);
                } catch (MalformedURLException ex) {
                    return url;
                }
            } else return url;
        } else return url;
    }

}
