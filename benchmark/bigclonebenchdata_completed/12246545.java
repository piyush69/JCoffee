import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c12246545 {
public MyHelperClass url;

    public void load(String url) throws IOException {
        this.url =(MyHelperClass)(Object) url;
        int col = url.indexOf(':');
        if (col > 1 && col < 5) {
            load((String)(Object)new URL(url).openStream());
        } else {
            if (new File(url).exists()) {
                System.out.println("Loading JAD from file : " + url);
                FileInputStream fin = new FileInputStream(url);
                try {
                    load((String)(Object)fin);
                } finally {
                    fin.close();
                }
            } else {
                InputStream in = getClass().getResourceAsStream(url);
                if (in != null) {
                    System.out.println("Loading JAD from classpath : " + url);
                    load((String)(Object)in);
                } else {
                    throw new IOException("\"" + url + "\" was found in file system or classpath");
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
