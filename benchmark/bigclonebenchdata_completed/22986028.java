import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22986028 {
public MyHelperClass logger;

    private boolean doPost(String content) throws Throwable, IOException {
        MyHelperClass baseurl = new MyHelperClass();
        logger.debug("Service Registry PutRecordHandler: " + baseurl.toString());
        MyHelperClass logger = new MyHelperClass();
        logger.debug("**** Service Registry PutRecord Request ****\n " + content);
//        MyHelperClass baseurl = new MyHelperClass();
        HttpURLConnection huc = (HttpURLConnection)(HttpURLConnection)(Object) (baseurl.openConnection());
        huc.setRequestMethod("POST");
        huc.setDoOutput(true);
        ByteArrayInputStream in = new ByteArrayInputStream(content.getBytes());
        OutputStream out = huc.getOutputStream();
        MyHelperClass BUFFER_SIZE = new MyHelperClass();
        byte[] buffer = new byte[(int)(Object)BUFFER_SIZE];
        BufferedInputStream bis = new BufferedInputStream(in);
        int count = 0;
        while ((count = bis.read(buffer)) != -1) {
            out.write(buffer, 0, count);
        }
        out.close();
        int code = huc.getResponseCode();
//        MyHelperClass logger = new MyHelperClass();
        logger.debug("Service Registry Response Code: " + code);
        if (code == 200) {
            return true;
        } else return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }}
