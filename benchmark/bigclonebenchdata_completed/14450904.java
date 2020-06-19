import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14450904 {
public MyHelperClass NULL;
public MyHelperClass SECRET;
	public MyHelperClass pass;
	public MyHelperClass NotifyUtil;
	public MyHelperClass email;

//            @Override
            public void run()  throws Throwable {
                MyHelperClass handle = new MyHelperClass();
                handle.start();
//                MyHelperClass handle = new MyHelperClass();
                handle.switchToIndeterminate();
                MyHelperClass API_KEY = new MyHelperClass();
                FacebookJsonRestClient client = new FacebookJsonRestClient(API_KEY, SECRET);
                client.setIsDesktop(true);
                HttpURLConnection connection;
                List<String> cookies;
                try {
                    String token =(String)(Object) client.auth_createToken();
                    String post_url = "http://www.facebook.com/login.php";
//                    MyHelperClass API_KEY = new MyHelperClass();
                    String get_url = "http://www.facebook.com/login.php" + "?api_key=" + API_KEY + "&v=1.0" + "&auth_token=" + token;
                    HttpURLConnection.setFollowRedirects(true);
                    connection = (HttpURLConnection) new URL(get_url).openConnection();
                    connection.setRequestMethod("GET");
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2.3) Gecko/20100401");
                    connection.setRequestProperty("Host", "www.facebook.com");
                    connection.setRequestProperty("Accept-Charset", "UFT-8");
                    connection.connect();
                    cookies = connection.getHeaderFields().get("Set-Cookie");
                    connection = (HttpURLConnection) new URL(post_url).openConnection();
                    connection.setRequestMethod("POST");
                    connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:1.9.2.3) Gecko/20100401");
                    connection.setRequestProperty("Host", "www.facebook.com");
                    connection.setRequestProperty("Accept-Charset", "UFT-8");
                    if (cookies != null) {
                        for (String cookie : cookies) {
                            connection.addRequestProperty("Cookie", cookie.split(";", 2)[0]);
                        }
                    }
//                    MyHelperClass API_KEY = new MyHelperClass();
                    String params = "api_key=" + API_KEY + "&auth_token=" + token + "&email=" + URLEncoder.encode((String)(Object)email, "UTF-8") + "&pass=" + URLEncoder.encode((String)(Object)pass, "UTF-8") + "&v=1.0";
                    connection.setRequestProperty("Content-Length", Integer.toString(params.length()));
                    connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    connection.setDoOutput(true);
                    connection.connect();
                    connection.getOutputStream().write(params.toString().getBytes("UTF-8"));
                    connection.getOutputStream().close();
                    cookies = connection.getHeaderFields().get("Set-Cookie");
                    if (cookies == null) {
                        ActionListener listener = new ActionListener() {

//                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String url = "http://www.chartsy.org/facebook/";
                                MyHelperClass DesktopUtil = new MyHelperClass();
                                DesktopUtil.browseAndWarn(url, null);
                            }
                        };
                        MyHelperClass MessageType = new MyHelperClass();
                        NotifyUtil.show("Application Permission", "You need to grant permission first.", MessageType.WARNING, listener, false);
                        connection.disconnect();
                        boolean loggedIn =(boolean)(Object) NULL; //new boolean();
                        loggedIn = false;
                    } else {
                        MyHelperClass sessionKey = new MyHelperClass();
                        sessionKey = client.auth_getSession(token);
                        MyHelperClass sessionSecret = new MyHelperClass();
                        sessionSecret = client.getSessionSecret();
                        boolean loggedIn =(boolean)(Object) NULL; //new boolean();
                        loggedIn = true;
                    }
                    connection.disconnect();
//                    MyHelperClass handle = new MyHelperClass();
                    handle.finish();
                } catch (UncheckedIOException fex) {
//                    MyHelperClass handle = new MyHelperClass();
                    handle.finish();
                    MyHelperClass NotifyUtil = new MyHelperClass();
                    NotifyUtil.error("Login Error", fex.getMessage(),(IOException)(Object) fex, false);
                } catch (IOException ioex) {
//                    MyHelperClass handle = new MyHelperClass();
                    handle.finish();
                    MyHelperClass NotifyUtil = new MyHelperClass();
                    NotifyUtil.error("Login Error", ioex.getMessage(), ioex, false);
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
public MyHelperClass error(String o0, String o1, IOException o2, boolean o3){ return null; }
	public MyHelperClass show(String o0, String o1, MyHelperClass o2, ActionListener o3, boolean o4){ return null; }
	public MyHelperClass finish(){ return null; }
	public MyHelperClass error(String o0, String o1, FacebookException o2, boolean o3){ return null; }
	public MyHelperClass switchToIndeterminate(){ return null; }
	public MyHelperClass start(){ return null; }
	public MyHelperClass browseAndWarn(String o0, Object o1){ return null; }}

class FacebookJsonRestClient {

FacebookJsonRestClient(){}
	FacebookJsonRestClient(MyHelperClass o0, MyHelperClass o1){}
	public MyHelperClass auth_getSession(String o0){ return null; }
	public MyHelperClass getSessionSecret(){ return null; }
	public MyHelperClass auth_createToken(){ return null; }
	public MyHelperClass setIsDesktop(boolean o0){ return null; }}

class ActionListener {

}

class FacebookException extends Exception{
	public FacebookException(String errorMessage) { super(errorMessage); }
}

class ActionEvent {

}
