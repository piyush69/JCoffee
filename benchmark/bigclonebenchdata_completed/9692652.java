


class c9692652 {

    public static void main(String[] args) throws Exception {
        DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpGet httpget = new HttpGet("https://portal.sun.com/portal/dt");
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        System.out.println("Login form get: " + response.getStatusLine());
        if (entity != null) {
            entity.consumeContent();
        }
        System.out.println("Initial set of cookies:");
        List cookies =(List)(Object) httpclient.getCookieStore().getCookies();
        if ((boolean)(Object)cookies.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < (int)(Object)cookies.size(); i++) {
                System.out.println("- " + cookies.get(i).toString());
            }
        }
        HttpPost httpost = new HttpPost("https://portal.sun.com/amserver/UI/Login?" + "org=self_registered_users&" + "goto=/portal/dt&" + "gotoOnFail=/portal/dt?error=true");
        List nvps =(List)(Object) new ArrayList();
        nvps.add(new BasicNameValuePair("IDToken1", "username"));
        nvps.add(new BasicNameValuePair("IDToken2", "password"));
        MyHelperClass HTTP = new MyHelperClass();
        httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        response =(HttpResponse)(Object) httpclient.execute(httpost);
        entity =(HttpEntity)(Object) response.getEntity();
        System.out.println("Login form get: " + response.getStatusLine());
        if (entity != null) {
            entity.consumeContent();
        }
        System.out.println("Post logon cookies:");
        cookies =(List)(Object) httpclient.getCookieStore().getCookies();
        if ((boolean)(Object)cookies.isEmpty()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < (int)(Object)cookies.size(); i++) {
                System.out.println("- " + cookies.get(i).toString());
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass UTF_8;
public MyHelperClass getCookies(){ return null; }}

class DefaultHttpClient {

public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass isEmpty(){ return null; }}

class Cookie {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0, MyHelperClass o1){}}
