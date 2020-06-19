import java.io.*;
import java.lang.*;
import java.util.*;



class c2453985 {
public MyHelperClass NULL;
public MyHelperClass password;
	public MyHelperClass JOptionPane;
	public MyHelperClass AccountsManager;
	public MyHelperClass HostsPanel;
	public MyHelperClass NULogger;
	public MyHelperClass Level;
	public MyHelperClass loginsuccessful;
	public MyHelperClass username;
	public MyHelperClass hfcookie;
	public MyHelperClass TranslationProvider;
	public MyHelperClass HOSTNAME;
	public MyHelperClass NeembuuUploader;
	public MyHelperClass getUsername(){ return null; }
	public MyHelperClass getPassword(){ return null; }

//    @Override
    public void login() {
        boolean loginsuccessful =(boolean)(Object) NULL; //new boolean();
        loginsuccessful = false;
        try {
            HttpParams params =(HttpParams)(Object) new BasicHttpParams();
            params.setParameter("http.useragent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; en-GB; rv:1.9.2) Gecko/20100115 Firefox/3.6");
            DefaultHttpClient httpclient = new DefaultHttpClient(params);
            MyHelperClass NULogger = new MyHelperClass();
            NULogger.getLogger().info("Trying to log in to HotFile");
            HttpPost httppost = new HttpPost("http://www.hotfile.com/login.php");
            httppost.setHeader("Referer", "http://www.hotfile.com/");
            httppost.setHeader("Cache-Control", "max-age=0");
            httppost.setHeader("Origin", "http://www.hotfile.com/");
            httppost.setHeader("Accept", "application/xml,application/xhtml+xml,text/html;q=0.9,text/plain;q=0.8,image/png,*/*;q=0.5");
            List<NameValuePair> formparams = new ArrayList<NameValuePair>();
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("returnto", "%2F"));
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("user", getUsername()));
            formparams.add((NameValuePair)(Object)new BasicNameValuePair("pass", getPassword()));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
            httppost.setEntity(entity);
            HttpResponse httpresponse =(HttpResponse)(Object) httpclient.execute(httppost);
            if (httpresponse.getFirstHeader("Set-Cookie") == null) {
                NULogger.getLogger().info("HotFile Login not successful");
                loginsuccessful =(boolean)(Object)(MyHelperClass)(Object) false;
                username =(MyHelperClass)(Object) "";
                password =(MyHelperClass)(Object) "";
                JOptionPane.showMessageDialog(NeembuuUploader.getInstance(), "<html><b>" + HOSTNAME + "</b> " + TranslationProvider.get("neembuuuploader.accounts.loginerror") + "</html>", HOSTNAME, JOptionPane.WARNING_MESSAGE);
                AccountsManager.getInstance().setVisible(true);
            } else {
                Iterator<Cookie> it =(Iterator<Cookie>)(Object) httpclient.getCookieStore().getCookies().iterator();
                while (it.hasNext()) {
                    hfcookie =(MyHelperClass)(Object) it.next();
                    if (hfcookie.getName().equals("auth")) {
                        NULogger.getLogger().log(Level.INFO, "hotfile login successful auth:{0}", hfcookie.getValue());
                        loginsuccessful =(boolean)(Object)(MyHelperClass)(Object) true;
                        HostsPanel.getInstance().hotFileCheckBox.setEnabled(true);
                        username = getUsername();
                        password = getPassword();
                        break;
                    }
                }
            }
        } catch (Exception ex) {
            NULogger.getLogger().log(Level.SEVERE, "{0}: Error in Hotfile Login", getClass().getName());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFO;
	public MyHelperClass hotFileCheckBox;
	public MyHelperClass WARNING_MESSAGE;
	public MyHelperClass SEVERE;
public MyHelperClass info(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, String o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class HttpParams {

public MyHelperClass setParameter(String o0, String o1){ return null; }}

class BasicHttpParams {

}

class DefaultHttpClient {

DefaultHttpClient(){}
	DefaultHttpClient(HttpParams o0){}
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(){}
	HttpPost(String o0){}
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

public MyHelperClass getFirstHeader(String o0){ return null; }}

class Cookie {

}
