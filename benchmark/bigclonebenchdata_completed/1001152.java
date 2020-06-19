import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1001152 {

    private void doOp(String urlString)  throws Throwable {
        URL url = null;
        try {
            url = new URL(urlString);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }
        URLConnection conn = null;
        try {
            conn = url.openConnection();
            conn.setRequestProperty("Authorization", "Basic " + (new BASE64Encoder()).encode((System.getProperty("fedoragsearch.fgsUserName") + ":" + System.getProperty("fedoragsearch.fgsPassword")).getBytes()));
            conn.connect();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        MyHelperClass content = new MyHelperClass();
        content = null;
        try {
//            MyHelperClass content = new MyHelperClass();
            content =(MyHelperClass)(Object) conn.getContent();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        String line;
//        MyHelperClass content = new MyHelperClass();
        BufferedReader br = new BufferedReader(new InputStreamReader((InputStream)(InputStream)(Object) content));
        try {
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
