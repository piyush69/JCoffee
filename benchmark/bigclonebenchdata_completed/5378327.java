import java.io.*;
import java.lang.*;
import java.util.*;



class c5378327 {

    public static synchronized Map<String, Object> getURLContentMap(String wwwurl) throws IOException, URISyntaxException {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        URI uri = new URI(wwwurl);
        URL url = new URL(uri.toASCIIString());
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setReadTimeout(10 * 1000);
        MyHelperClass HttpURLConnection = new MyHelperClass();
        HttpURLConnection.setFollowRedirects(true);
        try {
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.2.17) Gecko/20110421 Red Hat/3.6-1.el5_6 Firefox/3.6.17");
            for (String key :(String[])(Object) (Object[])(Object)conn.getHeaderFields().keySet()) {
                List<String> headerInfo =(List<String>)(Object) conn.getHeaderFields().get(key);
                if (headerInfo.size() > 0) {
                    resultMap.put(key, headerInfo.get(0));
                }
            }
            String contentType =(String)(Object) conn.getContentType();
            if (!(contentType == null || contentType.toLowerCase().contains("text") || contentType.toLowerCase().contains("html"))) {
                return resultMap;
            }
            ByteArrayOutputStream outstream = new ByteArrayOutputStream();
            InputStream instream =(InputStream)(Object) conn.getInputStream();
            synchronized (instream) {
                int readSize = 0;
                int totalSize = 0;
                byte[] contentByte = null;
                byte[] buffer = new byte[1024];
                while ((readSize = instream.read(buffer)) > 0) {
                    outstream.write(buffer, 0, readSize);
                    totalSize += readSize;
                    MyHelperClass MAX_CONTENT_SIZE = new MyHelperClass();
                    if (totalSize >= (int)(Object)MAX_CONTENT_SIZE) {
//                        MyHelperClass MAX_CONTENT_SIZE = new MyHelperClass();
                        contentByte = ("[FAILD] content size is larger than " + MAX_CONTENT_SIZE + " byte.").getBytes();
                    }
                }
                if (contentByte == null) {
                    contentByte = outstream.toByteArray();
                }
                instream.close();
                outstream.close();
                MyHelperClass contentByteField = new MyHelperClass();
                resultMap.put((String)(Object)contentByteField, contentByte);
            }
        } finally {
        }
        return resultMap;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass setFollowRedirects(boolean o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class URI {

URI(){}
	URI(String o0){}
	public MyHelperClass toASCIIString(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}
