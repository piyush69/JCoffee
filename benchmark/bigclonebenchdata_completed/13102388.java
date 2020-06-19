
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c13102388 {
public MyHelperClass Log;

    public void callBatch(final List calls, final BatchCallback callback) {
        MyHelperClass mRpcUrl = new MyHelperClass();
        HttpPost httpPost = new HttpPost(mRpcUrl);
        JSONObject requestJson = new JSONObject();
        JSONArray callsJson = new JSONArray();
        try {
            for (int i = 0; i < (int)(Object)calls.size(); i++) {
                Call call =(Call)(Object) calls.get(i);
                JSONObject callJson = new JSONObject();
                callJson.put("method",(JSONArray)(Object) call.getMethodName());
                if (call.getParams() != null) {
                    JSONObject callParams = (JSONObject)(JSONObject)(Object) call.getParams();
                    @SuppressWarnings("unchecked") Iterator keysIterator =(Iterator)(Object) callParams.keys();
                    String key;
                    while ((boolean)(Object)keysIterator.hasNext()) {
                        key =(String)(Object) keysIterator.next();
                        callJson.put(key,(JSONArray)(Object) callParams.get(key));
                    }
                }
                callsJson.put(i, callJson);
            }
            requestJson.put("calls", callsJson);
            httpPost.setEntity(new StringEntity(requestJson.toString(), "UTF-8"));
            MyHelperClass TAG = new MyHelperClass();
            if ((boolean)(Object)Log.isLoggable(TAG, Log.VERBOSE)) {
//                MyHelperClass TAG = new MyHelperClass();
                Log.v(TAG, "POST request: " + requestJson.toString());
            }
        } catch (UncheckedIOException e) {
        } catch (ArithmeticException e) {
        }
        try {
            MyHelperClass mHttpClient = new MyHelperClass();
            HttpResponse httpResponse =(HttpResponse)(Object) mHttpClient.execute(httpPost);
            final int responseStatusCode =(int)(Object) httpResponse.getStatusLine().getStatusCode();
            if (200 <= responseStatusCode && responseStatusCode < 300) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), "UTF-8"), 8 * 1024);
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                MyHelperClass TAG = new MyHelperClass();
                if ((boolean)(Object)Log.isLoggable(TAG, Log.VERBOSE)) {
//                    MyHelperClass TAG = new MyHelperClass();
                    Log.v(TAG, "POST response: " + sb.toString());
                }
                JSONTokener tokener = new JSONTokener(sb.toString());
                JSONObject responseJson = new JSONObject(tokener);
                JSONArray resultsJson =(JSONArray)(Object) responseJson.getJSONArray("results");
                Object[] resultData = new Object[(int)(Object)calls.size()];
                for (int i = 0; i < (int)(Object)calls.size(); i++) {
                    JSONObject result =(JSONObject)(Object) resultsJson.getJSONObject(i);
                    if ((boolean)(Object)result.has("error")) {
                        callback.onError(i, new JsonRpcException((int)(int)(Object) result.getInt("error"), calls.get(i).getMethodName(), result.getString("message"), null));
                        resultData[i] = null;
                    } else {
                        resultData[i] = result.get("data");
                    }
                }
                callback.onData(resultData);
            } else {
                callback.onError(-1, new JsonRpcException(-1, "Received HTTP status code other than HTTP 2xx: " + httpResponse.getStatusLine().getReasonPhrase()));
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("JsonRpcJavaClient", e.getMessage());
            e.printStackTrace();
        } catch (ArithmeticException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("JsonRpcJavaClient", "Error parsing server JSON response: " + e.getMessage());
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERBOSE;
public MyHelperClass e(String o0, String o1){ return null; }
	public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass v(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass isLoggable(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getMethodName(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(MyHelperClass o0){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(JSONTokener o0){}
	public MyHelperClass getJSONArray(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass put(String o0, JSONArray o1){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass keys(){ return null; }
	public MyHelperClass has(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class JSONArray {

public MyHelperClass put(int o0, JSONObject o1){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class StringEntity {

StringEntity(){}
	StringEntity(String o0, String o1){}}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class UnsupportedEncodingException extends Exception{
	public UnsupportedEncodingException(String errorMessage) { super(errorMessage); }
}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0, int o1){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class JSONTokener {

JSONTokener(String o0){}
	JSONTokener(){}}

class JsonRpcException extends Exception{
	public JsonRpcException(String errorMessage) { super(errorMessage); }
	JsonRpcException(){}
	JsonRpcException(int o0, String o1){}
	JsonRpcException(int o0, MyHelperClass o1, MyHelperClass o2, Object o3){}
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Call {

public MyHelperClass getParams(){ return null; }
	public MyHelperClass getMethodName(){ return null; }}

class BatchCallback {

public MyHelperClass onError(int o0, JsonRpcException o1){ return null; }
	public MyHelperClass onData(Object[] o0){ return null; }}
