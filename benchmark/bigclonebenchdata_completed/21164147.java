


class c21164147 {

    public String requestPOST(String baseUrl, Map params) throws Exception {
        String result = "";
        HttpPost request = new HttpPost(baseUrl);
        HttpEntity entity = null;
        if (params != null && !(Boolean)(Object)params.isEmpty()) {
            List postParams =(List)(Object) new ArrayList();
            List keys =(List)(Object) new ArrayList(params.keySet());
            for (String key :(String[])(Object) (Object[])(Object)keys) {
                postParams.add(new BasicNameValuePair(key, params.get(key)));
            }
            entity =(HttpEntity)(Object) new UrlEncodedFormEntity(postParams, "utf-8");
            request.setEntity(entity);
        }
        MyHelperClass client = new MyHelperClass();
        HttpResponse res =(HttpResponse)(Object) client.execute(request);
        MyHelperClass HttpStatus = new MyHelperClass();
        if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            entity =(HttpEntity)(Object) res.getEntity();
            BufferedReader in = new BufferedReader(new InputStreamReader(entity.getContent()));
            StringBuffer content = new StringBuffer();
            String read = "";
            while ((read =(String)(Object) in.readLine()) != null) {
                content.append(read);
            }
            in.close();
            JSONObject rObj = new JSONObject(content.toString());
            result =(String)(Object) rObj.getString("msg");
        } else result = "请求失败了";
        entity.consumeContent();
//        MyHelperClass client = new MyHelperClass();
        client.getConnectionManager().shutdown();
        request = null;
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getConnectionManager(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(HttpEntity o0){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

ArrayList(MyHelperClass o0){}
	ArrayList(){}}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }}
