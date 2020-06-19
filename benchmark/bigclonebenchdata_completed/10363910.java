import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c10363910 {
public MyHelperClass cookie;
	public MyHelperClass Log;

    private String getPayLoadWithCookie(String url) {
        StringBuffer sb = new StringBuffer();
        if (this.cookie != null) {
            try {
                Log.debug("Requesting url ==> " + url);
                URLConnection con = new URL(url).openConnection();
                con.setDoOutput(true);
                con.addRequestProperty("Cookie",(String)(Object) this.cookie);
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String line = "";
                while ((line = br.readLine()) != null) {
                    sb.append(line + "\n");
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }}
