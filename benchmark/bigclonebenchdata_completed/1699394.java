import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c1699394 {

    private int getPage(StringBuffer ret) throws IOException {
        Properties sysProp;
        int ResponseCode = HttpURLConnection.HTTP_OK;
        BufferedReader br = null;
        try {
            MyHelperClass url = new MyHelperClass();
            URLConnection con =(URLConnection)(Object) url.openConnection();
            con.setDefaultUseCaches(false);
            con.setDoInput(true);
            con.setDoOutput(false);
            if (con instanceof HttpURLConnection) {
                HttpURLConnection httpcon = (HttpURLConnection) con;
                ResponseCode = httpcon.getResponseCode();
                if (ResponseCode != httpcon.HTTP_OK) {
                    httpcon.disconnect();
                    return (ResponseCode);
                }
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;
                int NumberOfLines = 0;
                while ((line = br.readLine()) != null) {
                    ret.append(line + "\n");
                    ++NumberOfLines;
                }
                httpcon.disconnect();
            } else {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line;
                while ((line = br.readLine()) != null) {
                    ret.append(line + "\n");
                }
            }
        } catch (IOException e) {
        } finally {
            if (br != null) br.close();
        }
        return ResponseCode;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }}
