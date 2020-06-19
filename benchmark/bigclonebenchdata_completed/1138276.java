import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1138276 {
public MyHelperClass toStringBody(HttpResponse o0){ return null; }
	public MyHelperClass requestPost(HttpPost o0, Object o1){ return null; }
	public MyHelperClass executeHttp(HttpPost o0){ return null; }
public MyHelperClass JsonUrl;
	public MyHelperClass logined;
	public MyHelperClass pass;
	public MyHelperClass name;
	public MyHelperClass LoginUrl;
	public MyHelperClass httpClient;
	public MyHelperClass log;
	public MyHelperClass clearCookie(){ return null; }

    private void login() throws Throwable, LoginException {
        MyHelperClass log = new MyHelperClass();
        log.info("# iモード.netにログイン");
        try {
            this.httpClient.getCookieStore().clear();
            HttpPost post = new HttpPost(LoginUrl);
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("HIDEURL", "?WM_AK=https%3a%2f%2fimode.net%2fag&path=%2fimail%2ftop&query="));
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("LOGIN", "WM_LOGIN"));
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("WM_KEY", "0"));
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("MDCM_UID", this.name));
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("MDCM_PWD", this.pass));
            UrlEncodedFormEntity entity = null;
            try {
                entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            } catch (Exception e) {
            }
            post.setHeader("User-Agent", "Mozilla/4.0 (compatible;MSIE 7.0; Windows NT 6.0;)");
            post.setEntity(entity);
            try {
                HttpResponse res =(HttpResponse)(Object) this.executeHttp(post);
                if (res == null) {
                    this.logined =(MyHelperClass)(Object) Boolean.FALSE;
                    throw new IOException("Redirect Error");
                }
                if ((int)(Object)res.getStatusLine().getStatusCode() != 200) {
                    this.logined =(MyHelperClass)(Object) Boolean.FALSE;
                    throw new IOException("http login response bad status code " + res.getStatusLine().getStatusCode());
                }
                String body =(String)(Object) toStringBody(res);
                if (body.indexOf("<title>認証エラー") > 0) {
                    this.logined =(MyHelperClass)(Object) Boolean.FALSE;
                    log.info("認証エラー");
                    log.debug(body);
                    this.clearCookie();
                    throw new LoginException("認証エラー");
                }
            } finally {
                post.abort();
            }
            post = new HttpPost(JsonUrl + "login");
            try {
                HttpResponse res =(HttpResponse)(Object) this.requestPost(post, null);
                if (res == null) {
                    this.logined =(MyHelperClass)(Object) Boolean.FALSE;
                    throw new IOException("Login Error");
                }
                if ((int)(Object)res.getStatusLine().getStatusCode() != 200) {
                    this.logined =(MyHelperClass)(Object) Boolean.FALSE;
                    throw new IOException("http login2 response bad status code " + res.getStatusLine().getStatusCode());
                }
                this.logined =(MyHelperClass)(Object) Boolean.TRUE;
            } finally {
                post.abort();
            }
        } catch (Exception e) {
            this.logined =(MyHelperClass)(Object) Boolean.FALSE;
            throw new LoginException("Docomo i mode.net Login Error.", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class LoginException extends Exception{
	public LoginException(String errorMessage) { super(errorMessage); }
	LoginException(){}
	LoginException(String o0, Exception o1){}
}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	HttpPost(String o0){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
	public MyHelperClass abort(){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(String o0, MyHelperClass o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
