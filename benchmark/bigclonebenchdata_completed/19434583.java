import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c19434583 {
public MyHelperClass encodeSkyhookRequest(LocationRequest o0){ return null; }
	public MyHelperClass decodeSkyhookResponse(String o0, LocationResponse o1){ return null; }
public MyHelperClass skyhookServerUri;

    public LocationResponse getResponse(LocationRequest lrq) throws UnregisteredComponentException {
        LocationResponse lrs =(LocationResponse)(Object) lrq.createResponse();
        try {
            String rqs, rss;
            rqs =(String)(Object) encodeSkyhookRequest(lrq);
            if (null == rqs) {
                lrs.setError("No authentication was provided.");
                return lrs;
            }
            URL url = new URL((String)(Object)this.skyhookServerUri);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.addRequestProperty("Content-Type", "text/xml");
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(rqs);
            wr.flush();
            BufferedReader rd;
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            rss = "";
            String line;
            while ((line = rd.readLine()) != null) rss += line;
            rd.close();
            decodeSkyhookResponse(rss, lrs);
        } catch (Exception e) {
            e.printStackTrace();
            lrs.setError("Error querying Skyhook");
        }
        return lrs;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class LocationRequest {

public MyHelperClass createResponse(){ return null; }}

class LocationResponse {

public MyHelperClass setError(String o0){ return null; }}

class UnregisteredComponentException extends Exception{
	public UnregisteredComponentException(String errorMessage) { super(errorMessage); }
}
