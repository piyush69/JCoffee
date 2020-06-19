import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19044260 {
public MyHelperClass NULL;

    public void login() throws Throwable, Exception {
        MyHelperClass bean = new MyHelperClass();
        String s_url = bean.getProtocol() + "://" + bean.getUrl() + ":" + bean.getPort() + "/login/login.cgi?" + "userType=1&" + "name=" + bean.getLogin() + "&" + "passwd=" + bean.getPassword() + "&" + "btn_submit=enter&" + "login_action=login&" + "path=&" + "restart=no&" + "systemfull=no";
        URL url = new URL(s_url);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        HttpsURLConnectionImpl ssl = (HttpsURLConnectionImpl)(HttpsURLConnectionImpl)(Object) http;
        MyHelperClass factory = new MyHelperClass();
        ssl.setSSLSocketFactory(factory);
        ssl.setHostnameVerifier(new HostnameVerifier() {

            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        });
        http.setDoOutput(true);
        http.setDoInput(true);
        http.setAllowUserInteraction(true);
        int responseCode = http.getResponseCode();
        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
        String tmp = br.readLine();
        StringWriter writer = new StringWriter();
        while (tmp != null) {
            writer.write(tmp + "\n");
            tmp = br.readLine();
        }
        writer.flush();
        writer.close();
        String s = writer.toString();
        String pattern = "<input type=\"hidden\" name=\"id\" value=\"";
        int i = s.indexOf(pattern);
        String sessionId =(String)(Object) NULL; //new String();
        sessionId = s.substring(i + pattern.length(), s.indexOf("\"", i + pattern.length() + 1));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getLogin(){ return null; }
	public MyHelperClass getPort(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class HttpsURLConnectionImpl {

public MyHelperClass setSSLSocketFactory(MyHelperClass o0){ return null; }
	public MyHelperClass setHostnameVerifier(){ return null; }
	public MyHelperClass setHostnameVerifier( HostnameVerifier o0){ return null; }}

class HostnameVerifier {

}

class SSLSession {

}
