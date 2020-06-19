import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14341826 {
public static MyHelperClass IOUtils;
	public static MyHelperClass StringUtils;
	public static MyHelperClass formAuthorizationHeader(String o0, PrivateKey o1, URL o2, String o3){ return null; }
	public static MyHelperClass getSessionTokenUrl(String o0, String o1){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass StringUtils;
//	public MyHelperClass getSessionTokenUrl(String o0, String o1){ return null; }
//	public MyHelperClass formAuthorizationHeader(String o0, PrivateKey o1, URL o2, String o3){ return null; }

    public static String exchangeForSessionToken(String protocol, String domain, String onetimeUseToken, PrivateKey key) throws Throwable, IOException, GeneralSecurityException, AuthenticationException {
        String sessionUrl =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) getSessionTokenUrl(protocol, domain);
        URL url = new URL(sessionUrl);
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
        String header =(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) formAuthorizationHeader(onetimeUseToken, key, url, "GET");
        httpConn.setRequestProperty("Authorization", header);
        if (httpConn.getResponseCode() != HttpURLConnection.HTTP_OK) {
            throw new AuthenticationException(httpConn.getResponseCode() + ": " + httpConn.getResponseMessage());
        }
        String body = IOUtils.toString(httpConn.getInputStream());
        Map parsedTokens =(Map)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) StringUtils.string2Map(body, "\n", "=", true);
        parsedTokens =(Map)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) StringUtils.lowercaseKeys(parsedTokens);
        return (String) parsedTokens.get("token");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass string2Map(String o0, String o1, String o2, boolean o3){ return null; }
	public MyHelperClass lowercaseKeys(Map o0){ return null; }}

class AuthenticationException extends Exception{
	public AuthenticationException(String errorMessage) { super(errorMessage); }
}

class Object {

public MyHelperClass toString(InputStream o0){ return null; }}
