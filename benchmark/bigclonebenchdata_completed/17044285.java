import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c17044285 {
public MyHelperClass mbox;
public MyHelperClass uri;
	public MyHelperClass tags;

//    @Override
    public void run() {
        try {
            URL url = new URL((String)(Object)this.uri);
            String data = "tags=" + this.tags + "&mbox=" + this.mbox + "&_method=put";
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            huc.setRequestMethod("POST");
            huc.setDoOutput(true);
            huc.setRequestProperty("Content-type", "application/x-www-form-urlencoded");
            huc.setRequestProperty("Content-Length", "" + data.length());
            huc.getOutputStream().write(data.getBytes());
            huc.getOutputStream().flush();
            huc.connect();
            if (huc.getResponseCode() == 200) {
                System.out.println("Harvested: " + this.uri);
            } else if (huc.getResponseCode() > 200) {
                System.out.println("Not Harvested: " + this.uri + " error: " + huc.getResponseCode());
            }
            huc.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}
