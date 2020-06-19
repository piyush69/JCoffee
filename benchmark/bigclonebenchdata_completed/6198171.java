import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6198171 {

    public static JSONObject doJSONQuery(String urlstr) throws Throwable, IOException, MalformedURLException, JSONException, SolrException {
        URL url = new URL(urlstr);
        HttpURLConnection con = null;
        try {
            con = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuffer buffer = new StringBuffer();
            String str;
            while ((str = in.readLine()) != null) {
                buffer.append(str + "\n");
            }
            in.close();
            JSONObject response = new JSONObject(buffer.toString());
            return response;
        } catch (IOException e) {
            if (con != null) {
                try {
                    int statusCode = con.getResponseCode();
                    if (statusCode >= 400) {
                        throw (new SolrSelectUtils()).new SolrException(statusCode);
                    }
                } catch (IOException exc) {
                }
            }
            throw (e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class SolrException extends Exception{
	public SolrException(String errorMessage) { super(errorMessage); }
}

class SolrSelectUtils {

}
