import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22986029 {

    private boolean doDelete(String identifier) throws IOException, MalformedURLException {
        MyHelperClass baseurl = new MyHelperClass();
        URL url = new URL(baseurl.toString() + "/" + identifier);
        HttpURLConnection huc = (HttpURLConnection) (url.openConnection());
        huc.setRequestMethod("DELETE");
        huc.connect();
        if (huc.getResponseCode() == 200) {
            return true;
        } else return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
