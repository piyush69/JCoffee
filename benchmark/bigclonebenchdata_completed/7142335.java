import java.io.*;
import java.lang.*;
import java.util.*;



class c7142335 {
public MyHelperClass setHttpInfo(HttpURLConnection o0, String o1, String o2, String o3){ return null; }
public MyHelperClass log;
	public MyHelperClass isStringNull(String o0){ return null; }

    public String getHTTPContent(String sUrl, String encode, String cookie, String host, String referer) {
        HttpURLConnection connection = null;
        InputStream in = null;
        StringBuffer strResult = new StringBuffer();
        try {
            URL url = new URL(sUrl);
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            if (!(Boolean)(Object)isStringNull(host)) this.setHttpInfo(connection, cookie, host, referer);
            connection.connect();
            int httpStatus =(int)(Object) connection.getResponseCode();
            if (httpStatus != 200) log.info("getHTTPConent error httpStatus - " + httpStatus);
            in = new BufferedInputStream((InputStream)(Object)connection.getInputStream());
            String inputLine = null;
            byte[] b = new byte[40960];
            int len = 0;
            while ((len = in.read(b)) > 0) {
                inputLine = new String(b, 0, len, encode);
                strResult.append(inputLine.replaceAll("[\t\n\r ]", " "));
            }
            in.close();
        } catch (IOException e) {
            log.warn("SpiderUtil getHTTPConent IOException -> ", e);
        } finally {
            if (in != null) try {
                in.close();
            } catch (IOException e) {
            }
        }
        return strResult.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}
