


class c21164146 {

    public String requestGET(String baseUrl, Map params) throws Exception {
        String result = "";
        StringBuffer url = new StringBuffer();
        url.append(baseUrl);
        if (params != null && !(Boolean)(Object)params.isEmpty()) {
            List keys =(List)(Object) new ArrayList(params.keySet());
            for (String key :(String[])(Object) (Object[])(Object)keys) {
                url.append(key);
                url.append("/");
                MyHelperClass URLEncoder = new MyHelperClass();
                url.append(URLEncoder.encode(params.get(key), "UTF-8"));
            }
        }
        HttpGet get = new HttpGet(url.toString());
        MyHelperClass client = new MyHelperClass();
        HttpResponse res =(HttpResponse)(Object) client.execute(get);
        HttpEntity entity = null;
        MyHelperClass HttpStatus = new MyHelperClass();
        if (res.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            entity =(HttpEntity)(Object) res.getEntity();
            BufferedReader in = new BufferedReader(new InputStreamReader(entity.getContent()));
            String read = "";
            StringBuffer content = new StringBuffer();
            while ((read =(String)(Object) in.readLine()) != null) {
                content.append(read);
            }
            in.close();
            JSONObject rObj = new JSONObject(content.toString());
            result =(String)(Object) rObj.getString("msg");
        } else {
            result = "HTTP请求失败";
        }
        if (entity != null) entity.consumeContent();
//        MyHelperClass client = new MyHelperClass();
        client.getConnectionManager().shutdown();
        get = null;
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass encode(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getConnectionManager(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass keySet(){ return null; }}

class List {

}

class ArrayList {

ArrayList(MyHelperClass o0){}
	ArrayList(){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}

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
