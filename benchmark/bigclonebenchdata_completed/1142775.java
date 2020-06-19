
import java.io.UncheckedIOException;


class c1142775 {

    public String[] getFriends() {
        InputStream is = null;
        String[] answer = null;
        String result = "";
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            MyHelperClass domain = new MyHelperClass();
            HttpPost httppost = new HttpPost(domain);
            MyHelperClass library = new MyHelperClass();
            httppost.setEntity(new UrlEncodedFormEntity(library));
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            is =(InputStream)(Object) entity.getContent();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error in http connection " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                sb.append(line + ",");
            }
            is.close();
            result = sb.toString();
            if (result.equals("null,")) {
                answer = new String[1];
                answer[0] = "none";
                return answer;
            }
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        try {
            JSONArray json = new JSONArray(result);
            answer = new String[(int)(Object)json.length()];
            for (int i = 0; i < (int)(Object)json.length(); i++) {
                JSONObject jsonId =(JSONObject)(Object) json.getJSONObject(i);
                answer[i] =(String)(Object) jsonId.getString("uid");
            }
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error parsing data " + e.toString());
        }
        return answer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(String o0, String o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(MyHelperClass o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class JSONArray {

JSONArray(String o0){}
	JSONArray(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass getJSONObject(int o0){ return null; }}

class JSONObject {

public MyHelperClass getString(String o0){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
