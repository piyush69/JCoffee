


class c7633336 {

    private JSONObject executeHttpGet(String uri) throws Exception {
        HttpGet req = new HttpGet(uri);
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpResponse resLogin =(HttpResponse)(Object) client.execute(req);
        BufferedReader r = new BufferedReader(new InputStreamReader(resLogin.getEntity().getContent()));
        StringBuilder sb = new StringBuilder();
        String s = null;
        while ((s =(String)(Object) r.readLine()) != null) {
            sb.append(s);
        }
        return new JSONObject(sb.toString());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getContent(){ return null; }}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
