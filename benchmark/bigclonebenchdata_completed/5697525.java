


class c5697525 {

    public static void loginLetitbit() throws Exception {
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
        DefaultHttpClient httpclient = new DefaultHttpClient(params);
        System.out.println("Trying to log in to letitbit.com");
        HttpPost httppost = new HttpPost("http://letitbit.net/");
        MyHelperClass phpsessioncookie = new MyHelperClass();
        httppost.setHeader("Cookie", phpsessioncookie);
        List formparams =(List)(Object) new ArrayList();
        formparams.add(new BasicNameValuePair("act", "login"));
        formparams.add(new BasicNameValuePair("login", ""));
        formparams.add(new BasicNameValuePair("password", ""));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
        httppost.setEntity(entity);
        HttpResponse httpresponse =(HttpResponse)(Object) httpclient.execute(httppost);
        System.out.println("Getting cookies........");
        Iterator it =(Iterator)(Object) httpclient.getCookieStore().getCookies().iterator();
        Cookie escookie = null;
        while ((boolean)(Object)it.hasNext()) {
            escookie =(Cookie)(Object) it.next();
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("log")) {
                String logcookie;// = new String();
                logcookie = "log=" + escookie.getValue();
//                MyHelperClass logcookie = new MyHelperClass();
                System.out.println(logcookie);
            }
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("pas")) {
                String pascookie;// = new String();
                pascookie = "pas=" + escookie.getValue();
//                MyHelperClass pascookie = new MyHelperClass();
                System.out.println(pascookie);
            }
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("host")) {
                String hostcookie;// = new String();
                hostcookie = "host=" + escookie.getValue();
//                MyHelperClass hostcookie = new MyHelperClass();
                System.out.println(hostcookie);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCookies(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(HttpParams o0){}
	public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getCookieStore(){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setHeader(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, String o1){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(List o0, String o1){}}

class HttpResponse {

}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class Cookie {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getName(){ return null; }}
