import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7718801 {

    protected static StringBuffer doRESTOp(String urlString) throws Throwable, Exception {
        StringBuffer result = new StringBuffer();
        String restUrl = urlString;
        int p = restUrl.indexOf("://");
        if (p < 0) restUrl = System.getProperty("fedoragsearch.protocol") + "://" + System.getProperty("fedoragsearch.hostport") + "/" + System.getProperty("fedoragsearch.path") + restUrl;
        URL url = null;
        url = new URL(restUrl);
        URLConnection conn = null;
        conn = url.openConnection();
        conn.setRequestProperty("Authorization", "Basic " + (new BASE64Encoder()).encode((System.getProperty("fedoragsearch.fgsUserName") + ":" + System.getProperty("fedoragsearch.fgsPassword")).getBytes()));
        conn.connect();
        MyHelperClass content = new MyHelperClass();
        content = null;
//        MyHelperClass content = new MyHelperClass();
        content =(MyHelperClass)(Object) conn.getContent();
        String line;
//        MyHelperClass content = new MyHelperClass();
        BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(InputStream)(Object) content));
        while ((line = br.readLine()) != null) result.append(line);
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
