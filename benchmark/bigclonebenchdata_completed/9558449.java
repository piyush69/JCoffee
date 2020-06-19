import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9558449 {

    public int openUrl(String url, String method, Bundle params) {
        int result = 0;
        try {
            if (method.equals("GET")) {
                MyHelperClass Utility = new MyHelperClass();
                url = url + "?" + Utility.encodeUrl(params);
            }
            String response = "";
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " RenrenAndroidSDK");
            if (!method.equals("GET")) {
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                MyHelperClass Utility = new MyHelperClass();
                conn.getOutputStream().write((int)(Object)Utility.encodeUrl(params).getBytes("UTF-8"));
            }
            MyHelperClass Utility = new MyHelperClass();
            response =(String)(Object) Utility.read(conn.getInputStream());
            JSONObject json = new JSONObject(response);
            try {
                int code =(int)(Object) json.getInt("result");
                if (code > 0) result = 1;
            } catch (Exception e) {
                result =(int)(Object) json.getInt("error_code");
                MyHelperClass errmessage = new MyHelperClass();
                errmessage = json.getString("error_msg");
            }
        } catch (Exception e) {
            result = -1;
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass encodeUrl(Bundle o0){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }}

class Bundle {

}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }}
