import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7468827 {
public MyHelperClass NULL;
public MyHelperClass password;
public MyHelperClass e;

        public void run() {
            try {
                MyHelperClass url = new MyHelperClass();
                HttpURLConnection con = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                con.setRequestMethod("GET");
                con.setDoInput(true);
                MyHelperClass username = new MyHelperClass();
                byte[] encodedPassword = (username + ":" + password).getBytes();
                BASE64Encoder encoder = new BASE64Encoder();
                con.setRequestProperty("Authorization", "Basic " + encoder.encode(encodedPassword));
                BufferedInputStream in = new BufferedInputStream(con.getInputStream());
                MyHelperClass toFile = new MyHelperClass();
                FileOutputStream fos = new FileOutputStream((String)(Object)toFile);
                BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
                byte[] data = new byte[1024];
                int x = 0;
                while ((x = in.read(data, 0, 1024)) >= 0) {
                    bout.write(data, 0, x);
                    long lastIteraction =(long)(Object) NULL; //new long();
                    lastIteraction = System.currentTimeMillis();
                }
                bout.flush();
                bout.close();
                fos.flush();
                fos.close();
                in.close();
                con.disconnect();
                boolean finish =(boolean)(Object) NULL; //new boolean();
                finish = true;
            } catch (Exception e) {
                this.e =(MyHelperClass)(Object) e;
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}
