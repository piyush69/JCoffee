import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c16598485 {

    private void writeToUrl(byte[] data, String url) throws IOException, MalformedURLException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        OutputStream out = connection.getOutputStream();
        out.write(data);
        out.flush();
        out.close();
    }

}
