
import java.io.UncheckedIOException;


class c22842673 {

    private Map fetchAdData(String url) throws ClientProtocolException, IOException {
        String app = "1";
        String owner = "tx";
        String session = "";
        String sdk = "ad1.0";
        String version = "txLove1.0";
        String timestamp = String.valueOf(System.currentTimeMillis());
        String sign = "";
        String appSecret = "test";
        Map protocal =(Map)(Object) new HashMap();
        MyHelperClass AuthUtils = new MyHelperClass();
        protocal.put(AuthUtils.AUTH_APP, app);
//        MyHelperClass AuthUtils = new MyHelperClass();
        protocal.put(AuthUtils.AUTH_OWNER, owner);
//        MyHelperClass AuthUtils = new MyHelperClass();
        protocal.put(AuthUtils.AUTH_SESSION, session);
//        MyHelperClass AuthUtils = new MyHelperClass();
        protocal.put(AuthUtils.SDK, sdk);
//        MyHelperClass AuthUtils = new MyHelperClass();
        protocal.put(AuthUtils.VERSION, version);
//        MyHelperClass AuthUtils = new MyHelperClass();
        protocal.put(AuthUtils.TIMESTAMP, timestamp);
        Map parameter =(Map)(Object) new HashMap();
        MyHelperClass user = new MyHelperClass();
        parameter.put("uid", String.valueOf(user.getUserId()));
        parameter.put("ip", "0");
        MyHelperClass imsi = new MyHelperClass();
        parameter.put("imsi", imsi);
        parameter.put("width", "0");
//        MyHelperClass AuthUtils = new MyHelperClass();
        sign =(String)(Object) AuthUtils.sign(protocal, parameter, appSecret);
        HttpClient client =(HttpClient)(Object) new DefaultHttpClient();
        HttpGet request = new HttpGet(url.toString());
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.AUTH_APP, app);
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.AUTH_OWNER, owner);
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.AUTH_SESSION, session);
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.SDK, sdk);
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.VERSION, version);
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.TIMESTAMP, timestamp);
//        MyHelperClass AuthUtils = new MyHelperClass();
        request.setHeader(AuthUtils.SIGN, sign);
        HttpResponse response =(HttpResponse)(Object) client.execute(request);
        if ((int)(Object)response.getStatusLine().getStatusCode() == 200) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line =(String)(Object) reader.readLine();
            JSONObject object;
            Map map =(Map)(Object) new HashMap();
            try {
                System.out.println("##################### line = " + line);
                object = new JSONObject(line);
                if (object != null) {
                    System.out.println(object.toString());
                    map.put("imgAddress", object.getString("imgurl"));
                    map.put("imgUrl", object.getString("url"));
                    return map;
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass AUTH_APP;
	public MyHelperClass VERSION;
	public MyHelperClass SIGN;
	public MyHelperClass SDK;
	public MyHelperClass AUTH_OWNER;
	public MyHelperClass TIMESTAMP;
	public MyHelperClass AUTH_SESSION;
public MyHelperClass getContent(){ return null; }
	public MyHelperClass sign(Map o0, Map o1, String o2){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getUserId(){ return null; }}

class Map {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HashMap {

}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass setHeader(MyHelperClass o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}
