


class c1156882 {
public MyHelperClass Log;

//            @Override
            public void onClick(View v) {
                MyHelperClass Config = new MyHelperClass();
                Log.d(Config.SS_TAG, "Sending POST request to server...");
                DefaultHttpClient httpClient = new DefaultHttpClient();
//                MyHelperClass Config = new MyHelperClass();
                HttpPost httpPost = new HttpPost(Config.RPC_SERVLET_URL);
                JSONObject requestJson = new JSONObject();
                JSONArray callsJson = new JSONArray();
                try {
                    JSONObject callJson = new JSONObject();
                    callJson.put("method", "ping");
                    callJson.put("void", "null");
                    callsJson.put(0, callJson);
                    requestJson.put("calls", callsJson);
                    httpPost.setEntity(new StringEntity(requestJson.toString(), "UTF-8"));
                    HttpResponse httpResponse =(HttpResponse)(Object) httpClient.execute(httpPost);
                    final int responseStatusCode =(int)(Object) httpResponse.getStatusLine().getStatusCode();
                    if (200 <= responseStatusCode && responseStatusCode < 300) {
//                        MyHelperClass Config = new MyHelperClass();
                        Log.d(Config.SS_TAG, "Successful ping - status code: " + responseStatusCode);
                        BufferedReader reader = new BufferedReader(new InputStreamReader(httpResponse.getEntity().getContent(), "UTF-8"), 8 * 1024);
                        StringBuilder sb = new StringBuilder();
                        String line;
                        while ((line =(String)(Object) reader.readLine()) != null) {
                            sb.append(line).append("\n");
                        }
                        JSONTokener tokener = new JSONTokener(sb.toString());
                        JSONObject responseJson = new JSONObject(tokener);
                        JSONArray resultsJson =(JSONArray)(Object) responseJson.getJSONArray("results");
                        JSONObject result =(JSONObject)(Object) resultsJson.getJSONObject(0);
                        String returnValue =(String)(Object) result.getJSONObject("data").getString("return");
//                        MyHelperClass Config = new MyHelperClass();
                        Log.d(Config.SS_TAG, "Response message: " + returnValue);
                    } else {
//                        MyHelperClass Config = new MyHelperClass();
                        Log.e(Config.SS_TAG, "Unsuccessful ping...");
                    }
                } catch (Exception e) {
//                    MyHelperClass Config = new MyHelperClass();
                    Log.e(Config.SS_TAG, "Error while trying to ping rpc servlet");
                    e.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RPC_SERVLET_URL;
	public MyHelperClass SS_TAG;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass e(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass d(MyHelperClass o0, String o1){ return null; }}

class View {

}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class JSONObject {

JSONObject(){}
	JSONObject(JSONTokener o0){}
	public MyHelperClass getJSONObject(String o0){ return null; }
	public MyHelperClass put(String o0, JSONArray o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }}

class JSONArray {

public MyHelperClass put(int o0, JSONObject o1){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class StringEntity {

StringEntity(String o0, String o1){}
	StringEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0, String o1){}}

class JSONTokener {

JSONTokener(String o0){}
	JSONTokener(){}}
