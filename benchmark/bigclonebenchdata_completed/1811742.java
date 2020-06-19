import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1811742 {
public MyHelperClass server;
	public MyHelperClass EntityUtils;
	public MyHelperClass client;
	public MyHelperClass assertEquals(byte o0, byte o1){ return null; }
	public MyHelperClass assertEquals(int o0, int o1){ return null; }

    public void testSimpleBasicHttpRequests() throws Throwable, Exception {
        int reqNo = 20;
        Random rnd = new Random();
        final List testData = new ArrayList(reqNo);
        for (int i = 0; i < reqNo; i++) {
            int size = rnd.nextInt(5000);
            byte[] data = new byte[size];
            rnd.nextBytes(data);
            testData.add(data);
        }
        this.server.registerHandler("*", new HttpRequestHandler() {

            public void handle(final HttpRequest request, final HttpResponse response, final HttpContext context) throws HttpException, IOException {
                String s =(String)(Object) request.getRequestLine().getUri();
                if (s.startsWith("/?")) {
                    s = s.substring(2);
                }
                int index = Integer.parseInt(s);
                byte[] data = (byte[]) testData.get(index);
                ByteArrayEntity entity = new ByteArrayEntity(data);
                response.setEntity(entity);
            }
        });
        this.server.start();
        DefaultHttpClientConnection conn = new DefaultHttpClientConnection();
        HttpHost host = new HttpHost("localhost", this.server.getPort());
        try {
            for (int r = 0; r < reqNo; r++) {
                if (!(Boolean)(Object)conn.isOpen()) {
                    Socket socket = new Socket((String)(Object)host.getHostName(),(int)(Object) host.getPort());
                    conn.bind(socket, this.client.getParams());
                }
                BasicHttpRequest get = new BasicHttpRequest("GET", "/?" + r);
                HttpResponse response =(HttpResponse)(Object) this.client.execute(get, host, conn);
                byte[] received =(byte[])(Object) EntityUtils.toByteArray(response.getEntity());
                byte[] expected = (byte[]) testData.get(r);
                assertEquals(expected.length, received.length);
                for (int i = 0; i < expected.length; i++) {
                    assertEquals(expected[i], received[i]);
                }
                if (!(Boolean)(Object)this.client.keepAlive(response)) {
                    conn.close();
                }
            }
            HttpConnectionMetrics cm =(HttpConnectionMetrics)(Object) conn.getMetrics();
            assertEquals((byte)(Object)reqNo,(byte)(Object) cm.getRequestCount());
            assertEquals((byte)(Object)reqNo,(byte)(Object) cm.getResponseCount());
        } finally {
            conn.close();
            this.server.shutdown();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPort(){ return null; }
	public MyHelperClass toByteArray(MyHelperClass o0){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass getUri(){ return null; }
	public MyHelperClass registerHandler(String o0,  HttpRequestHandler o1){ return null; }
	public MyHelperClass keepAlive(HttpResponse o0){ return null; }
	public MyHelperClass getParams(){ return null; }
	public MyHelperClass execute(BasicHttpRequest o0, HttpHost o1, DefaultHttpClientConnection o2){ return null; }
	public MyHelperClass registerHandler(String o0){ return null; }
	public MyHelperClass start(){ return null; }}

class HttpRequestHandler {

}

class DefaultHttpClientConnection {

public MyHelperClass bind(Socket o0, MyHelperClass o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass isOpen(){ return null; }
	public MyHelperClass getMetrics(){ return null; }}

class HttpHost {

HttpHost(){}
	HttpHost(String o0, MyHelperClass o1){}
	public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getPort(){ return null; }}

class BasicHttpRequest {

BasicHttpRequest(){}
	BasicHttpRequest(String o0, String o1){}}

class HttpResponse {

public MyHelperClass setEntity(ByteArrayEntity o0){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpConnectionMetrics {

public MyHelperClass getRequestCount(){ return null; }
	public MyHelperClass getResponseCount(){ return null; }}

class HttpRequest {

public MyHelperClass getRequestLine(){ return null; }}

class HttpContext {

}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class ByteArrayEntity {

ByteArrayEntity(byte[] o0){}
	ByteArrayEntity(){}}
