import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18510279 {
public MyHelperClass NULL;
public MyHelperClass NeembuuUploader;
	public MyHelperClass HOSTNAME;
	public MyHelperClass AccountsManager;
	public MyHelperClass NULogger;
	public MyHelperClass cookies;
	public MyHelperClass JOptionPane;
	public MyHelperClass loginsuccessful;
	public MyHelperClass sessionid;
	public MyHelperClass EntityUtils;
	public MyHelperClass TranslationProvider;
	public MyHelperClass Level;
	public MyHelperClass password;
	public MyHelperClass username;
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }

    public void login()  throws Throwable {
        boolean loginsuccessful =(boolean)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new boolean();
        loginsuccessful = false;
        try {
            StringBuilder cookies =(StringBuilder)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) NULL; //new StringBuilder();
            cookies = new StringBuilder();
            HttpParams params =(HttpParams)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) new BasicHttpParams();
            params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
            DefaultHttpClient httpclient = new DefaultHttpClient(params);
            MyHelperClass NULogger = new MyHelperClass();
            NULogger.getLogger().info("Trying to log in to crocko.com");
            HttpPost httppost = new HttpPost("https://www.crocko.com/accounts/login");
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("login", getUsername()));
            formparams.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("password", getPassword()));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httppost.setEntity(entity);
            HttpResponse httpresponse =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httppost);
            NULogger.getLogger().info("Getting cookies........");
            NULogger.getLogger().info(EntityUtils.toString(httpresponse.getEntity()));
            Iterator<Cookie> it =(Iterator<Cookie>)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.getCookieStore().getCookies().iterator();
            Cookie escookie = null;
            while (it.hasNext()) {
                escookie = it.next();
                cookies.append(escookie.getName()).append("=").append(escookie.getValue()).append(";");
                if (escookie.getName().equals("PHPSESSID")) {
                    sessionid = escookie.getValue();
                    NULogger.getLogger().info(sessionid);
                }
            }
            if (cookies.toString().contains("logacc")) {
                NULogger.getLogger().info(cookies.toString());
                loginsuccessful =(boolean)(Object)(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) true;
                username = getUsername();
                password = getPassword();
                NULogger.getLogger().info("Crocko login successful :)");
            }
            if (!(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Boolean)(Object)loginsuccessful) {
                NULogger.getLogger().info("Crocko.com Login failed :(");
                loginsuccessful =(boolean)(Object)(MyHelperClass)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) false;
                username =(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(MyHelperClass)(Object) "";
                password =(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(MyHelperClass)(Object) "";
                JOptionPane.showMessageDialog(NeembuuUploader.getInstance(), "<html><b>" + HOSTNAME + "</b> " + TranslationProvider.get("neembuuuploader.accounts.loginerror") + "</html>", HOSTNAME, JOptionPane.WARNING_MESSAGE);
                AccountsManager.getInstance().setVisible(true);
            }
            httpclient.getConnectionManager().shutdown();
        } catch (Exception e) {
            NULogger.getLogger().log(Level.SEVERE, "{0}: {1}", new Object[] {(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getClass().getName(), e.toString() });
            System.err.println(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass WARNING_MESSAGE;
public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass info(MyHelperClass o0){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Object[] o2){ return null; }
	public MyHelperClass iterator(){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(HttpParams o0){}
	DefaultHttpClient(){}
	public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, MyHelperClass o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(List<NameValuePair> o0, String o1){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class Cookie {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getValue(){ return null; }}

class Object {

public MyHelperClass toString(MyHelperClass o0){ return null; }}
