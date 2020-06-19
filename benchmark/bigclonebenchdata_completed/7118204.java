


class c7118204 {
public static MyHelperClass CachePool;
//public MyHelperClass CachePool;

    private static String doGetForSessionKey(String authCode) throws Exception {
        String sessionKey = "";
        HttpClient hc =(HttpClient)(Object) new DefaultHttpClient();
        MyHelperClass Common = new MyHelperClass();
        HttpGet hg = new HttpGet((int)(Object)Common.TEST_SESSION_HOST + (int)(Object)Common.TEST_SESSION_PARAM + authCode);
        HttpResponse hr =(HttpResponse)(Object) hc.execute(hg);
        BufferedReader br = new BufferedReader(new InputStreamReader(hr.getEntity().getContent()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line =(String)(Object) br.readLine()) != null) {
            sb.append(line);
        }
        String result = sb.toString();
        MyHelperClass Log = new MyHelperClass();
        Log.i("sessionKeyMessages", result);
        MyHelperClass Util = new MyHelperClass();
        Map map =(Map)(Object) Util.handleURLParameters(result);
//        MyHelperClass Common = new MyHelperClass();
        sessionKey =(String)(Object) map.get(Common.TOP_SESSION);
//        MyHelperClass Common = new MyHelperClass();
        String topParameters =(String)(Object) map.get(Common.TOP_PARAMETERS);
//        MyHelperClass Util = new MyHelperClass();
        String decTopParameters =(String)(Object) Util.decodeBase64(topParameters);
//        MyHelperClass Log = new MyHelperClass();
        Log.i("base64", decTopParameters);
//        MyHelperClass Util = new MyHelperClass();
        map =(Map)(Object) Util.handleURLParameters(decTopParameters);
//        MyHelperClass Common = new MyHelperClass();
        Log.i("nick",(String)(Object) map.get(Common.VISITOR_NICK));
//        MyHelperClass Common = new MyHelperClass();
        CachePool.put(Common.VISITOR_NICK, map.get(Common.VISITOR_NICK));
        return sessionKey;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TOP_SESSION;
	public MyHelperClass TEST_SESSION_PARAM;
	public MyHelperClass VISITOR_NICK;
	public MyHelperClass TEST_SESSION_HOST;
	public MyHelperClass TOP_PARAMETERS;
public MyHelperClass i(String o0, String o1){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass decodeBase64(String o0){ return null; }
	public MyHelperClass handleURLParameters(String o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class Map {

public MyHelperClass get(MyHelperClass o0){ return null; }}
