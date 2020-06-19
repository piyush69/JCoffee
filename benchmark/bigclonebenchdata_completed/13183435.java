import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13183435 {
public MyHelperClass createJsonFile(MyHelperClass o0){ return null; }
public MyHelperClass http_client;
	public MyHelperClass initializeServer(String o0){ return null; }
	public MyHelperClass initializeSQLite(){ return null; }

//        @Override
        protected DefaultHttpClient doInBackground(Account... params)  throws Throwable {
            MyHelperClass mainActivity = new MyHelperClass();
            AccountManager accountManager =(AccountManager)(Object) AccountManager.get(mainActivity);
            Account account = params[0];
            try {
                Bundle bundle =(Bundle)(Object) accountManager.getAuthToken(account, "ah", false, null, null).getResult();
                MyHelperClass AccountManager = new MyHelperClass();
                Intent intent = (Intent)(Intent)(Object) bundle.get(AccountManager.KEY_INTENT);
                if (intent != null) {
//                    MyHelperClass mainActivity = new MyHelperClass();
                    mainActivity.startActivity(intent);
                } else {
//                    MyHelperClass AccountManager = new MyHelperClass();
                    String auth_token =(String)(Object) bundle.getString(AccountManager.KEY_AUTHTOKEN);
                    MyHelperClass ClientPNames = new MyHelperClass();
                    http_client.getParams().setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false);
                    HttpGet http_get = new HttpGet("http://3dforandroid.appspot.com/_ah" + "/login?continue=http://localhost/&auth=" + auth_token);
                    MyHelperClass http_client = new MyHelperClass();
                    HttpResponse response =(HttpResponse)(Object) http_client.execute(http_get);
                    if ((int)(Object)response.getStatusLine().getStatusCode() != 302) return null;
//                    MyHelperClass http_client = new MyHelperClass();
                    for (Cookie cookie :(Cookie[])(Object) (Object[])(Object)http_client.getCookieStore().getCookies()) {
                        if (cookie.getName().equals("ACSID")) {
                            MyHelperClass authClient = new MyHelperClass();
                            authClient = http_client;
                            MyHelperClass Kind = new MyHelperClass();
                            String json =(String)(Object) createJsonFile(Kind);
                            initializeSQLite();
                            initializeServer(json);
                        }
                    }
                }
            } catch (ArithmeticException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (ArrayStoreException e) {
                e.printStackTrace();
            }
            return(DefaultHttpClient)(Object) http_client;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass KEY_INTENT;
	public MyHelperClass KEY_AUTHTOKEN;
	public MyHelperClass HANDLE_REDIRECTS;
public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass setBooleanParameter(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass startActivity(Intent o0){ return null; }
	public MyHelperClass getCookieStore(){ return null; }
	public MyHelperClass getCookies(){ return null; }
	public MyHelperClass getResult(){ return null; }}

class Account {

}

class DefaultHttpClient {

}

class AccountManager {

public MyHelperClass getAuthToken(Account o0, String o1, boolean o2, Object o3, Object o4){ return null; }
	public static MyHelperClass get(MyHelperClass o0){ return null; }}

class Bundle {

public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }}

class Intent {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}

class OperationCanceledException extends Exception{
	public OperationCanceledException(String errorMessage) { super(errorMessage); }
}

class AuthenticatorException extends Exception{
	public AuthenticatorException(String errorMessage) { super(errorMessage); }
}

class Cookie {

public MyHelperClass getName(){ return null; }}
