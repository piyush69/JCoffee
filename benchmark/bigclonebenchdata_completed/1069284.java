import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1069284 {
public MyHelperClass string;
	public MyHelperClass resources;
public MyHelperClass httpclient;
	public MyHelperClass Level;
	public MyHelperClass callback;
	public MyHelperClass path;
	public MyHelperClass Logger;
	public MyHelperClass getAuthCookie(boolean o0){ return null; }

//            @Override
            public void run()  throws Throwable {
                String url = "http://" + resources.getString(string.host) + path;
                HttpUriRequest req;
                MyHelperClass dataToSend = new MyHelperClass();
                if (dataToSend == null) {
                    req =(HttpUriRequest)(Object) new HttpGet(url);
                } else {
                    req =(HttpUriRequest)(Object) new HttpPost(url);
                    try {
//                        MyHelperClass dataToSend = new MyHelperClass();
                        ((HttpPost)(HttpPost)(Object) req).setEntity(new StringEntity(dataToSend));
                    } catch (UncheckedIOException e) {
                        MyHelperClass Level = new MyHelperClass();
                        Logger.getLogger(JSBridge.class.getName()).log(Level.SEVERE, "Unsupported encoding.",(UnsupportedEncodingException)(Object) e);
                    }
                }
                req.addHeader("Cookie", getAuthCookie(false));
                try {
                    HttpResponse response =(HttpResponse)(Object) httpclient.execute(req);
                    Logger.getLogger(JSBridge.class.getName()).log(Level.INFO, "Response status is '" + response.getStatusLine() + "'.");
                    HttpEntity entity =(HttpEntity)(Object) response.getEntity();
                    if (entity != null) {
                        InputStream instream =(InputStream)(Object) entity.getContent();
                        try {
                            BufferedReader in = new BufferedReader(new InputStreamReader(instream));
                            StringBuilder b = new StringBuilder();
                            String line;
                            boolean first = true;
                            while ((line = in.readLine()) != null) {
                                b.append(line);
                                if (first) {
                                    first = false;
                                } else {
                                    b.append("\r\n");
                                }
                            }
                            in.close();
                            callback.success(b.toString());
                            return;
                        } catch (RuntimeException ex) {
                            throw ex;
                        } finally {
                            instream.close();
                        }
                    }
                } catch (UncheckedIOException e) {
                    Logger.getLogger(JSBridge.class.getName()).log(Level.SEVERE, "HTTP protocol violated.",(UnsupportedEncodingException)(Object) e);
                } catch (IOException e) {
                    Logger.getLogger(JSBridge.class.getName()).log(Level.WARNING, "Could not load '" + path + "'.", e);
                }
                Logger.getLogger(JSBridge.class.getName()).log(Level.INFO, "Calling error from JSBridge.getPage because of previous errors.");
                callback.error();
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass host;
	public MyHelperClass SEVERE;
	public MyHelperClass INFO;
	public MyHelperClass WARNING;
public MyHelperClass getString(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, UnsupportedEncodingException o2){ return null; }
	public MyHelperClass execute(HttpUriRequest o0){ return null; }
	public MyHelperClass error(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, ClientProtocolException o2){ return null; }
	public MyHelperClass success(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class HttpUriRequest {

public MyHelperClass addHeader(String o0, MyHelperClass o1){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(StringEntity o0){ return null; }}

class StringEntity {

StringEntity(){}
	StringEntity(MyHelperClass o0){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class JSBridge {

}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}
