import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21366357 {
public MyHelperClass buildUrl(MyHelperClass o0){ return null; }
public MyHelperClass logger;
	public MyHelperClass addHeaders(HttpURLConnection o0){ return null; }

    protected boolean checkResource(final String resourceName) {
        boolean isValid = true;
        HttpURLConnection.setFollowRedirects(false);
        try {
            final URL url = new URL((String)(Object)buildUrl(new Resource(resourceName).getName()));
            MyHelperClass logger = new MyHelperClass();
            logger.debug("check url: " + url.toString());
            final HttpURLConnection headConnection = (HttpURLConnection) url.openConnection();
            addHeaders(headConnection);
            headConnection.setRequestMethod("HEAD");
            headConnection.setDoOutput(true);
            int statusCode = headConnection.getResponseCode();
            if (statusCode == HttpURLConnection.HTTP_MOVED_PERM) {
                isValid = false;
                logger.debug("responseCode: " + statusCode);
            } else {
                logger.debug("responseCode: " + statusCode);
            }
        } catch (MalformedURLException e) {
            logger.error(e.toString());
            isValid = false;
        } catch (ProtocolException e) {
            logger.error(e.toString());
            isValid = false;
        } catch (IOException e) {
            logger.error(e.toString());
            isValid = false;
        }
        HttpURLConnection.setFollowRedirects(true);
        return isValid;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Resource {

Resource(String o0){}
	Resource(){}
	public MyHelperClass getName(){ return null; }}
