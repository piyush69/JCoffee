import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c15515730 {
public MyHelperClass endpointURL;

    public void delete(String fileName) throws IOException {
        MyHelperClass log = new MyHelperClass();
        log.debug("deleting: " + fileName);
        URL url = new URL(this.endpointURL + "?operation=delete&filename=" + fileName);
        URLConnection connection = url.openConnection();
        connection.setDoOutput(false);
        connection.setDoInput(true);
        connection.setUseCaches(false);
        connection.getInputStream();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}
