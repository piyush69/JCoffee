import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7052397 {
public MyHelperClass log;
	public MyHelperClass response;
	public MyHelperClass jsonContectResult;

    public  void ReqJsonContent(String useragent, String urlstr, String domain, String pathinfo, String alarmMessage) throws Throwable, IOException {
        URL url = new URL(urlstr);
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("user-agent", useragent);
        conn.setRequestProperty("pathinfo", pathinfo);
        conn.setRequestProperty("domain", domain);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF8"));
            response =(MyHelperClass)(Object) new StringBuffer();
            String line = "";
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();
            jsonContectResult =(MyHelperClass)(Object) response.toString();
        } catch (SocketTimeoutException e) {
            log.severe(alarmMessage + "-> " + e.getMessage());
            jsonContectResult = null;
        } catch (Exception e) {
            log.severe(alarmMessage + "-> " + e.getMessage());
            jsonContectResult = null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass severe(String o0){ return null; }
	public MyHelperClass append(String o0){ return null; }}
