import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c7949001 {
public MyHelperClass getBytesFromInputStream(MyHelperClass o0){ return null; }
public MyHelperClass archiveAccessSpecification;
	public MyHelperClass AuthScope;
	public MyHelperClass log(String o0){ return null; }

    protected byte[] getBytesForWebPageUsingHTTPClient(String urlString) throws ClientProtocolException, IOException {
        log("Retrieving url: " + urlString);
        DefaultHttpClient httpclient = new DefaultHttpClient();
        if (this.archiveAccessSpecification.getUserID() != null) {
            httpclient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY), new UsernamePasswordCredentials(this.archiveAccessSpecification.getUserID(), this.archiveAccessSpecification.getUserPassword()));
        }
        HttpGet httpget = new HttpGet(urlString);
        log("about to do request: " + httpget.getRequestLine());
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpget);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        log("-------------- Request results --------------");
        log("Status line: " + response.getStatusLine());
        if (entity != null) {
            log("Response content length: " + entity.getContentLength());
        }
        log("contents");
        byte[] bytes = null;
        if (entity != null) {
            bytes =(byte[])(Object) getBytesFromInputStream(entity.getContent());
            entity.consumeContent();
        }
        log("Status code :" + response.getStatusLine().getStatusCode());
        log((String)(Object)response.getStatusLine().getReasonPhrase());
        if ((int)(Object)response.getStatusLine().getStatusCode() != 200) return null;
        return bytes;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ANY;
public MyHelperClass getReasonPhrase(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass getUserID(){ return null; }
	public MyHelperClass getUserPassword(){ return null; }
	public MyHelperClass setCredentials(AuthScope o0, UsernamePasswordCredentials o1){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass getCredentialsProvider(){ return null; }
	public MyHelperClass execute(HttpGet o0){ return null; }}

class AuthScope {

AuthScope(MyHelperClass o0){}
	AuthScope(){}}

class UsernamePasswordCredentials {

UsernamePasswordCredentials(){}
	UsernamePasswordCredentials(MyHelperClass o0, MyHelperClass o1){}}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}
	public MyHelperClass getRequestLine(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }
	public MyHelperClass getStatusLine(){ return null; }}

class HttpEntity {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass consumeContent(){ return null; }}
