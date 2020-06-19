


class c2736180 {
public static MyHelperClass getResponseBody(InputStream o0, int o1){ return null; }
//public MyHelperClass getResponseBody(InputStream o0, int o1){ return null; }

    public static byte[] getURLContent(String urlPath) {
        HttpURLConnection conn = null;
        InputStream inStream = null;
        byte[] buffer = null;
        try {
            URL url = new URL(urlPath);
            MyHelperClass HttpURLConnection = new MyHelperClass();
            HttpURLConnection.setFollowRedirects(false);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setDefaultUseCaches(false);
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(60000);
            conn.connect();
            int repCode =(int)(Object) conn.getResponseCode();
            if (repCode == 200) {
                inStream =(InputStream)(Object) conn.getInputStream();
                int contentLength =(int)(Object) conn.getContentLength();
                buffer =(byte[])(Object) getResponseBody(inStream, contentLength);
            }
        } catch (Exception ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("", ex);
        } finally {
            try {
                if (inStream != null) {
                    inStream.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            } catch (Exception ex) {
            }
        }
        return buffer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}
