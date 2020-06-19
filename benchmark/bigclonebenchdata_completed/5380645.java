


class c5380645 {

    private static void login(HttpClient client, String token) throws Exception {
        HttpPost login = new HttpPost("https://libsys.arlingtonva.us/iii/cas/login?service=http&amp;scope=1");
        List formParams =(List)(Object) new ArrayList();
        formParams.add(new BasicNameValuePair("code", "202002686286"));
        formParams.add(new BasicNameValuePair("pin", "3128"));
        formParams.add(new BasicNameValuePair("_eventId", "submit"));
        formParams.add(new BasicNameValuePair("lt", token));
        UrlEncodedFormEntity form = new UrlEncodedFormEntity(formParams, "UTF-8");
        login.setEntity(form);
        HttpResponse response =(HttpResponse)(Object) client.execute(login);
        MyHelperClass EntityUtils = new MyHelperClass();
        EntityUtils.consume(response.getEntity());
        Header[] headers =(Header[])(Object) response.getAllHeaders();
        System.out.println("HEADERS: ");
        for (Header hdr : headers) {
            System.out.println(hdr.getName() + ": " + hdr.getValue());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass consume(MyHelperClass o0){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getAllHeaders(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class Header {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}
