import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4982745 {
public MyHelperClass HttpProtocolParams;
	public MyHelperClass serviceUser;
	public MyHelperClass servicePass;
	public MyHelperClass PROTOCOL_VERSION;
	public MyHelperClass Base64Coder;
	public MyHelperClass Log;
	public MyHelperClass httpClient;
	public MyHelperClass EntityUtils;
	public MyHelperClass HttpConnectionParams;
	public MyHelperClass getSoTimeout(){ return null; }
	public MyHelperClass getConnectionTimeout(){ return null; }

    protected JSONObject doJSONRequest(JSONObject jsonRequest) throws Throwable, JSONRPCException {
        MyHelperClass serviceUri = new MyHelperClass();
        HttpPost request = new HttpPost(serviceUri);
        HttpParams params =(HttpParams)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(params, getConnectionTimeout());
        HttpConnectionParams.setSoTimeout(params, getSoTimeout());
        HttpProtocolParams.setVersion(params, PROTOCOL_VERSION);
        request.setParams(params);
        request.addHeader("Authorization", "Basic " + Base64Coder.encodeString(serviceUser + ":" + servicePass));
        HttpEntity entity;
        try {
            entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new JSONEntity(jsonRequest);
        } catch (UnsupportedEncodingException e1) {
            throw new JSONRPCException("Unsupported encoding", e1);
        }
        request.setEntity(entity);
        try {
            long t = System.currentTimeMillis();
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(request);
            t = System.currentTimeMillis() - t;
            Log.d("json-rpc", "Request time :" + t);
            String responseString = EntityUtils.toString(response.getEntity());
            responseString = responseString.trim();
            JSONObject jsonResponse = new JSONObject(responseString);
            if ((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(boolean)(Object)jsonResponse.has("error")) {
                Object jsonError =(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) jsonResponse.get("error");
                if (!jsonError.equals(null)) throw new JSONRPCException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)jsonResponse.get("error"));
                return jsonResponse;
            } else {
                return jsonResponse;
            }
        } catch (ClientProtocolException e) {
            throw new JSONRPCException("HTTP error", e);
        } catch (IOException e) {
            throw new JSONRPCException("IO error", e);
        } catch (JSONException e) {
            throw new JSONRPCException("Invalid JSON response", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSoTimeout(HttpParams o0, MyHelperClass o1){ return null; }
	public MyHelperClass setConnectionTimeout(HttpParams o0, MyHelperClass o1){ return null; }
	public MyHelperClass setVersion(HttpParams o0, MyHelperClass o1){ return null; }
	public MyHelperClass d(String o0, String o1){ return null; }
	public MyHelperClass encodeString(String o0){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass has(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class JSONRPCException extends Exception{
	public JSONRPCException(String errorMessage) { super(errorMessage); }
	JSONRPCException(String o0, IOException o1){}
	JSONRPCException(){}
	JSONRPCException(String o0, ClientProtocolException o1){}
	JSONRPCException(String o0, JSONException o1){}
	JSONRPCException(String o0, UnsupportedEncodingException o1){}
}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setParams(HttpParams o0){ return null; }
	public MyHelperClass setEntity(HttpEntity o0){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }}

class HttpParams {

}

class BasicHttpParams {

}

class HttpEntity {

}

class JSONEntity {

JSONEntity(JSONObject o0){}
	JSONEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
