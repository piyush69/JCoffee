import java.io.*;
import java.lang.*;
import java.util.*;



class c17780438 {
public static MyHelperClass LogUtil;
//public MyHelperClass LogUtil;

    private static BufferedInputStream getHTTPConnection(String sUrl) {
        URL url = null;
        BufferedInputStream bis = null;
        try {
            url = new URL(sUrl);
            HttpURLConnection connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setConnectTimeout(30000);
            connection.setReadTimeout(60000);
            connection.setRequestProperty("Accept-Encoding", "gzip, deflate");
            connection.connect();
            String encoding =(String)(Object) connection.getContentEncoding();
            MyHelperClass Utilities = new MyHelperClass();
            if (!(Boolean)(Object)Utilities.isEmpty(encoding) && "gzip".equalsIgnoreCase(encoding)) {
                MyHelperClass IO_BUFFER_SIZE = new MyHelperClass();
                bis = new BufferedInputStream((InputStream)(Object)new GZIPInputStream(connection.getInputStream()),(int)(Object) IO_BUFFER_SIZE);
//            MyHelperClass Utilities = new MyHelperClass();
            } else if (!(Boolean)(Object)Utilities.isEmpty(encoding) && "deflate".equalsIgnoreCase(encoding)) {
                MyHelperClass IO_BUFFER_SIZE = new MyHelperClass();
                bis = new BufferedInputStream((InputStream)(Object)new InflaterInputStream(connection.getInputStream(), new Inflater(true)),(int)(Object) IO_BUFFER_SIZE);
            } else {
                MyHelperClass IO_BUFFER_SIZE = new MyHelperClass();
                bis = new BufferedInputStream((InputStream)(Object)connection.getInputStream(),(int)(Object) IO_BUFFER_SIZE);
            }
        } catch (Exception e) {
            MyHelperClass Constants = new MyHelperClass();
            LogUtil.e(Constants.TAG, e.getMessage());
        }
        return bis;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TAG;
public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}

class InflaterInputStream {

InflaterInputStream(){}
	InflaterInputStream(MyHelperClass o0, Inflater o1){}}

class Inflater {

Inflater(){}
	Inflater(boolean o0){}}
