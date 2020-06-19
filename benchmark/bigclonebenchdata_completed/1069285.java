import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1069285 {
public MyHelperClass Logger;
	public MyHelperClass string;
	public MyHelperClass act;
	public MyHelperClass bool;
	public MyHelperClass resources;

    private String getAuthCookie(boolean invalidate)  throws Throwable {
        if ((boolean)(Object)resources.getBoolean(bool.dev)) {
            return "dev_appserver_login=get_view@localhost.devel:false:18580476422013912411";
        } else {
            try {
                MyHelperClass accountsManager = new MyHelperClass();
                Account[] accounts =(Account[])(Object) accountsManager.getAccountsByType("com.google");
                Account account = null;
                while (!(accounts.length > 0)) {
                    MyHelperClass act = new MyHelperClass();
                    accountsManager.addAccount("com.google", "ah", null, null, act, null, null).getResult();
//                    MyHelperClass accountsManager = new MyHelperClass();
                    accounts =(Account[])(Object) accountsManager.getAccountsByType("com.google");
                }
                if (account == null) {
                    account = accounts[0];
                }
                MyHelperClass AccountManager = new MyHelperClass();
                String authToken = accountsManager.getAuthToken(account, "ah", null, act, null, null).getResult().get(AccountManager.KEY_AUTHTOKEN).toString();
                if (invalidate || authToken == null) {
                    MyHelperClass Level = new MyHelperClass();
                    Logger.getLogger(JSBridge.class.getName()).log(Level.INFO, "Invalidating auth token.");
//                    MyHelperClass accountsManager = new MyHelperClass();
                    accountsManager.invalidateAuthToken("com.google", authToken);
                    return getAuthCookie(false);
                }
                HttpGet httpget = new HttpGet("http://" + resources.getString(string.host) + "/_ah/login?auth=" + authToken);
                MyHelperClass httpclient = new MyHelperClass();
                HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
                for (Header c :(Header[])(Object) (Object[])(Object)response.getHeaders("Set-Cookie")) {
                    if ((boolean)(Object)c.getValue().startsWith("ACSID=")) {
                        return(String)(Object) c.getValue();
                    }
                }
                return getAuthCookie(false);
            } catch (ClientProtocolException e) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(JSBridge.class.getName()).log(Level.SEVERE, "HTTP protocol violated.", e);
            } catch (OperationCanceledException e) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(JSBridge.class.getName()).log(Level.WARNING, "Login canceled.", e);
            } catch (AuthenticatorException e) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(JSBridge.class.getName()).log(Level.WARNING, "Authentication failed.", e);
            } catch (IOException e) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(JSBridge.class.getName()).log(Level.SEVERE, "Login failed.", e);
            }
            return getAuthCookie(true);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass host;
	public MyHelperClass SEVERE;
	public MyHelperClass WARNING;
	public MyHelperClass KEY_AUTHTOKEN;
	public MyHelperClass INFO;
	public MyHelperClass dev;
public MyHelperClass log(MyHelperClass o0, String o1, OperationCanceledException o2){ return null; }
	public MyHelperClass getAuthToken(Account o0, String o1, Object o2, MyHelperClass o3, Object o4, Object o5){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, AuthenticatorException o2){ return null; }
	public MyHelperClass getAccountsByType(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass addAccount(String o0, String o1, Object o2, Object o3, MyHelperClass o4, Object o5, Object o6){ return null; }
	public MyHelperClass getBoolean(MyHelperClass o0){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass invalidateAuthToken(String o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, ClientProtocolException o2){ return null; }
	public MyHelperClass getResult(){ return null; }}

class Account {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getHeaders(String o0){ return null; }}

class Header {

public MyHelperClass getValue(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class OperationCanceledException extends Exception{
	public OperationCanceledException(String errorMessage) { super(errorMessage); }
}

class AuthenticatorException extends Exception{
	public AuthenticatorException(String errorMessage) { super(errorMessage); }
}

class JSBridge {

}
