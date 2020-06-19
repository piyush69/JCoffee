
import java.io.UncheckedIOException;


class c2329317 {

    public ArrayList loadIndexes() {
        JSONObject job = new JSONObject();
        ArrayList al = new ArrayList();
        try {
            String req = job.put("OperationId", "1").toString();
            InputStream is = null;
            String result = "";
            JSONObject jArray = null;
            try {
                HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.1.4:8080/newgenlibctxt/CarbonServlet");
                List nameValuePairs =(List)(Object) new ArrayList(2);
                nameValuePairs.add(new BasicNameValuePair("OperationId", "1"));
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
                HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
                HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                is =(InputStream)(Object) entity.getContent();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"), 8);
                StringBuilder sb = new StringBuilder();
                String line = null;
                while ((line =(String)(Object) reader.readLine()) != null) {
                    sb.append(line + "\n");
                }
                is.close();
                result = sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                JSONObject jobres = new JSONObject(result);
                JSONArray jarr =(JSONArray)(Object) jobres.getJSONArray("MobileIndexes");
                for (int i = 0; i < (int)(Object)jarr.length(); i++) {
                    String indexname =(String)(Object) jarr.getString(i);
                    al.add(indexname);
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return al;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ArrayList {

ArrayList(int o0){}
	ArrayList(){}
	public MyHelperClass add(String o0){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0){}}

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

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass length(){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
