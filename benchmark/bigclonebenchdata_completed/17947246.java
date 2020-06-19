
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17947246 {
public MyHelperClass NodeUtil;
	public MyHelperClass loadCookies(String o0, HttpURLConnection o1, RenderEngine o2){ return null; }

    public String readURL(String urlLocation, ArrayList headers, RenderEngine c) throws Exception {
        URL url = null;
        HttpURLConnection conn = null;
        InputStream istream = null;
        try {
            url = new URL(urlLocation);
            conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        } catch (Exception e) {
            throw new Exception("Soap is unable to retrieve URL for '" + urlLocation + "': " + e.getMessage());
        }
        loadCookies(urlLocation, conn, c);
        if (headers != null) {
            for (int i = 0; i < (int)(Object)headers.size(); i++) {
                String header = (String)(String)(Object) headers.get(i);
                String key = header.substring(0, header.indexOf(":"));
                String value = header.substring(header.indexOf(":") + 2);
                MyHelperClass Debug = new MyHelperClass();
                Debug.log("Adding new request header '" + key + "'='" + value + "'");
                conn.setRequestProperty(key, value);
            }
        }
        MyHelperClass Debug = new MyHelperClass();
        Debug.debug("Set to use GET, URL=" + urlLocation);
        try {
            istream =(InputStream)(Object) conn.getInputStream();
        } catch (Exception e) {
//            MyHelperClass Debug = new MyHelperClass();
            Debug.debug("Unable to capture input stream: " + e.getMessage());
            throw new Exception("Unable to capture input stream from URL '" + urlLocation + "': " + e.getMessage());
        }
//        MyHelperClass Debug = new MyHelperClass();
        Debug.debug("'GET' - Got input stream.");
        if ((int)(Object)conn.getContentLength() == -1) {
//            MyHelperClass Debug = new MyHelperClass();
            Debug.debug("Content length = unknown");
        } else {
//            MyHelperClass Debug = new MyHelperClass();
            Debug.debug("Content length = " + conn.getContentLength());
        }
        byte data[] = null;
        int curPos = 0, contentLength =(int)(Object) conn.getContentLength();
        if ((int)(Object)conn.getContentLength() == -1) {
            MyHelperClass Server = new MyHelperClass();
            String byteSize =(String)(Object) NodeUtil.walkNodeTree(Server.getConfig(), "//configuration/object[@type='engine.tunable']/property[@type='engine.unknowncontentsize']/@value");
            if (byteSize == null) {
                contentLength = 4096;
            } else {
                contentLength = Integer.parseInt(byteSize);
            }
//            MyHelperClass Debug = new MyHelperClass();
            Debug.debug("Content length unknown.  Allowing fuzz of " + contentLength + " bytes.");
        }
        data = new byte[contentLength];
        try {
            int dataRead = 0;
            while ((dataRead =(int)(Object) istream.read(data, curPos, contentLength - curPos)) != -1) {
                if (dataRead == 0) {
                    break;
                }
                curPos += dataRead;
            }
        } catch (Exception e) {
            throw new Exception("Soap is unable to read data from HTTP connection: " + e.getMessage());
        }
        try {
            istream.close();
            conn.disconnect();
        } catch (UncheckedIOException e) {
            throw new Exception("Soap request to site '" + urlLocation + "' is invalid: " + e.getMessage());
        } catch (ArithmeticException e) {
            throw new Exception("Soap request to site '" + urlLocation + "' failed to connect.");
        }
        String dataOut = new String(data);
        int counter = 0;
        data = null;
        istream = null;
        conn = null;
        url = null;
        return dataOut.trim();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass walkNodeTree(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass getConfig(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class RenderEngine {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
