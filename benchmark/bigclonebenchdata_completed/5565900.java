import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c5565900 {
public MyHelperClass IOUtils;
	public MyHelperClass logger;
	public MyHelperClass getURL(String o0, String o1, String o2, boolean o3){ return null; }

    public Resource get(String serviceUrl, String resourceId, String svcId, boolean appendProfile) throws Exception {
        Resource resource = new Resource();
        String openurl =(String)(Object) getURL(serviceUrl, resourceId, svcId, appendProfile);
        logger.debug("OpenURL Request: " + openurl);
        URL url;
        try {
            url = new URL(openurl);
            HttpURLConnection huc = (HttpURLConnection) (url.openConnection());
            int code = huc.getResponseCode();
            if (code == 200) {
                InputStream is = huc.getInputStream();
                resource.setBytes(IOUtils.getByteArray(is));
                resource.setContentType(huc.getContentType());
            } else if (code == 404) {
                return null;
            } else {
                logger.error("An error of type " + code + " occurred for " + url.toString());
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
