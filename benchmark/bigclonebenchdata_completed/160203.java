import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c160203 {

    public String readLines() {
        StringBuffer lines = new StringBuffer();
        try {
            int HttpResult;
            MyHelperClass address = new MyHelperClass();
            URL url = new URL((String)(Object)address);
            URLConnection urlconn = url.openConnection();
            urlconn.connect();
            HttpURLConnection httpconn = (HttpURLConnection) urlconn;
            HttpResult = httpconn.getResponseCode();
            if (HttpResult != HttpURLConnection.HTTP_OK) {
//                MyHelperClass address = new MyHelperClass();
                System.out.println("�޷����ӵ�" + address);
            } else {
                BufferedReader reader = new BufferedReader(new InputStreamReader(urlconn.getInputStream()));
                while (true) {
                    String line = reader.readLine();
                    if (line == null) break;
                    lines.append(line + "\r\n");
                }
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
