import java.io.*;
import java.lang.*;
import java.util.*;



class c13124924 {
public MyHelperClass _password;
public MyHelperClass Log;
	public MyHelperClass HTTP_NOT_OK;
	public MyHelperClass _shouldGET;
	public MyHelperClass _httpResponseCode;
	public MyHelperClass HttpURLConnection;
	public MyHelperClass _error;
	public MyHelperClass _url;
	public MyHelperClass NETWORK_DOWN;
	public MyHelperClass storeConditionalGetTable(Hashtable o0){ return null; }
	public MyHelperClass conditionalGetTable(){ return null; }

    public HttpURLConnection getURLConnection() throws IOException {
        HttpURLConnection conn = null;
        try {
            MyHelperClass _url = new MyHelperClass();
            conn = (HttpURLConnection)(HttpURLConnection)(Object) _url.openConnection();
            conn.setUseCaches(false);
            conn.setRequestProperty("User-Agent", "WD-2.0");
            MyHelperClass _doConditionalGET = new MyHelperClass();
            if ((boolean)(Object)_doConditionalGET) {
//                MyHelperClass _url = new MyHelperClass();
                ResourceInfo ri = (ResourceInfo)(ResourceInfo)(Object) conditionalGetTable().get(_url.toString());
                if (ri != null) {
                    if (ri.lastModified != null) {
                        conn.setRequestProperty("If-Modified-Since",(String)(Object) ri.lastModified);
                    }
                    if (ri.etag != null) {
                        conn.setRequestProperty("If-None-Match",(String)(Object) ri.etag);
                    }
                }
            }
            MyHelperClass _username = new MyHelperClass();
            if (_username != null && _password != null) {
//                MyHelperClass _username = new MyHelperClass();
                String authenticationStr = _username + ":" + _password;
                String encodedAuthStr =(String)(Object) Base64.encodeBytes(authenticationStr.getBytes());
                conn.setRequestProperty("Authorization", "Basic " + encodedAuthStr);
            }
            MyHelperClass _httpResponseCode = new MyHelperClass();
            _httpResponseCode = conn.getResponseCode();
//            MyHelperClass _httpResponseCode = new MyHelperClass();
            if (_httpResponseCode == HttpURLConnection.HTTP_OK) {
//                MyHelperClass _doConditionalGET = new MyHelperClass();
                if ((boolean)(Object)_doConditionalGET) {
                    ResourceInfo ri = new ResourceInfo();
                    ri.lastModified = conn.getHeaderField("Last-Modified");
                    ri.etag = conn.getHeaderField("ETag");
                    Hashtable table =(Hashtable)(Object) conditionalGetTable();
                    table.put(_url.toString(), ri);
                    storeConditionalGetTable(table);
                }
            } else if (_httpResponseCode == HttpURLConnection.HTTP_NOT_MODIFIED) {
                _shouldGET =(MyHelperClass)(Object) false;
            } else {
                Log.getInstance().write("Error getting url: " + _url + "\n" + "Error code: " + _httpResponseCode);
                _error = HTTP_NOT_OK;
                conn.disconnect();
                conn = null;
            }
        } catch (UncheckedIOException ex) {
            conn.disconnect();
            conn = null;
            _error = NETWORK_DOWN;
        }
        return conn;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_OK;
	public MyHelperClass HTTP_NOT_MODIFIED;
public MyHelperClass write(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass getHeaderField(String o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }}

class ResourceInfo {
public MyHelperClass etag;
	public MyHelperClass lastModified;
}

class Base64 {

public static MyHelperClass encodeBytes(byte[] o0){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}
