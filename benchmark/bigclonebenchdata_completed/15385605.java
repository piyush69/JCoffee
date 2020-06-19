


class c15385605 {

    public void logout(String cookieString) throws NetworkException {
        MyHelperClass HttpConfig = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) HttpConfig.newInstance();
//        MyHelperClass HttpConfig = new MyHelperClass();
        HttpGet get = new HttpGet((int)(Object)HttpConfig.bbsURL() + (int)(Object)HttpConfig.BBS_LOGOUT);
        if (cookieString != null && cookieString.length() != 0) get.setHeader("Cookie", cookieString);
        try {
            HttpResponse response =(HttpResponse)(Object) client.execute(get);
            if (response != null && response.getEntity() != null) {
                MyHelperClass HTTPUtil = new MyHelperClass();
                HTTPUtil.consume(response.getEntity());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new NetworkException((String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BBS_LOGOUT;
public MyHelperClass consume(MyHelperClass o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass bbsURL(){ return null; }}

class NetworkException extends Exception{
	public NetworkException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(){}
	HttpGet(int o0){}
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}
