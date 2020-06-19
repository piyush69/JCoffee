import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1026391 {

    public ObjectInputStream getObjectInputStreamFromServlet(String strUrl) throws Throwable, Exception {
        MyHelperClass cookie = new MyHelperClass();
        if (cookie == null) {
            return null;
        }
        String starter = "-----------------------------";
        String returnChar = "\r\n";
        String lineEnd = "--";
        String urlString = strUrl;
        String input = null;
        List txtList = new ArrayList();
        List fileList = new ArrayList();
        String targetFile = null;
        String actionStatus = null;
        StringBuffer returnMessage = new StringBuffer();
        List head = new ArrayList();
        final String boundary = String.valueOf(System.currentTimeMillis());
        URL url = null;
        URLConnection conn = null;
        DataOutputStream dos = null;
        ObjectInputStream inputFromServlet = null;
        try {
            url = new URL(urlString);
            conn = url.openConnection();
            ((HttpURLConnection) conn).setRequestMethod("POST");
            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestProperty("Content-Type", "multipart/form-data, boundary=" + "---------------------------" + boundary);
            MyHelperClass HEADER_COOKIE = new MyHelperClass();
            conn.setRequestProperty((String)(Object)HEADER_COOKIE,(String)(Object) cookie);
            if (input != null) {
                String auth = "Basic " + new sun.misc.BASE64Encoder().encode(input.getBytes());
                conn.setRequestProperty("Authorization", auth);
            }
            dos = new DataOutputStream(conn.getOutputStream());
            dos.flush();
            inputFromServlet = new ObjectInputStream(conn.getInputStream());
            txtList.clear();
            fileList.clear();
        } catch (Exception e) {
            MyHelperClass log = new MyHelperClass();
            log.error(e, e);
            return null;
        } finally {
            try {
                dos.close();
            } catch (Exception e) {
            }
        }
        return inputFromServlet;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Exception o0, Exception o1){ return null; }}
