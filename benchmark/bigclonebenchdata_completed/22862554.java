import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22862554 {
public MyHelperClass debug;
	public MyHelperClass parseResponse(SoapEnvelope o0, InputStream o1){ return null; }
	public MyHelperClass createRequestData(SoapEnvelope o0){ return null; }

//    @Override
    public void call(String soapAction, SoapEnvelope envelope) throws Throwable, IOException, XmlPullParserException {
        if (soapAction == null) {
            soapAction = "\"\"";
        }
        byte[] requestData =(byte[])(Object) createRequestData(envelope);
        MyHelperClass requestDump = new MyHelperClass();
        requestDump =(boolean)(Object) debug ? new String(requestData) : null;
        MyHelperClass responseDump = new MyHelperClass();
        responseDump = null;
        MyHelperClass url = new MyHelperClass();
        HttpPost method = new HttpPost(url);
        method.addHeader("User-Agent", "kSOAP/2.0-Excilys");
        method.addHeader("SOAPAction", soapAction);
        method.addHeader("Content-Type", "text/xml");
        HttpEntity entity =(HttpEntity)(Object) new ByteArrayEntity(requestData);
        method.setEntity(entity);
        MyHelperClass httpClient = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) httpClient.execute(method);
        InputStream inputStream =(InputStream)(Object) response.getEntity().getContent();
        MyHelperClass debug = new MyHelperClass();
        if ((boolean)(Object)debug) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[256];
            while (true) {
                int rd = inputStream.read(buf, 0, 256);
                if (rd == -1) {
                    break;
                }
                bos.write(buf, 0, rd);
            }
            bos.flush();
            buf = bos.toByteArray();
//            MyHelperClass responseDump = new MyHelperClass();
            responseDump =(MyHelperClass)(Object) new String(buf);
            inputStream.close();
            inputStream = new ByteArrayInputStream(buf);
        }
        parseResponse(envelope, inputStream);
        inputStream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpPost o0){ return null; }
	public MyHelperClass getContent(){ return null; }}

class SoapEnvelope {

}

class XmlPullParserException extends Exception{
	public XmlPullParserException(String errorMessage) { super(errorMessage); }
}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(HttpEntity o0){ return null; }}

class HttpEntity {

}

class ByteArrayEntity {

ByteArrayEntity(byte[] o0){}
	ByteArrayEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}
