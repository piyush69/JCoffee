import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19289085 {

    public void testSendMessage() throws Throwable, ClientProtocolException, IOException {
        String textMessage = "La%20sua%20prenotazione%20e60%20andata%20a%20buon%20fine";
        String customerPhoneNumber = "+393345730726";
        DefaultHttpClient httpclient = new DefaultHttpClient();
        String other = "http://smswizard.globalitalia.it/smsgateway/send.asp";
        String urlProva = other + "?" + "Account=sardricerche" + "&Password=v8LomdZT" + "&PhoneNumbers=+393345730726" + "&SMSData=" + textMessage + "&Recipients=1" + "&Sender=+393337589951" + "&ID=11762";
        HttpPost httpPost = new HttpPost(urlProva);
        HttpResponse response =(HttpResponse)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) httpclient.execute(httpPost);
        HttpEntity entity =(HttpEntity)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object)(Object) response.getEntity();
        MyHelperClass EntityUtils = new MyHelperClass();
        String txt = EntityUtils.toString(entity);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class DefaultHttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}

class Object {

public MyHelperClass toString(HttpEntity o0){ return null; }}
