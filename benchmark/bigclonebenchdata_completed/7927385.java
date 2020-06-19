import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7927385 {
public MyHelperClass StreamUtil;
	public MyHelperClass cookie;
	public MyHelperClass getUrl(String o0){ return null; }

    private String send(String method, String contentType, String urlStr, String body) throws MalformedURLException, IOException {
        HttpURLConnection postCon = (HttpURLConnection) new URL((String)(Object)getUrl(urlStr)).openConnection();
        postCon.setRequestMethod(method);
        postCon.setDoOutput(true);
        postCon.setDoInput(true);
        if (cookie != null) {
            postCon.setRequestProperty("Cookie",(String)(Object) cookie);
            if (contentType != null) {
                postCon.setRequestProperty("Content-type", contentType);
            }
            postCon.setRequestProperty("Content-Length", body == null ? "0" : Integer.toString(body.length()));
        }
        if (body != null) {
            OutputStream os = postCon.getOutputStream();
            OutputStreamWriter out = new OutputStreamWriter(os);
            out.write(body);
            out.close();
        }
        InputStream is = null;
        try {
            is = postCon.getInputStream();
        } catch (IOException ioe) {
            is = postCon.getErrorStream();
        }
        int resCode = postCon.getResponseCode();
        if (resCode == 201 || resCode == 202) {
            String loc = postCon.getHeaderField("Location");
            System.out.println("loc:" + loc);
            return loc;
        }
        StringBuffer sb =(StringBuffer)(Object) StreamUtil.readStream(is);
        return sb.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass readStream(InputStream o0){ return null; }}
