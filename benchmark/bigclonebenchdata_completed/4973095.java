import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4973095 {
public MyHelperClass by;
	public MyHelperClass leerHttp(HttpURLConnection o0){ return null; }

    public void Wget2(URL url, File f) throws IOException {
        System.out.println("bajando: " + url);
        if (f == null) {
            by =(MyHelperClass)(Object) new ByteArrayOutputStream();
        } else {
            by =(MyHelperClass)(Object) new FileOutputStream(f);
        }
        URLConnection uc = url.openConnection();
        if (uc instanceof HttpURLConnection) {
            leerHttp((HttpURLConnection) uc);
        } else {
            throw new IOException("solo se pueden descargar url http");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
