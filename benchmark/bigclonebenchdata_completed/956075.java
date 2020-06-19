import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c956075 {
public MyHelperClass NULL;
public MyHelperClass ssuicookie;
public MyHelperClass NeembuuUploader;
	public MyHelperClass HOSTNAME;
	public MyHelperClass AccountsManager;
	public MyHelperClass NULogger;
	public MyHelperClass JOptionPane;
	public MyHelperClass loginsuccessful;
	public MyHelperClass TranslationProvider;
	public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass ssalcookie;
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }

    public void loginSendSpace() throws Throwable, Exception {
        boolean loginsuccessful = NULL; //new boolean();
        loginsuccessful = false;
        HttpParams params =(HttpParams)(Object) new BasicHttpParams();
        params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
        DefaultHttpClient httpclient = new DefaultHttpClient(params);
        MyHelperClass NULogger = new MyHelperClass();
        NULogger.getLogger().info("Trying to log in to sendspace");
        HttpPost httppost = new HttpPost("http://www.sendspace.com/login.html");
        MyHelperClass sidcookie = new MyHelperClass();
        httppost.setHeader("Cookie", sidcookie + ";" + ssuicookie);
        List<NameValuePair> formparams = new ArrayList<NameValuePair>();
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("action", "login"));
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("submit", "login"));
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("target", "%252F"));
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("action_type", "login"));
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("remember", "1"));
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("username", getUsername()));
        formparams.add((NameValuePair)(Object)new BasicNameValuePair("password", getPassword()));
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
        httppost.setEntity(entity);
        HttpResponse httpresponse =(HttpResponse)(Object) httpclient.execute(httppost);
        NULogger.getLogger().info("Getting cookies........");
        Iterator<Cookie> it = httpclient.getCookieStore().getCookies().iterator();
        Cookie escookie = null;
        while (it.hasNext()) {
            escookie = it.next();
            if (escookie.getName().equalsIgnoreCase("ssal")) {
                ssalcookie = escookie.getName() + "="(MyHelperClass)(Object) + escookie.getValue();
                NULogger.getLogger().info(ssalcookie);
                loginsuccessful =(boolean)(Object)(MyHelperClass)(Object) true;
            }
        }
        if ((boolean)(Object)loginsuccessful) {
            username = getUsername();
            password = getPassword();
            NULogger.getLogger().info("SendSpace login success :)");
        } else {
            NULogger.getLogger().info("SendSpace login failed :(");
            loginsuccessful =(boolean)(Object)(MyHelperClass)(Object) false;
            username =(MyHelperClass)(Object) "";
            password =(MyHelperClass)(Object) "";
            JOptionPane.showMessageDialog(NeembuuUploader.getInstance(), "<html><b>" + HOSTNAME + "</b> " + TranslationProvider.get("neembuuuploader.accounts.loginerror") + "</html>", HOSTNAME, JOptionPane.WARNING_MESSAGE);
            AccountsManager.getInstance().setVisible(true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING_MESSAGE;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass info(MyHelperClass o0){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }
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

}

class Cookie {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}
