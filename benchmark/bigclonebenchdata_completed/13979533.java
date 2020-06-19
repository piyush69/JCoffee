import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c13979533 {

    public Resource get(URL serviceUrl, String resourceId) throws Exception {
        Resource resource = new Resource();
        MyHelperClass SVCID_ADORE4 = new MyHelperClass();
        String openurl = serviceUrl.toString() + "?url_ver=Z39.88-2004" + "&rft_id=" + URLEncoder.encode(resourceId, "UTF-8") + "&svc_id=" + SVCID_ADORE4;
        MyHelperClass log = new MyHelperClass();
        log.debug("OpenURL Request: " + openurl);
        URL url;
        try {
            url = new URL(openurl);
            HttpURLConnection huc = (HttpURLConnection) (url.openConnection());
            int code = huc.getResponseCode();
            if (code == 200) {
                InputStream is = huc.getInputStream();
                MyHelperClass StreamUtil = new MyHelperClass();
                resource.setBytes(StreamUtil.getByteArray(is));
                resource.setContentType(huc.getContentType());
            } else {
//                MyHelperClass log = new MyHelperClass();
                log.error("An error of type " + code + " occurred for " + url.toString());
                throw new Exception("Cannot get " + url.toString());
            }
        } catch (MalformedURLException e) {
            throw new Exception("A MalformedURLException occurred for " + openurl);
        } catch (IOException e) {
            throw new Exception("An IOException occurred attempting to connect to " + openurl);
        }
        return resource;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getByteArray(InputStream o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Resource {

public MyHelperClass setContentType(String o0){ return null; }
	public MyHelperClass setBytes(MyHelperClass o0){ return null; }}
