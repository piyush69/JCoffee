import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13987172 {
public MyHelperClass HttpProtocolParams;
public MyHelperClass fail(IOException o0){ return null; }
	public MyHelperClass fail(InterruptedException o0){ return null; }
	public MyHelperClass fail(URISyntaxException o0){ return null; }

    public void sendMessageToServer(String msg, Map<String, String> args, StringCallback cb, URLConstructor ctor)  throws Throwable {
        try {
            MyHelperClass port = new MyHelperClass();
            int tmpPort =(int)(Object) port;
//            MyHelperClass port = new MyHelperClass();
            for (; tmpPort <(int)(Object) port + 10; tmpPort++) {
                Socket tmpSock;
                try {
                    MyHelperClass host = new MyHelperClass();
                    tmpSock = socketsManager.connect(new InetSocketAddress((InetAddress)(Object)host, port), 5000);
                    tmpSock.close();
                    break;
                } catch (IOException e) {
                }
            }
            Map<String, String> newArgs = new HashMap<String, String>(args);
            newArgs.put("_f", String.valueOf(System.currentTimeMillis()));
            String request = ctor.constructURL(msg, newArgs);
            HttpClient client =(HttpClient)(Object) new SimpleLimeHttpClient();
            MyHelperClass host = new MyHelperClass();
            HttpGet get = new HttpGet("http://" + host + ":" + port + "/" + request);
            MyHelperClass HttpVersion = new MyHelperClass();
            HttpProtocolParams.setVersion(client.getParams(), HttpVersion.HTTP_1_1);
            HttpResponse response = client.execute(get);
            String res = "";
            if (response.getEntity() != null) {
                String result;
                if (response.getEntity() != null) {
                    MyHelperClass EntityUtils = new MyHelperClass();
                    result = EntityUtils.toString(response.getEntity());
                } else {
                    result = null;
                }
                res = result;
            }
            cb.process(res);
        } catch (IOException e) {
            fail(e);
        } catch (HttpException e) {
            fail((IOException)(Object)e);
        } catch (URISyntaxException e) {
            fail(e);
        } catch (InterruptedException e) {
            fail(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HTTP_1_1;
}

class StringCallback {

public MyHelperClass process(String o0){ return null; }}

class URLConstructor {

public MyHelperClass constructURL(String o0, Map<String o1, String o2){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getParams(){ return null; }}

class SimpleLimeHttpClient {

}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}
