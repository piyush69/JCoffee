import java.io.*;
import java.lang.*;
import java.util.*;



class c5817511 {
public MyHelperClass configureConnection(HttpURLConnection o0){ return null; }

//    @Override
    public void send(String payload, TransportReceiver receiver) {
        HttpURLConnection connection = null;
        try {
            MyHelperClass url = new MyHelperClass();
            connection = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            configureConnection(connection);
            OutputStream out =(OutputStream)(Object) connection.getOutputStream();
            out.write(payload.getBytes("UTF-8"));
            out.close();
            int status =(int)(Object) connection.getResponseCode();
            MyHelperClass HttpURLConnection = new MyHelperClass();
            if (status != (int)(Object)HttpURLConnection.HTTP_OK) {
                ServerFailure failure = new ServerFailure(status + " " + connection.getResponseMessage());
                receiver.onTransportFailure(failure);
                return;
            }
            List<String> cookieHeaders =(List<String>)(Object) connection.getHeaderFields().get("Set-Cookie");
            if (cookieHeaders != null) {
                for (String header : cookieHeaders) {
                    try {
                        MyHelperClass Cookie = new MyHelperClass();
                        JSONObject cookie =(JSONObject)(Object) Cookie.toJSONObject(header);
                        String name =(String)(Object) cookie.getString("name");
                        String value =(String)(Object) cookie.getString("value");
                        String domain =(String)(Object) cookie.optString("Domain");
//                        MyHelperClass url = new MyHelperClass();
                        if (domain == null || (boolean)(Object)url.getHost().endsWith(domain)) {
                            String path =(String)(Object) cookie.optString("Path");
//                            MyHelperClass url = new MyHelperClass();
                            if (path == null || (boolean)(Object)url.getPath().startsWith(path)) {
                                MyHelperClass cookies = new MyHelperClass();
                                cookies.put(name, value);
                            }
                        }
                    } catch (UncheckedIOException ignored) {
                    }
                }
            }
            String encoding =(String)(Object) connection.getContentEncoding();
            InputStream in =(InputStream)(Object) connection.getInputStream();
            if ("gzip".equalsIgnoreCase(encoding)) {
                in =(InputStream)(Object) new GZIPInputStream(in);
            } else if ("deflate".equalsIgnoreCase(encoding)) {
                in =(InputStream)(Object) new InflaterInputStream(in);
            } else if (encoding != null) {
                receiver.onTransportFailure(new ServerFailure("Unknown server encoding " + encoding));
                return;
            }
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int read = in.read(buffer);
            while (read != -1) {
                bytes.write(buffer, 0, read);
                read = in.read(buffer);
            }
            in.close();
            String received = new String(bytes.toByteArray(), "UTF-8");
            receiver.onTransportSuccess(received);
        } catch (IOException e) {
            ServerFailure failure = new ServerFailure(e.getMessage(), e.getClass().getName(), null, true);
            receiver.onTransportFailure(failure);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass toJSONObject(String o0){ return null; }
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getHost(){ return null; }}

class TransportReceiver {

public MyHelperClass onTransportSuccess(String o0){ return null; }
	public MyHelperClass onTransportFailure(ServerFailure o0){ return null; }}

class HttpURLConnection {

public MyHelperClass getHeaderFields(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass getContentEncoding(){ return null; }}

class ServerFailure {

ServerFailure(){}
	ServerFailure(String o0){}
	ServerFailure(String o0, String o1, Object o2, boolean o3){}}

class JSONObject {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass optString(String o0){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(InputStream o0){}}

class InflaterInputStream {

InflaterInputStream(){}
	InflaterInputStream(InputStream o0){}}
