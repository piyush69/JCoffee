


class c3788864 {

    public static void logout(String verify) throws NetworkException {
        MyHelperClass HttpUtil = new MyHelperClass();
        HttpClient client =(HttpClient)(Object) HttpUtil.newInstance();
//        MyHelperClass HttpUtil = new MyHelperClass();
        HttpGet get = new HttpGet((int)(Object)HttpUtil.KAIXIN_LOGOUT_URL + (int)(Object)HttpUtil.KAIXIN_PARAM_VERIFY + verify);
//        MyHelperClass HttpUtil = new MyHelperClass();
        HttpUtil.setHeader(get);
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
public MyHelperClass KAIXIN_LOGOUT_URL;
	public MyHelperClass KAIXIN_PARAM_VERIFY;
public MyHelperClass newInstance(){ return null; }
	public MyHelperClass setHeader(HttpGet o0){ return null; }
	public MyHelperClass consume(MyHelperClass o0){ return null; }}

class NetworkException extends Exception{
	public NetworkException(String errorMessage) { super(errorMessage); }
}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}
