import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18298938 {
public MyHelperClass consumer;
	public MyHelperClass DocumentBuilderFactory;
	public MyHelperClass getConsumerSecret(){ return null; }
	public MyHelperClass getAuthentificationURL(){ return null; }
	public MyHelperClass getConsumerKey(){ return null; }

    public void loginOAuth() throws Throwable, OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException, ClientProtocolException, IOException, IllegalStateException, SAXException, ParserConfigurationException, FactoryConfigurationError,(Throwable)(Object) AndroidException {
        String url =(String)(Object) getAuthentificationURL();
        HttpGet reqLogin = new HttpGet(url);
        consumer = new CommonsHttpOAuthConsumer(getConsumerKey(), getConsumerSecret());
        consumer.sign(reqLogin);
        HttpClient httpClient =(HttpClient)(Object) new DefaultHttpClient();
        HttpResponse resLogin = httpClient.execute(reqLogin);
        if (resLogin.getEntity() == null) {
            throw new AuthRemoteException();
        }
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(resLogin.getEntity().getContent());
        Element eOAuthToken = (Element) document.getElementsByTagName("oauth_token").item(0);
        if (eOAuthToken == null) {
            throw new AuthRemoteException();
        }
        Node e = eOAuthToken.getFirstChild();
        String sOAuthToken = e.getNodeValue();
        System.out.println("token: " + sOAuthToken);
        Element eOAuthTokenSecret = (Element) document.getElementsByTagName("oauth_token_secret").item(0);
        if (eOAuthTokenSecret == null) {
            throw new AuthRemoteException();
        }
        e = eOAuthTokenSecret.getFirstChild();
        String sOAuthTokenSecret = e.getNodeValue();
        System.out.println("Secret: " + sOAuthTokenSecret);
        consumer.setTokenWithSecret(sOAuthToken, sOAuthTokenSecret);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setTokenWithSecret(String o0, String o1){ return null; }
	public MyHelperClass sign(HttpGet o0){ return null; }
	public MyHelperClass newInstance(){ return null; }}

class OAuthMessageSignerException extends Exception{
	public OAuthMessageSignerException(String errorMessage) { super(errorMessage); }
}

class OAuthExpectationFailedException extends Exception{
	public OAuthExpectationFailedException(String errorMessage) { super(errorMessage); }
}

class OAuthCommunicationException extends Exception{
	public OAuthCommunicationException(String errorMessage) { super(errorMessage); }
}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class SAXException extends Exception{
	public SAXException(String errorMessage) { super(errorMessage); }
}

class ParserConfigurationException extends Exception{
	public ParserConfigurationException(String errorMessage) { super(errorMessage); }
}

class FactoryConfigurationError {

}

class AndroidException extends Exception{
	public AndroidException(String errorMessage) { super(errorMessage); }
}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class CommonsHttpOAuthConsumer {

CommonsHttpOAuthConsumer(MyHelperClass o0, MyHelperClass o1){}
	CommonsHttpOAuthConsumer(){}}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }}

class DefaultHttpClient {

}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class AuthRemoteException extends Exception{
	public AuthRemoteException(String errorMessage) { super(errorMessage); }
	AuthRemoteException(){}
}

class Document {

public MyHelperClass getElementsByTagName(String o0){ return null; }}

class Element {

public MyHelperClass getFirstChild(){ return null; }}

class Node {

public MyHelperClass getNodeValue(){ return null; }}
