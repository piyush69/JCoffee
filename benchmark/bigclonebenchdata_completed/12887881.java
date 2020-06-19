import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12887881 {
public static MyHelperClass Log;
//public MyHelperClass Log;

    public static byte[] request(String remoteUrl, boolean keepalive) throws Throwable, Exception {
        MyHelperClass TAG = new MyHelperClass();
        Log.d(TAG, String.format("started request(remote=%s)", remoteUrl));
        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
//        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
        MyHelperClass THREAD_PRIORITY_LOWEST = new MyHelperClass();
        Process.setThreadPriority(Process.THREAD_PRIORITY_LOWEST);
        byte[] buffer = new byte[1024];
        URL url = new URL(remoteUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setAllowUserInteraction(false);
        connection.setRequestProperty("Viewer-Only-Client", "1");
        connection.setRequestProperty("Client-Daap-Version", "3.10");
        connection.setRequestProperty("Accept-Encoding", "gzip, deflate");
        if (!keepalive) {
            connection.setConnectTimeout(1200000);
            connection.setReadTimeout(1200000);
        } else {
            connection.setReadTimeout(0);
        }
        connection.connect();
        if (connection.getResponseCode() >= HttpURLConnection.HTTP_UNAUTHORIZED) throw new RequestException("HTTP Error Response Code: " + connection.getResponseCode(), connection.getResponseCode());
        String encoding = connection.getContentEncoding();
        InputStream inputStream = null;
        if (encoding != null && encoding.equalsIgnoreCase("gzip")) {
            inputStream =(InputStream)(Object) new GZIPInputStream(connection.getInputStream());
        } else if (encoding != null && encoding.equalsIgnoreCase("deflate")) {
            inputStream =(InputStream)(Object) new InflaterInputStream(connection.getInputStream(), new Inflater(true));
        } else {
            inputStream = connection.getInputStream();
        }
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        } finally {
            if (os != null) {
                os.flush();
                os.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return os.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass d(MyHelperClass o0, String o1){ return null; }}

class RequestException extends Exception{
	public RequestException(String errorMessage) { super(errorMessage); }
	RequestException(String o0, int o1){}
	RequestException(){}
}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InflaterInputStream {

InflaterInputStream(){}
	InflaterInputStream(InputStream o0, Inflater o1){}}

class Inflater {

Inflater(boolean o0){}
	Inflater(){}}
