import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c22986027 {

    private String doGet(String identifier) throws IOException, MalformedURLException {
        MyHelperClass baseurl = new MyHelperClass();
        URL url = new URL(baseurl.toString() + "/" + identifier);
        MyHelperClass logger = new MyHelperClass();
        logger.debug("get " + url.toString());
        HttpURLConnection huc = (HttpURLConnection) (url.openConnection());
        BufferedReader reader = new BufferedReader(new InputStreamReader(huc.getInputStream()));
        StringWriter writer = new StringWriter();
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        char[] buffer = new char[(int)(Object)BUFFER_SIZE];
        int count = 0;
        while ((count = reader.read(buffer)) != -1) {
            writer.write(buffer, 0, count);
        }
        writer.close();
        reader.close();
        int code = huc.getResponseCode();
//        MyHelperClass logger = new MyHelperClass();
        logger.debug(" get result" + code);
        if (code == 200) {
            return writer.toString();
        } else throw new IOException("cannot get " + url.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}
