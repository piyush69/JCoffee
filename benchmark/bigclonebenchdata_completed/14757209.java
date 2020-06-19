import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c14757209 {

    public static String loadPage(URL url) throws IOException {
        Reader in = null;
        URLConnection uc;
        HttpURLConnection huc = null;
        try {
            uc = url.openConnection();
            if (uc instanceof HttpURLConnection) {
                huc = (HttpURLConnection) uc;
                huc.setInstanceFollowRedirects(false);
                huc.connect();
                in = new InputStreamReader(huc.getInputStream());
                StringBuilder sb = new StringBuilder();
                int c;
                while ((c = in.read()) != -1) sb.append((char) c);
                return sb.toString();
            } else return null;
        } finally {
            try {
                if (in != null) in.close();
                if (huc != null) huc.disconnect();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
