import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14353890 {
public MyHelperClass url;
	public MyHelperClass log;
	public MyHelperClass xmlString;

    private void getXMLData()  throws Throwable {
        String result = null;
        URL url = null;
        URLConnection conn = null;
        BufferedReader rd = null;
        StringBuffer sb = new StringBuffer();
        String line;
        try {
            url = new URL((String)(Object)this.url);
            conn = url.openConnection();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = rd.readLine()) != null) {
                sb.append(line + "\n");
            }
            rd.close();
            result = sb.toString();
        } catch (MalformedURLException e) {
            log.error("URL was malformed: {}", url, e);
        } catch (IOException e) {
            log.error("IOException thrown: {}", url, e);
        }
        this.xmlString =(MyHelperClass)(Object) result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, URL o1, IOException o2){ return null; }
	public MyHelperClass error(String o0, URL o1, MalformedURLException o2){ return null; }}
