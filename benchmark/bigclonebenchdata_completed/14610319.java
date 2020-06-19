


class c14610319 {
public static MyHelperClass getFolderCookies(){ return null; }
//public MyHelperClass getFolderCookies(){ return null; }

    public static void loginWuploader() throws IOException {
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
        DefaultHttpClient httpclient = new DefaultHttpClient(params);
        System.out.println("Trying to log in to Wupload");
        HttpPost httppost = new HttpPost("http://www.wupload.in/account/login");
        httppost.setHeader("Referer", "http://www.wupload.in/");
        httppost.setHeader("Accept", "application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
        List formparams =(List)(Object) new ArrayList();
        MyHelperClass uname = new MyHelperClass();
        formparams.add(new BasicNameValuePair("email", uname));
        MyHelperClass pwd = new MyHelperClass();
        formparams.add(new BasicNameValuePair("password", pwd));
        formparams.add(new BasicNameValuePair("redirect", "/"));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
        httppost.setEntity(entity);
        HttpResponse httpresponse =(HttpResponse)(Object) httpclient.execute(httppost);
        System.out.println("Getting cookies........");
        Iterator it =(Iterator)(Object) httpclient.getCookieStore().getCookies().iterator();
        Cookie escookie = null;
        while ((boolean)(Object)it.hasNext()) {
            escookie =(Cookie)(Object) it.next();
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("PHPSESSID")) {
                String sessioncookie;// = new String();
                sessioncookie = "PHPSESSID=" + escookie.getValue();
//                MyHelperClass sessioncookie = new MyHelperClass();
                System.out.println(sessioncookie);
            }
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("email")) {
                String mailcookie;// = new String();
                mailcookie = "email=" + escookie.getValue();
                boolean login;// = new boolean();
                login = true;
//                MyHelperClass mailcookie = new MyHelperClass();
                System.out.println(mailcookie);
            }
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("nickname")) {
                String namecookie;// = new String();
                namecookie = "nickname=" + escookie.getValue();
//                MyHelperClass namecookie = new MyHelperClass();
                System.out.println(namecookie);
            }
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("isAffiliate")) {
                String affiliatecookie;// = new String();
                affiliatecookie = "isAffiliate=" + escookie.getValue();
//                MyHelperClass affiliatecookie = new MyHelperClass();
                System.out.println(affiliatecookie);
            }
            if ((boolean)(Object)escookie.getName().equalsIgnoreCase("role")) {
                String rolecookie;// = new String();
                rolecookie = "role=" + escookie.getValue();
//                MyHelperClass rolecookie = new MyHelperClass();
                System.out.println(rolecookie);
            }
        }
        MyHelperClass login = new MyHelperClass();
        if ((boolean)(Object)login) {
            System.out.println("Login Success");
            getFolderCookies();
        } else {
            System.out.println("Login failed");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCookies(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

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
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class List {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class ArrayList {

}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

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
