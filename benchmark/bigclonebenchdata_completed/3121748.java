import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3121748 {
public MyHelperClass httpClient;

    private String clientLogin(AuthInfo authInfo) throws Throwable, AuthoricationRequiredException {
        MyHelperClass logger = new MyHelperClass();
        logger.fine("clientLogin.");
        try {
            String url = "https://www.google.com/accounts/ClientLogin";
            HttpPost httpPost = new HttpPost(url);
            ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("accountType", "HOSTED_OR_GOOGLE"));
            params.add(new BasicNameValuePair("Email",(String)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) authInfo.getEmail()));
            params.add(new BasicNameValuePair("Passwd", new String((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)authInfo.getPassword())));
            params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("service", "ah"));
            params.add((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(NameValuePair)(Object)new BasicNameValuePair("source", "client.kotan-server.appspot.com"));
            httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
            HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpClient.execute(httpPost);
            HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
            MyHelperClass HttpStatus = new MyHelperClass();
            if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
                entity.consumeContent();
                MyHelperClass EntityUtils = new MyHelperClass();
                throw new AuthoricationRequiredException(EntityUtils.toString(entity));
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(InputStream)(Object)entity.getContent()));
            while (true) {
                String line = reader.readLine();
                if (line == null) break;
                if (line.startsWith("Auth=")) {
                    return line.substring("Auth=".length());
                }
            }
            reader.close();
            throw new AuthoricationRequiredException("Login failure.");
        } catch (IOException e) {
            throw new AuthoricationRequiredException((Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(String)(Object)e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class AuthInfo {

public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class AuthoricationRequiredException extends Exception{
	public AuthoricationRequiredException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class NameValuePair {

}

class BasicNameValuePair {

BasicNameValuePair(String o0, String o1){}
	BasicNameValuePair(){}}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(){}
	UrlEncodedFormEntity(ArrayList<NameValuePair> o0, String o1){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
